import java.util.Scanner;
public class Ex49{
	public static void main(String [] args){

		Scanner ler = new Scanner(System.in);

		int num=1, sPos=0, qtNeg=0;

		while(num!=0){
			System.out.println("Entre com o n�mero: ");
			num=ler.nextInt();

			if(num!=0){
				if(num>0)
					sPos+=num;
				if(num<0)
					qtNeg++;
			}
		}
		System.out.println("A soma dos n�mero positivos � "+sPos);
		System.out.println("A quantidade de n�meros negativos � "+qtNeg);
	}
}