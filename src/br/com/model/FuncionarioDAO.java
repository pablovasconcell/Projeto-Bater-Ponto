package br.com.model;

import Util.HibernateUtil;
import br.com.entity.Funcionario;
import java.util.ArrayList;
import java.util.List;
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
}
