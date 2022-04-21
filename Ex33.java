import java.util.Scanner;
public class Ex33{
	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		double w=1, num, soma=0, media, dobro=0;

		while (w<=5){
			System.out.println("Entre com o número: ");
			num=ler.nextDouble();
			soma+=num;
		w++;
		}
		media=soma/5;
		dobro=soma*2;

		System.out.println("A soma dos números é "+soma+", a média é "+media+" e o dobro é "+dobro+".");




	}
}