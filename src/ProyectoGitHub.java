import java.util.Scanner;

public class ProyectoGitHub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      Scanner sn = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		int resultado = 0;
		
		System.out.println("Dime num1");
		num1 = sn.nextInt();
		System.out.println("Dime num2");
		num2 = sn.nextInt();
		System.out.println("Dime num3");
		num3 = sn.nextInt();

		resultado = num1 + num2 + num3;
		
		if(resultado > 100) {
			for(int i = 1; i <= num1; i++) {
				System.out.println(i);
			}
			for(int i = 1; i <= num2; i++) {
				System.out.println(i);
			}
			for(int i = 1; i <= num3; i++) {
				System.out.println(i);
			}
		}else if(resultado < 100) {
			for(int i = 1; i <= 10; i++) {
				System.out.print(i);
				if(i == 10) {
					System.out.println(".");
				}else {
					System.out.print(",");
				}
			}
		}
		
		if(resultado < 20) {
			System.out.println("Numeros pares del 2 - 20");
			for(int i = 2; i <= 20; i++) {
				if(i%2 == 0) {
					System.out.println(i);
				}
			}
		}
		
		
		
	}

}
