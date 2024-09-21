package br.com.fatecmogidascruzes.entidades;

import java.time.LocalDate;
import java.util.ArrayList;

public class Passageiro {
    public String nome;
    public String cpf;
    public LocalDate dataNascimento;
    private final ArrayList<Viagem> viagens = new ArrayList<Viagem>();

    public Passageiro(String nome, String cpf, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public void salvar(Viagem viagem) {
        this.viagens.add(viagem);
    }

    public int valorTotal() {
        return viagens.stream().mapToInt(Viagem::getPontos).sum();
    }
}
