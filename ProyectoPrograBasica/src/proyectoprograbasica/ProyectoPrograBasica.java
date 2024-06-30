/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template

 */
package proyectoprograbasica;

import javax.swing.JOptionPane;

public class ProyectoPrograBasica {

    public static void main(String[] args) {
        RegistroAnimales Gorillaz = new RegistroAnimales("moni", "Gorila", 12, "selva");
                
        String Lectura1;
        byte edad;
        byte opcion = 0;
        while (true) {
            Lectura1 = JOptionPane.showInputDialog("Bienvenido al Sistema De Registro del Zoologico UFIDE, cuál es su nombre?");
            edad = Byte.parseByte(JOptionPane.showInputDialog(null, "Digite su edad"));
            if (edad >= 18) {
                JOptionPane.showMessageDialog(null, " Bienvenido al sistema " + Lectura1 + "!");
                opcion = Byte.parseByte(JOptionPane.showInputDialog(null,
                        "1.Registro de animales\n2.Registro de habitats\n3.Registro de eventos\n4.Registro de visitantes\n5.Gestión de alimentación\n6.Mapa del zoologico"
                        + "\n7. Para Salir del programa " + "\n\nDigite el número de la opcion que desea ver:"));
            } else {
                JOptionPane.showMessageDialog(null, "No tiene acceso al sistema, intentelo mas tarde");
            }
            if (opcion == 7) {
                JOptionPane.showMessageDialog(null, " Saliendo del sistema...");
                break;
            } else if (opcion > 7 ){
                JOptionPane.showMessageDialog(null, " La opcion ingresada es invalida, ingreaa una opcion valida");
            }
            if (opcion == 1) {
                JOptionPane.showMessageDialog(null, " Ingresaste a Registro de animales ");
                
                JOptionPane.showMessageDialog(null, " Por el momento solo tenemos un gorila jaja " + "  Se llama " + Gorillaz.getnombre());
            }
            if (opcion == 2){
                JOptionPane.showMessageDialog(null, "Ingresaste a Registro de habitats");
            }
            if (opcion == 3){
                JOptionPane.showMessageDialog(null, " Ingresaste a Registro de eventos ");
            }
            if (opcion == 4){
                JOptionPane.showMessageDialog(null, " Ingresaste a Registro de visitantes ");    
            }
            if (opcion == 5){
               JOptionPane.showMessageDialog(null, " Ingreaste a Registro de gestion de alimentacion ");
            }
            if (opcion == 6){
                JOptionPane.showMessageDialog(null, " Ingresaste a Mapa del zoologico ");
            }
        }
    }
}

