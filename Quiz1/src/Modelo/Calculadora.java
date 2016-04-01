/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Scarlett
 */
public class Calculadora {
    
    private int operacion;

    public Calculadora(int opera) {
       this.operacion=opera;
    }

    public Calculadora() {
    }

    public int getOperacion() {
        return operacion;
    }

    public void setOperacion(int operacion) {
        this.operacion = operacion;
    }
     
    
    
    
}
