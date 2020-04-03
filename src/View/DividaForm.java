/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Model.bean.Divida;
import Model.bean.Menu;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Vitor França
 */
public class DividaForm extends javax.swing.JFrame {
private final Menu controller;
private final DividaForm view= this;
    /** Creates new form Divida */
    public DividaForm() {
        initComponents();
        this.controller = new Menu(this);
    }

    public JTextField getTxtData() {
        return txtData;
    }

    public void setTxtData(JTextField txtData) {
        this.txtData = txtData;
    }

    public JTextField getTxtCodigoDivida() {
        return txtCodigoDivida;
    }

    public void setTxtCodigoDivida(JTextField txtCodigoDivida) {
        this.txtCodigoDivida = txtCodigoDivida;
    }

    public JTextField getTxtDivida() {
        return txtDivida;
    }

    public void setTxtDivida(JTextField txtDivida) {
        this.txtDivida = txtDivida;
    }

    public JComboBox<String> getSlcCredor() {
        return slcCredor;
    }

    public void setSlcCredor(JComboBox<String> slcCredor) {
        this.slcCredor = slcCredor;
    }

    public JComboBox<String> getSlcDevedor() {
        return slcDevedor;
    }

    public void setSlcDevedor(JComboBox<String> slcDevedor) {
        this.slcDevedor = slcDevedor;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        slcDevedor = new javax.swing.JComboBox<>();
        slcCredor = new javax.swing.JComboBox<>();
        btnVoltarDivida = new javax.swing.JButton();
        btnSalvarDivida = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDivida = new javax.swing.JTextField();
        txtCodigoDivida = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        itemCliente = new javax.swing.JMenuItem();
        itemPagamento = new javax.swing.JMenuItem();
        itemDivida = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Data de atualização:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, -1, -1));

        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });
        getContentPane().add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, 200, 30));

        getContentPane().add(slcDevedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 400, 180, 30));

        getContentPane().add(slcCredor, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, 180, 30));

        btnVoltarDivida.setBackground(new java.awt.Color(102, 102, 102));
        btnVoltarDivida.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltarDivida.setText("Voltar");
        btnVoltarDivida.setToolTipText("");
        btnVoltarDivida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarDividaActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltarDivida, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, 110, 40));

        btnSalvarDivida.setBackground(new java.awt.Color(0, 102, 204));
        btnSalvarDivida.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarDivida.setText("Salvar");
        btnSalvarDivida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarDividaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvarDivida, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 530, 130, 40));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Visualizar Dívida");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Devedor:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dívida:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, -1, -1));

        txtDivida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDividaActionPerformed(evt);
            }
        });
        getContentPane().add(txtDivida, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 200, 30));

        txtCodigoDivida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoDividaActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigoDivida, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 200, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Credor:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Código:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/form-PainelFundo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/61764.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenuCadastro.setText("Cadastro");

        itemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icones/cliente-icone.png"))); // NOI18N
        itemCliente.setText("Cliente");
        itemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemClienteActionPerformed(evt);
            }
        });
        jMenuCadastro.add(itemCliente);

        itemPagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icones/pagamento-icone.png"))); // NOI18N
        itemPagamento.setText("Pagamento");
        itemPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPagamentoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(itemPagamento);

        itemDivida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icones/money.png"))); // NOI18N
        itemDivida.setText("Dívida");
        itemDivida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDividaActionPerformed(evt);
            }
        });
        jMenuCadastro.add(itemDivida);

        jMenuBar1.add(jMenuCadastro);

        jMenu2.setText("Alteração");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoDividaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoDividaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoDividaActionPerformed

    private void txtDividaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDividaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDividaActionPerformed

    private void btnSalvarDividaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarDividaActionPerformed
        // TODO add your handling code here:
        Divida divida = new Divida();
        divida.cadastrarDivida(this.view);
    }//GEN-LAST:event_btnSalvarDividaActionPerformed

    private void btnVoltarDividaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarDividaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltarDividaActionPerformed

    private void itemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemClienteActionPerformed
        // TODO add your handling code here:
        this.controller.navegar("cliente");
    }//GEN-LAST:event_itemClienteActionPerformed

    private void itemPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPagamentoActionPerformed
        // TODO add your handling code here:
        this.controller.navegar("pagamento");
    }//GEN-LAST:event_itemPagamentoActionPerformed

    private void itemDividaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDividaActionPerformed
        // TODO add your handling code here:
        this.controller.navegar("divida");
    }//GEN-LAST:event_itemDividaActionPerformed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

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
            java.util.logging.Logger.getLogger(DividaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DividaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DividaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DividaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DividaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvarDivida;
    private javax.swing.JButton btnVoltarDivida;
    private javax.swing.JMenuItem itemCliente;
    private javax.swing.JMenuItem itemDivida;
    private javax.swing.JMenuItem itemPagamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JComboBox<String> slcCredor;
    private javax.swing.JComboBox<String> slcDevedor;
    private javax.swing.JTextField txtCodigoDivida;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDivida;
    // End of variables declaration//GEN-END:variables

}
