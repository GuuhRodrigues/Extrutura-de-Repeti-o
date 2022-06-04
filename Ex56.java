import java.util.Scanner;
public class Ex56{
	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		int num, i=1, qtPos=0, qtNeg=0, sPos=0, sNeg=0;

		do{
			System.out.println("Entre com o "+i+"º número: ");
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
				System.out.println("Número Inválido");
		}
		while(i<=15);
		System.out.println("A quantidade de números positivos é "+qtPos);
		System.out.println("A quantidade de números negativos é "+qtNeg);
		System.out.println("A soma dos números positivos é "+sPos);
		System.out.println("A soma dos números negativos é "+sNeg);


	}
}