package model.manager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import model.entity.Acomodacao;
import model.entity.Categoria;
import model.entity.Hotel;
import model.entity.UsuarioProprietario;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HotelManager {

    private final SessionFactory conexao;
    AbstractFactory factory;

    public HotelManager() {
        factory = AbstractFactory.getFactory();
        conexao = new Configuration().configure().buildSessionFactory();
    }

    public void cadastrarHotel(String nome, int quantidadeEstrela, String telefone, String rua, int numero, String cidade, String estado, String pais, List<Integer> idCategoria, List<String> descricao, List<Float> valor, Integer idProprietario) {
        Collection<Acomodacao> acomodacao = new ArrayList<>();
        List<Categoria> categorias = factory.listar(new Categoria());
        for (int i = 0; i < descricao.size(); i++) {
            Categoria categoria = new Categoria();
            for (Categoria cat : categorias) {
                if (cat.getIdCategoria() == idCategoria.get(i)) {
                    categoria = cat;
                    break;
                }
            }
            acomodacao.add(new Acomodacao(descricao.get(i), valor.get(i), categoria));
        }
        UsuarioProprietario proprietario = (UsuarioProprietario) factory.buscar(new UsuarioProprietario(), idProprietario);
        Hotel obj = new Hotel(nome, quantidadeEstrela, telefone, rua, numero, cidade, estado, pais, acomodacao, proprietario);
        factory.salvar(obj);
    }

    public void cadastrarAcomodacao(int idHotel, int idCategoria, String descricao, float valor) {
        Acomodacao obj = new Acomodacao(descricao, valor, (Categoria) factory.buscar(new Categoria(), idCategoria));
        factory.salvar(obj);
    }

    public void cadastrarCategoria(String descricao) {
        Categoria obj = new Categoria(descricao);
        factory.salvar(obj);
    }

    public void excluirHotel(int id) {
        factory.deletar(factory.buscar(new Hotel(), id));
    }

    public void excluirAcomodacao(int id) {

    }

    public void excluirCategoria() {

    }

    public Hotel buscarHotel(int id) {
        return (Hotel) factory.buscar(new Hotel(), id);
    }

    public Collection<Hotel> listarHotel() {
        return factory.listar(new Hotel());
    }

    public void atualizarHotel(int id, String nome, int quantidadeEstrela, String telefone, String rua, int numero, String cidade, String estado, String pais) {

    }

    public void atualizarAcomodacao(int id, int idHotel, int idCategoria, String descricao, double valor) {

    }

    public void atualizarCategoria(int id, String descricao) {

    }

}
