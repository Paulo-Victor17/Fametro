import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
	   Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner (System.in);
		
		float x, y, soma, media;
		
		System.out.print("Digite o 1° valor: ");
		x = sc.nextFloat();
		
		System.out.print("Digite o 2° valor: ");
		y = sc.nextFloat();
		
		
		soma = x + y;
		
		media = (x + y) / 2;
		
		System.out.println("A média é: "+media);

		if (media >= 7) {
			System.out.println("Aprovado! :D");
		}else {
			System.out.println("Reprovado :(");
		}
		
		
	}

}
