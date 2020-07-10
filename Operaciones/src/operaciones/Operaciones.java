/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author 59399
 */
public class Operaciones {

    public double Suma(double valorA, double valorB) {

        double suma;

        suma = valorA + valorB;

        return suma;

    }

    public double Resta(double valorA, double valorB) {

        double resta;

        resta = valorA - valorB;

        return resta;

    }

    public double Multiplicacion(double valorA, double valorB) {

        double multiplicacion;

        multiplicacion = valorA * valorB;

        return multiplicacion;

    }

    public double Division(double valorA, double valorB) {

        double division;

        division = valorA / valorB;

        return division;

    }
    
    public double Residuo(double valorA, double valorB) {

        double residuo;

        residuo = valorA % valorB;

        return residuo;

    }

}
