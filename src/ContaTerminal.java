import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e Importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela classe Scanner os valores digitados no terminal

        //Exibir a mensagem da conta criada

        //Criando o objeto scanner


        //Obter dados do Cliente
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, digite o número da conta bancária ");
        int contaBancaria = scanner.nextInt();

        System.out.println("Por favor, digite seu nome ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite seu sobrenome ");
        String sobrenomeCliente = scanner.next();

        System.out.println("Por favor, digite seu saldo bancário ");
        double saldoBancario = scanner.nextDouble();

        //Criando o objeto ContaCliente com as informações fornecidas
       ContaCliente contaCliente = new ContaCliente(numeroAgencia, contaBancaria, nomeCliente, sobrenomeCliente, saldoBancario);
       
       //Exibindo a mensagem de conta do cliente criada
       System.out.println(contaCliente);


    }
}
