package br.com.view;

import br.com.entity.Funcionario;
import br.com.model.ModelTableFuncionario;
import br.com.model.ModelTableFuncionarioId;
import javax.swing.JOptionPane;

public class PesquisaFuncionario extends javax.swing.JInternalFrame {

    private ModelTableFuncionario modelfunc;
    private ModelTableFuncionarioId modelId;

    public PesquisaFuncionario() {
        initComponents();
        this.modelfunc = new ModelTableFuncionario();
        this.tableFunc.setModel(modelfunc);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        CodigoPsq = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFunc = new javax.swing.JTable();
        PsqButton = new javax.swing.JButton();

        setClosable(true);
        setTitle("Pesquisar Funcionário");
        setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel7.setText("PESQUISAR FUNCIONÁRIO");

        CodigoPsq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CodigoPsqKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel1.setText("Pesquisa:");

        tableFunc.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tableFunc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableFunc);

        PsqButton.setText("Ir");
        PsqButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PsqButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(CodigoPsq, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PsqButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodigoPsq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(PsqButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CodigoPsqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CodigoPsqKeyReleased
        /*if (CodigoPsq.getText().isEmpty()) {
         this.tableFunc = new ModelTableFuncionario();
         this.jTableFunc.setModel(modelfunc);
         } else {
         this.tableFunc = new ModelTableFuncionarioId(CodigoPsq.getText());
         this.tableFunc.setModel(modelfunc);
         }*/
    }//GEN-LAST:event_CodigoPsqKeyReleased

    private void PsqButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PsqButtonActionPerformed
        Funcionario func = new Funcionario();

        if (CodigoPsq.getText().isEmpty() == false) {
            func.setId(Integer.parseInt(CodigoPsq.getText()));
            this.modelId = new ModelTableFuncionarioId(func);
            this.tableFunc.setModel(modelId);
        } else {
            JOptionPane.showMessageDialog(null, "Campos vazios!");
        }
    }//GEN-LAST:event_PsqButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CodigoPsq;
    private javax.swing.JButton PsqButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tableFunc;
    // End of variables declaration//GEN-END:variables
}
