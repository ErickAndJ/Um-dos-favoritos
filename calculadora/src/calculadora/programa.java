package calculadora;

import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char op;
		double n1, n2, rs;
		System.out.println("******CALCULADORA******");
		System.out.println("Digite (+) para somar");
		System.out.println("Digite (-) para subtrair");
		System.out.println("Digite (*) para multiplicar");
		System.out.println("Digite (/) Para dividir");
		op = sc.next().charAt(0);
		System.out.println("Digite um numero pra operação =");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo numero da operação =");
		n2 = sc.nextInt();

		switch (op) {
		case '+':
			rs = n1 + n2;
			System.out.println("O resultado é =" + rs);
			break;
		case '-':
			rs = n1 - n2;
			System.out.println("O Resultado é =" + rs);
			break;

		case '*':
			rs = n1 * n2;
			System.out.println("O Resultado é =" + rs);
			break;
		case '/':
			if (n2 != 0) {
				rs = n1 / n2;
				System.out.println("O Resultado é=" + rs);
			} else {
				System.out.println("Não posso fazer divisão por 0");
			}
			break;
		default:
			System.out.println("Operação invalida");

		}

	}

}
