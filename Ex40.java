import java.util.Scanner;
public class Ex40
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);

		int num, pos=0, neg=0, mPos=0, mNeg=0, cPos=0, cNeg=0;

		for (int i=1;i<=5;)
		{
			System.out.println("Entre com o "+i+"º número: ");
			num=ler.nextInt();

			if (num!=0)
			{
				if(num>0)
				{
					cPos++;
					pos+=num;
				}
				else
				{
					cNeg++;
					neg+=num;
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
		mPos=pos/cPos;
		mNeg=neg/cNeg;
		System.out.println("A média dos números positivos é "+mPos);
		System.out.println("A média dos números negativos é "+mNeg);
	}
}