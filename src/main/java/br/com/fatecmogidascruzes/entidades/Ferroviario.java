package br.com.fatecmogidascruzes.entidades;
import br.com.fatecmogidascruzes.enums.TIPO_MODAL;
import java.time.LocalDate;

public class Ferroviario extends Viagem {
    public Ferroviario(TIPO_MODAL tipo, String codigo, LocalDate dataViagem) {
        super(tipo, codigo, dataViagem);
        this.pontos = (this.tipo == TIPO_MODAL.STANDARD) ?  2500 : 5000;
    }
}
