package GoL;

import java.util.ArrayList;

class Celula{
    private boolean estaViva;

    public Celula(boolean b) { //7 PREGUNTAR-{{{{{{{{{{{}}}}}}}}}}}
    }

    public boolean getViva() //7 retorna el estado de la celula
    {   
        return estaViva;
    }

    public void setViva(boolean viva) ///establece el estado de la celula
    {
        this.estaViva = viva;
    }

    public class Tablero{     

        //doonde almacenamos el tamaño de el tablero
        private int filas;
        private int columnas;
        private boolean viva; 

        private ArrayList<ArrayList<Celula>>celda; //almacenamos celdas en lista d {
        
        public Tablero(int filas, int columnas){
            celda = new ArrayList<>();
            for(int i = 0; i< filas; i ++)
            {
                ArrayList<Celula> fila = new ArrayList<>();

                for(int j = 0; j< filas; j ++)
                {
                    fila.add(new Celula(false));//empezamos con las celulas muertas

                }
                celda.add(fila);

            }
        }
            

        public ArrayList<ArrayList<Celula>> getCelda() //retorna el tablero
        {
            return celda;
        }

        public void setCelula(int filas, int columna, boolean viva)//establecemos el estado de una celula
        {
            if (filas>=0 && filas <celda.size() && columna>=0 && columna< celda.get(0).size()) {
                celda.get(filas).get(columna).setViva(viva);
            }
        }
////////////////////////////////////////////////////////
        public int contarVecinosVivos(int fila, int columna) {
            int vivos = 0;
            int[] direcciones = {-1, 0, 1};
    
            for (int i : direcciones) {
                for (int j : direcciones) {
                    if (i == 0 && j == 0) {
                        continue; // Ignorar la célula actual
                    }
                    int nuevaFila = fila + i;
                    int nuevaColumna = columna + j;
    
                    if (nuevaFila >= 0 && nuevaFila < celda.size() &&
                        nuevaColumna >= 0 && nuevaColumna < celda.get(0).size() &&
                        celda.get(nuevaFila).get(nuevaColumna).getViva()) {
                        vivos++;
                    }
                }
            }
    
            return vivos;
        }

        
    }

    
}
