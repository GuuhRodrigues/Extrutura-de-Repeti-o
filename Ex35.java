import java.util.Scanner;
public class Ex35{
	public static void main(String [] args){

		Scanner ler = new Scanner(System.in);

		int num, w=1, inf=0;

		while (w<=10){
			System.out.println("Entre com um número:");
			num=ler.nextInt();
			if (num<40)
				inf+=num;
		w++;
		}
		System.out.println("A soma dos números inferiores a 40 é "+inf);


	}
}