package model.entity;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Optional;
import java.util.stream.Stream;

public class Carrinho {
    
    private float valorTotal;

    private LinkedList<ItemCarrinho> itensCarrinho;

    public Carrinho() {
        itensCarrinho = new LinkedList<ItemCarrinho>();
    }
    
    public Carrinho(LinkedList<ItemCarrinho> carrinho) {
        this.itensCarrinho = carrinho;
        setValorTotal();
    }

    public float getValorTotal() {
        return valorTotal;
    }

    private void setValorTotal() {
        valorTotal = 0;
        
        for(ItemCarrinho ic: itensCarrinho)
            valorTotal += ic.getValor();
    }

    public LinkedList<ItemCarrinho> getItensCarrinho() {
        return itensCarrinho;
    }

    public void addItemCarrinho(ItemCarrinho itemCarrinho) {
        itensCarrinho.add(itemCarrinho);
        setValorTotal();
    }
    
    public void removeItemCarrinho(ItemCarrinho itemCarrinho) {
        itensCarrinho.remove(itemCarrinho);
        setValorTotal();
    }

    public void removeItemCarrinho(Optional<ItemCarrinho> itemCarrinho) {
        itensCarrinho.remove(itemCarrinho);
        setValorTotal();
    }

    public void atualizaItemCarrinho(ItemCarrinho itemCarrinho, int quantidade) {
        
        itemCarrinho.setQuantidade(quantidade);
        
        itensCarrinho.stream().filter(ic -> {
            
            return ic.getAcomodacao().getIdAcomodacao().equals(itemCarrinho.getAcomodacao().getIdAcomodacao());
            
        })  .map((ic) -> itensCarrinho.indexOf(ic))
            .map((index) -> {
                  
                itensCarrinho.add(index, itemCarrinho);
                return index;
                    
        });
        
        setValorTotal();
        
    }

}
