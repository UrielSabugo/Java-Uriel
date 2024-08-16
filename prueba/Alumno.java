package prueba;

public class Alumno {
    //atributos de la clase(caracteristicas)
    int id;
    String nombre;
    String apellido;

    //metodos
    public void mostrarNombre(){
        
        System.out.println("Hola soy un alumno y se decir mi nombre");
    }

    public void saberAprobado(double calificacion){
        if (calificacion>=6){
            System.out.println("Aprobe la materia");
        }
        else{
            System.out.println("No aprobe");
        }
        
    }

    //metodos constructores(permiten crear objetos)
    public Alumno(){

    }

    public Alumno(int id,String nombre, String apellido){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // getter and setters

    public int getterId(){ //Devuelve un valor(get)
        return id;
    }

    public void settersId(int id){ //coloca un valor(set)
        this.id = id;
    }
    
    public String getterNombre(){ //Devuelve un valor(get)
        return nombre;
    }

    public void settersNombre(String nombre){ //coloca un valor(set)
        this.nombre = nombre;
    }
    
    public String getterApellido(){ //Devuelve un valor(get)
        return apellido;
    }

    public void settersApellido(String apellido){ //coloca un valor(set)
        this.apellido = apellido;
    }

}
