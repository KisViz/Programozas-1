import org.junit.After;
import org.junit.Before;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.*;
import java.lang.reflect.*;
import java.nio.file.Files;
import java.util.*;

import static org.junit.Assert.*;

public class BaseTest {
    protected boolean keepSoutSerr = true;

    protected ByteArrayOutputStream sout = new ByteArrayOutputStream();
    protected ByteArrayOutputStream serr = new ByteArrayOutputStream();

    protected PrintStream oldOut = System.out;
    protected PrintStream oldErr = System.err;
    protected InputStream oldIn = System.in;

    @Before
    public void saveOut() {
        if (!keepSoutSerr) {
            System.setOut(new PrintStream(sout));
            System.setErr(new PrintStream(serr));
        }
    }

    @After
    public void restoreOut() {
        if (!keepSoutSerr) {
            System.setOut(oldOut);
            System.setErr(oldErr);
            System.setIn(oldIn);
            sout.reset();
            serr.reset();
        }
    }

    protected void setInput(String... lines) {
        StringBuilder input = new StringBuilder();
        for (String s: lines) {
            input.append(s).append(System.lineSeparator());
        }

        InputStream stream = new ByteArrayInputStream(input.toString().getBytes());
        System.setIn(stream);
    }

    @SuppressWarnings("SameParameterValue")
    protected boolean testField(Class<?> c, String name, Class<?> type, Integer modifier) {
        try {
            Field res = c.getDeclaredField(name);

            if (res.getType() != type) {
                return false;
            }

            return modifier == null || res.getModifiers() == modifier;
        } catch (NoSuchFieldException ignored) {}

        return false;
    }

    protected boolean testMethod(Class<?> c, String name, Class<?> returnType, Integer modifier, Class<?>... params) {
        try {
            Method res = c.getDeclaredMethod(name, params);

            if (res.getReturnType() != returnType) {
                return false;
            }

            return modifier == null || res.getModifiers() == modifier;
        } catch (NoSuchMethodException ignored) {}

        return false;
    }

    protected boolean testMethodInherited(Class<?> c, String name, Class<?> returnType, Integer modifier, Class<?>... params) {
        try {
            Method res = c.getMethod(name, params);

            if (res.getReturnType() != returnType) {
                return false;
            }

            return modifier == null || res.getModifiers() == modifier;
        } catch (Exception ignored) {}

        return false;
    }

    protected boolean testConstructor(Class<?> c, Integer modifier, Class<?>... params) {
        try {
            Constructor<?> t = c.getDeclaredConstructor(params);

            if (t == null) {
                return false;
            }

            return t.getModifiers() == modifier;
        } catch (Exception ignored) {}

        return false;
    }

    protected boolean testClass(Class<?> c, Integer modifier, Class<?> superclass, Class<?>... interfaces) {
        if (c.getModifiers() != modifier) {
            return false;
        }

        if (c.getSuperclass() != superclass) {
            return false;
        }

        List<Class<?>> implemented = Arrays.asList(c.getInterfaces());
        if (implemented.size() != interfaces.length) {
            return false;
        }

        outer: for (Class<?> cc: interfaces) {
            for (Class<?> ccc: implemented) {
                if (ccc == cc) {
                    continue outer;
                }
            }

            return false;
        }

        return true;
    }

    protected boolean testInterface(Class<?> c, Integer modifier) {
        if (!c.isInterface()) {
            return false;
        }

        return modifier == c.getModifiers();
    }

    protected Object fieldValue(Class<?> c, String name, Object o) {
        try {
            Field f = c.getDeclaredField(name);
            f.setAccessible(true);
            return f.get(o);
        } catch (NoSuchFieldException | IllegalAccessException ignored) {}

        return null;
    }

    protected void setFieldValue(Class<?> c, String name, Object o, Object value) {
        try {
            Field f = c.getDeclaredField(name);
            f.setAccessible(true);
            f.set(o, value);
        } catch (Exception ignored) {}
    }

    protected String doArgumentTest(Class<?> cl, String... args) {
        PrintStream old = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        try {
            Method m = cl.getDeclaredMethod("main", String[].class);
            m.invoke(null, (Object) args);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        System.setOut(old);
        return baos.toString().trim();
    }

    protected Method getMethod(Class<?> c, String name, Class<?>... params) {
        try {
            return c.getDeclaredMethod(name, params);
        } catch (NoSuchMethodException e) {
            return null;
        }
    }

    protected String getSout(Method m, Object o, Object... params) {
        PrintStream old = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        try {
            m.invoke(o, params);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        System.setOut(old);
        return baos.toString().trim();
    }

    protected int fieldCount(Class<?> c) {
        return c.getDeclaredFields().length;
    }

    protected int methodCount(Class<?> c) {
        return c.getDeclaredMethods().length;
    }

    protected int constructorCount(Class<?> c) {
        return c.getConstructors().length;
    }

    protected List<String> readFile(String filename) {
        try (Scanner sc = new Scanner(new File(filename))) {
            List<String> ret = new ArrayList<>();

            while (sc.hasNextLine()) {
                ret.add(sc.nextLine());
            }

            return ret;
        } catch (IOException e) {
            fail("Nem sikerult a fajlbol olvasni!");
        }

        return null;
    }

    protected void writeFile(String filename, List<String> content) {
        try (PrintWriter pw = new PrintWriter(filename)) {
            for (String s: content) {
                pw.println(s);
            }
        } catch (IOException e) {
            fail("Nem sikerult a fajlba irni!");
        }
    }

    protected void createNewDirectory(String name) {
        deleteDirectory(new File(name));
        //noinspection ResultOfMethodCallIgnored
        new File(name).mkdir();
    }

    protected void deleteDirectory(File dir) {
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                deleteDirectory(file);
            }
        }

        //noinspection ResultOfMethodCallIgnored
        dir.delete();
    }

    protected void deleteFile(String path) {
        try {
            Files.delete(new File(path).toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void checkFileSize(String sourcePath, int maxSize, int sourceCount, int testCount, int allFileCount) {
        File f = new File(sourcePath);

        try {
            long size = Files.size(f.toPath());
            assertTrue("A forraskod merete tul nagy (" + size + " bajt)!", size <= maxSize);
            oldOut.println(System.lineSeparator() + "[OK] A fajl merete: " + size + " bajt." + System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
            fail("Nem sikerult a fajl meretet lekerdezni!");
        }

        int sourceC = new File("./src").listFiles().length;
        int testC = new File("./test").listFiles().length;

        assertEquals("Nem engedelyezett uj fajlokat letrehozni!", sourceCount, sourceC);
        assertEquals("Nem engedelyezett uj fajlokat letrehozni!", testCount, testC);

        int allFileC = new File(".").listFiles().length;
        assertEquals("Nem engedelyezett uj fajlokat letrehozni!", allFileCount, allFileC);
    }

    public boolean objectEquals(Object a, Object b) {
        if (a.getClass() != b.getClass()) {
            return false;
        }

        Class<?>[] ignore = {String.class, Integer.class, Double.class, Float.class, Byte.class, Short.class, Long.class, Character.class};
        for (Class<?> clazz: ignore) {
            if (a.getClass() == clazz) {
                return Objects.equals(a, b);
            }
        }

        Field[] fields = a.getClass().getDeclaredFields();

        for (Field f: fields) {
            f.setAccessible(true);
            try {
                if (!Objects.deepEquals(f.get(a), f.get(b))) {
                    return false;
                }
            } catch (IllegalAccessException e) {
                return false;
            }
        }

        return true;
    }

    public boolean listEquals(List<?> a, List<?> b, boolean referenceEquals) {
        if (a.size() != b.size()) {
            return false;
        }

        for (int i = 0; i < a.size() && i < b.size(); i++) {
            if (referenceEquals) {
                if (a.get(i) != b.get(i)) {
                    return false;
                }
            } else {
                if (!objectEquals(a.get(i), b.get(i))) {
                    return false;
                }
            }
        }

        return true;
    }

    protected boolean setEquals(Set<?> a, Set<?> b, boolean referenceEquals) {
        if (a.size() != b.size()) {
            return false;
        }

        kulso: for (Object aa: a) {
            if (referenceEquals) {
                if (!b.contains(aa)) {
                    return false;
                }
            } else {
                for (Object bb: b) {
                    if (objectEquals(aa, bb)) {
                        continue kulso;
                    }
                }

                return false;
            }
        }

        return true;
    }

    protected boolean mapEquals(Map<?, ?> a, Map<?, ?> b, boolean referenceEquals) {
        if (a.size() != b.size()) {
            return false;
        }

        kulso: for (Map.Entry<?, ?> aa: a.entrySet()) {
            if (referenceEquals) {
                if (!b.containsKey(aa.getKey()) || b.get(aa.getKey()) != aa.getValue()) {
                    return false;
                }
            } else {
                for (Map.Entry<?, ?> bb: b.entrySet()) {
                    System.out.println(aa.getKey() + ", " + bb.getKey() + ", " + aa.getValue() + ", " + bb.getValue());
                    if (objectEquals(aa.getKey(), bb.getKey()) && objectEquals(aa.getValue(), bb.getValue())) {
                        continue kulso;
                    }
                }

                return false;
            }
        }

        return true;
    }

    protected String compile(String... sourceNames) {
        List<File> files = new ArrayList<>();
        for (String s: sourceNames) {
            files.add(new File(s));
        }

        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);

        Iterable<? extends JavaFileObject> units = fileManager.getJavaFileObjectsFromFiles(files);

        StringWriter writer = new StringWriter();
        compiler.getTask(writer, fileManager, null, Arrays.asList("-Xlint:all"), null, units).call();

        return writer.toString();
    }

    protected void checkCompilerError(String[] errors, int minErrors, boolean outputCompilerMessage, String... sourceNames) {
        String compilerOutput = compile(sourceNames);

        if (outputCompilerMessage) {
            oldOut.println(compilerOutput);
        }

        int result = 0;
        for (String error: errors) {
            if (compilerOutput.contains(error)) {
                result++;
                oldOut.print("[OK]");
            } else {
                oldOut.print("[--]");
            }

            oldOut.println(" " + error);
        }

        oldOut.println(System.lineSeparator());
        oldOut.println("Megtalalt hibak: " + result + "/" + errors.length + " [min: " + minErrors + "]" + System.lineSeparator());

        assertTrue("Tul keves hiba!", result >= minErrors);
    }

    protected void checkRunningTime(Class<?> klass, String methodName, Object object, Class<?>[] methodParams, Object[] params, Object expectedResult, double maxTime) {
        long start = System.currentTimeMillis();

        Method method;
        try {
            method = klass.getDeclaredMethod(methodName, methodParams);
        } catch (NoSuchMethodException e) {
            fail("There is no " + methodName + " method in the " + klass.getName() + " class with the given parameter types");
            return;
        }

        Object res;
        try {
            res = method.invoke(object, params);
        } catch (IllegalAccessException | InvocationTargetException e) {
            fail("Cannot call given method");
            return;
        }

        assertEquals("Hibas visszateresi ertek", expectedResult, res);

        long end = System.currentTimeMillis();

        long elapsedTime = end-start;

        assertTrue("A futasi ido (" + (elapsedTime/1000.0) + " s) tullepte a megengedett maximalis futasido-korlatot (" + maxTime + " s)" +
                System.lineSeparator() + System.lineSeparator(), (elapsedTime < maxTime*1000));
    }
}
