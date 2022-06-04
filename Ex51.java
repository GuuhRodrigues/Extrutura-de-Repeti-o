import java.util.Scanner;
public class Ex51{
	public static void main(String [] args){

		Scanner ler = new Scanner(System.in);

		String nome="";
		int aP=0, reP=0, qtAl=0;
		double nota, soma=0, media=0, somaMed=0;

		while(!"FIM".equals(nome)){
			System.out.println("Entre com o nome do aluno, para finalizar digite FIM: ");
			nome=ler.next();

			if(!"FIM".equals(nome)){
				qtAl++;
				for(int i=1;i<=3;++i){
					System.out.println("Entre com a "+i+"º nota do aluno: ");
					nota=ler.nextDouble();
					soma+=nota;
				}
				somaMed+=soma;

				if(soma>=60)
					aP++;
				else
					reP++;
				soma=soma-soma;
			}
		}
		media=somaMed/qtAl;
		System.out.println("A média da classe é "+media);
		System.out.println("A quantidade de alunos aprovados "+aP);
		System.out.println("A quantidade de alunos reprovados "+reP);
	}
}