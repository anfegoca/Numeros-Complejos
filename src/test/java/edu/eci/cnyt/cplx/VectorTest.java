/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cnyt.cplx;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Imac
 */
public class VectorTest {
    
    
    Vector x;
    Vector y;
    Vector v;
    Vector t;
    @Before
    public void setUp() {
         Complex[] aux3 = {new Complex(16,2.3),new Complex(0,-7),new Complex(6,0),new Complex(0,-4)};
         Complex[] aux4 = {new Complex(6,3),new Complex(0,0),new Complex(5,1),new Complex(4,0)};
         Complex[] aux2 = {new Complex(16,2.3),new Complex(0,-7),new Complex(6,0),new Complex(0,-4)};
         Complex[] aux = {new Complex(6,-4),new Complex(7,3),new Complex(4.2,-8.1),new Complex(0,-3)};
         x = new Vector(aux);
         y = new Vector(aux2);
         v = new Vector(aux3);
         t= new Vector(aux4);
         
         
         
    }
    @Test
    public void testEqualsVector() {
        assertEquals(y,v);
        
    }
    @Test
    public void testSumaVector() {
        Complex[] aux = {new Complex(22,-1.7000000000000002),new Complex(7,-4),new Complex(10.2,-8.1),new Complex(0,-7)};
        Vector cor = new Vector(aux);
        Vector res = x.suma(y);
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
    public void productoInterno(){
        Complex[] aux = {new Complex(3,0),new Complex(-6,0),new Complex(2,0)};
        Complex cor =new Complex(49,0);
        Vector v1 = new Vector(aux);
        Vector v2 = new Vector(aux);
        Complex res = v1.productoInterno(v2);
        assertEquals(res,cor);
    }
    @Test
    public void normaVector(){
        Complex[] aux = {new Complex(3,0),new Complex(-6,0),new Complex(2,0)};
        Vector v1 = new Vector(aux);
        double res = v1.normaVector();
        double cor = Math.sqrt(49);
        assertEquals(res,cor,2);
    }
    @Test
    public void distanciaVectores(){
        Complex[] aux = {new Complex(3,0),new Complex(1,0),new Complex(2,0)};
        Complex[] aux2 = {new Complex(2,0),new Complex(2,0),new Complex(-1,0)};
        Vector v1 = new Vector(aux);
        Vector v2 = new Vector(aux2);
        double res = v1.distanciaVectores(v2);
        double cor = Math.sqrt(11);
        assertEquals(res,cor,2);
    }
}
