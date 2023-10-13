package com.mycompany.processamentoimagens;

import java.awt.image.BufferedImage;

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

    public static BufferedImage applyGaussianFilter(BufferedImage inputImage, double sigma) {
        int width = inputImage.getWidth();
        int height = inputImage.getHeight();
        BufferedImage outputImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        int kernelSize = (int) (6 * sigma);
        kernelSize = (kernelSize % 2 == 0) ? kernelSize + 1 : kernelSize;

        int halfKernel = kernelSize / 2;

        double[][] kernel = new double[kernelSize][kernelSize];
        double kernelSum = 0.0;

        for (int x = -halfKernel; x <= halfKernel; x++) {
            for (int y = -halfKernel; y <= halfKernel; y++) {
                double exponent = -(x * x + y * y) / (2.0 * sigma * sigma);
                kernel[x + halfKernel][y + halfKernel] = Math.exp(exponent) / (2.0 * Math.PI * sigma * sigma);
                kernelSum += kernel[x + halfKernel][y + halfKernel];
            }
        }

        for (int x = 0; x < kernelSize; x++) {
            for (int y = 0; y < kernelSize; y++) {
                kernel[x][y] /= kernelSum;
            }
        }

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                double red = 0.0, green = 0.0, blue = 0.0;

                for (int i = -halfKernel; i <= halfKernel; i++) {
                    for (int j = -halfKernel; j <= halfKernel; j++) {
                        int pixelX = x + i;
                        int pixelY = y + j;

                        if (pixelX >= 0 && pixelX < width && pixelY >= 0 && pixelY < height) {
                            int pixel = inputImage.getRGB(pixelX, pixelY);
                            int r = (pixel >> 16) & 0xff;
                            int g = (pixel >> 8) & 0xff;
                            int b = pixel & 0xff;

                            red += r * kernel[i + halfKernel][j + halfKernel];
                            green += g * kernel[i + halfKernel][j + halfKernel];
                            blue += b * kernel[i + halfKernel][j + halfKernel];
                        }
                    }
                }

                int newPixel = ((int) red << 16) | ((int) green << 8) | (int) blue;
                outputImage.setRGB(x, y, newPixel);
            }
        }

        return outputImage;
    }

    public static BufferedImage applyMaxFilter(BufferedImage inputImage, int windowSize) {
        int width = inputImage.getWidth();
        int height = inputImage.getHeight();
        BufferedImage outputImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        int halfWindowSize = windowSize / 2;

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                int maxRed = 0, maxGreen = 0, maxBlue = 0;

                for (int i = -halfWindowSize; i <= halfWindowSize; i++) {
                    for (int j = -halfWindowSize; j <= halfWindowSize; j++) {
                        int pixelX = x + i;
                        int pixelY = y + j;

                        if (pixelX >= 0 && pixelX < width && pixelY >= 0 && pixelY < height) {
                            int pixel = inputImage.getRGB(pixelX, pixelY);
                            int r = (pixel >> 16) & 0xff;
                            int g = (pixel >> 8) & 0xff;
                            int b = pixel & 0xff;

                            maxRed = Math.max(maxRed, r);
                            maxGreen = Math.max(maxGreen, g);
                            maxBlue = Math.max(maxBlue, b);
                        }
                    }
                }

                int newPixel = (maxRed << 16) | (maxGreen << 8) | maxBlue;
                outputImage.setRGB(x, y, newPixel);
            }
        }

        return outputImage;
    }

    public static BufferedImage applyMinFilter(BufferedImage inputImage, int windowSize) {
        int width = inputImage.getWidth();
        int height = inputImage.getHeight();
        BufferedImage outputImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        int halfWindowSize = windowSize / 2;

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                int minRed = 255, minGreen = 255, minBlue = 255;

                for (int i = -halfWindowSize; i <= halfWindowSize; i++) {
                    for (int j = -halfWindowSize; j <= halfWindowSize; j++) {
                        int pixelX = x + i;
                        int pixelY = y + j;

                        if (pixelX >= 0 && pixelX < width && pixelY >= 0 && pixelY < height) {
                            int pixel = inputImage.getRGB(pixelX, pixelY);
                            int r = (pixel >> 16) & 0xff;
                            int g = (pixel >> 8) & 0xff;
                            int b = pixel & 0xff;

                            minRed = Math.min(minRed, r);
                            minGreen = Math.min(minGreen, g);
                            minBlue = Math.min(minBlue, b);
                        }
                    }
                }

                int newPixel = (minRed << 16) | (minGreen << 8) | minBlue;
                outputImage.setRGB(x, y, newPixel);
            }
        }

        return outputImage;
    }

    public static BufferedImage applyAverageFilter(BufferedImage inputImage, int windowSize) {
        int width = inputImage.getWidth();
        int height = inputImage.getHeight();
        BufferedImage outputImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        int halfWindowSize = windowSize / 2;

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                int sumRed = 0, sumGreen = 0, sumBlue = 0;
                int totalPixels = 0;

                for (int i = -halfWindowSize; i <= halfWindowSize; i++) {
                    for (int j = -halfWindowSize; j <= halfWindowSize; j++) {
                        int pixelX = x + i;
                        int pixelY = y + j;

                        if (pixelX >= 0 && pixelX < width && pixelY >= 0 && pixelY < height) {
                            int pixel = inputImage.getRGB(pixelX, pixelY);
                            int r = (pixel >> 16) & 0xff;
                            int g = (pixel >> 8) & 0xff;
                            int b = pixel & 0xff;

                            sumRed += r;
                            sumGreen += g;
                            sumBlue += b;
                            totalPixels++;
                        }
                    }
                }

                int avgRed = sumRed / totalPixels;
                int avgGreen = sumGreen / totalPixels;
                int avgBlue = sumBlue / totalPixels;

                int newPixel = (avgRed << 16) | (avgGreen << 8) | avgBlue;
                outputImage.setRGB(x, y, newPixel);
            }
        }

        return outputImage;
    }

    public static BufferedImage applyMedianFilter(BufferedImage inputImage, int windowSize) {
        int width = inputImage.getWidth();
        int height = inputImage.getHeight();
        BufferedImage outputImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        int halfWindowSize = windowSize / 2;
        int totalPixelsInWindow = windowSize * windowSize;
        int[] pixelValues = new int[totalPixelsInWindow];

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                int index = 0;

                for (int i = -halfWindowSize; i <= halfWindowSize; i++) {
                    for (int j = -halfWindowSize; j <= halfWindowSize; j++) {
                        int pixelX = x + i;
                        int pixelY = y + j;

                        if (pixelX >= 0 && pixelX < width && pixelY >= 0 && pixelY < height) {
                            int pixel = inputImage.getRGB(pixelX, pixelY);
                            int grayValue = (pixel >> 16) & 0xff;  // Use apenas o canal de vermelho como escala de cinza
                            pixelValues[index++] = grayValue;
                        }
                    }
                }

                // Ordena os valores da janela para encontrar a mediana
                sort(pixelValues);

                int medianIndex = totalPixelsInWindow / 2;
                int medianValue = pixelValues[medianIndex];

                int newPixel = (medianValue << 16) | (medianValue << 8) | medianValue;
                outputImage.setRGB(x, y, newPixel);
            }
        }

        return outputImage;
    }

    private static void sort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }

    public static BufferedImage applyOrderFilter(BufferedImage inputImage, int windowSize, int k) {
        int width = inputImage.getWidth();
        int height = inputImage.getHeight();
        BufferedImage outputImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        int halfWindowSize = windowSize / 2;
        int totalPixelsInWindow = windowSize * windowSize;
        int[] pixelValues = new int[totalPixelsInWindow];

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                int index = 0;

                for (int i = -halfWindowSize; i <= halfWindowSize; i++) {
                    for (int j = -halfWindowSize; j <= halfWindowSize; j++) {
                        int pixelX = x + i;
                        int pixelY = y + j;

                        if (pixelX >= 0 && pixelX < width && pixelY >= 0 && pixelY < height) {
                            int pixel = inputImage.getRGB(pixelX, pixelY);
                            int grayValue = (pixel >> 16) & 0xff;  // Use apenas o canal de vermelho como escala de cinza
                            pixelValues[index++] = grayValue;
                        }
                    }
                }

                // Ordena os valores da janela
                sort(pixelValues);

                int orderValue = pixelValues[k];
                int newPixel = (orderValue << 16) | (orderValue << 8) | orderValue;
                outputImage.setRGB(x, y, newPixel);
            }
        }

        return outputImage;
    }

    public static BufferedImage applyConservativeSmoothing(BufferedImage inputImage, int windowSize, int threshold) {
        int width = inputImage.getWidth();
        int height = inputImage.getHeight();
        BufferedImage outputImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        int halfWindowSize = windowSize / 2;

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                int centralPixel = inputImage.getRGB(x, y);
                int centralGray = (centralPixel >> 16) & 0xff;  // Use o canal de vermelho como escala de cinza

                boolean isEdgePixel = false;

                for (int i = -halfWindowSize; i <= halfWindowSize; i++) {
                    for (int j = -halfWindowSize; j <= halfWindowSize; j++) {
                        int pixelX = x + i;
                        int pixelY = y + j;

                        if (pixelX >= 0 && pixelX < width && pixelY >= 0 && pixelY < height) {
                            int neighborPixel = inputImage.getRGB(pixelX, pixelY);
                            int neighborGray = (neighborPixel >> 16) & 0xff;

                            if (Math.abs(centralGray - neighborGray) > threshold) {
                                isEdgePixel = true;
                                break;
                            }
                        }
                    }
                    if (isEdgePixel) {
                        break;
                    }
                }

                if (isEdgePixel) {
                    // Se for uma borda, mantenha o pixel original
                    outputImage.setRGB(x, y, centralPixel);
                } else {
                    // Caso contrário, aplique suavização
                    int smoothedPixel = applySmoothing(inputImage, x, y, windowSize);
                    outputImage.setRGB(x, y, smoothedPixel);
                }
            }
        }

        return outputImage;
    }

    public static int applySmoothing(BufferedImage inputImage, int x, int y, int windowSize) {
        int width = inputImage.getWidth();
        int height = inputImage.getHeight();
        int halfWindowSize = windowSize / 2;
        int totalPixelsInWindow = windowSize * windowSize;
        int sumGray = 0;

        for (int i = -halfWindowSize; i <= halfWindowSize; i++) {
            for (int j = -halfWindowSize; j <= halfWindowSize; j++) {
                int pixelX = x + i;
                int pixelY = y + j;

                if (pixelX >= 0 && pixelX < width && pixelY >= 0 && pixelY < height) {
                    int pixel = inputImage.getRGB(pixelX, pixelY);
                    int grayValue = (pixel >> 16) & 0xff;  // Use apenas o canal de vermelho como escala de cinza
                    sumGray += grayValue;
                }
            }
        }

        int smoothedGray = sumGray / totalPixelsInWindow;
        int smoothedPixel = (smoothedGray << 16) | (smoothedGray << 8) | smoothedGray;

        return smoothedPixel;
    }
}
