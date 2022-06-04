import java.util.Scanner;
public class Ex50{
	public static void main(String [] args){

		Scanner ler = new Scanner(System.in);

		String nome="";
		int quant=1;
		double pcUnit=0, total=0;

		while(!"FIM".equals(nome)){

			System.out.println("Entre com o nome do produto, para encerrar digite FIM: ");
			nome=ler.next();

			if(!"FIM".equals(nome)){
				System.out.println("Entre com o preço do produto: ");
				pcUnit=ler.nextDouble();
				System.out.println("Entre com a quantidade de produtos: ");
				quant=ler.nextInt();
				total=total+quant*pcUnit;
			}
		}
		System.out.printf("O valor total da compra é %.2f\n",total);
	}
}