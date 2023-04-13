package exercicios;
import java.util.Scanner;

public class mediaAluno {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String nomeAluno;
		double nota1;
		double nota2;
		double nota3;
		double mediaFinal;
		
		System.out.print("Digite o nome do aluno: ");
		nomeAluno = input.nextLine();
		
		
		System.out.print("Digite a primeira nota da prova: ");
		nota1 = input.nextDouble();
		
		
		System.out.print("Digite a segunda nota: ");
		nota2 =  input.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		nota3 =  input.nextDouble();
		
		
		mediaFinal = (nota1 + nota2 + nota3)/ 3;
		
		
		System.out.println("Nome do aluno: "+nomeAluno);
		
		System.out.println("A média do aluno é: " +mediaFinal);
		

	}

}
