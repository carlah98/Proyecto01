/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carla
 */
package cuentas;

public class Main {

    public static void main(String[] args) {
    }

    public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        double saldoActual;
        
       
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            cuenta1.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }

    
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695f);  // Se pasa como 'float'
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
