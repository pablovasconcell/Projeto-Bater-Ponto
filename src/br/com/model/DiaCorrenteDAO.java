package br.com.model;

import br.com.entity.DiaCorrenteEntity;
import br.com.util.HibernateUtil;
import javax.swing.JOptionPane;
import org.hibernate.Session;

public class DiaCorrenteDAO {

    Session sessao;

    public boolean insereDiaCorrente(DiaCorrenteEntity diaCorrente) {
        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            sessao.save(diaCorrente);
            sessao.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        } finally {
            sessao.close();
        }
    }

}
