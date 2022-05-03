import java.util.Scanner;
public class Ex42
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);

		int idade, qIdade=0, qNota=0;
		double nota, mNota=0, sNota=0;

		for(int i=1;i<=30;i++)
		{

			System.out.println("Entre com a idade do "+i+"º aluno: ");
			idade=ler.nextInt();
			System.out.println("Entre com a nota final do "+i+"º aluno: ");
			nota=ler.nextDouble();
			sNota+=nota;

			if(nota>70)
				qNota++;
			if(idade>20)
				qIdade++;
		}
		mNota=sNota/30;

		System.out.println("A quantidade de alunos com nota final acima de 70 pontos é "+qNota);
		System.out.println("A quantidade de alunos com idade superior a 20 é "+qIdade);
		System.out.printf("A média das notas finais da turma é %.1f",mNota);
	}

}