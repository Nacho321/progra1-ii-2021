/** 
 * Clase que representa una matriz de numeros aleatorios únicos.
 */
import java.util.Random;

public class Matriz {
    
    // La matriz de enteros unicos.
    private int[][] miMatriz;
    // En numerosUsados voy guardado los numeros que voy ingresando para
    // verificar que sean unicos antes de ingresarlos.
    private int[] numerosUsados;
    
    // Cuenta de cuantos numeros he generado.
    private int totalGenerados = 0;
    
    /**
     * Genera una matriz de "x" por "y" de enteros unicos.
     * 
     * @param int la cantidad de filas
     * @param int la cantidad de columnas
     */
    public Matriz(int x, int y) {
        miMatriz = new int[x][y];
        numerosUsados = new int[x*y];
        this.generarNumeros(x, y);
    }
    
    /**
     * Devuelve la matriz de numeros unicos.
     * 
     * @return la matriz de enteros
     */
    public int[][] getMatriz() {
        return this.miMatriz;
    }
    
    private void generarNumeros(int x, int y) { 
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                miMatriz[i][j] = generarNumeroAleatorio(x, y);
            }
        }
    }
    
    private int generarNumeroAleatorio(int x, int y) {
        boolean generado = false;
        Random random = new Random();
        // Esta variable me va a representar un entero unico aleatorio
        int aleatorio = 0;
        while (generado == false){ 
            boolean repetido = false;
            aleatorio = random.nextInt(x*y) + 1;
            if (!estaRepetido(aleatorio)) {
                generado = true;
                numerosUsados[totalGenerados] = aleatorio;
                totalGenerados++;
            }
        }
        return aleatorio;
    }
    
    private boolean estaRepetido(int potencialNuevoNumero) {
        for (int i = 0; i < totalGenerados; i++) {
            if (numerosUsados[i] == potencialNuevoNumero) {
                return true;
            }
        }
        return false;
    }
}