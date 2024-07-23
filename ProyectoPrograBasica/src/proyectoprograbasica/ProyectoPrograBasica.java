/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template

 */
package proyectoprograbasica;

import javax.swing.JOptionPane;

public class ProyectoPrograBasica {

    public static void main(String[] args) {
        boolean salir = false;

        while (!salir) {

            InicioSesion enter = new InicioSesion();
            enter.iniciarSesion();

            boolean sesionActiva = true;

            while (sesionActiva) {
                byte opcion = Byte.parseByte(JOptionPane.showInputDialog(null,
                        "1.Registro de animales\n2.Registro de habitats\n3.Registro de eventos\n4.Registro de visitantes\n5.Gestión de alimentación\n6.Mapa del zoologico"
                        + "\n7. Para Salir del programa " + "\n\nDigite el número de la opcion que desea ver:"));

                switch (opcion) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Ingresaste a Registro de animales");

                        if (enter.getTipoUsuario() == 1) {
                            RegistroAnimales[] arrAnimales = new RegistroAnimales[2];
                            RegistroAnimales.pideinfo(arrAnimales);
                            RegistroAnimales.muestrainfo(arrAnimales);
                        } else {
                            JOptionPane.showMessageDialog(null, "Solo Admins pueden modificar data");
                            continue;
                        }

                    case 2:
                        JOptionPane.showMessageDialog(null, "Ingresaste a Registro de habitats");
                        RegistroHabitats[] arrHabitats = new RegistroHabitats[2];
                        RegistroHabitats.pideinfo(arrHabitats);
                        RegistroHabitats.muestrainfo(arrHabitats);
                        break;

                    case 3:
                        JOptionPane.showMessageDialog(null, "Ingresaste a Registro de eventos");
                        RegistroEventos[] arrEventos = new RegistroEventos[1];
                        RegistroEventos.pideinfo(arrEventos);
                        RegistroEventos.muestrainfo(arrEventos);
                        break;

                    case 4:
                        JOptionPane.showMessageDialog(null, "Ingresaste a Registro de visitantes");
                        break;

                    case 5:
                        JOptionPane.showMessageDialog(null, "Ingresaste a Registro de gestion de alimentacion");
                        break;

                    case 6:
                        JOptionPane.showMessageDialog(null, "Ingresaste a Mapa del zoologico");
                        break;

                    case 7:
                        if (enter.getTipoUsuario() == 1) {
                            JOptionPane.showMessageDialog(null, " Cerrando sesion. Vuelve a iniciar sesión ");
                            sesionActiva = false;
                        } else {
                            sesionActiva = false;
                            salir = true;
                            JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                        }
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida. Intente nuevamente.");
                        break;
                }
            }
        }
    }
}
