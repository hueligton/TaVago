package model.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import model.entity.Reserva;
import model.entity.Carrinho;
import java.util.Date;

public class ReservaManager {
    private final String database = "jdbc:derby://localhost:5432/tavagodb";
    private final String user = "root";
    private final String password = "root";

    protected Connection conn;
    public ReservaManager(){
         try {

            conn = DriverManager.getConnection(database + ";user="
                    + user + ";password=" + password);

            System.out.println("Conectado com sucesso!");

        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro. " + ex);
        }
    }
    public void cadastrarReserva(int idUsuarioHospede) {

    }

    public void cadastraItemReserva(int idRserva, int idAcomodacao, int dataInicial, int dataFinal, int valor, int idHospede) {

    }

    public void adicionarCarrinho(int idAcomodacao, Date dataInicial, Date dataFinal) {

    }

    public void consultar(int idReserva) {

    }

    public void listarReservas(int idUsuario) {

    }

    public void removerCarrinho(int idAcomodacao) {

    }

    public void excluirReserva(int idReserva) {

    }

    public void pagarReserva(int idPessoa, int idReserva) {

    }
}
