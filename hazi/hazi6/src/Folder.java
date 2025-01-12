import java.util.Arrays;

public class Folder extends FileSystemEntry{
    private FileSystemEntry[] children = null;

    public Folder(Folder parent, String name) {
        super(parent, name);
    }

    public void addChild(FileSystemEntry child) {
        if (children == null) {
            children = new FileSystemEntry[] {child};
            return;
        } else {
            FileSystemEntry[] ujChildren = new FileSystemEntry[children.length + 1];

            for (int i = 0; i < children.length; i++) {
                ujChildren[i] = children[i];
            }
            ujChildren[ujChildren.length -1] = child;

            children = ujChildren;
        }
    }

    @Override
    public long size() {
        if (children == null || children.length == 0) {
            return 0;
        } else {
            long osszeg = 0;
            for (FileSystemEntry f : children) {
                osszeg += f.size();
            }
            return osszeg;
        }
    }
}
