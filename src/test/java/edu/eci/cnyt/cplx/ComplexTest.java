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
        Complex cor = new Complex(3,2);
        assertEquals(res,cor);
    }

    /**
     * Test of resta method, of class Complex.
     */
    @Test
    public void testResta() {
        Complex res=z.resta(w);
        Complex cor = new Complex(-1,8);
        assertEquals(res,cor);
    }

    /**
     * Test of producto method, of class Complex.
     */
    @Test
    public void testProducto() {
        Complex res=z.producto(w);
        Complex cor = new Complex(17,7);
        assertEquals(res,cor);
    }

    /**
     * Test of division method, of class Complex.
     */
    @Test
    public void testDivision() {
        Complex res=z.division(w);
        Complex cor = new Complex(-1.0000000000000002,1.0000000000000002);
        assertEquals(res,cor);
    }

    /**
     * Test of modulo method, of class Complex.
     */
    @Test
    public void testModulo() {
        boolean res2=false;
        double res=z.modulo();
        double cor=5.0990195135927845;
        if(res==cor){
            res2=true;
        }
        assertTrue(res2);
        
    }

    /**
     * Test of conjugado method, of class Complex.
     */
    @Test
    public void testConjugado() {
        Complex res=z.conjugado();
        Complex cor = new Complex(1,-5);
        assertEquals(res,cor);
    }

    /**
     * Test of fase method, of class Complex.
     */
    @Test
    public void testFase() {
        boolean res2=false;
        double res=z.fase();
        double cor=1.373400766945016;
        if(res==cor){
            res2=true;
        }
        assertTrue(res2);
    }

    /**
     * Test of polar method, of class Complex.
     */
    @Test
    public void testPolar() {
        Polar res=z.polar();
        Polar cor=new Polar(5.0990195135927845,1.373400766945016);
        assertEquals(res,cor);
    }
    
    
    
}
