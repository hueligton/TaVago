package model.entity;

import java.util.LinkedList;

public class Carrinho {

    // EM ANÁLISE
    //  - O tipo do atributo  itemCarrinho foi alterado de 
    //    Collection para LinkedList devido a problemas de
    //    integração na controladora
    private LinkedList<ItemCarrinho> itemCarrinho;

    public Carrinho() {
    }
    
    public Carrinho(LinkedList<ItemCarrinho> itemCarrinho) {
        this.itemCarrinho = itemCarrinho;
    }

    public LinkedList<ItemCarrinho> getItemCarrinho() {
        return itemCarrinho;
    }

    public void setItemCarrinho(LinkedList<ItemCarrinho> itemCarrinho) {
        this.itemCarrinho = itemCarrinho;
    }

}
