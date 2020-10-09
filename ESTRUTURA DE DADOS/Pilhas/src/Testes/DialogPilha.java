/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import Tad.Pilha;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernando
 */
public class DialogPilha extends javax.swing.JDialog {
    private Pilha pilha = new Pilha();
    
    /**
     * Creates new form DialogPilha
     */
    public DialogPilha(java.awt.Frame parent, boolean modal) {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();
        buttonAdd = new javax.swing.JButton();
        buttonDel = new javax.swing.JButton();
        buttonTop = new javax.swing.JButton();
        buttonPercorre = new javax.swing.JButton();
        buttonPesquisar = new javax.swing.JButton();
        buttonRemoverValor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Valor");

        areaTexto.setColumns(20);
        areaTexto.setRows(5);
        jScrollPane1.setViewportView(areaTexto);

        buttonAdd.setText("Adicionar");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        buttonDel.setText("Remover");
        buttonDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDelActionPerformed(evt);
            }
        });

        buttonTop.setText("Acessar");
        buttonTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTopActionPerformed(evt);
            }
        });

        buttonPercorre.setText("Percorrer");
        buttonPercorre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPercorreActionPerformed(evt);
            }
        });

        buttonPesquisar.setText("Pesquisar");
        buttonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisarActionPerformed(evt);
            }
        });

        buttonRemoverValor.setText("Remover Valor");
        buttonRemoverValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoverValorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(textValor, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(buttonTop, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonDel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(buttonPercorre)
                    .addComponent(buttonPesquisar)
                    .addComponent(buttonRemoverValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonDel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonTop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonPercorre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonRemoverValor)
                        .addGap(0, 52, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        // TODO add your handling code here:
        if (textValor.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Obrigatório");
            textValor.requestFocus();
            return;
        }
        areaTexto.append(pilha.pushStack(
                textValor.getText().toUpperCase())?
                "Inserido\n":"Stack Overflow\n");
        //
        textValor.setText("");
        textValor.requestFocus();
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDelActionPerformed
        // TODO add your handling code here:
        areaTexto.append(pilha.popStack()?"Removido\n":"UnderFlow\n");
    }//GEN-LAST:event_buttonDelActionPerformed

    private void buttonTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTopActionPerformed
        // TODO add your handling code here:
        if (pilha.isEmptyStack()){
            areaTexto.append("Pilha VAZIA\n");
        }else{
            areaTexto.append(pilha.topStack()+"\n");
        }
    }//GEN-LAST:event_buttonTopActionPerformed

    private void buttonPercorreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPercorreActionPerformed
        // TODO add your handling code here:
        if (pilha.isEmptyStack()){
            areaTexto.setText("Pilha VAZIA");
            return;
        }
        Pilha temp=null;
        try{
            temp = pilha.clone();
        }catch(CloneNotSupportedException ex){
            System.out.println("ERRO Clone:"+ex.getMessage());
            return;
        } 
        areaTexto.setText("Elementos da Pilha\n");
        while(!temp.isEmptyStack()){
            areaTexto. append(temp.topStack()+"\n");
            temp.popStack();
        }
    }//GEN-LAST:event_buttonPercorreActionPerformed

    private void buttonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarActionPerformed
        // TODO add your handling code here:
        if (textValor.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite Algo");
            return;
        }
        if (pilha.isEmptyStack()){
            areaTexto.setText("Pilha VAZIA");
            return;
        }
        Pilha temp=null;
        try{
           temp = pilha.clone();
        }catch(CloneNotSupportedException ex){
            System.out.println("ERRO:"+ex.getMessage());
            return;
        }
        while(!temp.isEmptyStack()){
            if (temp.topStack().equalsIgnoreCase(textValor.getText())){
                areaTexto.setText("Localizado:" + temp.topStack());
                return;
            }
            temp.popStack();
        }
        areaTexto.setText("Não Localizado");
        
    }//GEN-LAST:event_buttonPesquisarActionPerformed

    private void buttonRemoverValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverValorActionPerformed
        // TODO add your handling code here:
        if (textValor.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite Algo");
            return;
        }
        if (pilha.isEmptyStack()){
            areaTexto.setText("Pilha VAZIA");
            return;
        }
        Pilha temp = new Pilha();
        while (!pilha.isEmptyStack()){
            if (!pilha.topStack().equalsIgnoreCase(textValor.getText())){
                temp.pushStack(pilha.topStack());
            }
            pilha.popStack();
        }
        //remontar a pilha original
        while (!temp.isEmptyStack()){
            pilha.pushStack(temp.topStack());
            temp.popStack();
        }
        areaTexto.setText("Processo Concluído");
    }//GEN-LAST:event_buttonRemoverValorActionPerformed

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
            java.util.logging.Logger.getLogger(DialogPilha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogPilha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogPilha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogPilha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogPilha dialog = new DialogPilha(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonDel;
    private javax.swing.JButton buttonPercorre;
    private javax.swing.JButton buttonPesquisar;
    private javax.swing.JButton buttonRemoverValor;
    private javax.swing.JButton buttonTop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField textValor;
    // End of variables declaration//GEN-END:variables
}
