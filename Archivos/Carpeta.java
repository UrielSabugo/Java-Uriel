package Archivos;
import java.util.ArrayList;
import java.util.List;
public class Carpeta extends ArchivoBase {

    private List<ArchivoBase> contenidos;

    public Carpeta(int tamanio, String nombre) {
        super(tamanio, nombre); 
        this.contenidos= new ArrayList<>();//Incializamos la lista
    }

    public void agregarContenido(ArchivoBase contenido) {
        this.contenidos.add(contenido); // agregamos archivo o carpetas
    }

    public int calcularTamanioTotal(){

        int tamanioTotal= this.getTamanio();

        for(ArchivoBase contenido : contenidos){
            if (contenido instanceof Carpeta){
                tamanioTotal+=((Carpeta)contenido).calcularTamanioTotal();
            }
            else{
                tamanioTotal+=contenido.getTamanio();
            }
        }

        return tamanioTotal;
    }

    
}
