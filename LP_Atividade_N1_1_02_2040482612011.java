import java.util.Scanner;
public class LP_Atividade_N1_1_02_2040482612011
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//entrada
		System.out.print("valor primitivo: ");
		int valorprimitivo = scanner.nextInt();
		
		System.out.print("valor de objeto new integer: ");
		int valorobjeto = scanner.nextInt();
		
		System.out.print("valor dentro do cache (-128 a 127): ");
		int cache = scanner.nextInt();
		
		System.out.print("valor fora do cache: ");
		int foracache = scanner. nextInt();
		
		//processamento
		
		int aprimitivo = valorprimitivo;
		int bprimitivo = valorprimitivo;
		
		Integer aobjeto = new Integer(valorobjeto);
		Integer bobjeto = new Integer(valorobjeto);
		
		Integer acache = cache;
		Integer bcache = cache;
		
		Integer aforacache = foracache;
		Integer bforacache = foracache;
		
		//saida
		
		System.out.println("primitivo == primitivo: " + (aprimitivo == bprimitivo));
		
		System.out.println("objeto == objeto: " + (aobjeto == bobjeto));
		System.out.println("objeto.equals: " + aobjeto.equals(bobjeto));
		
		System.out.println("dentro do cache (" + cache + ") cache == cache: " + (acache == bcache));
		System.out.println("fora do cache (" + foracache + ") fora do cache == fora do cache: " + (aforacache == bforacache));
		System.out.println("fora do cache (" + foracache + ") fora do cache.equals: " + aforacache.equals(bforacache));
		
		scanner. close();
	}
}
