import java.util.InputMismatchException;
import java.util.Scanner;


public class cliente {
    //Leitura 3 medidas iniciais.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean valido = false;

        while(!valido){
            try{
                System.out.print("Digite o 1° lado: \n");    
                double a = input.nextDouble();
    
                System.out.print("Digite o 2° lado: \n");    
                double b = input.nextDouble();
    
                System.out.print("Digite o 3° lado: \n");    
                double c = input.nextDouble();
    
                valido = true;
            }catch (InputMismatchException e){
                System.out.println("Erro: você não digitou um número válido");
            }
        }
        

    }
}
