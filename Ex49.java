import java.util.Scanner;
public class Ex49{
	public static void main(String [] args){

		Scanner ler = new Scanner(System.in);

		int num=1, sPos=0, qtNeg=0;

		while(num!=0){
			System.out.println("Entre com o número: ");
			num=ler.nextInt();

			if(num!=0){
				if(num>0)
					sPos+=num;
				if(num<0)
					qtNeg++;
			}
		}
		System.out.println("A soma dos número positivos é "+sPos);
		System.out.println("A quantidade de números negativos é "+qtNeg);
	}
}