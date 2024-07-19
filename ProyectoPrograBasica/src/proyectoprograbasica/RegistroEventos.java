/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprograbasica;

import javax.swing.JOptionPane;

public class RegistroEventos {

    public String nombre;
    public String fecha;
    public int id;
    public String descripcion;

    public RegistroEventos(String nombre, String fecha, int id, String descripcion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.id = id;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public static void pideinfo(RegistroEventos arrEventos[]) {
        for (int i = 0; i < arrEventos.length; i++) {
            JOptionPane.showMessageDialog(null, "Se solicitaran los datos del evento que quiere registar" );
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del evento:");
            String fecha = JOptionPane.showInputDialog(null, "Ingrese la fecha del evento:");
            int id = Integer.parseInt(JOptionPane.showInputDialog(null, "digite el id para el evento:"));
            String descripcion = JOptionPane.showInputDialog(null, "Escriba una descripcion para el evento");
            arrEventos[i] = new RegistroEventos(nombre, fecha, id, descripcion);

        }
    }

    public static void muestrainfo(RegistroEventos arrEventos[]) {
        for (int i = 0; i < arrEventos.length; i++) {
            JOptionPane.showMessageDialog(null, arrEventos[i].getNombre() + "" + arrEventos[i].getFecha() + "" + arrEventos[i].getId() + "" + arrEventos[i].getDescripcion());

        }
    }
}
