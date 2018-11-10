package model.entity;

import java.util.Collection;

public class Carrinho {

    private Collection<ItemCarrinho> itemCarrinho;

    public Carrinho() {
    }

    public Carrinho(Collection<ItemCarrinho> itemCarrinho) {
        this.itemCarrinho = itemCarrinho;
    }

    public Collection<ItemCarrinho> getItemCarrinho() {
        return itemCarrinho;
    }

    public void setItemCarrinho(Collection<ItemCarrinho> itemCarrinho) {
        this.itemCarrinho = itemCarrinho;
    }

}
