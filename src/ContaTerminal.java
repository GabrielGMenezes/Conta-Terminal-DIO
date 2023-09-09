import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int conta;
        String agencia;
        String nomeCliente;
        BigDecimal saldo;

        //TODO: Conhecer e importar a classe Scanner

        Scanner scanner = new Scanner(System.in);

        //TODO: Exibir as mensagens para o nosso usuario

        System.out.println("Olá, seja Bem-Vindo a nossa plataforma do banco");
        System.out.println("Vamos abrir sua conta, preciso que nos informe alguns dados para dar continuidade");

        //TODO: Obter pelo scanner os valores digitados no terminal

        System.out.print("Por favor, nos informe seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Qual número da sua agência: (com o dígito separado por '-') ");
        agencia = scanner.next();

        System.out.print("Número da sua conta: ");
        conta = scanner.nextInt();

        System.out.print("Quanto você irá depositar na sua conta: ");
        saldo = scanner.nextBigDecimal();

        //TODO: Exibir a mensagem "Conta Criada"

        System.out.printf("Olá %s, obrigado criar sua conta em nosso banco digital DIO, sua agência é %s, conta %d, e o saldo disponível é de R$%.2f",
                nomeCliente, agencia, conta, saldo);
        System.out.println("Obrigado por utilizar nossa plataforma.");

    }
}
