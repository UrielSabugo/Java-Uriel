package prueba;

public class POO {
    public static void main(String[] args) {

        //Alumno a2 = new Alumno();
        Alumno a1 = new Alumno(10, "Uriel","Sabugo");

        System.out.println("La id del alumno 2 es: " + a1.getterId());
        System.out.println(("El nombre es : " + a1.getterNombre()));
        System.out.println(("El apellido es : " + a1.getterApellido()));

    }


}
