import java.util.Scanner;
public class Ex53 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num, soma=0, media=0, quant=0;

        do{
            System.out.println("Entre com o número, para finalizar digite <0>: ");
            num=ler.nextInt();

            if(num!=0){
            quant++;
            soma+=num;
            }
        }
        while(num!=0);
        media=soma/quant;
        System.out.println("A média dos números é "+media);
    }
}