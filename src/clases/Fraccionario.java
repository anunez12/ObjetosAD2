/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

/**
 *
 * @author anunez12
 */
public class Fraccionario { 
    private int numerador;private int denominador; 
    public Fraccionario(int numerador,int denominador) throws ExcepcionFraccionario{ 
     this.numerador=numerador; 
     this.denominador=denominador; 
     if(denominador==0){ 
      throw new ExcepcionFraccionario();
      
     }
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    public Fraccionario Sumar(Fraccionario f2) throws ExcepcionFraccionario{ 
       int numerador,denominador;Fraccionario f;  
       numerador=this.numerador *f2.denominador + this.denominador * f2.numerador; 
       denominador=this.denominador *f2.denominador; 
       f=new Fraccionario(numerador,denominador); 
       return f;
    } 
    public Fraccionario Restar(Fraccionario f2) throws ExcepcionFraccionario{ 
     int numerador,denominador;Fraccionario f; 
     numerador=this.numerador * f2.denominador - this.denominador * f2.numerador; 
     denominador=this.denominador* f2.denominador; 
     f=new Fraccionario(numerador, denominador); 
     return f;
    }
}
