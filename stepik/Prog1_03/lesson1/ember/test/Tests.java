import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Tests extends BaseTest {
    @Test
    public void asit() {
        assertTrue("asit metodus hibas", testMethod(Ember.class, "asit", void.class, Modifier.PUBLIC));
    }

    @Test
    public void alszik() {
        assertTrue("alszik metodus hibas", testMethod(Ember.class, "alszik", void.class, Modifier.PUBLIC, int.class));
    }

    @Test
    public void eszik() {
        assertTrue("eszik metodus hibas", testMethod(Ember.class, "eszik", void.class, Modifier.PUBLIC, Etel.class));
    }

    @Test
    public void iszik() {
        assertTrue("iszik metodus hibas", testMethod(Ember.class, "iszik", void.class, Modifier.PUBLIC, Ital.class));
    }

    @Test
    public void okos() {
        assertTrue("okos metodus hibas", testMethod(Ember.class, "okos", boolean.class, Modifier.PUBLIC));
    }

    @Test
    public void ferfi() {
        assertTrue("ferfi metodus hibas", testMethod(Ember.class, "ferfi", boolean.class, Modifier.PUBLIC));
    }

    @Test
    public void vasarol() {
        assertTrue("vasarol metodus hibas", testMethod(Ember.class, "vasarol", boolean.class, Modifier.PUBLIC, int[].class));
    }

    @Test
    public void szamol() {
        assertTrue("szamol metodus hibas", testMethod(Ember.class, "szamol", int.class, Modifier.PUBLIC, int.class, int.class, int.class));
    }

    @Test
    public void velemeny() {
        assertTrue("velemeny metodus hibas", testMethod(Ember.class, "velemeny", String.class, Modifier.PUBLIC, int.class, double.class));
    }
}