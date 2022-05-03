import java.util.Scanner;
public class Ex43
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);

		String nome;
		int ap=0, rep=0;
		double nota, media=0, ac3Nota=0,acTNota=0;

		for(int i=1;i<=10;++i)
		{
			System.out.println("Nome do "+i+"º aluno: ");
			nome=ler.next();

			for(int nt=1;nt<=3;++nt)
			{
				System.out.println("Entre com a "+nt+"º nota do "+i+"º aluno: ");
				nota=ler.nextDouble();
				ac3Nota+=nota;
			}
			acTNota+=ac3Nota;

			if(ac3Nota>=60)
					ap++;
			else
					rep++;

			ac3Nota=ac3Nota-ac3Nota;
		}
		media=acTNota/10;

		System.out.printf("A média de notas da classe é %.1f\n",media);
		System.out.println("A quantidade de alunos aprovados é "+ap);
		System.out.println("A quantidade de alunos reprovados é "+rep);
	}
}