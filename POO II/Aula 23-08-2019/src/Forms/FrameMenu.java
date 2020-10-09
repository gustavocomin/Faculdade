/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

/**
 *
 * @author Personal
 */
public class FrameMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrameMenu
     */
    public FrameMenu() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemCidade = new javax.swing.JMenuItem();
        itemFornecedor = new javax.swing.JMenuItem();
        itemProduto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Fornecimento");

        jMenu1.setText("Arquivos");

        itemCidade.setText("Cidades");
        itemCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCidadeActionPerformed(evt);
            }
        });
        jMenu1.add(itemCidade);

        itemFornecedor.setText("Fornecedores");
        itemFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFornecedorActionPerformed(evt);
            }
        });
        jMenu1.add(itemFornecedor);

        itemProduto.setText("Produtos");
        itemProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(itemProduto);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCidadeActionPerformed
        // TODO add your handling code here:
        new DialogCidade(this, true).setVisible(true);
    }//GEN-LAST:event_itemCidadeActionPerformed

    private void itemFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemFornecedorActionPerformed
        // TODO add your handling code here:
        new DialogFornecedor(this, true).setVisible(true);
    }//GEN-LAST:event_itemFornecedorActionPerformed

    private void itemProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemProdutoActionPerformed
        // TODO add your handling code here:
        new DialogProduto(this, true).setVisible(true);
    }//GEN-LAST:event_itemProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemCidade;
    private javax.swing.JMenuItem itemFornecedor;
    private javax.swing.JMenuItem itemProduto;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
