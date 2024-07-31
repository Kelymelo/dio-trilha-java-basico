
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner        

        Scanner scanner = new Scanner(System.in);

        //TODO: Exibir mensagens para o meu usuario
        //TODO: Obter pela Scanner os valores digitados no terminal

        System.out.print("Por favor, digite o número da Agência: ");
        int agencia = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Por favor, digite a Agência: ");
        String conta = scanner.nextLine();

        System.out.print("Por favor, digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        //TODO: Exibir a mensagem conta criada
        System.out.println("Olá " + nome +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta " + conta +" e seu saldo " + saldo + " já está disponível para saque");

        scanner.close();
    }
}
