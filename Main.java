public class Main {
    
    public static void main(String args[]) {
        Vista vista = new Vista();
        int filas = vista.pedirEntero("Ingrese la cantidad de filas:  ");
        int columnas = vista.pedirEntero("Ingrese la cantidad de columnas: ");
        Matriz matriz = new Matriz(filas, columnas);
        vista.imprimirMatriz(matriz.getMatriz());
    }
    
}