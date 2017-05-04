package br.com.model;

import br.com.entity.Funcionario;
import br.com.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class FuncionarioDAO {

    Session sessao;

    public List<Funcionario> buscaTableFuncionario() {

        List<Funcionario> listaFunc = new ArrayList<>();

        sessao = HibernateUtil.getSessionFactory().openSession();

        sessao.beginTransaction();

        Criteria crit = sessao.createCriteria(Funcionario.class);

        crit.addOrder(Order.asc("nome"));

        listaFunc = crit.list();

        return listaFunc;
    }

    public List<Funcionario> buscaFuncID(String idFunc) {

        List<Funcionario> listaFunc = new ArrayList<>();

        sessao = HibernateUtil.getSessionFactory().openSession();

        sessao.beginTransaction();

        Criteria crit = sessao.createCriteria(Funcionario.class);

        crit.add(Restrictions.like("IdFunc", idFunc + "%"));

        listaFunc = crit.list();

        return listaFunc;

    }

    public boolean inserirFuncionario(Funcionario funcionario) {
        try{
            sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            sessao.save(funcionario);
            sessao.getTransaction().commit();
            return true;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }finally{
            sessao.close();
        }
    }
    
    public List<Funcionario> getFuncionarios(){
        
        List<Funcionario> list = new ArrayList<>();

            sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            Criteria criteria = sessao.createCriteria(Funcionario.class);
            criteria.addOrder(Order.asc("nome"));
            
            list = criteria.list();
            
            sessao.close();
            return list;
    
    }
}
