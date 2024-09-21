package br.com.fatecmogidascruzes.entidades;
import br.com.fatecmogidascruzes.enums.TIPO_MODAL;

import java.time.LocalDate;

public abstract class Viagem {
    public String codigo;
    public TIPO_MODAL tipo;
    public int pontos;
    LocalDate dataViagem;

    public Viagem(TIPO_MODAL tipo, String codigo, LocalDate dataViagem) {
        this.tipo = tipo;
        this.codigo = codigo;
        this.dataViagem = dataViagem;
    }

    public int getPontos() {
        return pontos;
    }
}
