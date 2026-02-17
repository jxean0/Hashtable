public class ejemplo2 {
    public static void main(String[] args) {
        int[][] repuestos = {
            {10, 25, 30, 15},
            {40, 55, 20, 35},
            {60, 45, 70, 25},
            {80, 15, 50, 90}
        };

        for (int i = 0; i < repuestos.length; i++) {
            int maxFila = repuestos[i][0];
            for (int j = 1; j < repuestos[i].length; j++) {
                if (repuestos[i][j] > maxFila) maxFila = repuestos[i][j];
            }
            System.out.println("Máximo fila " + i + ": " + maxFila);
        }

        for (int j = 0; j < repuestos[0].length; j++) {
            int maxCol = repuestos[0][j];
            for (int i = 1; i < repuestos.length; i++) {
                if (repuestos[i][j] > maxCol) maxCol = repuestos[i][j];
            }
            System.out.println("Máximo columna " + j + ": " + maxCol);
        }
    }
}