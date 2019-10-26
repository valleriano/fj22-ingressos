package br.com.caelum.ingresso.model;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

	private List<Ingresso> ingressos = new ArrayList<>();

	public void add(Ingresso ingresssos) {
		ingressos.add(ingresssos);
	}

	public List<Ingresso> getIngressos() {
		return ingressos;
	}

	public void setIngressos(List<Ingresso> ingressos) {
		this.ingressos = ingressos;
	}

	public boolean isSelecionado(Lugar lugar) {
		return ingressos.stream().map(Ingresso::getLugar).anyMatch(lugarDoIngresso -> lugarDoIngresso.equals(lugar));
	}
}
