import java.util.Scanner;
public class Ex39
{
	public static void main(String[] args)
	{

		Scanner ler = new Scanner(System.in);

		int num, i, par=0, somaPar=0, imp=0, somaImp=0;


		for(i=1;i<=10;)
		{
			System.out.println("Entre com o "+i+"� n�mero: ");
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
				System.out.println("Este n�mero n�o pode ser aceito.");
			i++;
			i--;
			}
		}
		System.out.println("A quantidade de n�meros pares � "+par+" e a somas deles � "+somaPar);
		System.out.println("A quantidade de n�meros impar � "+imp+" e a somas deles � "+somaImp);

	}
}