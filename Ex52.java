import java.util.Scanner;
public class Ex52{
	public static void main(String [] args){

		Scanner ler = new Scanner(System.in);

		int idade=0, genero, qtH=0, qtM=0, sIdadeH=0, spesoM=0, qtPes=0, medId=0, medPes=0;
		double peso;

		while (idade!=-1){
			System.out.println("Entre com a idade: ");
			idade=ler.nextInt();
			if(idade!=-1){
			qtPes++;
			System.out.println("Entre com o peso: ");
			peso=ler.nextDouble();
			System.out.println("Digite(1) para g�nero Masculino e (2) para Feminino");
			genero=ler.nextInt();
				if(genero==1){
					qtH++;
					sIdadeH+=idade;
				}
				if(genero==2){
					qtM++;
					spesoM+=peso;
				}
			}
		}
		medId=sIdadeH/qtPes;
		medPes=spesoM/qtPes;
		System.out.println("O total de homens � "+qtH);
		System.out.println("O total de mulheres � "+qtM);
		System.out.println("A m�dia das idades dos homens � "+medId);
		System.out.println("A m�dia dos pesos das mulheres � "+medPes);
	}
}