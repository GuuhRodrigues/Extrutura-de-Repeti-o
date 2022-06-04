import java.util.Scanner;
public class Ex44{
	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		int num, somaPos=0, somaNeg=0;

		for(int i=1; i<=10; ++i){
			System.out.println("Entre com o "+i+"º número: ");
			num=ler.nextInt();

			if(num!=0){
				if(num>0)
					somaPos=somaPos+num;
				else
					somaNeg=somaNeg+num;
			}
		}
		System.out.println("A soma dos número positivos é "+somaPos);
		System.out.println("A soma dos número negativos é "+somaNeg);
	}
}
