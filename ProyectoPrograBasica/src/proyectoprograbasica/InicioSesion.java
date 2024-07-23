/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprograbasica;

import javax.swing.JOptionPane;

/**
 *
 * @author David Hernandez
 */
public class InicioSesion {

    private int tipoUsuario;
    private String user;
    private String password;

    public void iniciarSesion() {
        String login = JOptionPane.showInputDialog(null, "Bienvenido al Sistema De Registro del Zoologico UFIDE \nIngrese (1) para Administradores o (2) para Operadores");

        tipoUsuario = Integer.parseInt(login);

        if (tipoUsuario == 1) {
            String user = JOptionPane.showInputDialog(null, "Ingresa tu usuario");
            String password = JOptionPane.showInputDialog(null, "Ingresa tu contraseña");

            if (user.equals("Admin") && password.equals("159753")) {
                JOptionPane.showMessageDialog(null, "Bienvenido al sistema!");
            } else {
                JOptionPane.showMessageDialog(null, "Usuario y contraseña incorrectas, intentalo de nuevo");
                iniciarSesion();
            }
        } else if (tipoUsuario == 2) {
            JOptionPane.showMessageDialog(null, "Bienvenido operador.");
        } else {
            JOptionPane.showMessageDialog(null, "Tipo de usuario no válido. Intente nuevamente.");
            iniciarSesion();
        }
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String user) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
