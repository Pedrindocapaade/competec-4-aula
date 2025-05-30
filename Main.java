import java.util.Scanner;
public class Main
{
    // 1-programa com while que escreva oq o usuario digitar 5 vezes 
	public static void main(String[] args) {
	    Scanner pla = new Scanner(System.in);
	    
	    System.out.print("Digite uma frase: ");
	    
        String palavraWhile = pla.nextLine();
        int contadoar=0;
        
        while (contadoar <5 ){
            System.out.println(palavraWhile);
            contadoar ++;
            
        }
        
        System.out.println("                                                  ");
        System.out.println("                                                  ");
        System.out.println("                                                  ");
        System.out.println("                                                  ");
        System.out.println("                                                  ");
        
        //2- some todos os números de 1 a 100
        int contador= 0;             
        int soma=0;
        while(contador<=100){
             soma= soma + contador;
         contador++;    
        System.out.println(soma);   
        }       
	    
	}
    
}
