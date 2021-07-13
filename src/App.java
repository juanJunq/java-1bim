import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int iv = 0;
        int cont = 0;
        boolean error = false;
        int [] v = new int[10];
        do{
            error = false;
            try{
                i = input.nextInt();
                iv = input.nextInt();
                v[i] = iv;
            }catch(IndexOutOfBoundsException e){
                System.out.println("Posicao invalida: " + e);
                error = true;
            }catch(InputMismatchException e){
                System.out.println("Valor invalido: " + e);
                input.nextLine();
                error = true;
            }catch(NumberFormatException e){
                System.out.println("Valor invalido: " + e);
                error = true;
            }
            if(!error){
                cont++;
            }
        }while(cont < 10);
        for(i = 0; i<10; i++){
            System.out.print(v[i] + " ");
        }
    }
}
