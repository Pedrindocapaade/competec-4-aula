import java.util.Scanner;
public class Main 
{
    public static void main(String[] args){
        //1-solicite um número inteiro a imprima a tabuada de 1 a 10
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int number = sc.nextInt();
        
        
       for(int i=0; i<=10; i++){
           int conta = number * i;
            System.out.println(number +" x "+ i + " = " +conta);
       }
            
            
        //2-imprima todos os numeros impares de numeros
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        System.out.print("Digita outro numero aí: ");
        int num = sc.nextInt();
        
        for(int i=0;i<num; i= i+ 2 ){
            
            System.out.println(i);
        }
            
            
            
    
       
        
        
        }
	}