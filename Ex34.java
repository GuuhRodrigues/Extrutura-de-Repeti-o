import java.util.Scanner;
public class Ex34{
	public static void main(String [] args){

		Scanner ler = new Scanner(System.in);

		int num, w=1, pos=0, neg=0, somapos, somaneg;

		while (w<=10){
			System.out.println("Entre com um número:");
			num=ler.nextInt();
			if (num>0)
				pos+=num;
			else
				neg+=num;
		w++;
		}
		System.out.println("A soma dos números positivos é "+pos);
		System.out.println("A soma dos números negativos é "+neg);


	}
}