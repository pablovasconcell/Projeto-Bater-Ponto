package br.com.model;

import br.com.util.HibernateUtil;
import br.com.entity.Admin;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;




public class LoginDAO {

    private Session sessao;

    public Admin verificaLogin(String user, String senha) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        Criteria criteria = sessao.createCriteria(Admin.class);
        criteria.add(Restrictions.and(Restrictions.eq("usuario", user), Restrictions.eq("senha", senha)));
        Admin admin = (Admin) criteria.uniqueResult();
        return admin;
    }
}
