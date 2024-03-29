/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.bean.Menu;
import Model.bean.Pagamento;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Vitor França
 */
public class PagamentoForm extends javax.swing.JFrame {

    public JLabel getLblErro() {
        return lblErro;
    }

    public JLabel getLblDtPg() {
        return lblDataPag;
    }

    public void setLblDtPg(JLabel lblDtPg) {
        this.lblDataPag = lblDtPg;
    }

    public JButton getBtnSalvarPagamento() {
        return btnSalvarPagamento;
    }

    public void setBtnSalvarPagamento(JButton btnSalvarPagamento) {
        this.btnSalvarPagamento = btnSalvarPagamento;
    }

    public JButton getBtnVoltarPagamento() {
        return btnVoltarPagamento;
    }

    public void setBtnVoltarPagamento(JButton btnVoltarPagamento) {
        this.btnVoltarPagamento = btnVoltarPagamento;
    }

    public JLabel getLbldtPg() {
        return lblValorPg;
    }

    public void setLbldtPg(JLabel lbldtPg) {
        this.lblValorPg = lbldtPg;
    }

    public void setLblErro(JLabel lblErro) {
        this.lblErro = lblErro;
    }

    public JLabel getLblSucesso() {
        return lblSucesso;
    }

    public void setLblSucesso(JLabel lblSucesso) {
        this.lblSucesso = lblSucesso;
    }

    /**
     * Creates new form Pagamento
     */
    private final Menu controller;
    private final PagamentoForm view = this;
    public PagamentoForm() {
        initComponents();
        this.controller = new Menu(this.view);
//        this.getTxtDivida().setVisible(false);
        this.getTxtCodigoPagamento().setVisible(false);
        this.getLblCodPag().setVisible(false);
        
       
    }

    public JLabel getLblValorPg() {
        return lblValorPg;
    }

    public void setLblValorPg(JLabel lblValorPg) {
        this.lblValorPg = lblValorPg;
    }

    public JLabel getLblCodPag() {
        return lblCodPag;
    }

    public void setLblCodPag(JLabel lblCodPag) {
        this.lblCodPag = lblCodPag;
    }



    public JTextField getTxtCodigoPagamento() {
        return txtCodigoPagamento;
    }

    public void setTxtCodigoPagamento(JTextField txtCodigoPagamento) {
        this.txtCodigoPagamento = txtCodigoPagamento;
    }

    public JTextField getTxtDataPg() {
        return txtDataPg;
    }

    public void setTxtDataPg(JTextField txtDataPg) {
        this.txtDataPg = txtDataPg;
    }

    public JTextField getTxtValor() {
        return txtValor;
    }

    public void setTxtValor(JTextField txtValor) {
        this.txtValor = txtValor;
    }

    public JTextField getTxtDivida() {
        return txtDivida;
    }

    public void setTxtDivida(JTextField txtDivida) {
        this.txtDivida = txtDivida;
    }

    public JLabel getLblDivida() {
        return lblDivida;
    }

    public void setLblDivida(JLabel lblDivida) {
        this.lblDivida = lblDivida;
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblErro = new javax.swing.JLabel();
        lblSucesso = new javax.swing.JLabel();
        lblDataAtu = new javax.swing.JLabel();
        txtDataAtu = new javax.swing.JTextField();
        lblValorDivida = new javax.swing.JLabel();
        txtvalorDivida = new javax.swing.JTextField();
        btnVoltarPagamento = new javax.swing.JButton();
        btnSalvarPagamento = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblValorPg = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        lblDivida = new javax.swing.JLabel();
        txtDivida = new javax.swing.JTextField();
        txtDataPg = new javax.swing.JTextField();
        txtCodigoPagamento = new javax.swing.JTextField();
        lblDataPag = new javax.swing.JLabel();
        lblCodPag = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        itemCliente = new javax.swing.JMenuItem();
        MenuConsulta = new javax.swing.JMenu();
        consultaItemCliente = new javax.swing.JMenuItem();
        consultaItemDivida = new javax.swing.JMenuItem();
        consultaItemPagamento = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblErro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblErro.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblErro, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 740, 20));

        lblSucesso.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblSucesso.setForeground(new java.awt.Color(0, 153, 0));
        getContentPane().add(lblSucesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 740, 20));

        lblDataAtu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDataAtu.setForeground(new java.awt.Color(255, 255, 255));
        lblDataAtu.setText("Data de atualização:");
        getContentPane().add(lblDataAtu, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));

        txtDataAtu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataAtuActionPerformed(evt);
            }
        });
        getContentPane().add(txtDataAtu, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 200, 30));

        lblValorDivida.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblValorDivida.setForeground(new java.awt.Color(255, 255, 255));
        lblValorDivida.setText("Valor da dívida:");
        getContentPane().add(lblValorDivida, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, -1, -1));

        txtvalorDivida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvalorDividaActionPerformed(evt);
            }
        });
        getContentPane().add(txtvalorDivida, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 200, 30));

        btnVoltarPagamento.setBackground(new java.awt.Color(102, 102, 102));
        btnVoltarPagamento.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltarPagamento.setText("Voltar");
        btnVoltarPagamento.setToolTipText("");
        btnVoltarPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarPagamentoActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltarPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, 110, 40));

        btnSalvarPagamento.setBackground(new java.awt.Color(0, 102, 204));
        btnSalvarPagamento.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarPagamento.setText("Salvar");
        btnSalvarPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarPagamentoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvarPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, 130, 40));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Realizar Pagamento");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        lblValorPg.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblValorPg.setForeground(new java.awt.Color(255, 255, 255));
        lblValorPg.setText("Valor a ser pago:");
        getContentPane().add(lblValorPg, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, -1, -1));

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });
        getContentPane().add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 400, 200, 30));

        lblDivida.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDivida.setForeground(new java.awt.Color(255, 255, 255));
        lblDivida.setText("Dívida:");
        getContentPane().add(lblDivida, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, -1, -1));

        txtDivida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDividaActionPerformed(evt);
            }
        });
        getContentPane().add(txtDivida, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, 200, 30));

        txtDataPg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataPgActionPerformed(evt);
            }
        });
        getContentPane().add(txtDataPg, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, 200, 30));

        txtCodigoPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoPagamentoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigoPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 200, 30));

        lblDataPag.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDataPag.setForeground(new java.awt.Color(255, 255, 255));
        lblDataPag.setText("Data de pagemento:");
        getContentPane().add(lblDataPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, -1, -1));

        lblCodPag.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCodPag.setForeground(new java.awt.Color(255, 255, 255));
        lblCodPag.setText("Código:");
        getContentPane().add(lblCodPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

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

        jMenuBar1.add(jMenuCadastro);

        MenuConsulta.setText("Consulta");

        consultaItemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icones/cliente-icone.png"))); // NOI18N
        consultaItemCliente.setText("Cliente");
        consultaItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaItemClienteActionPerformed(evt);
            }
        });
        MenuConsulta.add(consultaItemCliente);

        consultaItemDivida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icones/money.png"))); // NOI18N
        consultaItemDivida.setText("Dívida");
        consultaItemDivida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaItemDividaActionPerformed(evt);
            }
        });
        MenuConsulta.add(consultaItemDivida);

        consultaItemPagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icones/pagamento-icone.png"))); // NOI18N
        consultaItemPagamento.setText("Pagamento");
        consultaItemPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaItemPagamentoActionPerformed(evt);
            }
        });
        MenuConsulta.add(consultaItemPagamento);

        jMenuBar1.add(MenuConsulta);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void txtDataPgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataPgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataPgActionPerformed

    private void txtCodigoPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoPagamentoActionPerformed

    private void btnVoltarPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarPagamentoActionPerformed
        // TODO add your handling code here:
        Pagamento nova_view = new Pagamento();
        try {
            nova_view.voltar(this.view);
        } catch (Exception ex) {
            Logger.getLogger(PagamentoForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnVoltarPagamentoActionPerformed

    private void btnSalvarPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarPagamentoActionPerformed
        // TODO add your handling code here:
        Pagamento pagamento = new Pagamento();
        try {
            pagamento.realizarPagamento(this);
        } catch (ParseException ex) {
            Logger.getLogger(PagamentoForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PagamentoForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSalvarPagamentoActionPerformed

    public JLabel getLblDataAtu() {
        return lblDataAtu;
    }

    public void setLblDataAtu(JLabel lblDataAtu) {
        this.lblDataAtu = lblDataAtu;
    }

    public JLabel getLblValorDivida() {
        return lblValorDivida;
    }

    public void setLblValorDivida(JLabel lblValorDivida) {
        this.lblValorDivida = lblValorDivida;
    }

    public JTextField getTxtDataAtu() {
        return txtDataAtu;
    }

    public JLabel getLblDataPag() {
        return lblDataPag;
    }

    public void setLblDataPag(JLabel lblDataPag) {
        this.lblDataPag = lblDataPag;
    }

    public void setTxtDataAtu(JTextField txtDataAtu) {
        this.txtDataAtu = txtDataAtu;
    }

    public JTextField getTxtvalorDivida() {
        return txtvalorDivida;
    }

    public void setTxtvalorDivida(JTextField txtvalorDivida) {
        this.txtvalorDivida = txtvalorDivida;
    }

    private void txtvalorDividaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvalorDividaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvalorDividaActionPerformed

    private void txtDataAtuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataAtuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataAtuActionPerformed

    private void itemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemClienteActionPerformed
        // TODO add your handling code here:
        this.controller.navegar("cliente");
    }//GEN-LAST:event_itemClienteActionPerformed

    private void consultaItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaItemClienteActionPerformed
        // TODO add your handling code here:
        this.controller.navegar("cliente_consulta");
    }//GEN-LAST:event_consultaItemClienteActionPerformed

    private void consultaItemDividaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaItemDividaActionPerformed
        // TODO add your handling code here:
        this.controller.navegar("divida_consulta");
    }//GEN-LAST:event_consultaItemDividaActionPerformed

    private void consultaItemPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaItemPagamentoActionPerformed
        // TODO add your handling code here:
        this.controller.navegar("pagamento_consulta");
    }//GEN-LAST:event_consultaItemPagamentoActionPerformed

    private void txtDividaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDividaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDividaActionPerformed

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
            java.util.logging.Logger.getLogger(PagamentoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagamentoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagamentoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagamentoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagamentoForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuConsulta;
    private javax.swing.JButton btnSalvarPagamento;
    private javax.swing.JButton btnVoltarPagamento;
    private javax.swing.JMenuItem consultaItemCliente;
    private javax.swing.JMenuItem consultaItemDivida;
    private javax.swing.JMenuItem consultaItemPagamento;
    private javax.swing.JMenuItem itemCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JLabel lblCodPag;
    private javax.swing.JLabel lblDataAtu;
    private javax.swing.JLabel lblDataPag;
    private javax.swing.JLabel lblDivida;
    private javax.swing.JLabel lblErro;
    private javax.swing.JLabel lblSucesso;
    private javax.swing.JLabel lblValorDivida;
    private javax.swing.JLabel lblValorPg;
    private javax.swing.JTextField txtCodigoPagamento;
    private javax.swing.JTextField txtDataAtu;
    private javax.swing.JTextField txtDataPg;
    private javax.swing.JTextField txtDivida;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextField txtvalorDivida;
    // End of variables declaration//GEN-END:variables
}
