/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cnyt.cplx;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Imac
 */
public class MatrizTest {
    
    
    Matriz mat1;
    Matriz mat2;
    
    @Before
    public void setUp() {
        Complex[][] m1 = {{new Complex(1,1),new Complex(0,-2)},{new Complex(3,-5),new Complex(4,0)}};
        Complex[][] m2 = {{new Complex(0,2),new Complex(1,1)},{new Complex(-1,-1),new Complex(0,0)}};
        mat1 = new Matriz(m1);
        mat2 = new Matriz(m2);
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
    @Test
    public void productoMatriz() {
        Complex[][] matr1 = {{new Complex(1,0),new Complex(-2,0)},{new Complex(3,0),new Complex(-4,0)}};
        Complex[][] matr2 = {{new Complex(2,0),new Complex(1,0)},{new Complex(3,0),new Complex(0,0)}};
        Matriz matriz1 = new Matriz(matr1);
        Matriz matriz2 = new Matriz(matr2);
        Complex[][] m = {{new Complex(-4,4),new Complex(0,2)},{new Complex(6,2),new Complex(8,-2)}};
        Matriz cor = new Matriz(m);
        Matriz res = mat1.producto(mat2);
        /*
        Complex[][] aux = res.getNumeros();
        for(int i=0;i<res.getM();i++){
            for(int j=0;j<res.getN();j++){
                System.out.println("i "+i+" j "+j+" valor "+aux[i][j].getA()+" "+aux[i][j].getB());
            }
        }
        System.out.println();
       
        */
        assertEquals(res,cor);
    }
    
    @Test
    public void accionMatrizVector() {
        
        Complex[][] matr1 = {{new Complex(1,4),new Complex(7,-1),new Complex(0,1)},{new Complex(4,0),new Complex(7,-1),new Complex(4,0)},{new Complex(0,1),new Complex(4,0),new Complex(5,6)}};
        Complex[] vec2 = {new Complex(5,6),new Complex(0,1),new Complex(7,-1)};
        Matriz matriz1 = new Matriz(matr1);
        Vector vector2 = new Vector(vec2);
        Complex[] m = {new Complex(-17,40),new Complex(49,27),new Complex(35,46)};
        Vector cor = new Vector(m);
        Vector res = matriz1.accionMatrizVector(vector2);
        /*
        Complex[][] aux = res.getNumeros();
        for(int i=0;i<res.getM();i++){
            for(int j=0;j<res.getN();j++){
                System.out.println("i "+i+" j "+j+" valor "+aux[i][j].getA()+" "+aux[i][j].getB());
            }
        }
        System.out.println(res.equals(cor));
        */
        
        assertEquals(res,cor);
    }
    @Test
    public void unitaria(){
        Complex[][] matr1 = {{new Complex(0,1),new Complex(0,0)},{new Complex(0,0),new Complex(0,1)}};
        Matriz matriz1 = new Matriz(matr1);
        boolean res = matriz1.esUnitaria();
        assertTrue(res);
    }
    @Test
    public void hermitian(){
        Complex[][] matr1 = {{new Complex(7,0),new Complex(6,5)},{new Complex(6,-5),new Complex(-3,0)}};
        Matriz matriz1 = new Matriz(matr1);
        boolean res = matriz1.hermitian();
        assertTrue(res);
    }
    @Test
    public void productoTensor(){
        Complex[][] matr1 = {{new Complex(1,0),new Complex(2,0)},{new Complex(0,0),new Complex(1,0)}};
        Complex[][] matr2 = {{new Complex(3,0),new Complex(2,0)},{new Complex(-1,0),new Complex(0,0)}};
        Complex[][] m = {{new Complex(3,0),new Complex(2,0),new Complex(6,0),new Complex(4,0)},{new Complex(-1,0),new Complex(0,0),new Complex(-2,0),new Complex(0,0)},{new Complex(0,0),new Complex(0,0),new Complex(3,0),new Complex(2,0)},{new Complex(0,0),new Complex(0,0),new Complex(-1,0),new Complex(0,0)}};
        Matriz matriz1 = new Matriz(matr1);
        Matriz matriz2 = new Matriz(matr2);
        Matriz cor = new Matriz(m);
        Matriz res = matriz1.productoTensor(matriz2);
        assertEquals(res,cor);
    }
    
}
