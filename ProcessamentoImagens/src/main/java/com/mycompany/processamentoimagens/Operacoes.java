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
    public static Integer GAUSSIANO = 12;

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
    
    public static int calculaFiltroGaussiano(Integer[][] focus, Double desvioPadrao) {
        int tamanhoKernel = 5;
            double[][] kernel = getKernelGaussiano(tamanhoKernel, desvioPadrao);

            double soma = 0.0;
            int metadeTamanho = tamanhoKernel / 2;

            for (int i = 0; i < focus.length; i++) {
                for (int j = 0; j < focus[i].length; j++) {
                    for (int x = 0; x < tamanhoKernel; x++) {
                        for (int y = 0; y < tamanhoKernel; y++) {
                            int novoX = i + x - metadeTamanho;
                            int novoY = j + y - metadeTamanho;

                            if (novoX >= 0 && novoX < focus.length && novoY >= 0 && novoY < focus[i].length) {
                                soma += focus[novoX][novoY] * kernel[x][y];
                            }
                        }
                    }
                }
            }

            int novoValor = (int) Math.round(soma);
            return novoValor;
    }
    
    public static double[][] getKernelGaussiano(int tamanho, double desvioPadrao) {
        double[][] kernel = new double[tamanho][tamanho];
        double soma = 0.0;
        int metadeTamanho = tamanho / 2;

        for (int x = 0; x < tamanho; x++) {
            for (int y = 0; y < tamanho; y++) {
                int deslocamentoX = x - metadeTamanho;
                int deslocamentoY = y - metadeTamanho;
                double exponent = -((deslocamentoX * deslocamentoX + deslocamentoY * deslocamentoY) / (2.0 * desvioPadrao * desvioPadrao));
                kernel[x][y] = (1.0 / (2.0 * Math.PI * desvioPadrao * desvioPadrao)) * Math.exp(exponent);
                soma += kernel[x][y];
            }
        }

        for (int x = 0; x < tamanho; x++) {
            for (int y = 0; y < tamanho; y++) {
                kernel[x][y] /= soma;
            }
        }

        return kernel;
    }
}
