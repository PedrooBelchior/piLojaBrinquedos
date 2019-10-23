/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ClienteController;
import javax.swing.JOptionPane;
import model.ClienteModel;
import util.Validador;

/**
 *
 * @author marcelo.ablsantos
 */
public class CadastroClienteView extends javax.swing.JFrame {

    public static boolean editar = false;

    /**
     * Creates new form CadastroCliente
     */
    public CadastroClienteView() {
        initComponents();
        lblID.setVisible(false);
        lblNumeroID.setVisible(false);
        btnEdit.setEnabled(false);
    }

    public CadastroClienteView(ClienteModel c) {
        initComponents();
        lblNumeroID.setText(String.valueOf(c.getId()));
        txtNome.setText(c.getNome());
        txtEmail.setText(c.getEmail());
        txtCPF.setText(c.getCpf());
        txtSexo.setText(c.getSexo());
        txtNasc.setText(c.getNascimento());
        txtEstadoCivil.setText(c.getEstadoCivil());
        txtCel.setText(c.getCelular());
        txtTel.setText(c.getTelefone());
        txtEndereco.setText(c.getEndereco());
        desabilitarFormulario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblNasc = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtCPF = new javax.swing.JFormattedTextField();
        lblCPF = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        txtNasc = new javax.swing.JFormattedTextField();
        lblCel = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        txtCel = new javax.swing.JFormattedTextField();
        txtTel = new javax.swing.JFormattedTextField();
        txtEndereco = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        lblEstadoCivil = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblNumeroID = new javax.swing.JLabel();
        txtSexo = new javax.swing.JTextField();
        txtEstadoCivil = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(434, 409));

        lblNome.setText("Nome: *");

        txtNome.setMaximumSize(new java.awt.Dimension(20, 400));
        txtNome.setMinimumSize(new java.awt.Dimension(20, 400));
        txtNome.setPreferredSize(new java.awt.Dimension(400, 25));

        lblEmail.setText("E-mail: *");

        txtEmail.setMinimumSize(new java.awt.Dimension(14, 25));
        txtEmail.setPreferredSize(new java.awt.Dimension(14, 25));

        lblNasc.setText("Data de Nascimento: *");

        btnSave.setText("Salvar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancelar");
        btnCancel.setPreferredSize(new java.awt.Dimension(80, 32));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setPreferredSize(new java.awt.Dimension(190, 25));

        lblCPF.setText("CPF: *");

        lblTel.setText("Telefone:");

        try {
            txtNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNasc.setText("");
        txtNasc.setMinimumSize(new java.awt.Dimension(4, 22));
        txtNasc.setPreferredSize(new java.awt.Dimension(34, 25));

        lblCel.setText("Celular: *");

        lblEndereco.setText("Endereço: *");

        try {
            txtCel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCel.setPreferredSize(new java.awt.Dimension(49, 25));

        try {
            txtTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTel.setPreferredSize(new java.awt.Dimension(52, 25));

        txtEndereco.setPreferredSize(new java.awt.Dimension(14, 25));

        lblID.setText("ID: ");

        btnEdit.setText("Editar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        lblEstadoCivil.setText("Estado Civil: *");

        lblSexo.setText("Sexo: *");

        lblNumeroID.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCPF)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblSexo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtSexo))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNumeroID)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEmail)
                            .addComponent(lblEndereco)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTel)
                                    .addComponent(txtTel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNasc)
                                    .addComponent(txtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblEstadoCivil)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtEstadoCivil))))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(lblID)
                    .addComponent(lblNumeroID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSexo)
                        .addGap(32, 32, 32)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNasc)
                    .addComponent(lblEstadoCivil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCel)
                    .addComponent(lblTel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (validarFormulario()) {
            if (editar) {
                if (ClienteController.atualizar(Integer.parseInt(lblNumeroID.getText()),
                        txtNome.getText(),
                        txtEmail.getText(),
                        txtCPF.getText().replace(".", "").replace("-", "").replace(" ", ""),
                        txtNasc.getText(),
                        txtSexo.getText(),
                        txtEstadoCivil.getText(),
                        txtCel.getText().replace("(", "").replace(")", "").replace("-", "").replace(" ", ""),
                        txtTel.getText().replace("(", "").replace(")", "").replace("-", "").replace(" ", ""),
                        txtEndereco.getText())) {

                    JOptionPane.showMessageDialog(this, "Cliente atualizado com Sucesso!");
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Falha ao atualizar cliente!");
                }
            } else {
                if (ClienteController.salvar(txtNome.getText(),
                        txtEmail.getText(),
                        txtCPF.getText().replace(".", "").replace("-", "").replace(" ", ""),
                        txtNasc.getText(),
                        txtSexo.getText(),
                        txtEstadoCivil.getText(),
                        txtCel.getText().replace("(", "").replace(")", "").replace("-", "").replace(" ", ""),
                        txtTel.getText().replace("(", "").replace(")", "").replace("-", "").replace(" ", ""),
                        txtEndereco.getText())) {

                    JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!");
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Falha ao registrar cliente!");
                }
            }

        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        habilitarFormulario();
        editar = true;
    }//GEN-LAST:event_btnEditActionPerformed

    private boolean validarFormulario() {
        String cpf = txtCPF.getText().replace(".", "").replace("-", "").replace(" ", "");
        String cel = txtCel.getText().replace("(", "").replace(")", "").replace("-", "").replace(" ", "");
        String data = txtNasc.getText().replace("/", "").replace(" ", "");

        if (txtNome.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Informe o nome do cliente!");
            return false;
        }

        if (txtEmail.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Informe o email do cliente!");
            return false;
        }

        if (cpf.equals("")) {
            JOptionPane.showMessageDialog(this, "Informe o CPF do cliente!");
            return false;
        }

        if (txtSexo.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Informe o sexo do cliente!");
            return false;
        }

        if (data.equals("")) {
            JOptionPane.showMessageDialog(this, "Informe a data de nascimento do cliente!");
            return false;
        }

        if (txtEstadoCivil.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Informe o estado civil do cliente!");
            return false;
        }

        if (cel.equals("")) {
            JOptionPane.showMessageDialog(this, "Informe o número de celular do cliente!");
            return false;
        }

        if (txtEndereco.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Informe o Endereço do cliente!");
            return false;
        }

        if (!Validador.validarData(txtNasc.getText())) {
            JOptionPane.showMessageDialog(this, "Data Inválida!");
            return false;
        }

        return true;
    }

    private void desabilitarFormulario() {
        txtNome.setEditable(false);
        txtEmail.setEditable(false);
        txtCPF.setEditable(false);
        txtSexo.setEditable(false);
        txtEstadoCivil.setEditable(false);
        txtNasc.setEditable(false);
        txtCel.setEditable(false);
        txtTel.setEditable(false);
        txtEndereco.setEditable(false);

        btnSave.setEnabled(false);
    }

    private void habilitarFormulario() {
        txtNome.setEditable(true);
        txtEmail.setEditable(true);
        txtCPF.setEditable(true);
        txtSexo.setEditable(true);
        txtEstadoCivil.setEditable(true);
        txtNasc.setEditable(true);
        txtCel.setEditable(true);
        txtTel.setEditable(true);
        txtEndereco.setEditable(true);

        btnSave.setEnabled(true);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        ClienteModel c = new ClienteModel(521,
                "Arthur",
                "arthursakemi@gmail.com",
                "36856036809",
                "Masculino",
                "16071990",
                "Solteiro",
                "11964005340",
                "1156315627",
                "Rua João da Rocha, 200 - Casa 11A");

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroClienteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCel;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNasc;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumeroID;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTel;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtCel;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEstadoCivil;
    private javax.swing.JFormattedTextField txtNasc;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JFormattedTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
