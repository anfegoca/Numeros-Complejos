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

    Vector x;
    Vector y;
    Vector v;
 
    
    @Before
    public void setUp() {
         a= new Complex(2,2);
         b = new Complex(2,2);
         z = new Complex(1,5);
         w = new Complex(2,-3);
         Complex[] aux3 = {new Complex(16,2.3),new Complex(0,-7),new Complex(6,0),new Complex(0,-4)};
         Complex[] aux2 = {new Complex(16,2.3),new Complex(0,-7),new Complex(6,0),new Complex(0,-4)};
         Complex[] aux = {new Complex(6,-4),new Complex(7,3),new Complex(4.2,-8.1),new Complex(0,-3)};
         x = new Vector(aux);
         y = new Vector(aux2);
         v = new Vector(aux3);

    }


    /**
     * Test of equals method, of class Complex.
     */
    @Test
    public void testEquals() {
        assertEquals(a,b);
        
    }
    
    @Test
    public void testEqualsVector() {
        assertEquals(y,v);
        
    }
    
    /**
     * Test of suma method, of class Complex.
     */
    @Test
    
    public void testSuma() {
        Complex res=z.suma(w);
        //Complex res2= new Complex(1,0).producto(new Complex(3,-4));
        //Complex res3= new Complex(0,2).producto(new Complex(-1,0));
        //res2 = res2.suma(res3);
 
        
        Complex cor = new Complex(3,2);
        //System.out.println("Hola"+res2.getA());
        //System.out.println("HOLA"+res2.getB());
        assertEquals(res,cor);
    }

    /**
     * Test of resta method, of class Complex.
     */
    @Test
    public void testResta() {
        assertFalse(false);
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
    
    
    @Test
    public void testSumaVector() {
        Complex[] aux = {new Complex(22,-1.7000000000000002),new Complex(7,-4),new Complex(10.2,-8.1),new Complex(0,-7)};
        Vector cor = new Vector(aux);
        Vector res = x.suma(y);
        System.out.println(res.getNumeros()[1].getA());
        System.out.println(res.getNumeros()[1].getB());
        assertEquals(res,cor);
    }
    
    @Test
    public void Inversavector() {
        Complex[] aux = {new Complex(-6,4),new Complex(-7,-3),new Complex(-4.2,8.1),new Complex(0,3)};
        Vector cor = new Vector(aux);
        Vector res = x.inversa();
        assertEquals(res,cor);
    }
}
