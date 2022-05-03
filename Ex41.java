import java.util.Scanner;
public class Ex41
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);

		int num, par=0, imp=0, mPar=0, mImp=0, cPar=0, cImp=0;

		for (int i=1;i<=5;)
		{
			System.out.println("Entre com o "+i+"º número: ");
			num=ler.nextInt();

			if (num!=0)
			{
				if(num%2==0)
				{
					cPar++;
					par+=num;
				}
				else
				{
					cImp++;
					imp+=num;
				}
			++i;
			}
			else
			{
				System.out.println("Número inválido");
			++i;
			--i;
			}
		}
		cPar=par/cPar;
		cImp=imp/cImp;
		System.out.println("A média dos números positivos é "+cPar);
		System.out.println("A média dos números negativos é "+cImp);
	}
}