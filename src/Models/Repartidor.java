/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Usuario
 */
public class Repartidor extends Empleado {

    private String Zona;

    public Repartidor(String Zona, String Nombre, Integer Edad, Integer Salario, Integer Bonificacion) {
        super(Nombre, Edad, Salario, Bonificacion);
        this.Zona = Zona;
    }

    

    public String getZona() {
        return Zona;
    }

    public void setZona(String Zona) {
        this.Zona = Zona;
    }

    @Override
    public void AsignarBonificacion() {

        if (this.Edad <= 25 && this.Zona == "zona 3") {
            this.Bonificacion = 150000;
        }
    }
}
