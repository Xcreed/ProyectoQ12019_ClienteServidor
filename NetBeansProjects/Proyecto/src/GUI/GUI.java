/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BL.Operacion;
import javax.swing.JOptionPane;

/**
 *
 * @author creed
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtgOperaciones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jtbtSuma = new javax.swing.JToggleButton();
        jtbtResta = new javax.swing.JToggleButton();
        jtbtMultiplicacion = new javax.swing.JToggleButton();
        jtbtDivision = new javax.swing.JToggleButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jbtCalcular = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jtxfNumerador2 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jtxfDenominador2 = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jtxfNumerador1 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jtxfDenominador1 = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.BorderLayout(10, 0));

        jPanel10.setMaximumSize(new java.awt.Dimension(50, 100));
        jPanel10.setMinimumSize(new java.awt.Dimension(20, 29));
        jPanel10.setPreferredSize(new java.awt.Dimension(50, 100));
        jPanel10.setLayout(new java.awt.GridLayout(4, 1, 10, 3));

        jbtgOperaciones.add(jtbtSuma);
        jtbtSuma.setText("+");
        jtbtSuma.setMaximumSize(new java.awt.Dimension(20, 29));
        jtbtSuma.setMinimumSize(new java.awt.Dimension(20, 29));
        jtbtSuma.setPreferredSize(new java.awt.Dimension(20, 29));
        jPanel10.add(jtbtSuma);

        jbtgOperaciones.add(jtbtResta);
        jtbtResta.setText("-");
        jtbtResta.setMaximumSize(new java.awt.Dimension(20, 29));
        jtbtResta.setMinimumSize(new java.awt.Dimension(20, 29));
        jtbtResta.setPreferredSize(new java.awt.Dimension(20, 29));
        jtbtResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbtRestaActionPerformed(evt);
            }
        });
        jPanel10.add(jtbtResta);

        jbtgOperaciones.add(jtbtMultiplicacion);
        jtbtMultiplicacion.setText("x");
        jtbtMultiplicacion.setMaximumSize(new java.awt.Dimension(20, 29));
        jtbtMultiplicacion.setMinimumSize(new java.awt.Dimension(20, 29));
        jtbtMultiplicacion.setPreferredSize(new java.awt.Dimension(20, 29));
        jPanel10.add(jtbtMultiplicacion);

        jbtgOperaciones.add(jtbtDivision);
        jtbtDivision.setText("÷");
        jtbtDivision.setMaximumSize(new java.awt.Dimension(20, 29));
        jtbtDivision.setMinimumSize(new java.awt.Dimension(20, 29));
        jtbtDivision.setPreferredSize(new java.awt.Dimension(20, 29));
        jPanel10.add(jtbtDivision);

        jPanel2.add(jPanel10, java.awt.BorderLayout.CENTER);

        jPanel11.setPreferredSize(new java.awt.Dimension(20, 100));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel11, java.awt.BorderLayout.WEST);

        jPanel12.setPreferredSize(new java.awt.Dimension(20, 100));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel12, java.awt.BorderLayout.EAST);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel16.setLayout(new java.awt.BorderLayout());

        jbtCalcular.setText("Calcular");
        jbtCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCalcularActionPerformed(evt);
            }
        });
        jPanel16.add(jbtCalcular, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel16, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel17, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel18, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel19, java.awt.BorderLayout.LINE_END);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel20, java.awt.BorderLayout.LINE_START);

        jPanel1.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel5.setPreferredSize(new java.awt.Dimension(190, 100));
        jPanel5.setLayout(new java.awt.BorderLayout(10, 0));

        jPanel9.setPreferredSize(new java.awt.Dimension(120, 78));
        jPanel9.setLayout(new javax.swing.BoxLayout(jPanel9, javax.swing.BoxLayout.Y_AXIS));
        jPanel9.add(jtxfNumerador2);
        jPanel9.add(jSeparator3);
        jPanel9.add(jtxfDenominador2);

        jPanel5.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel13.setPreferredSize(new java.awt.Dimension(25, 100));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel13, java.awt.BorderLayout.EAST);

        jPanel15.setPreferredSize(new java.awt.Dimension(25, 100));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel15, java.awt.BorderLayout.WEST);

        jPanel1.add(jPanel5, java.awt.BorderLayout.LINE_END);

        jPanel6.setLayout(new java.awt.BorderLayout(10, 0));

        jPanel7.setPreferredSize(new java.awt.Dimension(120, 78));
        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.Y_AXIS));
        jPanel7.add(jtxfNumerador1);
        jPanel7.add(jSeparator4);

        jtxfDenominador1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxfDenominador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfDenominador1ActionPerformed(evt);
            }
        });
        jPanel7.add(jtxfDenominador1);

        jPanel6.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel14.setPreferredSize(new java.awt.Dimension(25, 100));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel14, java.awt.BorderLayout.EAST);

        jPanel8.setPreferredSize(new java.awt.Dimension(25, 100));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel8, java.awt.BorderLayout.WEST);

        jPanel1.add(jPanel6, java.awt.BorderLayout.LINE_START);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtbtRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbtRestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtbtRestaActionPerformed

    private void jtxfDenominador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfDenominador1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfDenominador1ActionPerformed

    private void jbtCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCalcularActionPerformed
        String fraccion1 = jtxfNumerador1.getText() +"/"+ jtxfDenominador1.getText();
        String fraccion2 = jtxfNumerador2.getText() +"/"+ jtxfDenominador2.getText();
        
        if(jtxfNumerador1.getText().equals("") || jtxfNumerador2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Alguna de las fracciones no consiste del formato correcto. Verifique y vuelva a intentar.","Error al crear operaci\u00f3n.", JOptionPane.ERROR_MESSAGE);
        } 
        else if(jtxfDenominador1.getText().equals("") || jtxfDenominador1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Alguna de las fracciones no tiene Denominador. Se ha agregado el valor por omisi\u00f3n que es 1.","Error al crear operaci\u00f3n.", JOptionPane.INFORMATION_MESSAGE);
            Operacion operacion = new Operacion(fraccion1, fraccion2);
            realizarCalculo(operacion);
        } 
        else {
            Operacion operacion = new Operacion(fraccion1, fraccion2);
            realizarCalculo(operacion);
        }
    }//GEN-LAST:event_jbtCalcularActionPerformed

    private void realizarCalculo(Operacion operacion){
        if(jtbtSuma.isSelected()){
            System.out.println("Suma" + operacion.sumar());
        } else if (jtbtResta.isSelected()){
            System.out.println("Resta" + operacion.restar());
        } else if (jtbtMultiplicacion.isSelected()){
            System.out.println("Multiplicacion" + operacion.multiplicar());
        } else if (jtbtDivision.isSelected()){
            System.out.println("Division" + operacion.dividir());
        }
            
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton jbtCalcular;
    private javax.swing.ButtonGroup jbtgOperaciones;
    private javax.swing.JToggleButton jtbtDivision;
    private javax.swing.JToggleButton jtbtMultiplicacion;
    private javax.swing.JToggleButton jtbtResta;
    private javax.swing.JToggleButton jtbtSuma;
    private javax.swing.JTextField jtxfDenominador1;
    private javax.swing.JTextField jtxfDenominador2;
    private javax.swing.JTextField jtxfNumerador1;
    private javax.swing.JTextField jtxfNumerador2;
    // End of variables declaration//GEN-END:variables
}
