import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);		
		String str;
		

		System.out.print("Digite uma frase: ");
		str = input.nextLine();
		
		if (str.isEmpty()) {
			System.out.println("\nValor Inv�lido");
		}
		
		System.out.println(Reverse(str));
	}
	
	public static String Reverse (String str) {
		char letras[] = new char[str.length()];
		String novaFrase = "";	
		int contLetras = 0;
		
		for (int i = str.length() -1; i >= 0; i--) {
			if (contLetras <= str.length()) {
				letras[contLetras] = str.charAt(i);
				contLetras++;
			}else {
				break;
			}
		}			
		novaFrase = String.valueOf(letras);

		return novaFrase;
	}

}
