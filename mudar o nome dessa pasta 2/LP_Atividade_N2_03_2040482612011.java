import java.util.Scanner;
public class LP_Atividade_N2_03_2040482612011
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	
	final int pincorreto = 1234;
	int pin;
	
	do{
	System.out.print("digite o pin: ");
	pin = scanner.nextInt();
	
	if (pin != pincorreto){
	    System.out.println("pin incorreto, tente novamente");
	}} while (pin != pincorreto);
	
	System.out.println("pin correto, bem vindo");
	
	scanner.close();
}}
