package com.mycompany.processamentoimagens;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Eduardo Mokfa
 */
public class telaPrincipal extends javax.swing.JFrame {

    private Imagem imagemA;
    private Imagem imagemB;
    private Map<Integer, Integer> histogramaImgA = new HashMap<>();

    public telaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        btnHistograma = new javax.swing.JButton();
        tfMultiplicacao = new javax.swing.JTextField();
        btnMultiplicacao = new javax.swing.JButton();
        tfDivisao = new javax.swing.JTextField();
        btnDivisao = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnBlending = new javax.swing.JButton();
        labelHistograma = new javax.swing.JLabel();
        btnMultiplicacao1 = new javax.swing.JButton();
        tfDesvioPadrao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnMax = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        btnMin = new javax.swing.JButton();
        btnMedia = new javax.swing.JButton();
        btnMediana = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtOrdem = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(labelResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 190, 250, 250));

        labelImage1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(labelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 250, 250));

        labelImage2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(labelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 250, 250));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("=");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 290, 20, 30));

        btnAnd.setText("AND");
        btnAnd.setEnabled(false);
        btnAnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 520, 120, -1));

        btnOr.setText("OR");
        btnOr.setEnabled(false);
        btnOr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrActionPerformed(evt);
            }
        });
        getContentPane().add(btnOr, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, 120, -1));

        btnNot.setText("NOT");
        btnNot.setEnabled(false);
        btnNot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotActionPerformed(evt);
            }
        });
        getContentPane().add(btnNot, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 490, 120, -1));

        btnXor.setText("XOR");
        btnXor.setEnabled(false);
        btnXor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXorActionPerformed(evt);
            }
        });
        getContentPane().add(btnXor, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, 120, -1));

        btnCarregarImgA.setText("Carregar Imagem A");
        btnCarregarImgA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarImgAActionPerformed(evt);
            }
        });
        getContentPane().add(btnCarregarImgA, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 250, -1));

        btnCarregarImgB.setText("Carregar Imagem B");
        btnCarregarImgB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarImgBActionPerformed(evt);
            }
        });
        getContentPane().add(btnCarregarImgB, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 250, -1));

        btnEscalaCinza.setText("Escala de Cinza");
        btnEscalaCinza.setEnabled(false);
        btnEscalaCinza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscalaCinzaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEscalaCinza, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, 120, -1));

        btnBinario.setText("Binário");
        btnBinario.setEnabled(false);
        btnBinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBinarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnBinario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 120, -1));

        btnNegativo.setText("Negativo");
        btnNegativo.setEnabled(false);
        btnNegativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegativoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNegativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, 250, -1));
        getContentPane().add(tfAdicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 590, 120, -1));

        btnAdicao.setText("Adição");
        btnAdicao.setEnabled(false);
        btnAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 560, 120, -1));

        tfSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSubtracaoActionPerformed(evt);
            }
        });
        getContentPane().add(tfSubtracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 590, 120, 25));

        btnSubtracao.setText("Subtração");
        btnSubtracao.setEnabled(false);
        btnSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtracaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSubtracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 560, 120, -1));

        tfBlending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBlendingActionPerformed(evt);
            }
        });
        getContentPane().add(tfBlending, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 590, 120, -1));

        btnHistograma.setText("Equalizar Histograma");
        btnHistograma.setEnabled(false);
        btnHistograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistogramaActionPerformed(evt);
            }
        });
        getContentPane().add(btnHistograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 420, 340, -1));

        tfMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMultiplicacaoActionPerformed(evt);
            }
        });
        getContentPane().add(tfMultiplicacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 650, 120, 25));

        btnMultiplicacao.setText("Multiplicação");
        btnMultiplicacao.setEnabled(false);
        btnMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnMultiplicacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 620, 120, 25));

        tfDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDivisaoActionPerformed(evt);
            }
        });
        getContentPane().add(tfDivisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 650, 120, 25));

        btnDivisao.setText("Divisão");
        btnDivisao.setEnabled(false);
        btnDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnDivisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 620, 120, 25));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel2.setText("PROCESSAMENTO DE IMAGENS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 970, 100));

        btnBlending.setText("Blending");
        btnBlending.setEnabled(false);
        btnBlending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBlendingActionPerformed(evt);
            }
        });
        getContentPane().add(btnBlending, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 560, 120, -1));

        labelHistograma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(labelHistograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 460, 600, 400));

        btnMultiplicacao1.setText("Gaussiano");
        btnMultiplicacao1.setEnabled(false);
        btnMultiplicacao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacao1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMultiplicacao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 690, 120, 25));

        tfDesvioPadrao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDesvioPadraoActionPerformed(evt);
            }
        });
        getContentPane().add(tfDesvioPadrao, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 720, 120, -1));

        jLabel3.setText("Filtros");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 690, 50, -1));

        btnMax.setText("MAX");
        btnMax.setEnabled(false);
        btnMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaxActionPerformed(evt);
            }
        });
        getContentPane().add(btnMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 710, 120, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("3 X 3");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 690, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("5 X 5");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 690, -1, -1));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("7 X 7");
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 690, -1, -1));

        btnMin.setText("MIN");
        btnMin.setEnabled(false);
        btnMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinActionPerformed(evt);
            }
        });
        getContentPane().add(btnMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 710, 130, -1));

        btnMedia.setText("MEDIA");
        btnMedia.setEnabled(false);
        btnMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMediaActionPerformed(evt);
            }
        });
        getContentPane().add(btnMedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 740, 120, -1));

        btnMediana.setText("MEDIANA");
        btnMediana.setEnabled(false);
        btnMediana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedianaActionPerformed(evt);
            }
        });
        getContentPane().add(btnMediana, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 740, 130, -1));

        jButton1.setText("ORDEM");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 780, 120, -1));

        txtOrdem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrdemActionPerformed(evt);
            }
        });
        getContentPane().add(txtOrdem, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 810, 120, -1));

        jButton2.setText("SUAV. CONSERVATIVA");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 780, -1, -1));

        jButton3.setText("Sobel");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 750, 120, -1));

        jButton4.setText("Edge");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 780, 120, -1));

        jButton5.setText("Laplaciano");
        jButton5.setEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 810, 120, -1));

        jButton6.setText("Dilatar");
        jButton6.setEnabled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 840, 120, -1));

        jButton7.setText("Erosão");
        jButton7.setEnabled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 840, 120, -1));

        jButton8.setText("Abertura");
        jButton8.setEnabled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 870, 120, -1));

        jButton9.setText("Fechamento");
        jButton9.setEnabled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 870, 120, -1));

        jButton10.setText("Contorno");
        jButton10.setEnabled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 900, 120, -1));

        jLabel4.setText("De 0 a 1");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 590, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndActionPerformed
        Imagem imgABinario = new Imagem(converteImgParaBinario(imagemA));
        Imagem imgBBinario = new Imagem(converteImgParaBinario(imagemB));

        Imagem imgResultado = executaOperacaoNasImagens(imgABinario, imgBBinario, null, Operacoes.AND);
        this.labelResultado.setIcon(new ImageIcon(imgResultado.getMatrixImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_btnAndActionPerformed

    private void btnOrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrActionPerformed
        Imagem imgABinario = new Imagem(converteImgParaBinario(imagemA));
        Imagem imgBBinario = new Imagem(converteImgParaBinario(imagemB));

        Imagem imgResultado = executaOperacaoNasImagens(imgABinario, imgBBinario, null, Operacoes.OR);
        labelResultado.setIcon(new ImageIcon(imgResultado.getMatrixImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_btnOrActionPerformed

    private void btnNotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotActionPerformed
        Imagem imgABinario = new Imagem(converteImgParaBinario(imagemA));
        Imagem imgBBinario = new Imagem(converteImgParaBinario(imagemB));

        Imagem imgResultado = executaOperacaoNasImagens(imgABinario, imgBBinario, null, Operacoes.NOT);
        labelResultado.setIcon(new ImageIcon(imgResultado.getMatrixImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_btnNotActionPerformed

    private void btnXorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXorActionPerformed
        Imagem imgABinario = new Imagem(converteImgParaBinario(imagemA));
        Imagem imgBBinario = new Imagem(converteImgParaBinario(imagemB));

        Imagem imgResultado = executaOperacaoNasImagens(imgABinario, imgBBinario, null, Operacoes.XOR);
        labelResultado.setIcon(new ImageIcon(imgResultado.getMatrixImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_btnXorActionPerformed

    private void btnCarregarImgAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarImgAActionPerformed
        this.imagemA = carregarImagem();
        if (imagemA != null) {
            this.labelImage1.setIcon(new ImageIcon(imagemA.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
            habilitaBotoesImagemA();
        }
        habilitaBotoesImagemB();
    }//GEN-LAST:event_btnCarregarImgAActionPerformed

    private void habilitaBotoesImagemA() {
        this.btnAdicao.setEnabled(true);
        this.btnSubtracao.setEnabled(true);
        this.btnDivisao.setEnabled(true);
        this.btnMultiplicacao.setEnabled(true);
        this.btnBinario.setEnabled(true);
        this.btnEscalaCinza.setEnabled(true);
        this.btnNegativo.setEnabled(true);
        this.btnHistograma.setEnabled(true);
        this.btnMultiplicacao1.setEnabled(true);

        this.btnMin.setEnabled(true);
        this.btnMax.setEnabled(true);
        this.btnMedia.setEnabled(true);
        this.btnMediana.setEnabled(true);
        this.jButton1.setEnabled(true);
        this.jButton2.setEnabled(true);
        this.jButton3.setEnabled(true);
        this.jButton4.setEnabled(true);
        this.jButton5.setEnabled(true);
        this.jButton6.setEnabled(true);
        this.jButton7.setEnabled(true);
        this.jButton8.setEnabled(true);
        this.jButton9.setEnabled(true);
        this.jButton10.setEnabled(true);
    }

    private void habilitaBotoesImagemB() {
        if (this.imagemA != null && this.imagemB != null) {
            this.btnOr.setEnabled(true);
            this.btnAnd.setEnabled(true);
            this.btnNot.setEnabled(true);
            this.btnXor.setEnabled(true);
            this.btnHistograma.setEnabled(true);
            this.btnBlending.setEnabled(true);
        }
    }

    private void btnCarregarImgBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarImgBActionPerformed
        this.imagemB = carregarImagem();
        if (imagemB != null) {
            this.labelImage2.setIcon(new ImageIcon(imagemB.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
        }
        habilitaBotoesImagemB();
    }//GEN-LAST:event_btnCarregarImgBActionPerformed

    private void btnEscalaCinzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscalaCinzaActionPerformed
        labelResultado.setIcon(new ImageIcon(converteImgParaCinza(imagemA).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_btnEscalaCinzaActionPerformed

    private void btnBinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBinarioActionPerformed
        labelResultado.setIcon(new ImageIcon(converteImgParaBinario(imagemA).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_btnBinarioActionPerformed

    private void btnNegativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegativoActionPerformed
        labelResultado.setIcon(new ImageIcon(executaOperacaoNaImagem(imagemA, null, null, Operacoes.NEGATIVO).getMatrixImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_btnNegativoActionPerformed

    private void btnAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicaoActionPerformed
        String txt = tfAdicao.getText();
        if (txt == null || txt.isEmpty()) {
            labelResultado.setIcon(new ImageIcon(executaOperacaoNasImagens(imagemA, imagemB, null, Operacoes.SOMA).getMatrixImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
        } else {
            int value = Integer.parseInt(txt);
            labelResultado.setIcon(new ImageIcon(executaOperacaoNasImagens(imagemA, null, value, Operacoes.SOMA).getMatrixImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
        }
    }//GEN-LAST:event_btnAdicaoActionPerformed

    private void tfSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSubtracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSubtracaoActionPerformed

    private void btnSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtracaoActionPerformed
        String txt = tfSubtracao.getText();
        if (txt == null || txt.isEmpty()) {
            labelResultado.setIcon(new ImageIcon(executaOperacaoNasImagens(imagemA, imagemB, null, Operacoes.SUBTRACAO).getMatrixImage()));
        } else {
            int value = Integer.parseInt(txt);
            labelResultado.setIcon(new ImageIcon(executaOperacaoNaImagem(imagemA, value, null, Operacoes.SUBTRACAO).getMatrixImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
        }
    }//GEN-LAST:event_btnSubtracaoActionPerformed

    private void tfBlendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBlendingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBlendingActionPerformed

    private void btnHistogramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistogramaActionPerformed
        histogramaImgA = getImageHistogram(imagemA);
        BufferedImage img = Grafico.getHistogramImage(histogramaImgA);
        labelHistograma.setIcon(new ImageIcon(img));
    }//GEN-LAST:event_btnHistogramaActionPerformed

    private void tfMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMultiplicacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMultiplicacaoActionPerformed

    private void btnMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacaoActionPerformed
        String txt = tfMultiplicacao.getText();
        if (txt == null || txt.isEmpty()) {
            labelResultado.setIcon(new ImageIcon(executaOperacaoNasImagens(imagemA, imagemB, null, Operacoes.MULTIPLICACAO).getMatrixImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
        } else {
            int value = Integer.parseInt(txt);
            labelResultado.setIcon(new ImageIcon(executaOperacaoNaImagem(imagemA, value, null, Operacoes.MULTIPLICACAO).getMatrixImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
        }
    }//GEN-LAST:event_btnMultiplicacaoActionPerformed

    private void tfDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDivisaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDivisaoActionPerformed

    private void btnDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisaoActionPerformed
        String txt = tfDivisao.getText();
        if (txt == null || txt.isEmpty()) {
            labelResultado.setIcon(new ImageIcon(executaOperacaoNasImagens(imagemA, imagemB, null, Operacoes.DIVISAO).getMatrixImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
        } else {
            int value = Integer.parseInt(txt);
            labelResultado.setIcon(new ImageIcon(executaOperacaoNaImagem(imagemA, value, null, Operacoes.DIVISAO).getMatrixImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
        }
    }//GEN-LAST:event_btnDivisaoActionPerformed

    private void btnBlendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBlendingActionPerformed
        String text = tfBlending.getText();
        if (text == null || text.isEmpty()) {
            return;
        }
        double value = Double.parseDouble(text);
        labelResultado.setIcon(new ImageIcon(Operacoes.blendImages(imagemA.getImage(), imagemB.getImage(), value).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_btnBlendingActionPerformed

    private void btnMultiplicacao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacao1ActionPerformed
        double desvioPadrao = 1;
        if (tfDesvioPadrao.getText() != null && !tfDesvioPadrao.getText().isBlank()) {
            try {
                desvioPadrao = Double.valueOf(tfDesvioPadrao.getText());
            } catch (NumberFormatException e) {
                desvioPadrao = 1;
            }
        }
        labelResultado.setIcon(new ImageIcon(Operacoes.applyGaussianFilter(imagemA.getImage(), desvioPadrao).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_btnMultiplicacao1ActionPerformed

    private void tfDesvioPadraoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDesvioPadraoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDesvioPadraoActionPerformed

    private void btnMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaxActionPerformed
        labelResultado.setIcon(new ImageIcon(Operacoes.applyMaxFilter(imagemA.getImage(), getTamanhoFiltro()).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_btnMaxActionPerformed

    private int getTamanhoFiltro() {
        if (jRadioButton1.isSelected()) {
            return 3;
        } else if (jRadioButton2.isSelected()) {
            return 5;
        } else {
            return 7;
        }
    }

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed

    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void btnMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinActionPerformed
        labelResultado.setIcon(new ImageIcon(Operacoes.applyMinFilter(imagemA.getImage(), getTamanhoFiltro()).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_btnMinActionPerformed

    private void btnMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMediaActionPerformed
        labelResultado.setIcon(new ImageIcon(Operacoes.applyAverageFilter(imagemA.getImage(), getTamanhoFiltro()).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_btnMediaActionPerformed

    private void btnMedianaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedianaActionPerformed
        labelResultado.setIcon(new ImageIcon(Operacoes.applyMedianFilter(imagemA.getImage(), getTamanhoFiltro()).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_btnMedianaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int ordem = Integer.valueOf(txtOrdem.getText());
        labelResultado.setIcon(new ImageIcon(Operacoes.applyOrderFilter(imagemA.getImage(), getTamanhoFiltro(), ordem).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtOrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrdemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrdemActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        labelResultado.setIcon(new ImageIcon(Operacoes.applyConservativeSmoothing(imagemA.getImage(), getTamanhoFiltro(), 100).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        labelResultado.setIcon(new ImageIcon(Operacoes.applySobelEdgeDetection(imagemA.getImage()).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        labelResultado.setIcon(new ImageIcon(Operacoes.applyPrewittEdgeDetection(imagemA.getImage()).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        labelResultado.setIcon(new ImageIcon(Operacoes.applyLaplacianFilter(imagemA.getImage()).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        labelResultado.setIcon(new ImageIcon(Operacoes.dilate(imagemA.getImage(), 3).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        labelResultado.setIcon(new ImageIcon(Operacoes.erode(imagemA.getImage(), 3).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        labelResultado.setIcon(new ImageIcon(Operacoes.morphologicalOpening(imagemA.getImage(), 3).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        labelResultado.setIcon(new ImageIcon(Operacoes.morphologicalClosing(imagemA.getImage(), 3).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        labelResultado.setIcon(new ImageIcon(Operacoes.detectEdges(imagemA.getImage()).getScaledInstance(250, 250, Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_jButton10ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPrincipal().setVisible(true);
            }
        });
    }

    public static Imagem carregarImagem() {
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

    public static int[][] convRbgBinario(int[][] red, int[][] green, int[][] blue, int limit) {
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
                valorFinal = validaLimitesDaImagem(valorFinal);
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

    public static int[][] convRgbCinza(int[][] red, int[][] green, int[][] blue) {
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
                valorFinal = validaLimitesDaImagem(valorFinal);
                grayMatrix[x][y] = valorFinal;
            }
        }
        return grayMatrix;
    }

    public static BufferedImage getImagemCinza(int[][] grayMatrix) {
        int width = grayMatrix.length;
        int height = grayMatrix[0].length;
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int grayValue = grayMatrix[x][y];
                int rgbValue = (grayValue << 16) | (grayValue << 8) | grayValue;
                image.setRGB(x, y, rgbValue);
            }
        }
        return image;
    }

    public static int validaLimitesDaImagem(int value) {
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

    public static Imagem executaOperacaoNasImagens(Imagem image1, Imagem image2, Integer coeficient, Integer operation) {
        Imagem imagemAlterada = new Imagem();
        imagemAlterada.setRed(executaOperacaoEmDuasMatrizes(image1.getRed(), image2.getRed(), coeficient, operation));
        imagemAlterada.setGreen(executaOperacaoEmDuasMatrizes(image1.getGreen(), image2.getGreen(), coeficient, operation));
        imagemAlterada.setBlue(executaOperacaoEmDuasMatrizes(image1.getBlue(), image2.getBlue(), coeficient, operation));
        imagemAlterada.setAlpha(executaOperacaoEmDuasMatrizes(image1.getAlpha(), image2.getAlpha(), coeficient, operation));
        return imagemAlterada;
    }

    public static Imagem executaOperacaoNaImagem(Imagem image, Integer value, Integer coeficient, Integer operation) {
        Imagem imagemAlterada = new Imagem();
        imagemAlterada.setRed(executaOperacaoEmUmaUnicaMatriz(image.getRed(), value, coeficient, operation, Operacoes.R));
        imagemAlterada.setGreen(executaOperacaoEmUmaUnicaMatriz(image.getGreen(), value, coeficient, operation, Operacoes.G));
        imagemAlterada.setBlue(executaOperacaoEmUmaUnicaMatriz(image.getBlue(), value, coeficient, operation, Operacoes.B));
        return imagemAlterada;
    }

    public static Imagem executaOperacaoNaImagemMatriz(Imagem image, Integer value, Double desvioPadrao, Integer operation) {
        Imagem imagemAlterada = new Imagem();
        imagemAlterada.setRed(filterSingleMatrix(image.getRed(), value, operation, desvioPadrao));
        imagemAlterada.setGreen(filterSingleMatrix(image.getGreen(), value, operation, desvioPadrao));
        imagemAlterada.setBlue(filterSingleMatrix(image.getBlue(), value, operation, desvioPadrao));
        return imagemAlterada;
    }

    public static int[][] executaOperacaoEmDuasMatrizes(int[][] matrix1, int[][] matrix2, Integer coeficient, Integer operacao) {
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
                int opResult;

                opResult = realizaOperacao(matrix1[x][y], matrix2[x][y], coeficient, operacao, null);
                result[x][y] = validaLimitesDaImagem(opResult);
            }
            for (int x1 = minWidth; x1 < maxWidth; x1++) {
                result[x1][y] = widerMatrix[x1][y];
            }
        }
        for (int y1 = minHeight; y1 < maxHeight; y1++) {
            for (int x = 0; x < tallerMatrix.length; x++) {
                result[x][y1] = tallerMatrix[x][y1];
            }
        }
        return result;
    }

    private static int[][] executaOperacaoEmUmaUnicaMatriz(int[][] matrix, Integer value, Integer coeficient, Integer operacao, String corAtual) {
        int width = matrix.length;
        int height = matrix[0].length;
        int[][] result = new int[width][height];

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                result[x][y] = validaLimitesDaImagem(realizaOperacao(matrix[x][y], value, coeficient, operacao, corAtual));
            }
        }

        if (Operacoes.HISTOGRAMA.equals(operacao)) {
            int[] histogram = new int[256];
            int totalPixels = width * height;
            float[] normalizedHistogram = new float[256];
            for (int i = 0; i < 256; i++) {
                normalizedHistogram[i] = (float) histogram[i] / totalPixels;
            }

            float[] cdf = new float[256];
            cdf[0] = normalizedHistogram[0];
            for (int i = 1; i < 256; i++) {
                cdf[i] = cdf[i - 1] + normalizedHistogram[i];
            }

            for (int x = 0; x < width; x++) {
                for (int y = 0; y < height; y++) {
                    int newValue;
                    int pixel = matrix[x][y];
                    if (corAtual.equals(Operacoes.R)) {
                        int r = (pixel >> 16) & 0xFF;
                        newValue = (int) (cdf[r] * 255);
                    } else if (corAtual.equals(Operacoes.G)) {
                        int g = (pixel >> 8) & 0xFF;
                        newValue = (int) (cdf[g] * 255);
                    } else {
                        int b = pixel & 0xFF;
                        newValue = (int) (cdf[b] * 255);
                    }
                    int newRGB = (newValue << 16) | (newValue << 8) | newValue;
                    result[x][y] = newRGB;
                }
            }
        }

        return result;
    }

    private static int[][] filterSingleMatrix(int[][] matrix, Integer bounds, Integer operacao, Double desvioPadrao) {
        int width = matrix.length;
        int height = matrix[0].length;
        int[][] filteredMatrix = new int[width][height];

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Integer[][] focus = getFocus(matrix, bounds, x, y);
                filteredMatrix[x][y] = realizaOperacaoMatriz(focus, desvioPadrao, operacao);
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
                } else {
                    focus[x][y] = 0;
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

    private static int realizaOperacaoMatriz(Integer[][] matrix, Double desvioPadrao, Integer operacao) {
        if (Operacoes.GAUSSIANO.equals(operacao)) {
            return Operacoes.calculaFiltroGaussiano(matrix, desvioPadrao);
        }
        return 0;
    }

    private static int realizaOperacao(Integer x, Integer y, Integer coeficiente, Integer operacao, String corAtual) {
        if (Operacoes.SOMA.equals(operacao)) {
            return Operacoes.calculaSoma(x, y);
        } else if (Operacoes.SUBTRACAO.equals(operacao)) {
            return Operacoes.calculaSubtracao(x, y);
        } else if (Operacoes.MULTIPLICACAO.equals(operacao)) {
            return Operacoes.calculaMultiplicacao(x, y);
        } else if (Operacoes.DIVISAO.equals(operacao)) {
            return Operacoes.calculaDivisao(x, y);
        } else if (Operacoes.AND.equals(operacao)) {
            return Operacoes.calculaAnd(x, y);
        } else if (Operacoes.OR.equals(operacao)) {
            return Operacoes.calculaOr(x, y);
        } else if (Operacoes.XOR.equals(operacao)) {
            return Operacoes.calculaXor(x, y);
        } else if (Operacoes.NOT.equals(operacao)) {
            return Operacoes.calculaNot(x);
        } else if (Operacoes.BLENDING.equals(operacao)) {
            return Operacoes.calculaBlending(x, y, coeficiente);
        } else if (Operacoes.NEGATIVO.equals(operacao)) {
            return Operacoes.calculaNegativo(x);
        } else if (Operacoes.HISTOGRAMA.equals(operacao)) {
            return Operacoes.calculaHistograma(x, corAtual);
        }
        return 0;
    }

    public BufferedImage converteImgParaCinza(Imagem image) {
        int[][] grayMatrix = convRgbCinza(image.getRed(), image.getGreen(), image.getBlue());
        return getImagemCinza(grayMatrix);
    }

    public BufferedImage converteImgParaBinario(Imagem image) {
        int[][] binaryMatrix = convRbgBinario(image.getRed(), image.getGreen(), image.getBlue(), 128);
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

    public static Map<Integer, Integer> getImageHistogram(Imagem image) {
        Map<Integer, Integer> histogram = new HashMap<>();
        for (int i = 0; i < 256; i++) {
            histogram.put(i, 0);
        }
        int[][] grayMatrix = convRgbCinza(image.getRed(), image.getGreen(), image.getBlue());
        int width = grayMatrix.length;
        int height = grayMatrix[0].length;
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int pixelValue = grayMatrix[x][y];
                int histoCount = histogram.get(pixelValue);
                histogram.put(pixelValue, histoCount + 1);
            }
        }
        return histogram;
    }

    public static int[][] getEqualizedImage(Imagem image) {
        Map<Integer, Integer> histogram = getImageHistogram(image);
        int[][] grayMatrix = convRgbCinza(image.getRed(), image.getGreen(), image.getBlue());

        int width = grayMatrix.length;
        int height = grayMatrix[0].length;
        int[][] resultMatrix = new int[width][height];

        int cfdMin = getCumulativeFrequency(histogram, 0);
        int mxn = width * height;

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int cfd = getCumulativeFrequency(histogram, grayMatrix[x][y]);
                double result = Math.floor((cfd - cfdMin / mxn - cfdMin) * (255 - 1));
                resultMatrix[x][y] = (int) Math.round(result);
            }
        }
        return resultMatrix;
    }

    private static int getCumulativeFrequency(Map<Integer, Integer> histogram, int value) {
        int count = 0;
        for (int i = 0; i < value; i++) {
            count += histogram.get(i);
        }
        return count;
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
    private javax.swing.JButton btnHistograma;
    private javax.swing.JButton btnMax;
    private javax.swing.JButton btnMedia;
    private javax.swing.JButton btnMediana;
    private javax.swing.JButton btnMin;
    private javax.swing.JButton btnMultiplicacao;
    private javax.swing.JButton btnMultiplicacao1;
    private javax.swing.JButton btnNegativo;
    private javax.swing.JButton btnNot;
    private javax.swing.JButton btnOr;
    private javax.swing.JButton btnSubtracao;
    private javax.swing.JButton btnXor;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JLabel labelHistograma;
    private javax.swing.JLabel labelImage1;
    private javax.swing.JLabel labelImage2;
    private javax.swing.JLabel labelResultado;
    private javax.swing.JTextField tfAdicao;
    private javax.swing.JTextField tfBlending;
    private javax.swing.JTextField tfDesvioPadrao;
    private javax.swing.JTextField tfDivisao;
    private javax.swing.JTextField tfMultiplicacao;
    private javax.swing.JTextField tfSubtracao;
    private javax.swing.JTextField txtOrdem;
    // End of variables declaration//GEN-END:variables
}
