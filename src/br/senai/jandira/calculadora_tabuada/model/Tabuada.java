package br.senai.jandira.calculadora_tabuada.model;

public class Tabuada {

	private double multiplicando;
	private double minimoMultiplicador;
	private double maximoMultiplicador;

	public double getMultiplicando() {
		return multiplicando;
	}

	public void setMultiplicando(double multiplicando) {
		this.multiplicando = multiplicando;
	}

	public double getMinimoMultiplicador() {
		return minimoMultiplicador;
	}

	public void setMinimoMultiplicador(double minimoMultiplicador) {
		this.minimoMultiplicador = minimoMultiplicador;
	}

	public double getMaximoMultiplicador() {
		return maximoMultiplicador;
	}

	public void setMaximoMultiplicador(double maximoMultiplicador) {
		this.maximoMultiplicador = maximoMultiplicador;
	}

	public void calcularTabuada() {

		if (maximoMultiplicador < minimoMultiplicador) {
			double temp = maximoMultiplicador;
			maximoMultiplicador = minimoMultiplicador;
			minimoMultiplicador = temp;
		}

		while (minimoMultiplicador <= maximoMultiplicador) {
			double produto = multiplicando * minimoMultiplicador;
			System.out.printf("%s X %s = %s", multiplicando, minimoMultiplicador, produto);
			System.out.println();
			minimoMultiplicador++;
		}
		
		System.out.println("FIM");
		
	}

}
