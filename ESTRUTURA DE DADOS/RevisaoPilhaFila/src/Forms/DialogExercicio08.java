
package Forms;

import TAD.Fila;
import TAD.Pilha;
import javax.swing.JOptionPane;

public class DialogExercicio08 extends javax.swing.JDialog {
    private Pilha pilha = new Pilha();
    private Fila fila = new Fila();
    /**
     * Creates new form DialogExercicio08
     */
    public DialogExercicio08(java.awt.Frame parent, boolean modal) {
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
        buttonAdicionar = new javax.swing.JButton();
        buttonMoverPilhaFila = new javax.swing.JButton();
        buttonMoverFilaPilha = new javax.swing.JButton();
        buttonMostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Valor");

        buttonAdicionar.setText("Adicionar");
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });

        buttonMoverPilhaFila.setText("Mover Pilha p/ Fila");
        buttonMoverPilhaFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMoverPilhaFilaActionPerformed(evt);
            }
        });

        buttonMoverFilaPilha.setText("Mover Fila p/ Pilha");
        buttonMoverFilaPilha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMoverFilaPilhaActionPerformed(evt);
            }
        });

        buttonMostrar.setText("Mostrar");
        buttonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMostrarActionPerformed(evt);
            }
        });

        areaTexto.setColumns(20);
        areaTexto.setRows(5);
        jScrollPane1.setViewportView(areaTexto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textValor, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonMoverFilaPilha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonMoverPilhaFila, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonMoverPilhaFila)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonMoverFilaPilha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonMostrar))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed
        // TODO add your handling code here:
        if (textValor.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Obrigatório");
            textValor.requestFocus();
            return;
        }
        try{
            Integer.parseInt(textValor.getText());
            areaTexto.setText(
            pilha.pushStack(textValor.getText()) ? "Adicionado na Pilha":
            "OVERFLOW");        
        }catch(NumberFormatException ex){
            areaTexto.setText(
            fila.enQueue(textValor.getText())?"Adicionado na Fila":
            "OVERFLOW"        
            );
        }
        textValor.setText("");
        textValor.requestFocus();
    }//GEN-LAST:event_buttonAdicionarActionPerformed

    private void buttonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMostrarActionPerformed
        // TODO add your handling code here:
        try{
            Pilha temp = pilha.clone();
            areaTexto.setText("===Pilha===\n");
            while (!temp.isEmptyStack()){
                areaTexto.append(temp.topStack()+"\n");
                temp.popStack();
            }
            Fila fTemp = fila.clone();
            areaTexto.append("===Fila===\n");
            while (!fTemp.isEmptyQueue()){
                areaTexto.append(fTemp.firstQueue() + "\n");
                fTemp.deQueue();
            }
        }catch(CloneNotSupportedException ex){
            System.out.println("ERRO:"+ex.getMessage());
        }
    }//GEN-LAST:event_buttonMostrarActionPerformed

    private void buttonMoverPilhaFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMoverPilhaFilaActionPerformed
        // TODO add your handling code here:
        if (pilha.isEmptyStack()){
            areaTexto.setText("Pilha Vazia\n");
            return;
        }
        if (fila.isFullQueue()){
            areaTexto.setText("Fila CHEIA\n");
            return;
        }
        fila.enQueue(pilha.topStack());
        areaTexto.setText(pilha.topStack() + " foi movido\n");
        pilha.popStack();
    }//GEN-LAST:event_buttonMoverPilhaFilaActionPerformed

    private void buttonMoverFilaPilhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMoverFilaPilhaActionPerformed
        // TODO add your handling code here:
        if (fila.isEmptyQueue()){
            areaTexto.setText("Fila VAZIA");
            return;
        }
        if (pilha.isFullStack()){
            areaTexto.setText("Pilha CHEIA");
            return;
        }
        pilha.pushStack(fila.firstQueue());
        areaTexto.setText(fila.firstQueue() + " foi movido\n");
        fila.deQueue();
    }//GEN-LAST:event_buttonMoverFilaPilhaActionPerformed

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
            java.util.logging.Logger.getLogger(DialogExercicio08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogExercicio08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogExercicio08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogExercicio08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogExercicio08 dialog = new DialogExercicio08(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonMostrar;
    private javax.swing.JButton buttonMoverFilaPilha;
    private javax.swing.JButton buttonMoverPilhaFila;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField textValor;
    // End of variables declaration//GEN-END:variables
}
