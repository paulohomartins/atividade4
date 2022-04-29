package atividade;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Leitura {
	
	public String inserirDados(String dados) {
		
		System.out.println(dados);
		InputStreamReader enter = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(enter);
		
		String retornar = "";
		
		try {
		retornar = buffer.readLine();
	} catch (IOException erro) {
		System.out.println("Erro fatal!");
	}
		return retornar;
}

}