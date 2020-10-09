/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Tad.Lista;
import Tad.Nodo;
import javax.swing.JOptionPane;

/**
 *
 * @author Personal
 */
public class DialogLista extends javax.swing.JDialog {
    Lista lista = new Lista();

    /**
     * Creates new form DialogLista
     */
    public DialogLista(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jLabel1 = new javax.swing.JLabel();
        textValor = new javax.swing.JTextField();
        buttonAddInicio = new javax.swing.JButton();
        buttonAddFinal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();
        buttonMostrar = new javax.swing.JButton();
        buttonBuscar = new javax.swing.JButton();
        buttonRemoveInicio = new javax.swing.JButton();
        buttonRemoveFinal = new javax.swing.JButton();
        buttonRemoverValor = new javax.swing.JButton();
        buttonInserirOrdenado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Valor");

        buttonAddInicio.setText("Inserir Início");
        buttonAddInicio.setEnabled(false);
        buttonAddInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddInicioActionPerformed(evt);
            }
        });

        buttonAddFinal.setText("Inserir Final");
        buttonAddFinal.setEnabled(false);
        buttonAddFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddFinalActionPerformed(evt);
            }
        });

        areaTexto.setColumns(20);
        areaTexto.setRows(5);
        jScrollPane1.setViewportView(areaTexto);

        buttonMostrar.setText("Mostrar");
        buttonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMostrarActionPerformed(evt);
            }
        });

        buttonBuscar.setText("Buscar");
        buttonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarActionPerformed(evt);
            }
        });

        buttonRemoveInicio.setText("Remover Início");
        buttonRemoveInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoveInicioActionPerformed(evt);
            }
        });

        buttonRemoveFinal.setText("Remover Final");
        buttonRemoveFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoveFinalActionPerformed(evt);
            }
        });

        buttonRemoverValor.setText("Remover Valor");
        buttonRemoverValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoverValorActionPerformed(evt);
            }
        });

        buttonInserirOrdenado.setText("Inserir Ordenado");
        buttonInserirOrdenado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInserirOrdenadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonRemoveInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonAddInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonRemoveFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonAddFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonMostrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonBuscar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(buttonRemoverValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(textValor, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonInserirOrdenado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonInserirOrdenado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAddInicio)
                    .addComponent(buttonAddFinal)
                    .addComponent(buttonMostrar)
                    .addComponent(buttonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRemoveInicio)
                    .addComponent(buttonRemoveFinal)
                    .addComponent(buttonRemoverValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddFinalActionPerformed
        // TODO add your handling code here:
        if (textValor.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "VAZIO");
            textValor.requestFocus();
            return;
        }                
        lista.incluirFinal(new Nodo(textValor.getText()));
        textValor.setText("");
    }//GEN-LAST:event_buttonAddFinalActionPerformed

    private void buttonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMostrarActionPerformed
        // TODO add your handling code here:
        areaTexto.setText("");
        Nodo temp = lista.getPrimeiro();
        while (temp != null){
            areaTexto.append(temp.getInformacao()+"\n");
            temp = temp.getProximo();
        }
    }//GEN-LAST:event_buttonMostrarActionPerformed

    private void buttonAddInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddInicioActionPerformed
        // TODO add your handling code here:
        if (textValor.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "VAZIO");
            textValor.requestFocus();
            return;
        } 
        lista.incluirInicio(new Nodo(textValor.getText()));
        textValor.requestFocus();
        textValor.setText("");                
    }//GEN-LAST:event_buttonAddInicioActionPerformed

    private void buttonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarActionPerformed
        // TODO add your handling code here:
        if (textValor.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "VAZIO");
            textValor.requestFocus();
            return;
        }
        Nodo retorno = lista.getNodo(textValor.getText());
        if (retorno == null){
            areaTexto.setText("Não Localizado");                    
        }else{
            areaTexto.setText("Localizado: "+retorno.getInformacao());
        }
    }//GEN-LAST:event_buttonBuscarActionPerformed

    private void buttonRemoveInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoveInicioActionPerformed
        // TODO add your handling code here:
        if (lista.estaVazia()){
            areaTexto.setText("Lista VAZIA");
            return;
        }
        
        lista.removerInicio();
        areaTexto.setText("Primeiro Removido");
    }//GEN-LAST:event_buttonRemoveInicioActionPerformed

    private void buttonRemoveFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoveFinalActionPerformed
        // TODO add your handling code here:
        if (lista.estaVazia()){
            areaTexto.setText("Lista VAZIA");
            return;
        }
        
        lista.removerFinal();
        areaTexto.setText("Último Removido");
        
    }//GEN-LAST:event_buttonRemoveFinalActionPerformed

    private void buttonRemoverValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverValorActionPerformed
        // TODO add your handling code here:
        if (textValor.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite");
            textValor.requestFocus();
            return;
        }
        areaTexto.setText(
        lista.removeIntermediario(textValor.getText()) ?
        "Nodo Removido" : "Não Localizado");
        
    }//GEN-LAST:event_buttonRemoverValorActionPerformed

    private void buttonInserirOrdenadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInserirOrdenadoActionPerformed
        // TODO add your handling code here:
        if (textValor.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite");
            textValor.requestFocus();
            return;
        }
        lista.incluirOrdenado(new Nodo(textValor.getText()));
        textValor.setText("");
        textValor.requestFocus();
    }//GEN-LAST:event_buttonInserirOrdenadoActionPerformed

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
            java.util.logging.Logger.getLogger(DialogLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogLista dialog = new DialogLista(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTexto;
    private javax.swing.JButton buttonAddFinal;
    private javax.swing.JButton buttonAddInicio;
    private javax.swing.JButton buttonBuscar;
    private javax.swing.JButton buttonInserirOrdenado;
    private javax.swing.JButton buttonMostrar;
    private javax.swing.JButton buttonRemoveFinal;
    private javax.swing.JButton buttonRemoveInicio;
    private javax.swing.JButton buttonRemoverValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField textValor;
    // End of variables declaration//GEN-END:variables
}
