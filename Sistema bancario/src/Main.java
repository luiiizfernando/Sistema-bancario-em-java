import javax.xml.transform.Source;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner leitura = new Scanner(System.in);
        String nome = "Jacqueline Oliveira";
        String tipoDeConta = "Corrente";
        double saldo = 2500.00;
        double valor;
        int opcao = 0;

        System.out.println("********************************");
        System.out.println("Dados do cliente: ");
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("********************************");

        while (opcao != 4)
        {
            System.out.println();
            System.out.println("Operações");
            System.out.println();
            System.out.println("1 - Consultar saldos");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            System.out.println();
            System.out.print("Digite a opção desejada: ");
            opcao = leitura.nextInt();
            if(opcao == 1)
            {
                System.out.println("O saldo é R$ " + saldo);
                System.out.println();
            }
            else if(opcao == 2)
            {
                System.out.print("Digite o valor a receber: ");
                valor = leitura.nextDouble();
                saldo = saldo + valor;
                System.out.println("Saldo atualizado R$ " + saldo);
            }
            else if(opcao == 3)
            {
                System.out.print("Informe o valor que deseja tranferir: ");
                valor = leitura.nextDouble();
                if(valor > saldo)
                {
                    System.out.println("Não há saldo suficiente para fazer essa tranferência.");
                }
                else
                {
                    saldo = saldo - valor;
                    System.out.println("Saldo atualizado R$ " + saldo);
                }
            }
            else
            {
                System.out.println("Opção inválida.");
            }
        }

    }
}