package org.example.Observer;

class Cliente implements Observador {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String atualizar(String mensagem) {
        return("Cliente " + nome + " recebeu a notificação: " + mensagem);
    }
}