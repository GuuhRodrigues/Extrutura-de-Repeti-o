import java.util.Scanner;
public class Ex38{
	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		int num, w=1, pos=0, neg=0, somapos=0, somaneg=0;

		while(w<=15){
			System.out.println("Entre com o "+w+"° número: ");
			num=ler.nextInt();

			if(num>0){
				pos+=1;
				somapos+=num;
			}
			else if(num<0){
				neg+=1;
				somaneg+=num;
			}
			else
				System.out.println("O número 0 não pode ser aceito");
		w++;
		}
		System.out.println("A quantidade de números positivos é "+pos);
		System.out.println("A quantidade de números negativos é "+neg);
		System.out.println("A soma de todos os números positivos é "+somapos);
		System.out.println("A soma de todos os números negativos é "+somaneg);
	}
}