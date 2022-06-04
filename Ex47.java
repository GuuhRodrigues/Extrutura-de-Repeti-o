import java.util.Scanner;

public class Ex47 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num, qPos = 0, qNeg = 0, sPos = 0, sNeg = 0;

        for (int i = 1; i <= 15; ++i) {
            System.out.println("Entre com o " + i + "º número: ");
            num = ler.nextInt();
            if (num != 0) {
                if (num > 0) {
                    qPos++;
                    sPos += num;
                } else {
                    qNeg++;
                    sNeg += num;
                }
            } else {
                System.out.println("Número Inválido");
                --i;
            }
        }
        System.out.println("A quantidade de números positivos é " + qPos);
        System.out.println("A quantidade de números negativos é " + qNeg);
        System.out.println("A soma dos números positivos é " + sPos);
        System.out.println("A soma dos números negativos é " + sNeg);
    }
}
