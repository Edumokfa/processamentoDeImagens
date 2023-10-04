package com.mycompany.processamentoimagens;

public class Operacoes {

    public static Integer SOMA = 1;
    public static Integer SUBTRACAO = 2;
    public static Integer DIVISAO = 3;
    public static Integer MULTIPLICACAO = 4;
    public static Integer AND = 5;
    public static Integer OR = 6;
    public static Integer XOR = 7;
    public static Integer NOT = 8;
    public static Integer BLENDING = 9;
    public static Integer NEGATIVO = 10;
    public static Integer HISTOGRAMA = 11;

    public static String R = "R";
    public static String G = "G";
    public static String B = "B";

    public static Integer calculaSoma(Integer x, Integer y) {
        return x + y;
    }

    public static Integer calculaSubtracao(Integer x, Integer y) {
        return x - y;
    }

    public static Integer calculaDivisao(Integer x, Integer y) {
        if (y == 0) {
            return x;
        }
        return x / y;
    }

    public static Integer calculaMultiplicacao(Integer x, Integer y) {
        return x * y;
    }

    public static Integer calculaAnd(Integer x, Integer y) {
        boolean v1 = x > 0;
        boolean v2 = y > 0;
        return (v1 && v2) ? 255 : 0;
    }

    public static Integer calculaOr(Integer x, Integer y) {
        boolean v1 = x > 0;
        boolean v2 = y > 0;
        return (v1 || v2) ? 255 : 0;
    }

    public static Integer calculaXor(Integer x, Integer y) {
        boolean v1 = x > 0;
        boolean v2 = y > 0;
        return (v1 ^ v2) ? 255 : 0;
    }

    public static Integer calculaNot(Integer x) {
        if (x == 255) {
            return 0;
        }
        return 255;
    }

    public static Integer calculaBlending(Integer x, Integer y, Integer coeficiente) {
        double resultadoCoeficiente = coeficiente / 100.0;
        double result = resultadoCoeficiente * x + (1 - resultadoCoeficiente) * y;
        return (int) Math.round(result);
    }

    public static Integer calculaNegativo(Integer x) {
        return 255 - x;
    }

    public static Integer calculaHistograma(Integer x, String corAtual) {
        if (R.equals(corAtual)) {
            return (x >> 16) & 0XFF;
        } else if (G.equals(corAtual)) {
            return (x >> 8) & 0XFF;
        } else {
            return x & 0XFF;
        }
    }

    private static int getFiltroMax(Integer[][] focus, Double desvioPadrao) {
        int width = focus.length;
        int height = focus[0].length;
        int maxValue = 0;

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (focus[x][y] != null && focus[x][y] > maxValue) {
                    maxValue = focus[x][y];
                }
            }
        }

        return maxValue;
    }

    public static Imagem applyFilterInImage(Imagem image, int bounds, String tipoFiltro) {
        Imagem imageResult = new Imagem();
        imageResult.setRed(filterSingleMatrix(image.getRed(), bounds, tipoFiltro, null));
        imageResult.setGreen(filterSingleMatrix(image.getGreen(), bounds, tipoFiltro, null));
        imageResult.setBlue(filterSingleMatrix(image.getBlue(), bounds, tipoFiltro, null));
        return imageResult;
    }

    private static int[][] filterSingleMatrix(int[][] matrix, Integer bounds, String tipoFiltro, Double desvioPadrao) {
        int width = matrix.length;
        int height = matrix[0].length;
        int[][] filteredMatrix = new int[width][height];

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Integer[][] focus = getFocus(matrix, bounds, x, y);
                if ("M".equals(tipoFiltro)) {
                    filteredMatrix[x][y] = getFiltroMax(focus, desvioPadrao);
                }

            }
        }

        return filteredMatrix;
    }

    private static Integer[][] getFocus(int[][] matrix, Integer bounds, int posX, int posY) {
        int focusSize = bounds * 2 + 1;
        Integer[][] focus = new Integer[focusSize][focusSize];

        for (int y = 0; y < focusSize; y++) {
            for (int x = 0; x < focusSize; x++) {
                int posFocusX = posX + (x - bounds);
                int posFocusY = posY + (y - bounds);
                if (isPositionValid(matrix, posFocusX, posFocusY)) {
                    focus[x][y] = matrix[posFocusX][posFocusY];
                }
            }
        }
        return focus;
    }

    private static boolean isPositionValid(int[][] matrix, int posX, int posY) {
        int width = matrix.length;
        int height = matrix[0].length;

        return posX >= 0 && posX < width && posY >= 0 && posY < height;
    }
}
