package br.com.model;

import Util.HibernateUtil;
import br.com.entity.LoginAdmin;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;




public class LoginDAO {

    private Session sessao;

    public LoginAdmin verificaLogin(String user, String senha) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        Criteria criteria = sessao.createCriteria(LoginAdmin.class);
        criteria.add(Restrictions.and(Restrictions.eq("usuario", user), Restrictions.eq("senha", senha)));
        LoginAdmin admin = (LoginAdmin) criteria.uniqueResult();
        return admin;
    }
}
