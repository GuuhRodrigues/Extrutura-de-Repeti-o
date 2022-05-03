import java.util.Scanner;
public class Ex39
{
	public static void main(String[] args)
	{

		Scanner ler = new Scanner(System.in);

		int num, i, par=0, somaPar=0, imp=0, somaImp=0;


		for(i=1;i<=10;)
		{
			System.out.println("Entre com o "+i+"º número: ");
			num=ler.nextInt();

			if (num!=0)
			{

				if(num%2==0)
				{
				par++;
				somaPar+=num;
				}
				else
				{
				imp++;
				somaImp=+num;
				}
			i++;
			}
			else
			{
				System.out.println("Este número não pode ser aceito.");
			i++;
			i--;
			}
		}
		System.out.println("A quantidade de números pares é "+par+" e a somas deles é "+somaPar);
		System.out.println("A quantidade de números impar é "+imp+" e a somas deles é "+somaImp);

	}
}