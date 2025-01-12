public class Eger {
    public static int kurzormozgatas(Pozicio a, Pozicio b) {
        int x = b.x - a.x;
        int y = b.y - a.y;

        if (x == 0 && y == 0) {
            return 0;
        }

        if (x == 0) {
            return y > 0 ? 90 : 270;
        }

        if (y == 0) {
            return x > 0 ? 0 : 180;
        }

        double res = Math.atan(y/(x+0.0)) * 180 / Math.PI;

        if (x > 0 && y > 0) {
            return (int) Math.round(res);
        }

        if (x > 0) {
            return (int) Math.round(res + 360);
        }

        return (int) Math.round(res + 180);

    }
}