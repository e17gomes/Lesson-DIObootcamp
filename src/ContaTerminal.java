import java.util.Scanner;

import javax.swing.JOptionPane;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        int Numero = 001;
        double Saldo = 0.00;
    JOptionPane.showMessageDialog(null, "Insira seus dados no terminal. ","Insira os dados", 1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira seu nome de usuário...");
            String  NomeCliente = scanner.nextLine();
        System.out.println("Insira sua agência...");
            String Agencia = scanner.nextLine();
        System.out.println(
            "Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+Agencia +", conta "+Numero+ " e seu saldo "+Saldo+" já está disponível para saque"
        );
        
        System.out.println("Deseja depositar ou sacar dinheiro? s/n");
        String resposta = scanner.nextLine();
        if(resposta.equals("s")){
                System.out.println("Digite o valor");
                double valDeposito = Double.parseDouble(scanner.nextLine());
                Saldo = valDeposito;

                System.out.println("Seu saldo agora é de " + Saldo);

        } else System.out.println("Até a proxima...");

    
        
        
        
        
        
        scanner.close();
    }
}
