import java.util.Scanner;
public class Ex36{
	public static void main(String[] args){

		Scanner ler = new Scanner(System.in);

		int idade, a=0, b=0,nada=0, w=1;

		while (w<=10){
			System.out.println("Entre com a idade da "+w+"° pessoa: ");
			idade=ler.nextInt();
			if (idade<21)
				a=a+1;
			else if (idade>50)
				b=b+1;
		w++;
		}
		System.out.println("O total de pessoas com menos de 21 anos é "+a);
		System.out.println("O total de pessoas com mais de 50 anos é "+b);
	}
}