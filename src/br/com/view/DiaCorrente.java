package br.com.view;

import br.com.entity.DiaCorrenteEntity;
import br.com.entity.Funcionario;
import br.com.model.DiaCorrenteDAO;
import br.com.model.FuncionarioDAO;
import static java.lang.Math.abs;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DiaCorrente extends javax.swing.JInternalFrame {

    public DiaCorrente() {
        initComponents();
        setFuncionarioBox();
    }

    public void setFuncionarioBox() {
        FuncionarioDAO dao = new FuncionarioDAO();
        List<Funcionario> list = new ArrayList<>();
        list = dao.getFuncionarios();
        for (Funcionario funcionario : list) {
            cbxFunc.addItem(funcionario);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        horaEntrada = new javax.swing.JComboBox();
        minutoEntrada = new javax.swing.JComboBox();
        horaS = new javax.swing.JComboBox();
        minutoS = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        cbxFunc = new javax.swing.JComboBox();

        setClosable(true);
        setTitle("Entrada de Funcionário");

        registrar.setBackground(new java.awt.Color(0, 0, 0));
        registrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        registrar.setForeground(new java.awt.Color(255, 255, 255));
        registrar.setText("REGISTRAR");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel2.setText("Hora de Entrada:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/img/Sem Título-1.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel4.setText("Hora de Saída:");

        horaEntrada.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        minutoEntrada.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        horaS.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        minutoS.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel5.setText("Funcionário:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(23, 23, 23)
                        .addComponent(cbxFunc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(registrar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(horaS, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(horaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(minutoS, 0, 55, Short.MAX_VALUE)
                            .addComponent(minutoEntrada, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbxFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(horaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minutoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(horaS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minutoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed

        DiaCorrenteEntity diaCorrente = new DiaCorrenteEntity();
        DiaCorrenteDAO dao = new DiaCorrenteDAO();

        int hrE = Integer.parseInt(horaEntrada.getSelectedItem().toString());
        int hrS = Integer.parseInt(horaS.getSelectedItem().toString());

        int minE = Integer.parseInt(minutoEntrada.getSelectedItem().toString());
        int minS = Integer.parseInt(minutoS.getSelectedItem().toString());

        String tmp1 = hrE + ":" + minE;
        String tmp2 = hrS + ":" + minS;

        if (tmp1 == tmp2) {
            JOptionPane.showMessageDialog(null, "Hora de entrada igual à saída.");
        } else {
            SimpleDateFormat format = new SimpleDateFormat("HH:mm");
            Date date1;
            Date date2;

            long differen;
            try {

                date1 = format.parse(tmp1);
                date2 = format.parse(tmp2);
                differen = date1.getTime() - date2.getTime();
                differen = differen * -1;
                int tempoMin = (int) TimeUnit.MILLISECONDS.toMinutes(differen);
                if (tempoMin == 540) {
                    diaCorrente.setTempo(0);
                    diaCorrente.setStatus("Normal");
                } else if (tempoMin < 540) {
                    diaCorrente.setTempo(abs(tempoMin - 540));
                    diaCorrente.setStatus("Atrasado");
                } else if (tempoMin > 540) {
                    diaCorrente.setTempo(tempoMin - 540);
                    diaCorrente.setStatus("Hora Extra");
                }

            } catch (ParseException ex) {

            }

            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date = new Date();

            diaCorrente.setData(dateFormat.format(date));
            diaCorrente.setHoraE(hrE);
            diaCorrente.setHoraS(hrS);
            diaCorrente.setMinutoE(minE);
            diaCorrente.setMinutoS(minS);

            diaCorrente.setFuncionario((Funcionario) cbxFunc.getSelectedItem());

            dao.insereDiaCorrente(diaCorrente);
            JOptionPane.showMessageDialog(null, "Registrado com sucesso!");
            setVisible(false);
        }
    }//GEN-LAST:event_registrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbxFunc;
    private javax.swing.JComboBox horaEntrada;
    private javax.swing.JComboBox horaS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox minutoEntrada;
    private javax.swing.JComboBox minutoS;
    private javax.swing.JButton registrar;
    // End of variables declaration//GEN-END:variables
}
