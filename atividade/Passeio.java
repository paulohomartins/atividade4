package atividade;

final public class Passeio extends Veiculo implements Calc{
	
	//Atributos
	private int qtdPassageiros;
	
	//Método construtor recebendo valores zerados
	public Passeio() {
		this.qtdPassageiros = 0;
	}
	
	//Getters and Setters
	public int getQtdPassageiros() {
		return qtdPassageiros;
	}

	public void setQtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}
	
	//Metodo imprimir VeiculoPasseio
	public void imprimirPasseio() {
		System.out.println("\nVeículo de Passeio");
		System.out.println("Quantidade de passageiros: "+this.qtdPassageiros);
	}
	

	@Override
	public float calcVel(float velocMax) {
		System.out.println("\nConversor de velocicade");
		System.out.println("\nKilometros por hora - "+velocMax);
		System.out.println("\nMetros por hora - "+ velocMax*1000);
		return 0;
	}

	@Override
	public int calcular() {
		
		int totalLetras = 0;
		totalLetras += getPlaca().length();
		totalLetras += getMarca().length();
		totalLetras += getModelo().length();
		totalLetras += getCor().length();
		return totalLetras;
		
	}
	
	

}
