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
public class Comercial extends Empleado {

    private Integer Comision;

    public Comercial(Integer Comision, String Nombre, Integer Edad, Integer Salario, Integer Bonificacion) {
        super(Nombre, Edad, Salario, Bonificacion);
        this.Comision = Comision;
    }

    public Integer getComision() {
        return Comision;
    }

    public void setComision(Integer Comision) {
        this.Comision = Comision;
    }

    @Override
    public void AsignarBonificacion() {

        if (this.Edad >= 30 && this.Comision >= 400000) {
         
            this.Bonificacion = 150000;
        } 

    }
}
