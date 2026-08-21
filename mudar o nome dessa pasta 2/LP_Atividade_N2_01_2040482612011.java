import java.util.Scanner;
public class LP_Atividade_N2_1_01_2040482612011
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	
	double somanotas = 0;
	double maiornota = 0;
	int totalalunos = 0;
	String continuar;
	
	
	
	System.out.print("digite quantidade de alunos na sala: ");
	int alunos = scanner. nextInt();
	
	do{
	System.out.print("digite a nota do aluno: ");
	double nota = scanner. nextDouble();
	
	scanner.nextLine();
	
	somanotas += nota;
	totalalunos ++;
	
	if (totalalunos == 1 || nota > maiornota) {
	    maiornota = nota;
	}
	
	System.out.println("deseja cadastrar outro aluno? ENTER para cadastrar / outra tecla + enter para sair :");
	continuar = scanner.nextLine();
	
	} while (continuar.isEmpty());
	
	double media = somanotas/totalalunos;
	
	System.out.println("numero de alunos da sala :" + alunos);
	System.out.println("numero de alunos:" + totalalunos);
	System.out.println("media de notas :" + media);
	System.out.println("maior nota :" + maiornota);
	System.out.println("total notas :" + somanotas);
	
	scanner.close();
}}