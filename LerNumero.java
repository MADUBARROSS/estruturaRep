package estruturaPosCondicionada;

import java.util.Scanner;

public class LerNumero {

	public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        
		int qnt, i = 0;
		String nome;
		System.out.println("qual seu nome? ");
		nome = ler.next();
		
		System.out.println("quantas vezes você quer que ele seja repetido? ");
		qnt = ler.nextInt();
	         
	     while (i < qnt) {
	    	 i++;
	    	 System.out.println(nome);
	     }
	       
     ler.close();

	}

}
