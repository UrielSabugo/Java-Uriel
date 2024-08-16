package lib;
import java.util.ArrayList;

import java.util.List;

public class Empleado{

    private String nombre;
    private int hijos;
    private int horasTrabajadas;
    private int montoPorHora;
    private int montoPorHijo; 
    private int cantidadDeHijo;
    private int cantidadDeHijos;

    private List<HijoEmpleado>hijoLista = new ArrayList<HijoEmpleado>();

    public void agregarHijos(HijoEmpleado hijo){
        hijoLista.add(hijo);
    }


    public void setNombre(String valor) {
        nombre = valor;
    }

    public String getNombre(){
        return nombre;
    }

    public int calcularSueldo() {
        return montoPorHora * horasTrabajadas + hijos * montoPorHijo;
    }

    public int getMontoPorHora() { 
        return montoPorHora;
    }

    public int getHijos() {
        return hijos;
    }

    public void setHijos(int valor) {
        hijos = valor;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int valor) {
        horasTrabajadas = valor;
    }

    public void setMontoPorHora(int valor) {
        montoPorHora = valor;
    }

    public void setMontoPorHijo(int valor) {
        montoPorHijo = valor;
    }

    public static void main(String[] args) {
        HijoEmpleado e1= new HijoEmpleado(4510, "Uriel", 2004);
        Empleado h1= new Empleado();
        h1.agregarHijos(e1);
        System.out.println();
  
    
    }
}
