package model.manager;

import model.entity.Reserva;
import model.entity.Carrinho;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import model.entity.Acomodacao;
import model.entity.ItemCarrinho;

public class ReservaManager {

    private final DAO factory;

    public ReservaManager() {
        
        factory = DAO.getFactory();
        
    }

    public Carrinho adicionarCarrinho(int idAcomodacao, int quantidade, Date dataInicial, Date dataFinal, Carrinho carrinho) {

        Acomodacao acomodacao = (Acomodacao) factory.buscar(new Acomodacao(), idAcomodacao);
        
        ItemCarrinho itemCarrinho = new ItemCarrinho(dataInicial, dataFinal, quantidade, acomodacao);

        if (carrinho == null)
            carrinho = new Carrinho();
        
        carrinho.addItemCarrinho(itemCarrinho);
        
        return carrinho;
    }
    
    public Carrinho removerCarrinho(Carrinho carrinho, int idAcomodacao) {
        List<ItemCarrinho> car = carrinho.getItensCarrinho();
        Optional<ItemCarrinho> itemCarrinho = car.stream().filter(x -> x.getAcomodacao().getIdAcomodacao()==idAcomodacao).findFirst();
        
        carrinho.removeItemCarrinho(itemCarrinho.get());
        return carrinho;
    }
    
    public Carrinho atualizarCarrinho(Carrinho carrinho, int idAcomodacao, int quantidade) {
        List<ItemCarrinho> car = carrinho.getItensCarrinho();
        Optional<ItemCarrinho> itemCarrinho = car.stream().filter(x -> x.getAcomodacao().getIdAcomodacao()==idAcomodacao).findFirst();
        
        carrinho.atualizaItemCarrinho(itemCarrinho.get(), quantidade);
        return carrinho;
    }
    
    public void cadastraItemReserva(int idRserva, int idAcomodacao, int dataInicial, int dataFinal, int valor, int idHospede) {

    }
    
    public Reserva cadastrarReserva(int idUsuarioHospede) {
        return null;
    }

    public void excluirReserva(int idReserva) {

    }

    public void consultarReserva(int idReserva) {

    }

    public void listarReservas(int idUsuario) {

    }

    public void pagarReserva(int idPessoa, int idReserva) {

    }
    
}
