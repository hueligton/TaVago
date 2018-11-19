package model.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.entity.Acomodacao;
import model.entity.Categoria;
import model.entity.Hotel;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HotelManager {

    private final String database = "jdbc:derby://localhost:5432/tavagodb";
    private final String user = "root";
    private final String password = "root";

    protected Connection conn;

    public HotelManager() {
        try {

            conn = DriverManager.getConnection(database + ";user="
                    + user + ";password=" + password);

            System.out.println("Conectado com sucesso!");

        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro. " + ex);
        }
    }

    public void cadastrarHotel(String nome, int quantidadeEstrela, String telefone, String rua, int numero, String cidade, String estado, String pais) {

    }

    public void cadastrarAcomodacao(int idHotel, int idCategoria, String descricao, double valor) {

    }

    public void cadastrarCategoria(String descricao) {
        /*   Session session = conexao.openSession();
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
        }*/
    }

    public void excluirHotel(int id) {

    }

    public void excluirAcomodacao(int id) {

    }

    public void excluirCategoria() {

    }

    public void buscarHotel(int id) {

    }

    public List<Hotel> listaHotel() throws SQLException {
        List<Hotel> list = null;
        SessionFactory sessions = new AnnotationConfiguration().configure("src/java/hibernate.cfg.xml").buildSessionFactory();
        Session session = sessions.openSession();

        try{
            session.beginTransaction();
            list = session.createQuery("SELECT * FROM HOTEL").list();
            session.getTransaction().commit();

            for (Hotel hot : list) {
                System.out.println(hot.toString());
            }
        }catch ( HibernateException e ) {
            if ( session.getTransaction() != null )
                session.getTransaction().rollback();
        }finally {
            session.close();
        }

            /* CODIGO ANTIGO 
        
            List<Hotel> lista = new ArrayList();
       
            Statement statement = conn.createStatement();
            ResultSet resultado = statement.executeQuery("SELECT * FROM HOTEL");
            while(resultado.next()){
                //teste, ainda não foram colocados todos os dados de hotel
               String nome = resultado.getString("NOME");
               int qtdEstrelas = resultado.findColumn("QUANTIDADEESTRELA");
                
                Hotel hotel = new Hotel(nome,qtdEstrelas);
                
                lista.add(hotel);
        }
                return lista;
             */
        return list;
        }

    

    public void atualizarHotel(int id, String nome, int quantidadeEstrela, String telefone, String rua, int numero, String cidade, String estado, String pais) {

    }

    public void atualizarAcomodacao(int id, int idHotel, int idCategoria, String descricao, double valor) {

    }

    public void atualizarCategoria(int id, String descricao) {

    }

}
