import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sd = new Scanner(System.in);
	    
	    
	    System.out.print("Digite a senha: ");
	    int senha = sd.nextInt();
	    
		while(senha !=1234){
		    System.out.println("Senha incorreta "+"a senha não é "+ senha);
		    System.out.print("Digite novamente: ");
		    senha = sd.nextInt();
		}
		if(senha == 1234){
		    System.out.println("Acesso liberado");
		}
	}
}
