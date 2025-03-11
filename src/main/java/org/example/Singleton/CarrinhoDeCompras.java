package org.example.Singleton;

import java.util.ArrayList;
import java.util.List;

//
public class CarrinhoDeCompras {
    private static volatile CarrinhoDeCompras instance;
    private List<String> itens;

    private CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public static CarrinhoDeCompras getInstance() {
        if (instance == null) {
            synchronized (CarrinhoDeCompras.class) {
                if (instance == null) {
                    instance = new CarrinhoDeCompras();
                }
            }
        }
        return instance;
    }

    public String adicionarItem(String item) {
        itens.add(item);
        return ("Item adicionado ao carrinho: " + item);
    }

    public String removerItem(String item) {
        itens.remove(item);
        return ("Item removido do carrinho: " + item);
    }

    public String listarItens() {
        return("Itens no carrinho: " + itens);
    }

    public List<String> getItens() {
        return itens;
    }
}