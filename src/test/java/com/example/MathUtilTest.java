package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MathUtilTest {
    @Test
    void testMdcP1Impar() {
        int a=6, b=3 ;
        int esperado =3;
        int obtido = MathUtil.mdc(a,b);

        assertEquals(obtido,esperado);
    }

    @Test
    void testMdcP1par() {
        int a=6, b=2 ;
        int esperado =2;
        int obtido = MathUtil.mdc(a,b);

        assertEquals(obtido,esperado);
    }

    @Test
    void testMdcP3Negativo() {
        int a=-6, b=0 ;
        int esperado =6;
        int obtido = MathUtil.mdc(a,b);
        assertEquals(obtido,esperado);
    }

    @Test
    void testMdcP3Positivo() {
        int a=6, b=0 ;
        int esperado =6;
        int obtido = MathUtil.mdc(a,b);
        assertEquals(obtido,esperado);
    }
    @Test
    void testMdcP5() {
        int a=6, b=2 ;
        int esperado =MathUtil.mdc(a,b);
        int obtido = MathUtil.mdc(b,a);
        assertEquals(obtido,esperado);
    }
    @Test
    void testMdcP7() {
        int a=6, b=2 ;
        int esperado =MathUtil.mdc(-a,b);
        int obtido = MathUtil.mdc(-a,-b);
        assertEquals(obtido,esperado);
    }
}
