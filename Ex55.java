import java.util.Scanner;
public class Ex55{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

         String prod="";
         int quant=0;
         double precoUnit=0, valT=0;
         do{
             System.out.println("Entre com a descri��o do produto, para finalizar digite FIM: ");
             prod=ler.next();
             if (!prod.equals("FIM")){
                 System.out.println("Pre�o unit�rio: ");
                 precoUnit = ler.nextDouble();
                 System.out.println("Quantidade: ");
                 quant = ler.nextInt();
                 valT=valT+precoUnit*quant;
             }
         }
             while(!prod.equals("FIM"));
             System.out.printf("O valor total da compra � %.2f",valT);
    }
}
