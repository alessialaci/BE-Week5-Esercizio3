package it.epicodeW5E3.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Component
@Scope("prototype")
public class Elemento extends Prodotto {
	
	private String nota;

	public Elemento(Prodotto prodotto, String nota) {
		this.prezzo = prodotto.getPrezzo();
		this.nome = prodotto.getNome();
		this.calorie = prodotto.getCalorie();
		this.nota = nota;
	}

	@Override
	public String toString() {
		return getNome() + "€" + prezzo + " Nota: " + getNota();
	}

}
