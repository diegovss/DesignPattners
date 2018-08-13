package org.designpatterns.adapter;

public class AdapterTomada extends PlugDoisPinos{
	private PlugTresPinos plugTresPinos;
	public AdapterTomada(PlugTresPinos p) {
		this.plugTresPinos = p;
	}
	
	public void ligarDoisPinos(Tomada t) {
		plugTresPinos.ligarTresPinos(t);
	}

}
