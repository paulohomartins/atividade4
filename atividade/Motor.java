package atividade;

public class Motor {
	
	//Atributos
	private int qtdPist;
	private int potencia;
	
	
	//M�todo default Motor iniciando vari�veis com 0
	public Motor() {
		this.potencia = 0;
		this.qtdPist = 0;	
	}
	
	
	//Mm�todo Motor recebendo vari�veis por parametro 
	public Motor(int potencia ,int qtdPist) {
		this.potencia = potencia;
		this.qtdPist = qtdPist;
	}
	
	//Getters and Setters
	public int getQtdPist() {
		return qtdPist;
	}
	public void setQtdPist(int qtdPist) {
		this.qtdPist = qtdPist;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}	

}
