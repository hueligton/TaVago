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
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author hueli
 */
public class DAO {

    private final SessionFactory conexao;
    
    private static DAO factory;

    private DAO() {
        
        Configuration configuration = new Configuration().configure();          // carrega mapeamentos e propriedades especificadas no hibernate.cfg.xml
        
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()  // define um Standard Service Registry, aplica as configurações do hibernate.cfg.xml
            .applySettings(configuration.getProperties()).build();
             
        conexao = configuration.buildSessionFactory(serviceRegistry);           // constrói uma session factory
        
    }

    public static DAO getFactory() {
        
        if (factory == null)
            factory = new DAO();
        
        return factory;
    }

    public boolean salvar(Object objeto) {
        
        Transaction tx = null;
        
        try {
            
            Session session = conexao.openSession();            //Realiza abertura da seção criada pela conexao

            tx = session.beginTransaction();                    //Inicializa uma transação
            
            session.save(objeto.getClass().cast(objeto));       //Persisti a instância objeto
            
            tx.commit();                                        //Descarrega a sessão associada e termine a unidade de trabalho
            
            session.close();                                    //Destrói a sessão e libera recursos
            
            return true;
            
        } catch (HibernateException e) {                       //Indica que ocorreu uma exceção durante uma chamada JDBC
            
            if (tx != null)
                tx.rollback();                                  //Força a transação a reverter
            
            return false;
            
        }
        
    }

    public boolean editar(Object objeto) {
        
        Transaction tx = null;
        
        try {
            
            Session session = conexao.openSession();
            
            tx = session.beginTransaction();
            
            session.update(objeto.getClass().cast(objeto));     //Atualize a instância objeto persistente
            
            tx.commit();
            
            session.close();
            
            return true;
            
        } catch (HibernateException e) {
            
            if (tx != null)
                tx.rollback();

            return false;
            
        }
        
    }

    public boolean deletar(Object objeto) {
        
        Transaction tx = null;
        
        try {
            
            Session session = conexao.openSession();
            
            tx = session.beginTransaction();
            
            session.delete(objeto.getClass().cast(objeto));     //Remove a instância objeto persistente do armazenamento de dados
            
            tx.commit();
            
            session.close();
            
            return true;
            
        } catch (HibernateException e) {
            
            if (tx != null)
                tx.rollback();
            
            return false;
            
        }
        
    }

    public Object buscar(Object objeto, Integer id) {
        
        try {
            
            Session session = conexao.openSession();
            
            Object retorno = session.get(objeto.getClass(), id);    //Atualiza a instância objeto persistente no armazenamento de dados
            
            session.close();
            
            return retorno;
            
        } catch (HibernateException e) {
                
            throw e;
            
        }
        
    }

    public List listar(Object objeto) {
          
        try {
            
            Session session = conexao.openSession();
            
            List retorno = session.createQuery("from " + objeto.getClass().getName()).list();   //Cria uma instância de Query de consulta do objeto persistente no armazenamento de dados
            
            session.close();
            
            return retorno;
            
        } catch (HibernateException e) {
                
            throw e;
            
        }
        
    }

}
