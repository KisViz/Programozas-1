import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Atalakit {
    @Test
    public void teszt_01() {
        String atalakitott = Reakcio.atalakit("macska");
        assertEquals(":regional_indicator_m: :regional_indicator_a: :regional_indicator_c: :regional_indicator_s: :regional_indicator_k: :regional_indicator_a: ", atalakitott);
    }

    @Test
    public void teszt_02() {
        String atalakitott = Reakcio.atalakit("itt van egy macska az udvarunkban");
        assertEquals(":regional_indicator_i: :regional_indicator_t: :regional_indicator_t:    :regional_indicator_v: :regional_indicator_a: :regional_indicator_n:    :regional_indicator_e: :regional_indicator_g: :regional_indicator_y:    :regional_indicator_m: :regional_indicator_a: :regional_indicator_c: :regional_indicator_s: :regional_indicator_k: :regional_indicator_a:    :regional_indicator_a: :regional_indicator_z:    :regional_indicator_u: :regional_indicator_d: :regional_indicator_v: :regional_indicator_a: :regional_indicator_r: :regional_indicator_u: :regional_indicator_n: :regional_indicator_k: :regional_indicator_b: :regional_indicator_a: :regional_indicator_n: ", atalakitott);
    }

    @Test
    public void teszt_03() {
        String atalakitott = Reakcio.atalakit("en is szeretem a pizzat");
        assertEquals(":regional_indicator_e: :regional_indicator_n:    :regional_indicator_i: :regional_indicator_s:    :regional_indicator_s: :regional_indicator_z: :regional_indicator_e: :regional_indicator_r: :regional_indicator_e: :regional_indicator_t: :regional_indicator_e: :regional_indicator_m:    :regional_indicator_a:    :regional_indicator_p: :regional_indicator_i: :regional_indicator_z: :regional_indicator_z: :regional_indicator_a: :regional_indicator_t: ", atalakitott);
    }

    @Test
    public void teszt_04() {
        String atalakitott = Reakcio.atalakit("nyilvanvaloan otosre vizsgaztam mindenbol pontosan ugyanugy mint mindenki mas");
        assertEquals(":regional_indicator_n: :regional_indicator_y: :regional_indicator_i: :regional_indicator_l: :regional_indicator_v: :regional_indicator_a: :regional_indicator_n: :regional_indicator_v: :regional_indicator_a: :regional_indicator_l: :regional_indicator_o: :regional_indicator_a: :regional_indicator_n:    :regional_indicator_o: :regional_indicator_t: :regional_indicator_o: :regional_indicator_s: :regional_indicator_r: :regional_indicator_e:    :regional_indicator_v: :regional_indicator_i: :regional_indicator_z: :regional_indicator_s: :regional_indicator_g: :regional_indicator_a: :regional_indicator_z: :regional_indicator_t: :regional_indicator_a: :regional_indicator_m:    :regional_indicator_m: :regional_indicator_i: :regional_indicator_n: :regional_indicator_d: :regional_indicator_e: :regional_indicator_n: :regional_indicator_b: :regional_indicator_o: :regional_indicator_l:    :regional_indicator_p: :regional_indicator_o: :regional_indicator_n: :regional_indicator_t: :regional_indicator_o: :regional_indicator_s: :regional_indicator_a: :regional_indicator_n:    :regional_indicator_u: :regional_indicator_g: :regional_indicator_y: :regional_indicator_a: :regional_indicator_n: :regional_indicator_u: :regional_indicator_g: :regional_indicator_y:    :regional_indicator_m: :regional_indicator_i: :regional_indicator_n: :regional_indicator_t:    :regional_indicator_m: :regional_indicator_i: :regional_indicator_n: :regional_indicator_d: :regional_indicator_e: :regional_indicator_n: :regional_indicator_k: :regional_indicator_i:    :regional_indicator_m: :regional_indicator_a: :regional_indicator_s: ", atalakitott);
    }
}
