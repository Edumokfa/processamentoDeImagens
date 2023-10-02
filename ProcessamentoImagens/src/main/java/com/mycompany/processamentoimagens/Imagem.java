package com.mycompany.processamentoimagens;

import java.awt.image.BufferedImage;
import java.io.Serializable;

public class Imagem implements Serializable {

    private BufferedImage image;
    private int[][] red;
    private int[][] green;
    private int[][] blue;
    private int[][] alpha;

    public Imagem() {
    }

    public Imagem(BufferedImage img) {
        int colunas = img.getWidth();
        int linhas = img.getHeight();
        this.red = new int[colunas][linhas];
        this.green = new int[colunas][linhas];
        this.blue = new int[colunas][linhas];
        this.alpha = new int[colunas][linhas];

        for (int y = 0; y < linhas; y++) {
            for (int x = 0; x < colunas; x++) {
                int clr = img.getRGB(x, y);
                this.alpha[x][y] = 255;
                this.red[x][y] = (clr >> 16) & 255;
                this.green[x][y] = (clr >> 8) & 255;
                this.blue[x][y] = clr & 255;
            }
        }

        this.image = img;
    }

    public Imagem(int width, int height) {
        int cols = width;
        int rows = height;

        this.red = new int[cols][rows];
        this.green = new int[cols][rows];
        this.blue = new int[cols][rows];
        this.alpha = new int[cols][rows];
    }

    public BufferedImage getMatrixImage() {
        int width = getWidth();
        int height = getHeight();

        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int argb = (255 << 24) | (red[x][y] << 16) | (green[x][y] << 8) | blue[x][y];
                img.setRGB(x, y, argb);
            }
        }
        return img;
    }

    public int getWidth() {
        return this.red.length;
    }

    public int getHeight() {
        return this.red[0].length;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public int[][] getRed() {
        return red;
    }

    public void setRed(int[][] red) {
        this.red = red;
    }

    public int[][] getGreen() {
        return green;
    }

    public void setGreen(int[][] green) {
        this.green = green;
    }

    public int[][] getBlue() {
        return blue;
    }

    public void setBlue(int[][] blue) {
        this.blue = blue;
    }

    public int[][] getAlpha() {
        return alpha;
    }

    public void setAlpha(int[][] alpha) {
        this.alpha = alpha;
    }
}
