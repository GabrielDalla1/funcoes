package projeto;
import java.util.Scanner;
public class Trabalhofun01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("insira o primeiro numero");
		int num1 = input.nextInt();
		
		System.out.println("insira o segundo numero");
		int num2 = input.nextInt();
		
		System.out.println("insira o terceiro numero");
		int num3 = input.nextInt();
		
		
		int resultado = numeroPar(num1, num2, num3);
		
		System.out.println("o menor entre os 3 digitos é: " + resultado);
	}

	public static int numeroPar(int num1, int num2, int num3){
		 
		int menorNum = 0;
		if((num1 < num2) &&(num1 < num3)) {
		    menorNum = num1;
		    
		}else{
			menorNum += num3;
			}if(num2 < num3){
				menorNum = num2;
			}else {
				menorNum = num3;
				  }
		return menorNum;
	}
	
	
	
	
}
