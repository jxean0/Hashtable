public class ejemplo3 {
    public static void main(String[] args) {
        int[][] carros = {
            {2018, 2019, 2020, 2021},
            {2015, 2017, 2022, 2016},
            {2010, 2023, 2014, 2013},
            {2012, 2011, 2024, 2009}
        };

        for (int i = 0; i < carros.length; i++) {
            int maxFila = carros[i][0];
            for (int j = 1; j < carros[i].length; j++) {
                if (carros[i][j] > maxFila) maxFila = carros[i][j];
            }
            System.out.println("Máximo fila " + i + ": " + maxFila);
        }

        for (int j = 0; j < carros[0].length; j++) {
            int maxCol = carros[0][j];
            for (int i = 1; i < carros.length; i++) {
                if (carros[i][j] > maxCol) maxCol = carros[i][j];
            }
            System.out.println("Máximo columna " + j + ": " + maxCol);
        }
    }
}