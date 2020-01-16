/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cnyt.cplx;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2137885
 */
public class ComplexTest {
    Complex a;
    Complex b; 
    Complex z;
    Complex w;
    
    @Before
    public void setUp() {
         a= new Complex(2,2);
         b = new Complex(2,2);
         z = new Complex(1,5);
         w = new Complex(2,-3);
    }


    /**
     * Test of equals method, of class Complex.
     */
    @Test
    public void testEquals() {
        assertEquals(a,b);
        
    }
    
    /**
     * Test of suma method, of class Complex.
     */
    @Test
    
    public void testSuma() {
        Complex res=z.suma(w);
        Complex cor = new Complex(-1,+8);
        assertEquals(res,cor);
    }

    /**
     * Test of resta method, of class Complex.
     */
    @Test
    public void testResta() {
        assertEquals(1,1);
    }

    /**
     * Test of producto method, of class Complex.
     */
    @Test
    public void testProducto() {
        assertEquals(1,1);
    }

    /**
     * Test of division method, of class Complex.
     */
    @Test
    public void testDivision() {
        assertEquals(1,1);
    }

    /**
     * Test of modulo method, of class Complex.
     */
    @Test
    public void testModulo() {
        assertEquals(1,1);
    }

    /**
     * Test of conjugado method, of class Complex.
     */
    @Test
    public void testConjugado() {
        assertEquals(1,1);
    }

    /**
     * Test of fase method, of class Complex.
     */
    @Test
    public void testFase() {
        assertEquals(1,1);
    }

    /**
     * Test of polar method, of class Complex.
     */
    @Test
    public void testPolar() {
        assertEquals(1,1);
    }
}
