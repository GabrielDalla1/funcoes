package projeto;
import java.util.Scanner;
public class Trabalhofun05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int arrayDeclarado[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + " número: ");
            arrayDeclarado[i] = scanner.nextInt();
        }

        vetorOrdenado(arrayDeclarado);

        for (int numero : arrayDeclarado) {
            System.out.println(numero);
        }
    }

    public static void vetorOrdenado(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
	}

}
