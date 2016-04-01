/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Validador;
import Vista.GUICalculadora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Scarlett
 */
public class ControladorPrincipal implements ActionListener {

    GUICalculadora calculadora;
    Validador validador;

    public ControladorPrincipal(GUICalculadora calculadora) {
        this.calculadora = calculadora;
        this.validador = new Validador();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getActionCommand().equalsIgnoreCase("Calcular")) {

            try {
                if (validador.equals(true)) {

                    calculadora.getPanelResultados3().llenarTextArea(calculadora.getExpre());
                }

            } catch (Exception e) {
            }

        }

    }

}
