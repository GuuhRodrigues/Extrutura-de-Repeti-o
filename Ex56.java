import java.util.Scanner;
public class Ex56{
	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		int num, i=1, qtPos=0, qtNeg=0, sPos=0, sNeg=0;

		do{
			System.out.println("Entre com o "+i+"� n�mero: ");
			num=ler.nextInt();

			if(num!=0){
				if(num>0){
					qtPos++;
					sPos+=num;
				}
				else{
					qtNeg++;
					sNeg+=num;
				}
			++i;
			}
			else
				System.out.println("N�mero Inv�lido");
		}
		while(i<=15);
		System.out.println("A quantidade de n�meros positivos � "+qtPos);
		System.out.println("A quantidade de n�meros negativos � "+qtNeg);
		System.out.println("A soma dos n�meros positivos � "+sPos);
		System.out.println("A soma dos n�meros negativos � "+sNeg);


	}
}