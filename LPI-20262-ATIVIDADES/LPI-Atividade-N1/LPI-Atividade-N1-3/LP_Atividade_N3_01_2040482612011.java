import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class LP_Atividade_N3_01_2040482612011
{
	public static void main(String[] args) throws Exception {
	    
	    System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
	    
	    String xadrez = """
   ABCDEFGH
   
   
 8 █ █ █ █
 7  █ █ █ █
 6 █ █ █ █ 
 5  █ █ █ █
 4 █ █ █ █
 3  █ █ █ █
 2 █ █ █ █
 1  █ █ █ █

""";
		System.out.print("   XADREZ :\n");
		System.out.print( xadrez );
		System.out.print(" T = torre \n C = cavalo \n B = bispo \n D = rainha \n R = rei \n P = peao \n");
		System.out.print(" MAIUSCULAS = PRETAS \n minusculas = brancas \n\n");
        
        String xadrez1 = """
   ABCDEFGH
   
 8 TCBDRBCT
 7 PPPPPPPP
 6 █ █ █ █ 
 5  █ █ █ █
 4 █ █ █ █
 3  █ █ █ █
 2 pppppppp
 1 tcbdrbct
""";
        System.out.print( xadrez1 );
        System.out.println("\n lance um: pe4, Pe5 \n");
        
String lance1 = """
   ABCDEFGH
   
 8 TCBDRBCT
 7 PPPP PPP
 6 █ █ █ █ 
 5  █ █P█ █
 4 █ █ p █
 3  █ █ █ █
 2 pppp█ppp
 1 tcbdrbct
""";
        
       System.out.print( lance1 ); 
       System.out.println("\n lance dois: dh5, Cc6 \n");
        
String lance2 = """
   ABCDEFGH
   
 8 T BDRBCT
 7 PPPP PPP
 6 █ C █ █ 
 5  █ █P█ d
 4 █ █ p █
 3  █ █ █ █
 2 pppp█ppp
 1 tcb█rbct
""";
        System.out.print( lance2 );
        System.out.println("\n lance tres: bc4, Cf6 \n");
        
String lance3 = """
   ABCDEFGH
   
 8 T BDRB█T
 7 PPPP PPP
 6 █ C █C█ 
 5  █ █P█ d
 4 █ b p █
 3  █ █ █ █
 2 pppp█ppp
 1 tcb█r█ct
""";
        
        System.out.print( lance3 );
        System.out.println("\n lance quatro: df7 xeque-mate \n");
 
String lance4 = """
   ABCDEFGH
   
 8 T BDRB█T
 7 PPPP dPP
 6 █ C █C█ 
 5  █ █P█ █
 4 █ b p █
 3  █ █ █ █
 2 pppp█ppp
 1 tcb█r█ct
""";       
        
        System.out.print( lance4 );
        System.out.println("Fim: brancas vencem");
	}
}
