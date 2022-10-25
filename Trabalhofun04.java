package projeto;

import java.util.Scanner;

public class Trabalhofun04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um numero para ser verificado se é primo ou não");
        int numPrimo = input.nextInt();
		
       boolean resultado = numeroPrimo(numPrimo);
       
       if(resultado == true) {
    	   System.out.println("o numero: " + numPrimo + " é primo");
       }if(resultado == false){
    	   System.out.println("o numero: " + numPrimo + " não é primo");
        }
       }
	
	

	public static boolean numeroPrimo(int numPrimo){
		if ((numPrimo == 0) || (numPrimo == 1))
		       return(false); 
		    else {
		      int i, fim;
		      
		      fim = (int)Math.sqrt(numPrimo);
		      for(i=2; i<=fim; i++) {
		        if ((numPrimo % i) == 0)
		           return(false); 
		      }
		      
		      return(true);
	
	} 
	
}
}
