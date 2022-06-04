import java.util.Scanner;

public class Ex45 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num, somaNum = 0;

        for (int i = 1; i <= 10; ++i) {
            System.out.println("Entre com o " + i + "º número: ");
            num = ler.nextInt();
            if (num!=0){
                if (num<40)
                    somaNum += num;
            }
            else {
                System.out.println("Número Inválido");
                --i;
            }
        }
        System.out.println("A soma dos números menos que 40 é " + somaNum);
    }
}
