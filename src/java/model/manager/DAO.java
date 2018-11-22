/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manager;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author hueli
 */
public class DAO {

    private final SessionFactory conexao;
    private static DAO factory;

    private DAO() {
        conexao = new Configuration().configure().buildSessionFactory();
    }

    public static DAO getFactory() {
        if (factory == null) {
            factory = new DAO();
        }
        return factory;
    }

    public boolean salvar(Object objeto) {
        boolean sucesso = false;
        Session session = conexao.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(objeto.getClass().cast(objeto));
            tx.commit();
            sucesso = true;
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            sucesso=false;
        } finally {
            session.flush();
            session.clear();
            session.close();
        }
        return sucesso;
    }

    public void editar(Object objeto) {
        Session session = conexao.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.update(objeto.getClass().cast(objeto));
            session.flush();
            session.clear();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
    }

    public void deletar(Object objeto) {
        Session session = conexao.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.delete(objeto.getClass().cast(objeto));
            session.flush();
            session.clear();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
    }

    public Object buscar(Object objeto, Integer id) {
        Session session = conexao.openSession();
        Object retorno = session.get(objeto.getClass(), id);
        session.close();
        return retorno;
    }

    public List listar(Object objeto) {
        Session session = conexao.openSession();
        List retorno = session.createQuery("from " + objeto.getClass().getName()).list();
        session.close();
        return retorno;
    }

}
