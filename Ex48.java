import java.util.Scanner;
public class Ex48{
	public static void main(String [] args){

		Scanner ler = new Scanner(System.in);

		int num=0, qtPar=0, sImp=0;

		while(num!=-1){
			System.out.println("Entre com o número: ");
			num=ler.nextInt();

			if(num%2==0)
				qtPar++;
			if(num%2==1)
				sImp+=num;
		}
		System.out.println("A quantidade de números pares é "+qtPar);
		System.out.println("A soma dos números impares é "+sImp);
	}
}