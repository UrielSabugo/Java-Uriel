package lib;

public class HijoEmpleado extends Empleado {
    private int dni;
    private String Nombre;
    private int naciemiento;

    public HijoEmpleado(){ //constructor vacio
    }

    public HijoEmpleado(int dni, String Nombre, int naciemiento){ // constructor con parametros

        this.Nombre=Nombre;
        this.dni=dni;
        this.naciemiento=naciemiento;
    }
    
    public int getterDni(){ //Devuelve un valor(get)
        return dni;
    }

    public void settersDni(int id){ //coloca un valor(set)
        this.dni = dni;
    }

    public void setNombre(String valor) {
        Nombre = valor;
    }

    public String getNombre(){
        return Nombre;
    }

    public void setDni(int valor) {
        dni = valor;
    }

    public int getDni(){
        return dni;
    }

    public void setNacimiento(int valor) {
        naciemiento = valor;
    }

    public int getNacimiento(){
        return naciemiento;
    }

    public int getEdad(){
        return 2024-naciemiento;
    }



}

