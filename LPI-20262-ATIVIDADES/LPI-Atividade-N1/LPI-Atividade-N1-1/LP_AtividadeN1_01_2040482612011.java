import java.util.Scanner;
public class LP_Atividade_N1_1_01_2040482612011
{
public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    //entrada
    System.out.print("idade do aluno: ");
byte idade = scanner.nextByte();
    
    System.out.print("numero de faltas: ");
short faltas = scanner.nextShort();

    System.out.print("matricula id: ");
int matriculaid = scanner.nextInt();

    System.out.print("codigo nacional do estudante: ");
long codigonacional = scanner.nextLong();

    System.out.print("nota do trabalho: ");
float notatrabalho = scanner.nextFloat();

    System.out.print("nota da prova final: ");
double notaprovafinal = scanner.nextDouble();
    
    System.out.print("conceito final do aluno: ");
char conceitofinal = scanner.next().charAt(0);

    System.out.print("aluno aprovado: ");
boolean aprovado = scanner.nextBoolean();

//saida
System.out.println("idade do aluno: " + idade + "anos");
System.out.println("numero de faltas: " + faltas);
System.out.println("matricula id: " + matriculaid);
System.out.println("codigo nacional do estudante: " + codigonacional);
System.out.println("nota do trabalho: " + notatrabalho);
System.out.println("nota da prova final: " + notaprovafinal);
System.out.println("conceito final do aluno: " + conceitofinal);
System.out.println("aluno aprovado?" + aprovado);

scanner.close();

}
}
