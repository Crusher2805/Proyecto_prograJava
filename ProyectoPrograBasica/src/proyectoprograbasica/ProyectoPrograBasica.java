/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template

 */
package proyectoprograbasica;

import javax.swing.JOptionPane;

public class ProyectoPrograBasica {

    public static void main(String[] args) {

        RegistroAnimales Gorillaz = new RegistroAnimales("moni", "Gorila", 12, "selva");
        int intentos = 0;
        byte opcion = 0;

        String lectura1 = JOptionPane.showInputDialog("Bienvenido al Sistema De Registro del Zoologico UFIDE, cuál es su nombre?");
        String lectura2 = JOptionPane.showInputDialog(null, " Ingrese  (1)  para Administradores o  (2)  para Operadores ");

        int adminVisitante = Integer.parseInt(lectura2);

        if (adminVisitante == 1) {
            String user = JOptionPane.showInputDialog(null, " Ingresa tu usuario ");
            String password = JOptionPane.showInputDialog(null, " Ingresa tu contraseña ");

            if (user.equals("Admin") && password.equals("159753")) {
                JOptionPane.showMessageDialog(null, " Bienvenido al sistema " + lectura1 + "!");
                opcion = Byte.parseByte(JOptionPane.showInputDialog(null,
                        "1.Registro de animales\n2.Registro de habitats\n3.Registro de eventos\n4.Registro de visitantes\n5.Gestión de alimentación\n6.Mapa del zoologico"
                        + "\n7. Para Salir del programa " + "\n\nDigite el número de la opcion que desea ver:"));
            } else {
                JOptionPane.showMessageDialog(null, " Usuario y contraseña incorrectas, intentalo de nuevo ");
            }
        } else if (adminVisitante == 2) {
            String user = JOptionPane.showInputDialog(null, " Ingresa tu usuario ");
            String password = JOptionPane.showInputDialog(null, " Ingresa tu contraseña ");

            if (user.equals("Jimi123") && password.equals("1234") || user.equals("David123") && password.equals("4567") || user.equals("Gabi123") && password.equals("7891") || user.equals("Andres8521") && password.equals("9632")) {
                JOptionPane.showMessageDialog(null, " Bienvenido al sistema " + lectura1 + "!");
                opcion = Byte.parseByte(JOptionPane.showInputDialog(null,
                        "1.Registro de animales\n2.Registro de habitats\n3.Registro de eventos\n4.Registro de visitantes\n5.Gestión de alimentación\n6.Mapa del zoologico"
                        + "\n7. Para Salir del programa " + "\n\nDigite el número de la opcion que desea ver:"));
            } else {
                JOptionPane.showMessageDialog(null, " Usuario y contraseña incorrectas ");
            }
        } else {
            JOptionPane.showMessageDialog(null, " La opcion ingresada es invalida, ingresa una opcion valida ");
        }

        switch (opcion) {
            case 1:
                JOptionPane.showMessageDialog(null, " Ingresaste a Registro de animales ");
                JOptionPane.showMessageDialog(null, " Por el momento solo tenemos un gorila jaja " + "  Se llama " + Gorillaz.getnombre());
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Ingresaste a Registro de habitats");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, " Ingresaste a Registro de eventos ");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, " Ingresaste a Registro de visitantes ");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, " Ingreaste a Registro de gestion de alimentacion ");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, " Ingresaste a Mapa del zoologico ");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, " Saliendo del sistema...");
                break;
            default:
                JOptionPane.showMessageDialog(null, " La opcion ingresada es invalida, ingresa una opcion valida");
        }
    }
}
