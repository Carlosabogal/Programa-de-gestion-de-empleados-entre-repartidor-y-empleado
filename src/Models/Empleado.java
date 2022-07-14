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
public class Empleado {

    protected String Nombre;
    protected Integer Edad;
    protected Integer Salario;
    protected Integer Bonificacion;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer Edad) {
        this.Edad = Edad;
    }

    public Integer getSalario() {
        return Salario;
    }

    public void setSalario(Integer Salario) {
        this.Salario = Salario;
    }

    public Integer getBonificacion() {
        return Bonificacion;
    }

    public void setBonificacion(Integer Bonificacion) {
        this.Bonificacion = Bonificacion;
    }

    public void AsignarBonificacion() {
        Bonificacion = 150000;
    }

    public Empleado(String Nombre, Integer Edad, Integer Salario, Integer Bonificacion) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Salario = Salario;
        this.Bonificacion = Bonificacion;
    }

}
