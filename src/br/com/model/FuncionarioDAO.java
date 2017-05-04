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

    public List<Funcionario> getFunc() {
        List<Funcionario> listaFunc = new ArrayList<>();
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();

        Criteria criteria = sessao.createCriteria(Funcionario.class);
        criteria.addOrder(Order.asc("id"));

        listaFunc = criteria.list();

        return listaFunc;
    }

    public List<Funcionario> getFuncById(Funcionario func) {
        List<Funcionario> listFunc = new ArrayList<>();
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();

        Criteria criteria = sessao.createCriteria(Funcionario.class);
        criteria.addOrder(Order.asc("id"));
        criteria.add(Restrictions.eq("id", func.getId()));

        listFunc = criteria.list();

        return listFunc;
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
