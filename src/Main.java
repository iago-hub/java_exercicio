import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		System.out.println("--------------Exerc�cio 01-----------------");
		System.out.println(
				"Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses n�meros com uma \r\n"
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

		System.out.println("--------------Exerc�cio 02-----------------");
		System.out.println(
				"Fa�a um programa para ler o valor do raio de um c�rculo, e depois mostrar o valor da �rea deste c�rculo com quatro \r\n"
						+ "casas decimais ");
		System.out.println("Digie o valor do raio do c�rculo: ");
		double raio = sc.nextDouble();
		double pi = 3.14159;
		double area = pi * Math.pow(raio, 2.0);
		System.out.printf("A = %.4f%n ", area);
		
		// Outra forma de implementar
		
		System.out.printf("A = %.4f%n ", (pi * (raio*raio)));

		System.out.println("--------------Exerc�cio 03-----------------");
		System.out.println(
				"Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferen�a do produto \r\n"
						+ "de A e B pelo produto de C e D segundo a f�rmula: DIFERENCA = (A * B - C * D).");

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
		
		

		System.out.println("--------------Exerc�cio 04-----------------");
		System.out.println(
				"Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por \r\n"
						+ "hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas \r\n"
						+ "decimais.");
		System.out.println("Digite o n�mero de identifica��o do funcionario: ");
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

		System.out.println("--------------Exerc�cio 05-----------------");
		System.out.println(
				"Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o \r\n"
						+ "c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago");
		System.out.println("Digite o c�digo da pe�a 1: ");
		String code1 = sc.next();
		System.out.println("Digite o n�mero da pe�a 1: ");
		double numberAsk1 = sc.nextDouble();
		System.out.println("Digite o valor da pe�a 1: ");
		double valueAsk1 = sc.nextDouble();
		double codeAsk1 = numberAsk1 * valueAsk1;

		System.out.println("Digite o c�digo da pe�a 2: ");
		String code2 = sc.next();
		System.out.println("Digite o n�mero da pe�a 2: ");
		double numberAsk2 = sc.nextDouble();
		System.out.println("Digite o valor da pe�a 2: ");
		double valueAsk2 = sc.nextDouble();
		double codeAsk2 = numberAsk2 * valueAsk2;

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", (codeAsk1 + codeAsk2));

		// Outra forma de implementar

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", ((numberAsk1 * valueAsk1) + (numberAsk2 * valueAsk2)));
		

		System.out.println("--------------Exerc�cio 06-----------------");
		System.out.println(
				"Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e \r\n"
						+ "mostre: \r\n" + "a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura. \r\n"
						+ "b) a �rea do c�rculo de raio C. (pi = 3.14159) \r\n"
						+ "c) a �rea do trap�zio que tem A e B por bases e C por altura. \r\n"
						+ "d) a �rea do quadrado que tem lado B. \r\n" + "e) a �rea do ret�ngulo que tem lados A e B.");
		System.out.println();
		System.out.println("Digite tr�s valores com ponto flutuante de fupla precis�o: ");
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
