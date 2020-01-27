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
    Vector t;
    
    Matriz mat1;
    Matriz mat2;
    
    @Before
    public void setUp() {
         a= new Complex(2,2);
         b = new Complex(2,2);
         z = new Complex(1,5);
         w = new Complex(2,-3);
         Complex[] aux3 = {new Complex(16,2.3),new Complex(0,-7),new Complex(6,0),new Complex(0,-4)};
         Complex[] aux4 = {new Complex(6,3),new Complex(0,0),new Complex(5,1),new Complex(4,0)};
         Complex[] aux2 = {new Complex(16,2.3),new Complex(0,-7),new Complex(6,0),new Complex(0,-4)};
         Complex[] aux = {new Complex(6,-4),new Complex(7,3),new Complex(4.2,-8.1),new Complex(0,-3)};
         x = new Vector(aux);
         y = new Vector(aux2);
         v = new Vector(aux3);
         t= new Vector(aux4);
         Complex[][] m1 = {{new Complex(1,1),new Complex(0,-2)},{new Complex(3,-5),new Complex(4,0)}};
         Complex[][] m2 = {{new Complex(0,2),new Complex(1,1)},{new Complex(-1,-1),new Complex(0,0)}};
         mat1 = new Matriz(m1);
         mat2 = new Matriz(m2);
         
         
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
        //System.out.println("Hola"+res.getA());
        //System.out.println("HOLA"+res.getB());
        assertEquals(res,cor);
    }
    
    
    @Test
    public void testSumaVector() {
        Complex[] aux = {new Complex(22,-1.7000000000000002),new Complex(7,-4),new Complex(10.2,-8.1),new Complex(0,-7)};
        Vector cor = new Vector(aux);
        Vector res = x.suma(y);
        //System.out.println(res.getNumeros()[1].getA());
        //System.out.println(res.getNumeros()[1].getB());
        assertEquals(res,cor);
    }
    
    @Test
    public void InversaVector() {
        Complex[] aux = {new Complex(-6,4),new Complex(-7,-3),new Complex(-4.2,8.1),new Complex(0,3)};
        Vector cor = new Vector(aux);
        Vector res = x.inversa();
        assertEquals(res,cor);
    }
    @Test
    public void testMultEscalar() {
        Complex[] aux = {new Complex(12,21),new Complex(0,0),new Complex(13,13),new Complex(12,8)};
        Vector cor = new Vector(aux);
        Vector res = t.multEscalar(new Complex(3,2));
        assertEquals(res,cor);
    }
    @Test
    public void sumaMatriz() {
        Complex[][] m = {{new Complex(1,3),new Complex(1,-1)},{new Complex(2,-6),new Complex(4,0)}};
        Matriz cor = new Matriz(m);
        Matriz res = mat1.suma(mat2);
        assertEquals(res,cor);
    }
    @Test
    public void InversaMatriz() {
        Complex[][] m = {{new Complex(-1,-1),new Complex(0,2)},{new Complex(-3,5),new Complex(-4,0)}};
        Matriz cor = new Matriz(m);
        Matriz res = mat1.inversa();
        assertEquals(res,cor);
    }
    @Test
    public void productoEscalarMatriz() {
        Complex[][] m = {{new Complex(5,5),new Complex(0,-10)},{new Complex(15,-25),new Complex(20,0)}};
        Matriz cor = new Matriz(m);
        Matriz res = mat1.productoEsca(new Complex(5,0));
        assertEquals(res,cor);
    }
    @Test
    public void MatrizTranspuesta() {
        
        Complex[][] m = {{new Complex(1,1),new Complex(3,-5)},{new Complex(0,-2),new Complex(4,0)}};
        Matriz cor = new Matriz(m);
        Matriz res = mat1.transpuesta();
        assertEquals(res,cor);
    }
    @Test
    public void MatrizConjugada() {
        Complex[][] m = {{new Complex(1,-1),new Complex(0,2)},{new Complex(3,5),new Complex(4,0)}};
        Matriz cor = new Matriz(m);
        Matriz res = mat1.conjugada();
        assertEquals(res,cor);
    }
}
