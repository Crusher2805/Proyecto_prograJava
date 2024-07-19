/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprograbasica;

import javax.swing.JOptionPane;


public class RegistroHabitats {
    public String nombre;
    public String tipoAmbiente;
    public int capacidad;

    public RegistroHabitats(String nombre, String tipoAmbiente, int capacidad) {
        this.nombre = nombre;
        this.tipoAmbiente = tipoAmbiente;
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAmbiente() {
        return tipoAmbiente;
    }

    public void setTipoAmbiente(String tipoAmbiente) {
        this.tipoAmbiente = tipoAmbiente;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public static void pideinfo (RegistroHabitats arrHabitats[]){
        for (int i = 0; i < arrHabitats.length; i++) {
            JOptionPane.showInternalMessageDialog(null, "Se solicitaran los datos del habitat que se quiere registrar");
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del habitat:");
            String tipoAmbiente = JOptionPane.showInputDialog(null, "Ingrese el tipo de ambiente del habitat:");
            int capacidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la capacidad del habitat:"));
            arrHabitats[i] = new RegistroHabitats(nombre, tipoAmbiente, capacidad);
            
        }
    }
    
    public static void muestrainfo (RegistroHabitats arrHabitats[]){
        for (int i = 0; i < arrHabitats.length; i++) {
            JOptionPane.showInternalMessageDialog(null, arrHabitats[i].getNombre()+""+arrHabitats[i].getTipoAmbiente()+""+arrHabitats[i].getCapacidad());
            
        }
    }
}
