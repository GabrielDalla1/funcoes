package projeto;
import java.util.Scanner;
public class Trabalhofun02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("digite um numero inteiro para checar se ele é par");
		int numPar = input.nextInt();
		boolean result = numeroPar(numPar);
		if(result == true){
			System.out.println("o " + numPar + " é par");
		}if(result == false){
			System.out.println("o " + numPar + " não é par");
		}

	}

	public static boolean numeroPar(int numPar){
		
		
		if((numPar  % 2) == 0) {
			return(true);
		}else {
			return(false);
			} 
	
	
	}
	
}
