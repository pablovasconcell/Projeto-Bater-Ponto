package br.com.model;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;




/*import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;*/
public class RelatorioDAO {

    /*
    public void gerarRelatorio() {
        try {
            HashMap filtro = new HashMap();

            InputStream inputstream = getClass().getResourceAsStream("/br.com.relatorio/PontoFuncionario.jasper");
            JasperReport relatorio = (JasperReport) JRLoader.loadObject(inputstream);

            JasperPrint print = JasperFillManager.fillReport(relatorio, filtro, getConexao());

            JasperViewer view = new JasperViewer(print, false);
            view.setVisible(true);
        } catch (Exception e) {
            Logger.getLogger(RelatorioDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
     */
    public Connection getConexao() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/PontoFuncionario", "root", "1234");
        } catch (ClassNotFoundException | SQLException e) {
            Logger.getLogger(RelatorioDAO.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
}
