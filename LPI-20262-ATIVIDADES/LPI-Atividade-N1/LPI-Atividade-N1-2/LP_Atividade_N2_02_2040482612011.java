import java.util.Scanner;
public class LP_Atividade_N2_02_2040482612011
{
	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	
	double total = 0;
	double valor = 0;
	int vendas = 0;
	
	System.out.println("digite o valor das vendas, zero para encerrar: ");
	do {
	    System.out.print("digite o valor do produto: ");
	    valor = scanner.nextDouble();
	    
	    if (valor > 0) {
	        total += valor; 
	        vendas++;
	        
	    }} while (valor !=0 );
	    
	    if (vendas > 0) {
	        double media = total / vendas;
	        
	        System.out.println("total de vendas: "+ vendas);
	        System.out.println("valor total vendido: "+ total);
	        System.out.println("total de vendas: "+ media);
	    } else {
	        System.out.print("nenhuma venda registrada.");
	    }
	
	
	scanner.close();
}}
