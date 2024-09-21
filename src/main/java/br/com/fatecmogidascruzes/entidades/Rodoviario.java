package br.com.fatecmogidascruzes.entidades;
import br.com.fatecmogidascruzes.enums.TIPO_MODAL;
import java.time.LocalDate;

public class Rodoviario extends Viagem {
    public Rodoviario(TIPO_MODAL tipo, String codigo, LocalDate dataViagem) {
        super(tipo, codigo, dataViagem);
        this.pontos = (this.tipo == TIPO_MODAL.STANDARD) ?  500 : 1000;
    }
}
