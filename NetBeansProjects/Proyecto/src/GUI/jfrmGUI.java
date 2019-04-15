/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BL.Operacion;
import DA.FileAdmin;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author creed
 */
public class jfrmGUI extends javax.swing.JFrame {
    
    protected static String resultado = "/";
    Date currentDate = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    public String archivoDiario = dateFormat.format(currentDate) + ".csv";
    public static FileAdmin fileAdmin = null;
    DefaultListModel lista = new DefaultListModel();

    /**
     * Creates new form GUI
     */
    public jfrmGUI() {
        initComponents();
        
        try {
            File file = new File(archivoDiario);
            if (file.exists() && file.isFile() && file.canRead()) {
                fileAdmin = new FileAdmin(archivoDiario);
                file.createNewFile();
            } else {
                file.createNewFile();
            }
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, err.getMessage(), "Error al instanciar el Administrador de Archivos", JOptionPane.ERROR_MESSAGE);
        }
        //cargarDatos();
    }
    
    protected void cargarDatos () {
        try {
            lista.removeAllElements();
            
            String[] lasOperaciones = Operacion.getOperaciones(fileAdmin);
            
            for(String s : lasOperaciones) {
                lista.addElement(s);
                System.out.println(s);
            }
            
            //Aca se debe agregar el elemento donde se van a mostrar los datos
            
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, err.getMessage(), "Error al cargar los datos del archivo.", JOptionPane.ERROR_MESSAGE);
        }
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
            .addGap(0, 236, Short.MAX_VALUE)
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
            .addGap(0, 236, Short.MAX_VALUE)
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

        jPanel17.setPreferredSize(new java.awt.Dimension(562, 40));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
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

        jtxfNumerador2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jtxfNumerador2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel9.add(jtxfNumerador2);
        jPanel9.add(jSeparator3);

        jtxfDenominador2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jtxfDenominador2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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
            .addGap(0, 236, Short.MAX_VALUE)
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
            .addGap(0, 236, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel15, java.awt.BorderLayout.WEST);

        jPanel1.add(jPanel5, java.awt.BorderLayout.LINE_END);

        jPanel6.setLayout(new java.awt.BorderLayout(10, 0));

        jPanel7.setPreferredSize(new java.awt.Dimension(120, 78));
        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.Y_AXIS));

        jtxfNumerador1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jtxfNumerador1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxfNumerador1.setActionCommand("<Not Set>");
        jPanel7.add(jtxfNumerador1);
        jPanel7.add(jSeparator4);

        jtxfDenominador1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
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
            .addGap(0, 236, Short.MAX_VALUE)
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
            .addGap(0, 236, Short.MAX_VALUE)
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
        
   
        try{
            String fraccion1 = jtxfNumerador1.getText() + "/" + jtxfDenominador1.getText();
            String fraccion2 = jtxfNumerador2.getText() + "/" + jtxfDenominador2.getText();
            
            for (;;){
                
                if (!jtbtSuma.isSelected() && !jtbtResta.isSelected() && !jtbtMultiplicacion.isSelected() && !jtbtDivision.isSelected()){
                    JOptionPane.showMessageDialog(null, "Seleccione un operando y vuelva a intentar.","Error al crear operaci\u00f3n", JOptionPane.ERROR_MESSAGE);
                    break;
                }
                
                else if (jtbtSuma.isSelected()) {
                    Operacion operacion = new Operacion(fraccion1, fraccion2,Operacion.OPERANDO.SUMA);
                    resultado = operacion.sumar();
                    operacion.insertar(fileAdmin);
                }
                
                else if(jtbtResta.isSelected()) {
                    Operacion operacion = new Operacion(fraccion1, fraccion2,Operacion.OPERANDO.RESTA);
                    resultado = operacion.restar();    
                    operacion.insertar(fileAdmin);
                }
                
                else if(jtbtMultiplicacion.isSelected()) {
                    Operacion operacion = new Operacion(fraccion1, fraccion2,Operacion.OPERANDO.MULTIPLICACION);
                    resultado = operacion.multiplicar();    
                    operacion.insertar(fileAdmin);
                }
                
                else if(jtbtDivision.isSelected()) {
                    Operacion operacion = new Operacion(fraccion1, fraccion2,Operacion.OPERANDO.DIVISION);
                    resultado = operacion.dividir();operacion.dividir();      
                    operacion.insertar(fileAdmin);
                }

                //Operacion operacion = new Operacion(fraccion1, fraccion2,operacionOperando);
                
                //realizarCalculo(operacion);
                jbtgOperaciones.clearSelection();
                System.out.println(resultado);
                
                jfrmResultado _jfrmResultado = new jfrmResultado();
                _jfrmResultado.setResizable(false);
                _jfrmResultado.setSize(400, 300);
                _jfrmResultado.show();
                
                break;
                
                
            }
            
            
        
            

        } catch (Exception error) { //Fraccion no tiene numerador o tiene letras
            JOptionPane.showMessageDialog(null, error.getMessage(),"Error al crear operaci\u00f3n", JOptionPane.ERROR_MESSAGE); 
        } 
        
        
    }//GEN-LAST:event_jbtCalcularActionPerformed

//    private void realizarCalculo(Operacion operacion) throws Exception{
//        for(;;){
//            if(jtbtSuma.isSelected()){
//                resultado = operacion.sumar();
//            } else if (jtbtResta.isSelected()){
//                resultado = operacion.restar();
//            } else if (jtbtMultiplicacion.isSelected()){
//                resultado = operacion.multiplicar();
//            } else if (jtbtDivision.isSelected()){
//                resultado = operacion.dividir();
//            } else {
//                JOptionPane.showMessageDialog(null, "Seleccione un operando y vuelva a intentar.","Error al crear operaci\u00f3n", JOptionPane.ERROR_MESSAGE);
//                break;
//            }
//
//            JOptionPane.showMessageDialog(null, "El resultado de la operaci\u00f3n es: " + resultado,"Operaci\u00f3n exitosa", JOptionPane.INFORMATION_MESSAGE);
//            break;
//        }
//        jbtgOperaciones.clearSelection();
//    }
    
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
            java.util.logging.Logger.getLogger(jfrmGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrmGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrmGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrmGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfrmGUI().setVisible(true);
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
