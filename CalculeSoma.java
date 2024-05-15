package estruturaPosCondicionada;

import java.util.Scanner;

public class CalculeSoma {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int soma = 0, i = 1, num;
	         
	         while(i <= 10) {
	        i++;
	        	 System.out.println("Informe o numero");
	        	 num = ler.nextInt();
	             soma += num;
	         }
	         System.out.println("o resultado da soma é: " +soma);
       ler.close();
	}

}
