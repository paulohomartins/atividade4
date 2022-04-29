package atividade;

final public class Carga extends Veiculo implements Calc{
	
	//Atributos
	private int cargaMax;
	private int tara;
	
	//Método construtor recebendo valores zerados
	public Carga(){
		this.cargaMax = 0;
		this.tara = 0;
	}

	//Getters and Setters
	public int getCargaMax() {
		return cargaMax;
	}

	public void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}

	public int getTara() {
		return tara;
	}

	public void setTara(int tara) {
		this.tara = tara;
	}
	
	//Metodo imprimir VeiculoCarga
	public void imprimirCarga() {
		System.out.println("\nVeículo de Carga");
		System.out.println("Tara do Veículo: "+this.tara);
		System.out.println("Carga Máaxima do Veículo: "+this.cargaMax);
	}

	@Override
	public float calcVel(float velocMax) {
		long conv = (long)velocMax*100000;
		System.out.println("\nConversor de velocicade");
		System.out.println("\nKilometros por hora - "+velocMax);
		System.out.println("\nCentímetros por hora - "+ conv);
		return 0;
	}

	@Override
	public int calcular() {
		
		int somaNumeros = 0;
		somaNumeros =+ (int)getVelocMax();
		somaNumeros =+ (int)getQtdRodas();
		somaNumeros =+ (int)getTara();
		somaNumeros =+ (int)getCargaMax();
		somaNumeros =+ (int)getMotor().getPotencia();
		somaNumeros =+ (int)getMotor().getQtdPist();
		return somaNumeros;
		
		
	}
	
	

}
