import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		int angulo1=0, angulo2=0, angulo3=0;
		for (int numLados = 1; numLados < 4; ++numLados) {
			System.out.println("Digite o lado " + numLados);
			if (numLados < 2) {	
				angulo1 = tc.nextInt();
			} else if (numLados < 4) {
				angulo2 = tc.nextInt();
			} else {
				angulo3 = tc.nextInt();
			}
		}
		if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
			System.out.println("Triangulo Retangulo");
		} else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
			System.out.println("Triangulo Obtusangulo");
		} else if (angulo1 < 90 && angulo2 < 90 && angulo3 < 90) {
			System.out.println("Triangulo Acutanguo"); 
		} else {
			System.out.println("Nao é um triagulo"); 
		}
		
		tc.close();
		
	}
}


