package projeto;
import java.util.Scanner;
public class Trabalhofun03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("digite um numero inteiro para descobrir seu fatorial");
        int fat = input.nextInt();
	    long result = fatorial(fat);
	    
	    System.out.println("o fatorial de " + fat + " é " + result);
        
	}

	public static long fatorial(int fat){
		
	long fatorial = 1;
	      for(int i = 1; i <=fat; i++) {
		      fatorial = fatorial * i;
	      }
	
	return fatorial;
	}
	
}
