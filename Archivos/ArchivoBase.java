package Archivos;

public class ArchivoBase {
    private int tamanio;
    private String nombre;

    public ArchivoBase(int tamanio, String nombre) {
        this.tamanio = tamanio;
        this.nombre = nombre;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamanioCarpetaUcp(){
        return tamanio;
        
    }
}
