/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprograbasica;

import javax.swing.JOptionPane;

public class RegistroAnimales {

    public String nombre;
    public String Especie;
    public int edad;
    public String habitat;

    public RegistroAnimales(String nombre, String Especie, int edad, String habitat) {
        this.nombre = nombre;
        this.Especie = Especie;
        this.edad = edad;
        this.habitat = habitat;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String Especie) {
        this.Especie = Especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public static void pideinfo(RegistroAnimales arrAnimales[]) {
        for (int i = 0; i < arrAnimales.length; i++) {
            JOptionPane.showMessageDialog(null, "Se solicitaran los datos del animal que se quiere registar" );
            String nombre = JOptionPane.showInputDialog(null, "Escriba el nombre del animal:");
            String Especie = JOptionPane.showInputDialog(null, "Escriba la especie a la que pertenece el animal:");
            int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba la edad del animal:"));
            String habitat = JOptionPane.showInputDialog(null, "Escriba el habitat al que pertenece el animal");
            arrAnimales[i] = new RegistroAnimales(nombre, Especie, edad, habitat);

        }
    }

    public static void muestrainfo(RegistroAnimales arrAnimales[]) {
        for (int i = 0; i < arrAnimales.length; i++) {
            JOptionPane.showMessageDialog(null, arrAnimales[i].getNombre() + "" + arrAnimales[i].getEspecie() + "" + arrAnimales[i].getEdad() + "" + arrAnimales[i].getHabitat());

        }
    }
}
