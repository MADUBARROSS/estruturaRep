package estruturaPosCondicionada;

import java.util.Scanner;

public class IdadeVinte {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i = 1, idade, soma = 0;
		
        while(i <= 20) {
        	i++;
       	 System.out.println("informe sua idade: "); 
       	idade = ler.nextInt();
       	if (idade >= 18) {
      soma++;
       	}
      
    
   }
       System.out.println(soma+ " são maiores de idade");
        ler.close(); 
	}

}
