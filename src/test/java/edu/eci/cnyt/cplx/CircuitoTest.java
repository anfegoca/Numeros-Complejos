/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cnyt.cplx;

import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Imac
 */
public class CircuitoTest {
    Matriz o;
    Matriz X;
    
    @Before
    public void setUp() {
        Complex[][] m1 = {{new Complex(1,0)},{new Complex(0,0)}};
        Complex[][] m2 = {{new Complex(0,0),new Complex(1,0)},{new Complex(1,0),new Complex(0,0)}};
        o = new Matriz(m1);
        X = new Matriz(m2);
        
    }
    @Test
    public void circu(){
        Matriz p=o.productoTensor(o);
        Vector oo = new Vector(p.transpuesta().getNumeros()[0]);
        Complex[][] aux = {{new Complex(1,0),new Complex(1,0)},{new Complex(1,0),new Complex(-1,0)}};
        Matriz k = new Matriz(aux);
        Matriz H=k.productoEsca(new Complex(1/Math.sqrt(2),0));
        Matriz M1 = X.productoTensor(H);
        Matriz M2 = H.productoTensor(H);
        Vector M3 = M1.accionMatrizVector(oo);
        Vector y = M2.accionMatrizVector(M3);
        Complex[] a = y.getNumeros();
        System.out.print("{");
        for(int i=0;i<y.getDim();i++){
            System.out.print("("+a[i].getA()+", "+a[i].getA()+"), ");
            
        }
        System.out.println("}");
        
        
    }
}
