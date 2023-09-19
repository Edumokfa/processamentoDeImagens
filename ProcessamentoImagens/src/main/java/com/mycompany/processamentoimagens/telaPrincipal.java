package com.mycompany.processamentoimagens;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Eduardo Mokfa
 */
public class telaPrincipal extends javax.swing.JFrame {

    private Imagem imageA;
    private Imagem imageB;
    private Imagem imageResult;
    
    public telaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelResultado = new javax.swing.JLabel();
        labelImage1 = new javax.swing.JLabel();
        labelImage2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAnd = new javax.swing.JButton();
        btnOr = new javax.swing.JButton();
        btnNot = new javax.swing.JButton();
        btnXor = new javax.swing.JButton();
        btnCarregarImgA = new javax.swing.JButton();
        btnCarregarImgB = new javax.swing.JButton();
        btnEscalaCinza = new javax.swing.JButton();
        btnBinario = new javax.swing.JButton();
        btnNegativo = new javax.swing.JButton();
        tfAdicao = new javax.swing.JTextField();
        btnAdicao = new javax.swing.JButton();
        tfSubtracao = new javax.swing.JTextField();
        btnSubtracao = new javax.swing.JButton();
        tfBlending = new javax.swing.JTextField();
        btnBlending = new javax.swing.JButton();
        tfMultiplicacao = new javax.swing.JTextField();
        btnMultiplicacao = new javax.swing.JButton();
        tfDivisao = new javax.swing.JTextField();
        btnDivisao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(labelResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 250, 250));

        labelImage1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(labelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 250, 250));

        labelImage2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(labelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 250, 250));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 0));
        jLabel1.setText("=");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 20, 30));

        btnAnd.setText("AND");
        btnAnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 120, -1));

        btnOr.setText("OR");
        btnOr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrActionPerformed(evt);
            }
        });
        getContentPane().add(btnOr, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 120, -1));

        btnNot.setText("NOT");
        btnNot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotActionPerformed(evt);
            }
        });
        getContentPane().add(btnNot, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 120, -1));

        btnXor.setText("XOR");
        btnXor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXorActionPerformed(evt);
            }
        });
        getContentPane().add(btnXor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 120, -1));

        btnCarregarImgA.setText("Carregar Imagem A");
        btnCarregarImgA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarImgAActionPerformed(evt);
            }
        });
        getContentPane().add(btnCarregarImgA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 250, -1));

        btnCarregarImgB.setText("Carregar Imagem B");
        btnCarregarImgB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarImgBActionPerformed(evt);
            }
        });
        getContentPane().add(btnCarregarImgB, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 250, -1));

        btnEscalaCinza.setText("Escala de Cinza");
        btnEscalaCinza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscalaCinzaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEscalaCinza, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 120, -1));

        btnBinario.setText("Binário");
        btnBinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBinarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnBinario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 120, -1));

        btnNegativo.setText("Negativo");
        btnNegativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegativoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNegativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 250, -1));
        getContentPane().add(tfAdicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 120, 20));

        btnAdicao.setText("Adição");
        btnAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 120, -1));

        tfSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSubtracaoActionPerformed(evt);
            }
        });
        getContentPane().add(tfSubtracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 120, 20));

        btnSubtracao.setText("Subtração");
        btnSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtracaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSubtracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 120, -1));

        tfBlending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBlendingActionPerformed(evt);
            }
        });
        getContentPane().add(tfBlending, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 120, -1));

        btnBlending.setText("Blending");
        btnBlending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBlendingActionPerformed(evt);
            }
        });
        getContentPane().add(btnBlending, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 120, -1));

        tfMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMultiplicacaoActionPerformed(evt);
            }
        });
        getContentPane().add(tfMultiplicacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 120, -1));

        btnMultiplicacao.setText("Multiplicação");
        btnMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnMultiplicacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 120, -1));

        tfDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDivisaoActionPerformed(evt);
            }
        });
        getContentPane().add(tfDivisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, 120, -1));

        btnDivisao.setText("Divisão");
        btnDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnDivisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndActionPerformed
        if (!validateImgAAndB()) {
            return;
        }

        Imagem imgABinario = new Imagem(getBinaryImage(imageA));
        Imagem imgBBinario = new Imagem(getBinaryImage(imageB));

        Imagem imgResultado = doOperationInImages(imgABinario, imgBBinario, null, Operation.AND);
        this.labelResultado.setIcon(new ImageIcon(imgResultado.getMatrixImage()));
    }//GEN-LAST:event_btnAndActionPerformed

    private void btnOrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrActionPerformed
        if (!validateImgAAndB()) {
            return;
        }

        Imagem imgABinario = new Imagem(getBinaryImage(imageA));
        Imagem imgBBinario = new Imagem(getBinaryImage(imageB));

        Imagem imgResultado = doOperationInImages(imgABinario, imgBBinario, null, Operation.OR);
        labelResultado.setIcon(new ImageIcon(imgResultado.getMatrixImage()));
    }//GEN-LAST:event_btnOrActionPerformed

    private void btnNotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotActionPerformed
        if (!validateImgAAndB()) {
            return;
        }

        Imagem imgABinario = new Imagem(getBinaryImage(imageA));
        Imagem imgBBinario = new Imagem(getBinaryImage(imageB));

        Imagem imgResultado = doOperationInImages(imgABinario, imgBBinario, null, Operation.NOT);
        labelResultado.setIcon(new ImageIcon(imgResultado.getMatrixImage()));
    }//GEN-LAST:event_btnNotActionPerformed

    private void btnXorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXorActionPerformed
        if (!validateImgAAndB()) {
            return;
        }

        Imagem imgABinario = new Imagem(getBinaryImage(imageA));
        Imagem imgBBinario = new Imagem(getBinaryImage(imageB));

        Imagem imgResultado = doOperationInImages(imgABinario, imgBBinario, null, Operation.XOR);
        labelResultado.setIcon(new ImageIcon(imgResultado.getMatrixImage()));
    }//GEN-LAST:event_btnXorActionPerformed

    private void btnCarregarImgAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarImgAActionPerformed
        this.imageA = loadImage();
        this.labelImage1.setIcon(new ImageIcon(imageA.getImage()));
    }//GEN-LAST:event_btnCarregarImgAActionPerformed

    private void btnCarregarImgBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarImgBActionPerformed
        this.imageB = loadImage();
        this.labelImage2.setIcon(new ImageIcon(imageB.getImage()));
    }//GEN-LAST:event_btnCarregarImgBActionPerformed

    private void btnEscalaCinzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscalaCinzaActionPerformed
        if (!validateImgA()) {
            return;
        }
        labelResultado.setIcon(new ImageIcon(getGrayImage(imageA)));
    }//GEN-LAST:event_btnEscalaCinzaActionPerformed

    private void btnBinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBinarioActionPerformed
        if (!validateImgA()) {
            return;
        }
        labelResultado.setIcon(new ImageIcon(getBinaryImage(imageA)));
    }//GEN-LAST:event_btnBinarioActionPerformed

    private void btnNegativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegativoActionPerformed
        if (!validateImgA()) {
            return;
        }
        labelResultado.setIcon(new ImageIcon( doOperationInImage(imageA, null, null, Operation.NEGATIVE).getMatrixImage()));
    }//GEN-LAST:event_btnNegativoActionPerformed

    private void btnAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicaoActionPerformed
        String txt = tfAdicao.getText();
        if (txt == null || txt.isEmpty()) {
            if (!validateImgAAndB()) {
                return;
            }

            labelResultado.setIcon(new ImageIcon(doOperationInImages(imageA, imageB, null, Operation.SUM).getMatrixImage()));
        } else {
            if (!validateImgA()) {
                return;
            }
            int value = Integer.parseInt(txt);
            labelResultado.setIcon(new ImageIcon(doOperationInImages(imageA, imageB, null, Operation.SUM).getMatrixImage()));
        }
    }//GEN-LAST:event_btnAdicaoActionPerformed

    private void tfSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSubtracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSubtracaoActionPerformed

    private void btnSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtracaoActionPerformed
        String txt = tfSubtracao.getText();
        if (txt == null || txt.isEmpty()) {
            if (!validateImgAAndB()) {
                return;
            }

            labelResultado.setIcon(new ImageIcon(doOperationInImages(imageA, imageB, null, Operation.SUBTRACT).getMatrixImage()));
        } else {
            if (!validateImgA()) {
                return;
            }
            int value = Integer.parseInt(txt);
            labelResultado.setIcon(new ImageIcon(doOperationInImage(imageA, value, null, Operation.SUBTRACT).getMatrixImage()));
        }
    }//GEN-LAST:event_btnSubtracaoActionPerformed

    private void tfBlendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBlendingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBlendingActionPerformed

    private void btnBlendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBlendingActionPerformed
        if (!validateImgAAndB()) {
            return;
        }

        String txt = tfBlending.getText();
        if (txt == null || txt.isEmpty()) {
            labelResultado.setIcon(new ImageIcon(doOperationInImages(imageA, imageA, null, Operation.BLENDING).getMatrixImage()));
        } else {
            int coeficient = Integer.parseInt(txt);
            labelResultado.setIcon(new ImageIcon(doOperationInImages(imageA, imageA, coeficient, Operation.BLENDING).getMatrixImage()));
        }
    }//GEN-LAST:event_btnBlendingActionPerformed

    private void tfMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMultiplicacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMultiplicacaoActionPerformed

    private void btnMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacaoActionPerformed
        String txt = tfMultiplicacao.getText();
        if (txt == null || txt.isEmpty()) {
            if (!validateImgAAndB()) {
                return;
            }

            labelResultado.setIcon(new ImageIcon(doOperationInImages(imageA, imageB, null, Operation.MULTIPLICATION).getMatrixImage()));
        } else {
            if (!validateImgA()) {
                return;
            }
            int value = Integer.parseInt(txt);
            labelResultado.setIcon(new ImageIcon(doOperationInImage(imageA, value, null, Operation.MULTIPLICATION).getMatrixImage()));
        }
    }//GEN-LAST:event_btnMultiplicacaoActionPerformed

    private void tfDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDivisaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDivisaoActionPerformed

    private void btnDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisaoActionPerformed
        String txt = tfDivisao.getText();
        if (txt == null || txt.isEmpty()) {
            if (!validateImgAAndB()) {
                return;
            }

            labelResultado.setIcon(new ImageIcon(doOperationInImages(imageA, imageB, null, Operation.DIVISION).getMatrixImage()));
        } else {
            if (!validateImgA()) {
                return;
            }
            int value = Integer.parseInt(txt);
            labelResultado.setIcon(new ImageIcon(doOperationInImage(imageA, value, null, Operation.DIVISION).getMatrixImage()));
        }
    }//GEN-LAST:event_btnDivisaoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new telaPrincipal().setVisible(true);
        });
    }
    
    public static Imagem loadImage() {
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagens", "jpg", "jpeg", "png", "bmp", "tiff", "tif");

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(filter);
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                BufferedImage img = ImageIO.read(selectedFile);
                Imagem image = new Imagem(img);
                return image;
            } catch (IOException ex) {
                return null;
            }
        }
        return null;
    }

    public static int[][] rgbToBinary(int[][] red, int[][] green, int[][] blue, int limit) {
        int width = red.length;
        int height = red[0].length;

        int[][] binaryMatrix = new int[width][height];

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int valorFinal;
                int valMatrizR = red[x][y];
                int valMatrizG = green[x][y];
                int valMatrizB = blue[x][y];
                valorFinal = (valMatrizR + valMatrizG + valMatrizB) / 3;
                valorFinal = getValueInBounds(valorFinal);
                if (valorFinal >= limit) {
                    valorFinal = 0;
                } else {
                    valorFinal = 1;
                }
                binaryMatrix[x][y] = valorFinal;
            }
        }
        return binaryMatrix;
    }

    public static int[][] rgbToGray(int[][] red, int[][] green, int[][] blue) {
        int width = red.length;
        int height = red[0].length;

        int[][] grayMatrix = new int[width][height];

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int valorFinal;
                int valMatrizR = red[x][y];
                int valMatrizG = green[x][y];
                int valMatrizB = blue[x][y];
                valorFinal = (valMatrizR + valMatrizG + valMatrizB) / 3;
                valorFinal = getValueInBounds(valorFinal);
                grayMatrix[x][y] = valorFinal;
            }
        }
        return grayMatrix;
    }

    public static BufferedImage getGrayImage(int[][] grayMatrix) {
        int width = grayMatrix.length;
        int height = grayMatrix[0].length;
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int grayValue = grayMatrix[x][y];
                // Setando valores do RED (16) GREEN (8) e BLUE
                int rgbValue = (grayValue << 16) | (grayValue << 8) | grayValue;
                image.setRGB(x, y, rgbValue);
            }
        }
        return image;
    }

    public static int getValueInBounds(int value) {
        if (value < 0) {
            return 0;
        }
        if (value > 255) {
            return 255;
        }
        return value;
    }

    public static int getMaxValue(int value1, int value2) {
        return Math.max(value1, value2);
    }

    public static int getMinValue(int value1, int value2) {
        return Math.min(value1, value2);
    }

    public static Imagem doOperationInImages(Imagem image1, Imagem image2, Integer coeficient, Operation operation) {
        Imagem imageResult = new Imagem();
        imageResult.setRed(operationInTwoMatrixes(image1.getRed(), image2.getRed(), coeficient, operation));
        imageResult.setGreen(operationInTwoMatrixes(image1.getGreen(), image2.getGreen(), coeficient, operation));
        imageResult.setBlue(operationInTwoMatrixes(image1.getBlue(), image2.getBlue(), coeficient, operation));
        imageResult.setAlpha(operationInTwoMatrixes(image1.getAlpha(), image2.getAlpha(), coeficient, operation));
        return imageResult;
    }

    public static Imagem doOperationInImage(Imagem image, Integer value, Integer coeficient, Operation operation) {
        Imagem imageResult = new Imagem();
        imageResult.setRed(operationSingleMatrix(image.getRed(), value, coeficient, operation));
        imageResult.setGreen(operationSingleMatrix(image.getGreen(), value, coeficient, operation));
        imageResult.setBlue(operationSingleMatrix(image.getBlue(), value, coeficient, operation));
        return imageResult;
    }

    public static int[][] operationInTwoMatrixes(int[][] matrix1, int[][] matrix2, Integer coeficient, Operation operation) {
        int maxWidth = getMaxValue(matrix1.length, matrix2.length);
        int minWidth = getMinValue(matrix1.length, matrix2.length);
        int maxHeight = getMaxValue(matrix1[0].length, matrix2[0].length);
        int minHeight = getMinValue(matrix1[0].length, matrix2[0].length);
        int[][] result = new int[maxWidth][maxHeight];
        int[][] widerMatrix;
        int[][] tallerMatrix;
        if (matrix1.length > matrix2.length) {
            widerMatrix = matrix1;
        } else {
            widerMatrix = matrix2;
        }
        if (matrix1[0].length > matrix2[0].length) {
            tallerMatrix = matrix1;
        } else {
            tallerMatrix = matrix2;
        }

        for (int y = 0; y < minHeight; y++) {
            for (int x = 0; x < minWidth; x++) {
                // Faz as operações
                int opResult;
                opResult = operation.getResult(matrix1[x][y], matrix2[x][y], coeficient);
                result[x][y] = getValueInBounds(opResult);
            }
            for (int x1 = minWidth; x1 < maxWidth; x1++) {
                // Preenche os valores a direita com os valores da matriz mais larga
                result[x1][y] = widerMatrix[x1][y];
            }
        }
        // Preenche os valores embaixo com os valores da matriz mais alta
        for (int y1 = minHeight; y1 < maxHeight; y1++) {
            for (int x = 0; x < tallerMatrix.length; x++) {
                result[x][y1] = tallerMatrix[x][y1];
            }
        }
        return result;
    }

    private static int[][] operationSingleMatrix(int[][] matrix, Integer value, Integer coeficient, Operation operation) {
        int width = matrix.length;
        int height = matrix[0].length;
        int[][] result = new int[width][height];

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                result[x][y] = getValueInBounds(operation.getResult(matrix[x][y], value, coeficient));
            }
        }
        return result;
    }
    
    public BufferedImage getGrayImage(Imagem image) {
        int[][] grayMatrix = rgbToGray(image.getRed(), image.getGreen(), image.getBlue());
        return getGrayImage(grayMatrix);
    }

    public BufferedImage getBinaryImage(Imagem image) {
        int[][] binaryMatrix = rgbToBinary(image.getRed(), image.getGreen(), image.getBlue(), 128);
        int width = image.getWidth();
        int height = image.getHeight();

        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_BINARY);

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int binaryValue = binaryMatrix[x][y];
                int rgbValue = binaryValue == 0 ? 0x000000 : 0xFFFFFF;
                img.setRGB(x, y, rgbValue);
            }
        }
        return img;
    }
    
    private boolean validateImgA() {
        if (imageA == null) {
            JOptionPane.showMessageDialog(null, "Escolha a Imagem A");
            return false;
        }
        return true;
    }

    private boolean validateImgAAndB() {
        if (!validateImgA()) {
            return false;
        }
        if (imageB == null) {
            JOptionPane.showMessageDialog(null, "Escolha a Imagem B");
            return false;
        }
        return true;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicao;
    private javax.swing.JButton btnAnd;
    private javax.swing.JButton btnBinario;
    private javax.swing.JButton btnBlending;
    private javax.swing.JButton btnCarregarImgA;
    private javax.swing.JButton btnCarregarImgB;
    private javax.swing.JButton btnDivisao;
    private javax.swing.JButton btnEscalaCinza;
    private javax.swing.JButton btnMultiplicacao;
    private javax.swing.JButton btnNegativo;
    private javax.swing.JButton btnNot;
    private javax.swing.JButton btnOr;
    private javax.swing.JButton btnSubtracao;
    private javax.swing.JButton btnXor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelImage1;
    private javax.swing.JLabel labelImage2;
    private javax.swing.JLabel labelResultado;
    private javax.swing.JTextField tfAdicao;
    private javax.swing.JTextField tfBlending;
    private javax.swing.JTextField tfDivisao;
    private javax.swing.JTextField tfMultiplicacao;
    private javax.swing.JTextField tfSubtracao;
    // End of variables declaration//GEN-END:variables
}
