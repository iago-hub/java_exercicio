import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		System.out.println("--------------Exercício 01-----------------");
		System.out.println(
				"Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma \r\n"
						+ "mensagem explicativa. ");
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primerio valor: ");
		int value1 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		int value2 = sc.nextInt();
		
		System.out.printf("SOMA = %d%n", value1 + value2);

		// Outra forma de implementar

		int sum = value1 + value2;

		System.out.println("SOMA = " + sum);

		System.out.println("--------------Exercício 02-----------------");
		System.out.println(
				"Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro \r\n"
						+ "casas decimais ");
		System.out.println("Digie o valor do raio do círculo: ");
		double raio = sc.nextDouble();
		double pi = 3.14159;
		double area = pi * Math.pow(raio, 2.0);
		System.out.printf("A = %.4f%n ", area);
		
		// Outra forma de implementar
		
		System.out.printf("A = %.4f%n ", (pi * (raio*raio)));

		System.out.println("--------------Exercício 03-----------------");
		System.out.println(
				"Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto \r\n"
						+ "de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).");

		System.out.println("Digite o valor de A: ");
		int a = sc.nextInt();
		System.out.println("Digite o valor de B: ");
		int b = sc.nextInt();
		System.out.println("Digite o valor de C: ");
		int c = sc.nextInt();
		System.out.println("Digite o valor de D: ");
		int d = sc.nextInt();
		System.out.printf("DIFERENCA = %d\n", ((a * b) - (c * d)));

		// Outra forma de implementar

		int diferenca = ((a * b) - (c * d));

		System.out.println("DIFERENCA = " + diferenca);
		
		

		System.out.println("--------------Exercício 04-----------------");
		System.out.println(
				"Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por \r\n"
						+ "hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas \r\n"
						+ "decimais.");
		System.out.println("Digite o número de identificação do funcionario: ");
		int number = sc.nextInt();
		System.out.println("Digite as horas de trabalho do funcionario: ");
		double hour = sc.nextDouble();
		System.out.println("Digite o valor da hora de trabalho do funcionario: ");
		double valueHour = sc.nextDouble();
		double salary = (hour * valueHour);

		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f%n", salary);

		// Outra forma de implementar

		System.out.printf("SALARY = U$ %.2f\n", (hour * valueHour));

		System.out.println("--------------Exercício 05-----------------");
		System.out.println(
				"Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o \r\n"
						+ "código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago");
		System.out.println("Digite o código da peça 1: ");
		String code1 = sc.next();
		System.out.println("Digite o número da peça 1: ");
		double numberAsk1 = sc.nextDouble();
		System.out.println("Digite o valor da peça 1: ");
		double valueAsk1 = sc.nextDouble();
		double codeAsk1 = numberAsk1 * valueAsk1;

		System.out.println("Digite o código da peça 2: ");
		String code2 = sc.next();
		System.out.println("Digite o número da peça 2: ");
		double numberAsk2 = sc.nextDouble();
		System.out.println("Digite o valor da peça 2: ");
		double valueAsk2 = sc.nextDouble();
		double codeAsk2 = numberAsk2 * valueAsk2;

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", (codeAsk1 + codeAsk2));

		// Outra forma de implementar

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", ((numberAsk1 * valueAsk1) + (numberAsk2 * valueAsk2)));
		

		System.out.println("--------------Exercício 06-----------------");
		System.out.println(
				"Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e \r\n"
						+ "mostre: \r\n" + "a) a área do triângulo retângulo que tem A por base e C por altura. \r\n"
						+ "b) a área do círculo de raio C. (pi = 3.14159) \r\n"
						+ "c) a área do trapézio que tem A e B por bases e C por altura. \r\n"
						+ "d) a área do quadrado que tem lado B. \r\n" + "e) a área do retângulo que tem lados A e B.");
		System.out.println();
		System.out.println("Digite três valores com ponto flutuante de fupla precisão: ");
		// A = X; B =Y; C = Z;
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();

		System.out.printf("TRIANGULO: %.3f%n", ((x * z) / 2));
		System.out.printf("CIRCULO: %.3f%n", (pi * Math.pow(z, 2.0)));
		System.out.printf("TRAPEZIO: %.3f%n", ((((x + y) * z) / 2.0)));
		System.out.printf("QUADRADO: %.3f%n", (Math.pow(y, 2.0)));
		System.out.printf("RETANGULO: %.3f%n", (x * y));
		System.out.println("");

		sc.close();
	}

}
