package model.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.entity.Pessoa;

public class PessoaManager {

    private final String database = "jdbc:derby://localhost:5432/tavagodb";
    private final String user = "root";
    private final String password = "root";

    protected Connection conn;

    public PessoaManager() {
        try {

            conn = DriverManager.getConnection(database + ";user="
                    + user + ";password=" + password);

            System.out.println("Conectado com sucesso!");

        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro. " + ex);
        }
    }

    public void cadastraHospede(String nome, String email, String senha, long cpf, String telefone, String rua, int numeroCasa, String cidade, String estado, String pais) {

    }

    public void cadastrarUsuarioHospede(String nome, String email, String senha, long cpf, String telefone) {

    }

    public void cadastrarUsuarioProprietario(String nome, String email, String senha, long cpf, String telefone, int idHotel) {

    }

    public void excluir(int id) {

    }

    public Pessoa consulta(String id) {
        Pessoa p = null;
        try {
            Statement statement = conn.createStatement();
            String sql = "SELECT * "
                    + "FROM PESSOA P "
                    + "INNER JOIN USUARIO U "
                    + "ON P.IDPESSOA = U.IDPESSOA"
                    + "WHERE P.IDPESSOA = '" + id + "' AND U.IDPESSOA = '" + id + "';";

            // teste sql 
            System.out.println(sql);

            ResultSet resultado = statement.executeQuery(sql);

            String nome = resultado.getString("NOME");
            String cpf = resultado.getString("CPF");
            String telefone = resultado.getString("TELEFONE");
            String email = resultado.getString("EMAIL");

            p = new Pessoa(nome, cpf, telefone);

        } catch (SQLException ex) {
            Logger.getLogger(PessoaManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return p;
    }

    public void cadastrarCartao(int titular, int numeroCartao, int vencimento, int codigoSeguranca) {

    }

    public void atualizarHospede(int id, String nome, String email, String senha, long cpf, String telefone, String rua, int numeroCasa, String cidade, String estado, String pais) {

    }

    public void atualizarUsuarioHospede(int id, String nome, String email, String senha, long cpf, String telefone) {

    }

    public void atualizarUsuarioProprietario(int id, String nome, String email, String senha, long cpf, String telefone, int idHotel) {

    }

}
