public class Lo {

    public static Lo[] lovakOsszeallnak() {
        Lo[] lovak = new Lo[10];
        for (int i = 0; i < 10; i++) {
            lovak[i] = new Lo();
        }

        return lovak;
    }

}