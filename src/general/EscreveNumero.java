package general;

import numeros.Numero;

public class EscreveNumero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		escreveNumero();
		
		comparacaoString();
		

	}

	private static void escreveNumero() {
		Numero n1;
		Numero n2;
		
		n1 = new Numero(3);
		n2 = new Numero(4);
		
		System.out.println("O numero n1 eh: "+n1.getN() +" o numero n2 eh: "+n2.getN());
		
		// trocaNumero(n1, n2); nao compila como estava.
		trocaNumero(n1.getN(), n2.getN());
		
		System.out.println("O numero n1 eh: "+n1.getN() +" o numero n2 eh: "+n2.getN());
		
		// trocaNumeroNovo(n1, 5); nao compila como estava.
		trocaNumeroNovo(n1.getN(), 5);
		
		System.out.println("O numero n1 eh: "+n1.getN());
		
		// trocaNumeroNovo(n1, 5); nao compila como estava.
		trocaNumeroNovo(n1.getN(), 5);
		
		System.out.println("O numero n1 eh: "+n1.getN());
	}

	/**
	 *
	 * Método responsável por 
	 *
	 * @author Aydalvo Nery Neto <aydalvo.nery@gmail.com>
	 * @since 30/01/2015 15:26:57
	 * @version 1.0
	 *
	 */
	private static void comparacaoString() {
		String str = "abc";
		String str1= "def";
		
		str=str1;
		
		System.out.println(str1);
		
		if (str==str1) System.out.println("o mesmo.");
		if (str.equals(str1)) System.out.println("iguais.");
	}
	
	public static void trocaNumero(int n1, int n2) {
		int temp = n1;
		n1=n2;
		n2=temp;
	}
	
	public static void trocaNumeroNovo(int n1, int valor) {
//		n1 = new Numero(valor);
		n1=valor;
	}

}
