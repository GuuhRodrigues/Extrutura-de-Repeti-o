import java.util.Scanner;
public class Ex46{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int num, par=0, imp=0;

		for(int i=1; i<=10;){
			System.out.println("Entre com o "+i+"º número: ");
			num=ler.nextInt();

			if(num!=0){
				if(num%2==0)
					par++;
				else
					imp++;
			++i;
			}
			else
				System.out.println("Número Inválido");
			++i;
			--i;
		}
		System.out.println("A quantidade de números pares é "+par);
		System.out.println("A quantidade de números impares é "+imp);
	}
}