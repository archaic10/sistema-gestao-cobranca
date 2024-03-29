/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.bean.Divida;
import Model.bean.Menu;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author vitor
 */
public class DividaCons extends javax.swing.JFrame {

    /**
     * Creates new form DividaCons
     */
    private final DividaCons view = this;
    private final Menu controller;
            
    public DividaCons() throws Exception {
        initComponents();
        this.controller = new Menu(this);
        Divida dividaBean = new Divida();
        dividaBean.carregarTabela(view);
        this.getBtnEditar().setVisible(false);
        this.getBtnExcluir().setVisible(false);
        this.getBtnVoltarDivida().setVisible(false);
        this.getBtnPagamento().setVisible(false);
    }

    public JButton getBtnPagamento() {
        return btnPagamento;
    }

    public void setBtnPagamento(JButton btnPagamento) {
        this.btnPagamento = btnPagamento;
    }

    public JButton getBtnEditar() {
        return btnEditar;
    }

    public JButton getBtnPesquisar() {
        return btnPesquisar;
    }

    public void setBtnPesquisar(JButton btnPesquisar) {
        this.btnPesquisar = btnPesquisar;
    }

    public void setBtnEditar(JButton btnEditar) {
        this.btnEditar = btnEditar;
    }

    public JButton getBtnExcluir() {
        return btnExcluir;
    }

    public void setBtnExcluir(JButton btnExcluir) {
        this.btnExcluir = btnExcluir;
    }

    public JButton getBtnVoltarDivida() {
        return btnVoltarDivida;
    }

    public void setBtnVoltarDivida(JButton btnVoltarDivida) {
        this.btnVoltarDivida = btnVoltarDivida;
    }

    public JComboBox<String> getSlcFiltro() {
        return slcFiltro;
    }

    public void setSlcFiltro(JComboBox<String> slcFiltro) {
        this.slcFiltro = slcFiltro;
    }

    public JTable getTabelaDivida() {
        return tabelaDivida;
    }

    public void setTabelaDivida(JTable tabelaDivida) {
        this.tabelaDivida = tabelaDivida;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPagamento = new javax.swing.JButton();
        slcFiltro = new javax.swing.JComboBox<>();
        lblSucesso = new javax.swing.JLabel();
        lblErro = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        txtDocumento = new javax.swing.JTextField();
        lblCpf = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDivida = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnVoltarDivida = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
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

        btnPagamento.setBackground(new java.awt.Color(0, 102, 204));
        btnPagamento.setForeground(new java.awt.Color(255, 255, 255));
        btnPagamento.setText("Registrar Pagamento");
        btnPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagamentoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 740, 130, 40));

        slcFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas", "Pagas", "Não pagas" }));
        slcFiltro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                slcFiltroItemStateChanged(evt);
            }
        });
        slcFiltro.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                slcFiltroPropertyChange(evt);
            }
        });
        slcFiltro.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                slcFiltroVetoableChange(evt);
            }
        });
        getContentPane().add(slcFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, -1, 30));

        lblSucesso.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblSucesso.setForeground(new java.awt.Color(0, 153, 0));
        getContentPane().add(lblSucesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 300, 20));

        lblErro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblErro.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblErro, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 320, 20));

        btnExcluir.setBackground(new java.awt.Color(255, 0, 0));
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 740, 130, 40));

        btnPesquisar.setBackground(new java.awt.Color(0, 102, 204));
        btnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 130, 30));

        txtDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoActionPerformed(evt);
            }
        });
        getContentPane().add(txtDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 200, 30));

        lblCpf.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCpf.setForeground(new java.awt.Color(255, 255, 255));
        lblCpf.setText("Documento:");
        getContentPane().add(lblCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        tabelaDivida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código dívida", "Devedor", "CPF do devedor", "Valor dívida", "Credor", "Data atualização"
            }
        ));
        jScrollPane1.setViewportView(tabelaDivida);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 710, 400));

        btnEditar.setBackground(new java.awt.Color(0, 102, 204));
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 740, 130, 40));

        btnVoltarDivida.setBackground(new java.awt.Color(102, 102, 102));
        btnVoltarDivida.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltarDivida.setText("Voltar");
        btnVoltarDivida.setToolTipText("");
        btnVoltarDivida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarDividaActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltarDivida, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 740, 110, 40));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Consultar Dívida");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/form-PainelFundo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, -1, -1));

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

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        Divida dividaBean = new Divida();
        try {
            dividaBean.excluir(this.view);
        } catch (Exception ex) {
            Logger.getLogger(ClienteCons.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    public JLabel getLblCpf() {
        return lblCpf;
    }

    public void setLblCpf(JLabel lblCpf) {
        this.lblCpf = lblCpf;
    }

    public JTextField getTxtDocumento() {
        return txtDocumento;
    }

    public void setTxtDocumento(JTextField txtDocumento) {
        this.txtDocumento = txtDocumento;
    }

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:

        try {
            Divida dividaBean = new Divida();
            dividaBean.buscarDevedorCPF(this.view);
        } catch (Exception ex) {
            Logger.getLogger(ClienteCons.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Divida divida = new Divida();
        try {
            divida.carregarDados(view);
        } catch (Exception ex) {
            Logger.getLogger(DividaCons.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnVoltarDividaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarDividaActionPerformed
        // TODO add your handling code here:
//        Cliente clienteBean = new Cliente();
//        try {
//            clienteBean.voltarConsulta(this.view);
//        } catch (Exception ex) {
//            Logger.getLogger(ClienteCons.class.getName()).log(Level.SEVERE, null, ex);
//        }
        Divida dividaBean = new Divida();
        try {
            dividaBean.voltarConsultaDivida(view);
        } catch (Exception ex) {
            Logger.getLogger(DividaCons.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnVoltarDividaActionPerformed

    private void slcFiltroPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_slcFiltroPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_slcFiltroPropertyChange

    private void slcFiltroVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_slcFiltroVetoableChange
        // TODO add your handling code here:
     
    }//GEN-LAST:event_slcFiltroVetoableChange

    public JLabel getLblErro() {
        return lblErro;
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

    private void slcFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_slcFiltroItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_slcFiltroItemStateChanged

    private void btnPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagamentoActionPerformed
        // TODO add your handling code here:
        Divida dividaBean = new Divida();
        try {
            dividaBean.carregarDadosPagamento(view);
        } catch (ParseException ex) {
            Logger.getLogger(DividaCons.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPagamentoActionPerformed

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
            java.util.logging.Logger.getLogger(DividaCons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DividaCons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DividaCons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DividaCons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new DividaCons().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(DividaCons.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuConsulta;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPagamento;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVoltarDivida;
    private javax.swing.JMenuItem consultaItemCliente;
    private javax.swing.JMenuItem consultaItemDivida;
    private javax.swing.JMenuItem consultaItemPagamento;
    private javax.swing.JMenuItem itemCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblErro;
    private javax.swing.JLabel lblSucesso;
    private javax.swing.JComboBox<String> slcFiltro;
    private javax.swing.JTable tabelaDivida;
    private javax.swing.JTextField txtDocumento;
    // End of variables declaration//GEN-END:variables
}
