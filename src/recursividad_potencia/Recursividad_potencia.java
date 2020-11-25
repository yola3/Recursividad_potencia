/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad_potencia;

import java.util.Scanner;

public class Recursividad_potencia {

    public static void main(String[] args) {
        int Base;
        int exponente;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el numero base.");
        Base = leer.nextInt();
        System.out.println("ingrese el valor del exponente.");// se solicita el valor de la variable a utilizar desde el teclado
        exponente = leer.nextInt();
        System.out.println("el total de la potencia del numero introducido es:");
        System.out.println(potencia(Base, exponente));// se manda imprimir 
    }

    public static int potencia(int base, int Exponente) {//metodo recursivo con parametro que nos servirapara guardar el valor de los datos que se iran ingresando
        if (Exponente == 0) {//condicion o caso base
            return 1;
        } else {
            return base * potencia(base, Exponente - 1);//se llama asi mismo el metodo calculando la potencia y creando un bucle el cual terminara cumpliendose la condicion.

        }

    }

}
