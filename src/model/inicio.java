package model;


import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import paneles.CambiaPanel;

public class inicio extends javax.swing.JFrame {
    int x, y;
    
    public inicio() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(this);
        this.uno.setSelected(true);
        
        new CambiaPanel(pnlprin, new paneles.menu());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        pnlmen = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        uno = new rsbuttom.RSButtonMetro();
        dos = new rsbuttom.RSButtonMetro();
        tres = new rsbuttom.RSButtonMetro();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pnlCentro = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlprin = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        pnlmen.setBackground(new java.awt.Color(239, 238, 244));
        pnlmen.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 0, new java.awt.Color(239, 238, 244)));

        jPanel4.setBackground(new java.awt.Color(239, 238, 244));

        uno.setForeground(new java.awt.Color(128, 128, 131));
        uno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewapp/inicioo40.png"))); // NOI18N
        uno.setText("Inicio");
        uno.setColorHover(new java.awt.Color(204, 204, 204));
        uno.setColorNormal(new java.awt.Color(204, 204, 204));
        uno.setColorPressed(new java.awt.Color(204, 204, 204));
        uno.setColorTextHover(new java.awt.Color(128, 128, 131));
        uno.setColorTextNormal(new java.awt.Color(128, 128, 131));
        uno.setColorTextPressed(new java.awt.Color(128, 128, 131));
        uno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        uno.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        uno.setIconTextGap(25);
        uno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                unoMousePressed(evt);
            }
        });
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        dos.setBackground(new java.awt.Color(239, 238, 244));
        dos.setForeground(new java.awt.Color(128, 128, 131));
        dos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewapp/metas40.png"))); // NOI18N
        dos.setText("Mis metas");
        dos.setColorHover(new java.awt.Color(204, 204, 204));
        dos.setColorNormal(new java.awt.Color(239, 238, 244));
        dos.setColorPressed(new java.awt.Color(204, 204, 204));
        dos.setColorTextHover(new java.awt.Color(128, 128, 131));
        dos.setColorTextNormal(new java.awt.Color(128, 128, 131));
        dos.setColorTextPressed(new java.awt.Color(128, 128, 131));
        dos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dos.setIconTextGap(25);
        dos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dosMousePressed(evt);
            }
        });
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });

        tres.setBackground(new java.awt.Color(239, 238, 244));
        tres.setForeground(new java.awt.Color(128, 128, 131));
        tres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewapp/cuenta40.png"))); // NOI18N
        tres.setText("Productos");
        tres.setColorHover(new java.awt.Color(204, 204, 204));
        tres.setColorNormal(new java.awt.Color(239, 238, 244));
        tres.setColorPressed(new java.awt.Color(204, 204, 204));
        tres.setColorTextHover(new java.awt.Color(128, 128, 131));
        tres.setColorTextNormal(new java.awt.Color(128, 128, 131));
        tres.setColorTextPressed(new java.awt.Color(128, 128, 131));
        tres.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tres.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        tres.setIconTextGap(25);
        tres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tresMousePressed(evt);
            }
        });
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlmenLayout = new javax.swing.GroupLayout(pnlmen);
        pnlmen.setLayout(pnlmenLayout);
        pnlmenLayout.setHorizontalGroup(
            pnlmenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlmenLayout.createSequentialGroup()
                .addGroup(pnlmenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlmenLayout.setVerticalGroup(
            pnlmenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlmenLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(467, 467, 467))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 8.3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 1);
        jPanel1.add(pnlmen, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fitness Routine Companion");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(681, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 0.2;
        jPanel1.add(jPanel2, gridBagConstraints);

        pnlCentro.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        jScrollPane1.setBorder(null);

        pnlprin.setBackground(new java.awt.Color(255, 255, 255));
        pnlprin.setLayout(new javax.swing.BoxLayout(pnlprin, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane1.setViewportView(pnlprin);

        javax.swing.GroupLayout pnlCentroLayout = new javax.swing.GroupLayout(pnlCentro);
        pnlCentro.setLayout(pnlCentroLayout);
        pnlCentroLayout.setHorizontalGroup(
            pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        pnlCentroLayout.setVerticalGroup(
            pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentroLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(pnlCentro, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        new CambiaPanel(pnlprin, new paneles.menu());
        if(this.uno.isSelected()){
            this.uno.setColorNormal(new Color(204,204,204));
            this.uno.setColorHover(new Color(204,204,204));
            this.uno.setColorPressed(new Color(204,204,204));
            
            this.dos.setColorNormal(new Color(239,238,244));
            this.dos.setColorHover(new Color(204,204,204));
            this.dos.setColorPressed(new Color(204,204,204));
            
            this.tres.setColorNormal(new Color(239,238,244));
            this.tres.setColorHover(new Color(204,204,204));
            this.tres.setColorPressed(new Color(204,204,204));
            

            
        }else{
            this.uno.setColorNormal(new Color(239,238,244));
            this.uno.setColorHover(new Color(204,204,204));
            this.uno.setColorPressed(new Color(204,204,204));
        }
    }//GEN-LAST:event_unoActionPerformed

    private void unoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unoMousePressed
        this.uno.setSelected(true);
        this.dos.setSelected(false);
        this.tres.setSelected(false);

         
    }//GEN-LAST:event_unoMousePressed

    private void dosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dosMousePressed
        this.uno.setSelected(false);
        this.dos.setSelected(true);
        this.tres.setSelected(false);

        
    }//GEN-LAST:event_dosMousePressed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
        new CambiaPanel(pnlprin, new paneles.metas());
        if(this.dos.isSelected()){
            this.dos.setColorNormal(new Color(204,204,204));
            this.dos.setColorHover(new Color(204,204,204));
            this.dos.setColorPressed(new Color(204,204,204));            
            this.uno.setColorNormal(new Color(239,238,244));
            this.uno.setColorHover(new Color(204,204,204));
            this.uno.setColorPressed(new Color(204,204,204));            
            this.tres.setColorNormal(new Color(239,238,244));
            this.tres.setColorHover(new Color(204,204,204));
            this.tres.setColorPressed(new Color(204,204,204));            
       
            
        }else{
            this.dos.setColorNormal(new Color(239,238,244));
            this.dos.setColorHover(new Color(204,204,204));
            this.dos.setColorPressed(new Color(204,204,204));
        }
    }//GEN-LAST:event_dosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int posicion = pnlmen.getX();
        if(posicion > -1){
            Animacion.Animacion.mover_izquierda(0, -264, 2, 2, pnlmen);
        }else{
            Animacion.Animacion.mover_derecha(-264, 0, 2, 2, pnlmen);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        Point mueve = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(mueve.x - x, mueve.y - y);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void tresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tresMousePressed
        new CambiaPanel(pnlprin, new paneles.producto());
        
        
    }//GEN-LAST:event_tresMousePressed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        this.uno.setSelected(false);
        this.dos.setSelected(false);
        this.tres.setSelected(true);
    }//GEN-LAST:event_tresActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    new inicio().setVisible(true);
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(inicio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro dos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlCentro;
    private javax.swing.JPanel pnlmen;
    private javax.swing.JPanel pnlprin;
    private rsbuttom.RSButtonMetro tres;
    private rsbuttom.RSButtonMetro uno;
    // End of variables declaration//GEN-END:variables
}
