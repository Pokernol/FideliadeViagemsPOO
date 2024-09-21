package br.com.fatecmogidascruzes.entidades;
import br.com.fatecmogidascruzes.enums.TIPO_MODAL;

import java.time.LocalDate;

public class Aereo extends Viagem {
    public Aereo(TIPO_MODAL tipo, String code, LocalDate departureDate) {
        super(tipo, code, departureDate);
        this.pontos = (this.tipo == TIPO_MODAL.STANDARD) ? 1000 : 2500;
    }
}
