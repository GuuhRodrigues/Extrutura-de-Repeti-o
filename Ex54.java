import java.util.Scanner;
public class Ex54 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num, soma=0;

        do{
            System.out.println("Entre com o n�mero e digite <0> para finalizar: ");
            num=ler.nextInt();
            if(num>5)
                soma+=num;
        }
        while(num!=0);
        System.out.println("A soma dos n�meros maiores que 5 � "+soma);
    }
}
