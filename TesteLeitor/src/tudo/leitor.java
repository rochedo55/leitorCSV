package tudo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintStream;
public class leitor {

	public static void main(String[] args) {
		
		String arq = "//home//bioinfo//Área de Trabalho//planilhaTeste.csv";
		BufferedReader conteudo = null;
		
		String linha = "";
		String c = ";";
		int i = 0;
		try {
			conteudo = new BufferedReader(new FileReader(arq));
			while ((linha = conteudo.readLine())!= null) {
				String [] v = linha.split(c);
				System.out.println(v[i]);
				i++;
				
			}
		} catch (Exception e) {
			e.printStackTrace( );
		}
		

	}

}
