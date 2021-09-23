/**
 * La clase Vista para la interfaz del usuario
 */
import java.util.Scanner;

public class Vista {
    
    private Scanner scanner = new Scanner(System.in);
    
    /** 
     * Le solicita al usuario un entero a partir de un mensaje
     * 
     * @return el entero
     */
    public int pedirEntero(String mensaje) {
        System.out.println(mensaje);
        return scanner.nextInt();
    }
    
    /**
     * Imprime una matriz en formato tabla
     * 
     * @param int[][] la matriz de enteros
     */
    public void imprimirMatriz(int[][] matriz) {
        String linea;
        for (int i = 0; i < matriz.length; i++) {
            linea = "";
            for (int j = 0; j < matriz[0].length; j++) {
                linea += matriz[i][j] + "\t";
            }
            System.out.println(linea);
        }
    }
}