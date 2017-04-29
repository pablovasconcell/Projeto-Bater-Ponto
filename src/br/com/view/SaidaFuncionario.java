package br.com.view;

public class SaidaFuncionario extends javax.swing.JInternalFrame {

    public SaidaFuncionario() {
        initComponents();
    }

    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BaterSaida = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        LabelDataAtual = new javax.swing.JLabel();
        horaSaida = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Saida de Funcionário");

        BaterSaida.setText("Bater Ponto");
        BaterSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaterSaidaActionPerformed(evt);
            }
        });

        jLabel2.setText("Data:");

        LabelDataAtual.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        LabelDataAtual.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BaterSaida)
                        .addGap(86, 86, 86))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelDataAtual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(horaSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDataAtual)
                    .addComponent(horaSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(BaterSaida)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BaterSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaterSaidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BaterSaidaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BaterSaida;
    private javax.swing.JLabel LabelDataAtual;
    private javax.swing.JTextField horaSaida;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
