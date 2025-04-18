package Desafio6;

import java.util.LinkedList;

public class Ninja {
    private String nome;
    private String vila;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getVila() {
        return vila;
    }

    public void setVila(String vila) {
        this.vila = vila;
    }

    public String getNome() {
        return nome;
    }

    public Ninja (String nome){
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return this.nome;
    }
}
