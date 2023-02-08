package it.epicodeW5E3.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Component
@Scope("prototype")
public class Pizza extends Prodotto {

	public Pizza() {
		nome = "Pizza ";
		prezzo = 4.00;
		calorie = 1000;
	}
	
	@Override
	public String toString() {
		return getNome() + "prezzo: " + prezzo + " calorie: " + getCalorie() ;
	}
	
}
