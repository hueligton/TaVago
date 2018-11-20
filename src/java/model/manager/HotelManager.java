package model.manager;

import java.util.ArrayList;
import java.util.List;
import model.entity.Acomodacao;
import model.entity.Categoria;
import model.entity.Hotel;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HotelManager {

    private final SessionFactory conexao;

    public HotelManager() {
        conexao = new Configuration().configure().buildSessionFactory();
    }

    public void cadastrarHotel(String nome, int quantidadeEstrela, String telefone, String rua, int numero, String cidade, String estado, String pais) {

    }

    public void cadastrarAcomodacao(int idHotel, int idCategoria, String descricao, double valor) {

    }

    public void cadastrarCategoria(String descricao) {
        Session session = conexao.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Categoria categoria = new Categoria(descricao);
            session.save(categoria);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
    }

    public void excluirHotel(int id) {

    }

    public void excluirAcomodacao(int id) {

    }

    public void excluirCategoria() {

    }

    public void buscarHotel(int id) {

    }

    public void listaHotel() {
        Session session = conexao.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
           SQLQuery query = session.createSQLQuery("select nome from hotel");
           List<Object[]> rows = query.list();
           
           for(Object[] row : rows){
               Hotel hot = new Hotel();
               hot.setNome(row[1].toString());
               System.out.println(hot);
           }
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
    }

    public void atualizarHotel(int id, String nome, int quantidadeEstrela, String telefone, String rua, int numero, String cidade, String estado, String pais) {

    }

    public void atualizarAcomodacao(int id, int idHotel, int idCategoria, String descricao, double valor) {

    }

    public void atualizarCategoria(int id, String descricao) {

    }

}