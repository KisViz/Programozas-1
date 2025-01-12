import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class Tests extends BaseTest {
    @Test
    public void teszt_01() {
        Pozicio startPozicio = new Pozicio(2, 2);

        Pozicio[] bunozok = new Pozicio[] {
                new Pozicio(4, 4),
                new Pozicio(1, 3),
                new Pozicio(1, 0)
        };

        Pozicio[] falak = new Pozicio[] {
                new Pozicio(3, 3),
                new Pozicio(3, 4)
        };

        Pozicio[] konyvespolcok = new Pozicio[] {
                new Pozicio(2, 3),
                new Pozicio(4, 3),
                new Pozicio(1, 1)
        };

        Pozicio[] asztalok = new Pozicio[] {
                new Pozicio(2, 4)
        };

        Pozicio[] ajtok = new Pozicio[] {
                new Pozicio(0, 0),
                new Pozicio(0, 4)
        };

        Epulet e = new Epulet(startPozicio, bunozok, falak, konyvespolcok, asztalok, ajtok);
        checkRunningTime(Epulet.class, "lepesekSzama", e, new Class[] {}, new Object[] {}, 23, 10);
    }

    @Test
    public void teszt_02() {
        Pozicio startPozicio = new Pozicio(0, 0);

        Pozicio[] bunozok = new Pozicio[] {
                new Pozicio(2, 1),
                new Pozicio(1, 3),
                new Pozicio(0, 1),
                new Pozicio(0, 4)
        };

        Pozicio[] falak = new Pozicio[] {
                new Pozicio(0, 3),
                new Pozicio(1, 2),
                new Pozicio(0, 2),
                new Pozicio(1, 1)
        };

        Pozicio[] konyvespolcok = new Pozicio[] {};

        Pozicio[] asztalok = new Pozicio[] {
                new Pozicio(2, 4),
                new Pozicio(2,2 )
        };

        Pozicio[] ajtok = new Pozicio[] {
                new Pozicio(2, 0),
        };

        Epulet e = new Epulet(startPozicio, bunozok, falak, konyvespolcok, asztalok, ajtok);
        checkRunningTime(Epulet.class, "lepesekSzama", e, new Class[] {}, new Object[] {}, 21, 10);
    }

    @Test
    public void teszt_03() {
        Pozicio startPozicio = new Pozicio(7, 12);

        Pozicio[] bunozok = new Pozicio[] {
                new Pozicio(4, 4),
                new Pozicio(6, 12),
                new Pozicio(11, 14),
                new Pozicio(10, 2),
                new Pozicio(4, 25),
                new Pozicio(10, 22),
                new Pozicio(5, 20),
                new Pozicio(2, 22),
                new Pozicio(2, 14),
                new Pozicio(3, 12),
                new Pozicio(10, 31),
                new Pozicio(11, 31),
                new Pozicio(11, 22),
                new Pozicio(5, 32),
                new Pozicio(7, 6),
                new Pozicio(11, 0),
                new Pozicio(0, 11),
                new Pozicio(0, 17),
                new Pozicio(0, 31),
                new Pozicio(9, 27),
                new Pozicio(0, 27),
                new Pozicio(11, 25),
                new Pozicio(0, 1)
        };

        Pozicio[] falak = new Pozicio[] {
                new Pozicio(0, 15),
                new Pozicio(1, 15),
                new Pozicio(2, 15),
                new Pozicio(3, 15),
                new Pozicio(4, 15),
                new Pozicio(5, 15),
                new Pozicio(6, 15),
                new Pozicio(7, 15),
                new Pozicio(9, 15),
                new Pozicio(10, 15),
                new Pozicio(11, 15),
                new Pozicio(7, 16),
                new Pozicio(7, 17),
                new Pozicio(8, 17),
                new Pozicio(9, 17),
                new Pozicio(10, 17),
                new Pozicio(10, 18),
                new Pozicio(11, 20),
                new Pozicio(10, 20),
                new Pozicio(9, 20),
                new Pozicio(8, 20),
                new Pozicio(8, 19),
                new Pozicio(7, 19),
                new Pozicio(6, 19),
                new Pozicio(5, 19),
                new Pozicio(4, 19),
                new Pozicio(3, 19),
                new Pozicio(1, 16),
                new Pozicio(1, 17),
                new Pozicio(1, 18),
                new Pozicio(1, 19),
                new Pozicio(1, 20),
                new Pozicio(1, 21),
                new Pozicio(1, 22),
                new Pozicio(1, 23),
                new Pozicio(1, 24),
                new Pozicio(1, 25),
                new Pozicio(1, 26),
                new Pozicio(1, 27),
                new Pozicio(1, 28),
                new Pozicio(1, 29)
        };

        Pozicio[] konyvespolcok = new Pozicio[] {
                new Pozicio(1, 30),
                new Pozicio(1, 31),
                new Pozicio(7, 14),
                new Pozicio(6, 5),
                new Pozicio(6, 6),
                new Pozicio(6, 7),
                new Pozicio(6, 8),
                new Pozicio(6, 9),
                new Pozicio(11, 9),
                new Pozicio(10, 9),
                new Pozicio(9, 9),
                new Pozicio(8, 9),
                new Pozicio(7, 5),
                new Pozicio(8, 5),
                new Pozicio(9, 5),
                new Pozicio(10, 5),
                new Pozicio(11, 5),
                new Pozicio(0, 3),
                new Pozicio(1, 3),
                new Pozicio(2, 3),
                new Pozicio(3, 3),
                new Pozicio(4, 3),
                new Pozicio(5, 3),
                new Pozicio(5, 2),
                new Pozicio(11, 29),
                new Pozicio(10, 29),
                new Pozicio(9, 29),
                new Pozicio(8, 29),
                new Pozicio(7, 29),
                new Pozicio(7, 28),
                new Pozicio(7, 27),
                new Pozicio(7, 25),
                new Pozicio(8, 25)
        };

        Pozicio[] asztalok = new Pozicio[] {
                new Pozicio(9, 25),
                new Pozicio(10, 25),
                new Pozicio(7, 26),
                new Pozicio(7, 30),
                new Pozicio(7, 31),
                new Pozicio(8, 31),
                new Pozicio(9, 31)
        };

        Pozicio[] ajtok = new Pozicio[] {
                new Pozicio(0, 0),
                new Pozicio(3, 32),
                new Pozicio(11, 32),
                new Pozicio(11, 16),
                new Pozicio(0, 14),
                new Pozicio(11, 0)
        };

        Epulet e = new Epulet(startPozicio, bunozok, falak, konyvespolcok, asztalok, ajtok);
        checkRunningTime(Epulet.class, "lepesekSzama", e, new Class[] {}, new Object[] {}, 148, 10);
    }

    @Test
    public void teszt_04() {
        Pozicio startPozicio = new Pozicio(0, 0);

        List<Pozicio> bunozoList = new ArrayList<>();
        Pozicio[] bunozok = new Pozicio[bunozoList.size()];
        for (int i = 0; i < bunozok.length; i++) {
            bunozok[i] = bunozoList.get(i);
        }

        Pozicio[] falak = new Pozicio[] {
                new Pozicio(0, 15),
                new Pozicio(1, 15),
                new Pozicio(2, 15),
                new Pozicio(3, 15),
                new Pozicio(4, 15),
                new Pozicio(5, 15),
                new Pozicio(6, 15),
                new Pozicio(7, 15),
                new Pozicio(9, 15),
                new Pozicio(10, 15),
                new Pozicio(11, 15),
                new Pozicio(7, 16),
                new Pozicio(7, 17),
                new Pozicio(8, 17),
                new Pozicio(9, 17),
                new Pozicio(10, 17),
                new Pozicio(10, 18),
                new Pozicio(11, 20),
                new Pozicio(10, 20),
                new Pozicio(9, 20),
                new Pozicio(8, 20),
                new Pozicio(8, 19),
                new Pozicio(7, 19),
                new Pozicio(6, 19),
                new Pozicio(5, 19),
                new Pozicio(4, 19),
                new Pozicio(3, 19),
                new Pozicio(1, 16),
                new Pozicio(1, 17),
                new Pozicio(1, 18),
                new Pozicio(1, 19),
                new Pozicio(1, 20),
                new Pozicio(1, 21),
                new Pozicio(1, 22),
                new Pozicio(1, 23),
                new Pozicio(1, 24),
                new Pozicio(1, 25),
                new Pozicio(1, 26),
                new Pozicio(1, 27),
                new Pozicio(1, 28),
                new Pozicio(1, 29)
        };

        Pozicio[] konyvespolcok = new Pozicio[] {
                new Pozicio(1, 30),
                new Pozicio(1, 31),
                new Pozicio(7, 14),
                new Pozicio(6, 5),
                new Pozicio(6, 6),
                new Pozicio(6, 7),
                new Pozicio(6, 8),
                new Pozicio(6, 9),
                new Pozicio(11, 9),
                new Pozicio(10, 9),
                new Pozicio(9, 9),
                new Pozicio(8, 9),
                new Pozicio(7, 5),
                new Pozicio(8, 5),
                new Pozicio(9, 5),
                new Pozicio(10, 5),
                new Pozicio(11, 5),
                new Pozicio(0, 3),
                new Pozicio(1, 3),
                new Pozicio(2, 3),
                new Pozicio(3, 3),
                new Pozicio(4, 3),
                new Pozicio(5, 3),
                new Pozicio(5, 2),
                new Pozicio(11, 29),
                new Pozicio(10, 29),
                new Pozicio(9, 29),
                new Pozicio(8, 29),
                new Pozicio(7, 29),
                new Pozicio(7, 28),
                new Pozicio(7, 27),
                new Pozicio(7, 25),
                new Pozicio(8, 25)
        };

        Pozicio[] asztalok = new Pozicio[] {
                new Pozicio(9, 25),
                new Pozicio(10, 25),
                new Pozicio(7, 26),
                new Pozicio(7, 30),
                new Pozicio(7, 31),
                new Pozicio(8, 31),
                new Pozicio(9, 31)
        };

        Pozicio[] ajtok = new Pozicio[] {
                new Pozicio(0, 0),
                new Pozicio(3, 32),
                new Pozicio(11, 32),
                new Pozicio(11, 16),
                new Pozicio(0, 14),
                new Pozicio(11, 0)
        };

        Epulet e = new Epulet(startPozicio, bunozok, falak, konyvespolcok, asztalok, ajtok);
        checkRunningTime(Epulet.class, "lepesekSzama", e, new Class[] {}, new Object[] {}, 1, 10);
    }

    @Test
    public void teszt_05() {
        Pozicio startPozicio = new Pozicio(0, 2);

        List<Pozicio> bunozoList = new ArrayList<>();
        Pozicio[] bunozok = new Pozicio[] {
                new Pozicio(0, 0)
        };

        Pozicio[] falak = new Pozicio[] {
                new Pozicio(0, 4)
        };

        Pozicio[] konyvespolcok = new Pozicio[] {
                new Pozicio(1, 2)
        };

        Pozicio[] asztalok = new Pozicio[] {
                new Pozicio(1, 2)
        };

        Pozicio[] ajtok = new Pozicio[] {
                new Pozicio(0, 0)
        };

        Epulet e = new Epulet(startPozicio, bunozok, falak, konyvespolcok, asztalok, ajtok);
        checkRunningTime(Epulet.class, "lepesekSzama", e, new Class[] {}, new Object[] {}, 3, 10);
    }

    @Test
    public void teszt_06() {
        Pozicio startPozicio = new Pozicio(Integer.MAX_VALUE - 1, Integer.MAX_VALUE - 1);

        List<Pozicio> bunozoList = new ArrayList<>();
        Pozicio[] bunozok = new Pozicio[] {
                new Pozicio(Integer.MAX_VALUE - 2, Integer.MAX_VALUE -3),
                new Pozicio(Integer.MAX_VALUE - 3, Integer.MAX_VALUE -4),
                new Pozicio(Integer.MAX_VALUE - 2, Integer.MAX_VALUE -5)
        };

        Pozicio[] falak = new Pozicio[] {
                new Pozicio(Integer.MAX_VALUE - 2, Integer.MAX_VALUE -4),
                new Pozicio(Integer.MAX_VALUE - 3, Integer.MAX_VALUE -5),
                new Pozicio(Integer.MAX_VALUE - 4, Integer.MAX_VALUE - 5),
                new Pozicio(Integer.MAX_VALUE - 4, Integer.MAX_VALUE - 4),
                new Pozicio(Integer.MAX_VALUE - 4, Integer.MAX_VALUE - 3),
                new Pozicio(Integer.MAX_VALUE - 4, Integer.MAX_VALUE - 2),
                new Pozicio(Integer.MAX_VALUE - 4, Integer.MAX_VALUE - 1),
                new Pozicio(Integer.MAX_VALUE - 4, Integer.MAX_VALUE),
                new Pozicio(Integer.MAX_VALUE, Integer.MAX_VALUE - 6),
                new Pozicio(Integer.MAX_VALUE - 1, Integer.MAX_VALUE - 6),
                new Pozicio(Integer.MAX_VALUE - 2, Integer.MAX_VALUE - 6),
                new Pozicio(Integer.MAX_VALUE - 3, Integer.MAX_VALUE - 6),
                new Pozicio(Integer.MAX_VALUE - 4, Integer.MAX_VALUE - 6),
                new Pozicio(Integer.MAX_VALUE - 5, Integer.MAX_VALUE - 6)
        };

        Pozicio[] konyvespolcok = new Pozicio[] {
                new Pozicio(Integer.MAX_VALUE - 1, Integer.MAX_VALUE -4),
                new Pozicio(Integer.MAX_VALUE - 1, Integer.MAX_VALUE -3),
                new Pozicio(Integer.MAX_VALUE - 1, Integer.MAX_VALUE -2)
        };

        Pozicio[] asztalok = new Pozicio[] {
                new Pozicio(Integer.MAX_VALUE - 2, Integer.MAX_VALUE -2),
        };

        Pozicio[] ajtok = new Pozicio[] {
                new Pozicio(Integer.MAX_VALUE - 1, Integer.MAX_VALUE -1),
        };

        Epulet e = new Epulet(startPozicio, bunozok, falak, konyvespolcok, asztalok, ajtok);
        checkRunningTime(Epulet.class, "lepesekSzama", e, new Class[] {}, new Object[] {}, 27, 10);
    }

    @Test
    public void teszt_07() {
        Pozicio startPozicio = new Pozicio(0, 0);


        Pozicio[] bunozok = new Pozicio[] {
                new Pozicio(41, -31),
                new Pozicio(-48, 1),
                new Pozicio(-44, 8),
                new Pozicio(44, 44),
                new Pozicio(-40, -12),
                new Pozicio(29, -48),
                new Pozicio(-3, -1),
                new Pozicio(-16, -48),
                new Pozicio(-38, 20),
                new Pozicio(-50, 50),
                new Pozicio(-49, 40),
                new Pozicio(-33, 47),
                new Pozicio(6, -11),
                new Pozicio(37, -24),
                new Pozicio(-11, 18),
                new Pozicio(11, 22),
                new Pozicio(-8, -41),
                new Pozicio(13, -44),
                new Pozicio(-18, -34),
                new Pozicio(-21, 31),
                new Pozicio(7, -22),
                new Pozicio(6, 30),
                new Pozicio(27, -31),
                new Pozicio(-38, 38),
                new Pozicio(14, -47),
                new Pozicio(13, -34),
                new Pozicio(-9, 37),
                new Pozicio(-4, -29),
                new Pozicio(-6, 35),
                new Pozicio(-45, 39),
                new Pozicio(-23, -21),
                new Pozicio(20, 47),
                new Pozicio(-29, -31),
                new Pozicio(-24, 39),
                new Pozicio(-8, 40),
                new Pozicio(-27, -19),
                new Pozicio(45, -31),
                new Pozicio(-40, 35),
                new Pozicio(-2, 35),
                new Pozicio(-26, 49),
                new Pozicio(-19, 41),
                new Pozicio(20, -36),
                new Pozicio(31, -21),
                new Pozicio(-44, 6),
                new Pozicio(-28, -6),
                new Pozicio(21, -20),
                new Pozicio(-43, -44),
                new Pozicio(22, 0),
                new Pozicio(13, 6),
                new Pozicio(-13, 32),
                new Pozicio(23, -12),
                new Pozicio(17, 18),
                new Pozicio(30, -45),
                new Pozicio(-9, -24),
                new Pozicio(-21, 10),
                new Pozicio(-41, -29),
                new Pozicio(28, 40),
                new Pozicio(-49, 43),
                new Pozicio(24, -41),
                new Pozicio(25, 33),
                new Pozicio(32, -33),
                new Pozicio(-44, 24),
                new Pozicio(47, 43),
                new Pozicio(-24, 26),
                new Pozicio(-46, -31),
                new Pozicio(44, 49),
                new Pozicio(-34, 47),
                new Pozicio(-27, 6),
                new Pozicio(46, -2),
                new Pozicio(31, -29),
                new Pozicio(-21, -39),
                new Pozicio(48, -27),
                new Pozicio(13, -9),
                new Pozicio(-13, 44),
                new Pozicio(1, -4),
                new Pozicio(-43, 24),
                new Pozicio(-10, -7),
                new Pozicio(-35, -1),
                new Pozicio(31, 9),
                new Pozicio(2, -42),
                new Pozicio(-39, -49),
                new Pozicio(-21, -49),
                new Pozicio(-15, -17),
                new Pozicio(-35, -18),
                new Pozicio(25, 21),
                new Pozicio(-27, 36),
                new Pozicio(49, -33),
                new Pozicio(-41, -19),
                new Pozicio(-34, 16),
                new Pozicio(-47, -23),
                new Pozicio(35, 23),
                new Pozicio(37, 11),
                new Pozicio(-48, -2),
                new Pozicio(30, -8),
                new Pozicio(12, 28),
                new Pozicio(18, 47),
                new Pozicio(22, 37),
                new Pozicio(-16, 12),
                new Pozicio(-4, -20),
                new Pozicio(-41, 21),
                new Pozicio(47, 10),
                new Pozicio(29, 24),
                new Pozicio(-12, 38),
                new Pozicio(3, 38),
                new Pozicio(2, 37),
                new Pozicio(-28, 18),
                new Pozicio(32, -44),
                new Pozicio(2, 30),
                new Pozicio(18, 27),
                new Pozicio(26, -16),
                new Pozicio(-9, 29),
                new Pozicio(-20, 38),
                new Pozicio(17, -19),
                new Pozicio(-40, -49),
                new Pozicio(29, -27),
                new Pozicio(48, -24),
                new Pozicio(20, -45),
                new Pozicio(35, 30),
                new Pozicio(-44, 1),
                new Pozicio(-45, 14),
                new Pozicio(5, 20),
                new Pozicio(-43, 32),
                new Pozicio(44, 25),
                new Pozicio(-43, -31),
                new Pozicio(4, -35),
                new Pozicio(39, 32),
                new Pozicio(-2, -37),
                new Pozicio(-21, 7),
                new Pozicio(7, 47),
                new Pozicio(37, -50),
                new Pozicio(14, -42),
                new Pozicio(-27, 12),
                new Pozicio(-32, 20),
                new Pozicio(3, -48),
                new Pozicio(-33, -31),
                new Pozicio(5, 26),
                new Pozicio(27, 18),
                new Pozicio(24, -1),
                new Pozicio(-48, -3),
                new Pozicio(46, 6),
                new Pozicio(47, -26),
                new Pozicio(-41, -17),
                new Pozicio(-3, 33),
                new Pozicio(16, 37),
                new Pozicio(-18, -43),
                new Pozicio(14, -24),
                new Pozicio(13, -23),
                new Pozicio(-44, 42),
                new Pozicio(26, -31),
                new Pozicio(-13, -39),
                new Pozicio(-43, -1),
                new Pozicio(-29, 22),
                new Pozicio(-46, 42),
                new Pozicio(-3, 43),
                new Pozicio(-32, 15),
                new Pozicio(-39, -28),
                new Pozicio(-21, -8),
                new Pozicio(-19, -37),
                new Pozicio(21, 27),
                new Pozicio(-19, -6),
                new Pozicio(11, -16),
                new Pozicio(-5, 13),
                new Pozicio(48, 40),
                new Pozicio(-47, -48),
                new Pozicio(36, 17),
                new Pozicio(-47, 43),
                new Pozicio(-46, 49),
                new Pozicio(7, 32),
                new Pozicio(16, -8),
                new Pozicio(-12, 3),
                new Pozicio(-38, 31),
                new Pozicio(-16, 35),
                new Pozicio(-17, 24),
                new Pozicio(49, -15),
                new Pozicio(18, 23),
                new Pozicio(25, -14),
                new Pozicio(-47, -15),
                new Pozicio(-44, 47),
                new Pozicio(-27, -24),
                new Pozicio(47, -31),
                new Pozicio(5, -40),
                new Pozicio(40, 37),
                new Pozicio(-44, -5),
                new Pozicio(-9, 26),
                new Pozicio(15, 29),
                new Pozicio(-11, -4),
                new Pozicio(46, -23),
                new Pozicio(30, -23),
                new Pozicio(18, 35),
                new Pozicio(-27, 28),
                new Pozicio(46, 33),
                new Pozicio(-28, -43),
                new Pozicio(-20, -50),
                new Pozicio(26, 16),
                new Pozicio(-21, 14),
                new Pozicio(22, -47),
                new Pozicio(15, -46),
                new Pozicio(28, -42),
                new Pozicio(-19, 31)
        };

        Pozicio[] falak = new Pozicio[] {
                new Pozicio(-20, -45),
                new Pozicio(-19, 23),
                new Pozicio(1, -5),
                new Pozicio(-19, -10),
                new Pozicio(-8, 21),
                new Pozicio(50, 11),
                new Pozicio(0, -14),
                new Pozicio(8, -22),
                new Pozicio(31, 45),
                new Pozicio(39, 4),
                new Pozicio(43, 40),
                new Pozicio(-21, -4),
                new Pozicio(-27, 49),
                new Pozicio(-48, 47),
                new Pozicio(-41, -15),
                new Pozicio(0, 41),
                new Pozicio(-34, 1),
                new Pozicio(-25, 10),
                new Pozicio(22, 46),
                new Pozicio(-4, -7),
                new Pozicio(-49, -33),
                new Pozicio(34, -9),
                new Pozicio(50, 28),
                new Pozicio(24, -19),
                new Pozicio(-7, -33),
                new Pozicio(-17, 9),
                new Pozicio(37, -45),
                new Pozicio(-36, -34),
                new Pozicio(21, 42),
                new Pozicio(50, -50),
                new Pozicio(36, 11),
                new Pozicio(-21, -44),
                new Pozicio(18, 29),
                new Pozicio(44, -1),
                new Pozicio(22, -43),
                new Pozicio(32, 43),
                new Pozicio(-8, 37),
                new Pozicio(25, -48),
                new Pozicio(-1, 0),
                new Pozicio(-45, -5),
                new Pozicio(42, -37),
                new Pozicio(-11, 50),
                new Pozicio(-24, -17),
                new Pozicio(-23, 46),
                new Pozicio(-36, -6),
                new Pozicio(-20, -42),
                new Pozicio(7, -46),
                new Pozicio(35, 19),
                new Pozicio(-39, -24),
                new Pozicio(26, 45),
                new Pozicio(9, -42),
                new Pozicio(30, -29),
                new Pozicio(-12, -15),
                new Pozicio(31, 50),
                new Pozicio(-17, 23),
                new Pozicio(40, 50),
                new Pozicio(37, 46),
                new Pozicio(45, 22),
                new Pozicio(19, -33),
                new Pozicio(35, 27),
                new Pozicio(-16, 15),
                new Pozicio(3, 34),
                new Pozicio(41, 45),
                new Pozicio(39, 18)
        };

        Pozicio[] konyvespolcok = new Pozicio[] {
                new Pozicio(41, -6),
                new Pozicio(-50, -5),
                new Pozicio(-16, -16),
                new Pozicio(-15, -21),
                new Pozicio(49, -27),
                new Pozicio(27, -35),
                new Pozicio(-42, 27),
                new Pozicio(44, -48),
                new Pozicio(-27, -16),
                new Pozicio(46, 0),
                new Pozicio(-2, 34),
                new Pozicio(-43, -7),
                new Pozicio(48, -33),
                new Pozicio(28, 2),
                new Pozicio(10, 49),
                new Pozicio(20, -32),
                new Pozicio(-50, -33),
                new Pozicio(23, 41),
                new Pozicio(48, -38),
                new Pozicio(-8, 18),
                new Pozicio(36, -38),
                new Pozicio(23, -11),
                new Pozicio(50, 6),
                new Pozicio(46, 48),
                new Pozicio(39, 48),
                new Pozicio(16, 21),
                new Pozicio(3, -8),
                new Pozicio(24, -12),
                new Pozicio(-38, -40),
                new Pozicio(2, 21),
                new Pozicio(47, 49),
                new Pozicio(-34, 7),
                new Pozicio(-41, 29),
                new Pozicio(26, -36),
                new Pozicio(-49, 2),
                new Pozicio(43, 2),
                new Pozicio(44, -7),
                new Pozicio(-23, -1),
                new Pozicio(15, 25),
                new Pozicio(31, -41),
                new Pozicio(11, 32),
                new Pozicio(26, -9),
                new Pozicio(-7, -23),
                new Pozicio(31, 23),
                new Pozicio(27, 42),
                new Pozicio(-18, 41),
                new Pozicio(-29, 11),
                new Pozicio(18, 45),
                new Pozicio(5, 14),
                new Pozicio(27, -6),
                new Pozicio(-49, 24),
                new Pozicio(-7, -1),
                new Pozicio(16, 14),
                new Pozicio(45, 0),
                new Pozicio(-2, 25),
                new Pozicio(-25, 0),
                new Pozicio(24, 2),
                new Pozicio(40, 48),
                new Pozicio(-5, -25),
                new Pozicio(-47, -46),
                new Pozicio(33, 15),
                new Pozicio(-4, -4),
                new Pozicio(38, -24),
                new Pozicio(-2, 10),
                new Pozicio(22, 17),
                new Pozicio(43, 29),
                new Pozicio(-10, 35),
                new Pozicio(40, -29),
                new Pozicio(-45, -49),
                new Pozicio(31, 34),
                new Pozicio(31, -45),
                new Pozicio(-24, 32),
                new Pozicio(-5, 35),
                new Pozicio(13, 48),
                new Pozicio(10, 28),
                new Pozicio(-14, -23),
                new Pozicio(-7, -11),
                new Pozicio(28, 26),
                new Pozicio(35, -35),
                new Pozicio(-44, -20),
                new Pozicio(-3, 32),
                new Pozicio(-48, -36),
                new Pozicio(1, 39),
                new Pozicio(-46, -49),
                new Pozicio(10, -5),
                new Pozicio(-25, -8),
                new Pozicio(-7, 18),
                new Pozicio(-21, 11),
                new Pozicio(-9, -25),
                new Pozicio(-38, -42),
                new Pozicio(-5, -45),
                new Pozicio(-49, -34),
                new Pozicio(-46, 33),
                new Pozicio(-13, -41),
                new Pozicio(-2, 46),
                new Pozicio(5, 39),
                new Pozicio(-13, 23),
                new Pozicio(43, 38),
                new Pozicio(-26, 44),
                new Pozicio(45, 48),
                new Pozicio(-23, 19),
                new Pozicio(1, 8),
                new Pozicio(13, 31),
                new Pozicio(41, -10),
                new Pozicio(15, 18),
                new Pozicio(-22, 45),
                new Pozicio(21, -26),
                new Pozicio(-16, -43),
                new Pozicio(-2, 36),
                new Pozicio(30, 20),
                new Pozicio(-22, 42),
                new Pozicio(33, -35),
                new Pozicio(24, 1),
                new Pozicio(-5, -9),
                new Pozicio(25, 29),
                new Pozicio(-35, 40),
                new Pozicio(3, 4),
                new Pozicio(40, -3),
                new Pozicio(-32, -32),
                new Pozicio(-1, 35),
                new Pozicio(-19, 19),
                new Pozicio(33, 11),
                new Pozicio(-48, -48),
                new Pozicio(-7, 27),
                new Pozicio(-25, 32),
                new Pozicio(32, -38),
                new Pozicio(27, 26),
                new Pozicio(40, 41),
                new Pozicio(-38, 2),
                new Pozicio(7, -25),
                new Pozicio(-35, 16),
        };

        Pozicio[] asztalok = new Pozicio[] {
                new Pozicio(-32, 26),
                new Pozicio(-35, -34),
                new Pozicio(-11, -15),
                new Pozicio(18, -11),
                new Pozicio(-21, -12),
                new Pozicio(46, -15),
                new Pozicio(9, -28),
                new Pozicio(0, -3),
                new Pozicio(-25, 15),
                new Pozicio(-28, -39),
                new Pozicio(-31, -31),
                new Pozicio(-6, 4),
                new Pozicio(-46, 12),
                new Pozicio(-23, 11),
                new Pozicio(-42, 44),
                new Pozicio(7, -4),
                new Pozicio(50, -18),
                new Pozicio(44, -41),
                new Pozicio(33, -18),
                new Pozicio(-45, -37),
                new Pozicio(-33, 32),
                new Pozicio(19, -4),
                new Pozicio(10, 19),
                new Pozicio(26, -5),
                new Pozicio(-6, -50),
                new Pozicio(-27, 11),
                new Pozicio(-43, 0),
                new Pozicio(-21, 35),
                new Pozicio(-49, 17),
                new Pozicio(16, 50),
                new Pozicio(31, -3),
                new Pozicio(45, -41),
                new Pozicio(25, -36),
                new Pozicio(-38, 50),
                new Pozicio(-5, 14),
                new Pozicio(-23, -22),
                new Pozicio(18, -35),
                new Pozicio(-41, 18),
                new Pozicio(-10, 38),
                new Pozicio(5, 4),
                new Pozicio(31, -25),
                new Pozicio(-43, -26),
                new Pozicio(30, 2),
                new Pozicio(2, -17),
                new Pozicio(6, -43),
                new Pozicio(-42, -11),
                new Pozicio(-7, -40),
                new Pozicio(-49, 12),
                new Pozicio(-40, 50),
                new Pozicio(-40, -34),
                new Pozicio(4, 36),
                new Pozicio(29, -4),
                new Pozicio(29, -25),
                new Pozicio(42, -15),
                new Pozicio(31, -16),
                new Pozicio(-25, 5),
                new Pozicio(39, -5),
                new Pozicio(-47, -49),
                new Pozicio(-16, 37),
                new Pozicio(43, 35),
                new Pozicio(-15, 10),
                new Pozicio(6, -40),
                new Pozicio(-44, -19),
                new Pozicio(48, -42),
                new Pozicio(40, 0),
                new Pozicio(4, 23),
                new Pozicio(-6, -17),
                new Pozicio(33, -48),
                new Pozicio(-30, 50),
                new Pozicio(19, -15),
                new Pozicio(19, 22),
                new Pozicio(-6, 19),
                new Pozicio(3, -12),
                new Pozicio(4, -45),
                new Pozicio(-14, 7),
                new Pozicio(-21, -7),
                new Pozicio(45, 44),
                new Pozicio(-24, 49),
                new Pozicio(11, 20),
                new Pozicio(-6, -13),
                new Pozicio(21, 21),
                new Pozicio(-22, -8),
                new Pozicio(-27, 20),
                new Pozicio(45, -40),
                new Pozicio(-25, 7),
                new Pozicio(32, 7),
                new Pozicio(-29, -17),
                new Pozicio(-26, 0),
                new Pozicio(-5, 15),
                new Pozicio(-4, 10),
                new Pozicio(35, -48),
                new Pozicio(-20, 29),
                new Pozicio(34, 44),
                new Pozicio(3, 15),
                new Pozicio(46, 29),
                new Pozicio(-46, 4),
                new Pozicio(22, 48),
                new Pozicio(3, 14),
                new Pozicio(12, -33),
                new Pozicio(-33, 18),
                new Pozicio(-45, -29),
                new Pozicio(-26, 19),
                new Pozicio(-12, -1),
                new Pozicio(19, -49),
                new Pozicio(-19, -34),
                new Pozicio(26, 17),
                new Pozicio(-15, 29),
                new Pozicio(37, 47),
                new Pozicio(-29, -15),
                new Pozicio(41, 2),
                new Pozicio(-18, 37),
                new Pozicio(10, -21),
                new Pozicio(7, -24),
                new Pozicio(29, 10),
                new Pozicio(23, -14),
                new Pozicio(8, -10),
                new Pozicio(-26, 29),
                new Pozicio(-15, -36),
                new Pozicio(35, -10),
                new Pozicio(28, -32),
                new Pozicio(-43, -19),
                new Pozicio(-3, 6),
                new Pozicio(1, 28),
                new Pozicio(3, -28),
                new Pozicio(9, 14),
                new Pozicio(33, 43),
                new Pozicio(-31, 0),
                new Pozicio(-13, 26),
                new Pozicio(37, 28),
                new Pozicio(16, -12),
                new Pozicio(16, 34),
                new Pozicio(-5, 22),
                new Pozicio(-27, 1),
                new Pozicio(6, -24),
                new Pozicio(6, -9),
                new Pozicio(-30, 38),
                new Pozicio(-3, 17),
                new Pozicio(48, 15),
                new Pozicio(-32, -39),
                new Pozicio(27, 21),
                new Pozicio(-49, -10),
                new Pozicio(31, 4),
                new Pozicio(-32, 31),
                new Pozicio(-22, 44),
                new Pozicio(-23, -19),
                new Pozicio(40, -25),
                new Pozicio(-37, 6),
                new Pozicio(-19, -31),
                new Pozicio(15, 22),
                new Pozicio(42, -26),
                new Pozicio(13, 49),
                new Pozicio(30, 6),
                new Pozicio(-33, -36),
                new Pozicio(38, -27),
                new Pozicio(-23, 4),
                new Pozicio(-31, -43),
                new Pozicio(16, -47),
                new Pozicio(-8, -26),
                new Pozicio(20, -10),
                new Pozicio(-25, -28),
                new Pozicio(-2, -6),
                new Pozicio(8, 11),
                new Pozicio(28, 46),
                new Pozicio(14, 45),
                new Pozicio(9, 38),
                new Pozicio(-43, -41),
                new Pozicio(-36, 48),
                new Pozicio(45, -50),
                new Pozicio(3, 39),
                new Pozicio(38, 11),
                new Pozicio(5, -39),
                new Pozicio(2, -45),
                new Pozicio(44, 33),
                new Pozicio(-25, 19),
                new Pozicio(35, 50),
                new Pozicio(-15, -25),
                new Pozicio(9, 30),
                new Pozicio(-22, -36),
                new Pozicio(15, -12),
                new Pozicio(1, 13),
                new Pozicio(48, 5),
                new Pozicio(-33, 43),
                new Pozicio(-5, 50),
                new Pozicio(44, -25),
                new Pozicio(-20, -35),
                new Pozicio(-48, 20),
                new Pozicio(13, -21),
                new Pozicio(-29, 8),
                new Pozicio(27, -30),
                new Pozicio(-46, -47),
                new Pozicio(23, -2),
                new Pozicio(-48, -35),
                new Pozicio(9, 26),
                new Pozicio(25, -12),
                new Pozicio(18, 48),
                new Pozicio(41, 28),
                new Pozicio(-44, -40),
                new Pozicio(7, 37),
                new Pozicio(-37, 10),
                new Pozicio(18, 6),
                new Pozicio(27, 22),
                new Pozicio(-36, 36)
        };

        Pozicio[] ajtok = new Pozicio[] {
                new Pozicio(-50, 20),
                new Pozicio(-50, -20),
                new Pozicio(-50, 40),
                new Pozicio(-50, -40)
        };

        Epulet e = new Epulet(startPozicio, bunozok, falak, konyvespolcok, asztalok, ajtok);
        checkRunningTime(Epulet.class, "lepesekSzama", e, new Class[] {}, new Object[] {}, 1815, 10);
    }

}