import java.util.Scanner;
public class Ex37{
	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		int num, w=1, imp=0, par=0;

		while(w<=10){
			System.out.println("Entre com o "+w+"° número: ");
			num=ler.nextInt();

			if(num%2==0)
				imp+=1;
			else if(num%2==1)
				par+=1;
		w++;
		}

		System.out.println("A quantidade de números pares é "+par);
		System.out.println("A quantidade de números impares é "+imp);
	}
}