public class ejemplo1 {
    public static void main(String[] args) {
        int[][] placas = {
            {101, 202, 303, 404},
            {505, 606, 707, 808},
            {909, 110, 211, 312},
            {413, 514, 615, 716}
        };

        for (int i = 0; i < placas.length; i++) {
            int maxFila = placas[i][0];
            for (int j = 1; j < placas[i].length; j++) {
                if (placas[i][j] > maxFila) maxFila = placas[i][j];
            }
            System.out.println("Máximo fila " + i + ": " + maxFila);
        }

        for (int j = 0; j < placas[0].length; j++) {
            int maxCol = placas[0][j];
            for (int i = 1; i < placas.length; i++) {
                if (placas[i][j] > maxCol) maxCol = placas[i][j];
            }
            System.out.println("Máximo columna " + j + ": " + maxCol);
        }
    }
}