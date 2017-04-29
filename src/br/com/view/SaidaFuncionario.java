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
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Saida de Funcionário");

        BaterSaida.setBackground(new java.awt.Color(0, 0, 0));
        BaterSaida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BaterSaida.setForeground(new java.awt.Color(255, 255, 255));
        BaterSaida.setText("BATER PONTO");
        BaterSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaterSaidaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel2.setText("Data:");

        LabelDataAtual.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        LabelDataAtual.setText("...");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sem Título-1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(LabelDataAtual)
                        .addGap(50, 50, 50)
                        .addComponent(horaSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(BaterSaida))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(15, 15, 15)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDataAtual)
                    .addComponent(horaSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(54, 54, 54)
                .addComponent(BaterSaida)
                .addContainerGap())
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}