import java.util.Scanner;

/**
 * A classe simula a criação de uma conta bancária e exibe uma mensagem de boas-vindas ao usuário.
 * Através dela, o cliente fornece informações como o número da conta, a agência e o saldo inicial. 
 * Após a coleta dos dados, uma mensagem é gerada e exibida, confirmando o sucesso da abertura da conta.
 * 
 * <p>A classe contém os seguintes atributos:</p>
 * <ul>
 *   <li><b>numeroConta</b>: O número da conta bancária.</li>
 *   <li><b>agencia</b>: O número da agência bancária.</li>
 *   <li><b>nomeCliente</b>: O nome completo do cliente.</li>
 *   <li><b>saldo</b>: O saldo inicial da conta bancária.</li>
 * </ul>
 * 
 * <p>A classe também inclui métodos de acesso (getters e setters) para manipulação desses atributos,
 * além de um método para exibir a mensagem de boas-vindas no terminal.</p>
 * 
 * @author Gabriel Finger Conte
 * @since 26/03/2025
 */
public class ContaTerminal {
    
    /**
     * Número da conta bancária
     */
    private int numeroConta;
    /**
     * Número da agência bancária
     */
    private String agencia;
    /**
     * Nome do dono da conta bancária
     */
    private String nomeCliente;
    /**
     * Saldo da conta bancária
     */
    private double saldo;
    
    /**
     * Método principal da aplicação, que simula a criação de uma conta bancária.
     * Ele coleta os dados do cliente e exibe uma mensagem de boas-vindas no terminal.
     * 
     * @param args Argumentos passados para a aplicação.
     * @throws Exception Se ocorrer algum erro durante a execução.
     */
    public static void main(String[] args) throws Exception {
        
        ContaTerminal novaConta = new ContaTerminal();
        Scanner dataScanner = new Scanner(System.in,"utf-8");

        // Obtém os dados do cliente
        System.out.print("Por favor, digite o número da Agência: ");
        novaConta.setAgencia(dataScanner.next());
        System.out.print("Por favor, digite o número da Conta: ");
        novaConta.setNumeroConta(dataScanner.nextInt());
        System.out.print("Por favor, digite o seu Nome completo: ");
        novaConta.setNomeCliente(dataScanner.next());
        System.out.print("Por favor, digite o saldo inicial a ser depositado: R$");
        novaConta.setSaldo(dataScanner.nextDouble());

        // Exibe a mensagem de boas vindas
        novaConta.exibeMensagemBoasVindas();

        // Fecha o Scanner
        dataScanner.close();
    }

    //===============================================================
    // Definição de métodos 
    //===============================================================

    /**
     * Formata os dados do cliente para uma mensagem de boas vindas na abertura da conta,
     * exibindo a mensagem no terminal.
     */
    public void exibeMensagemBoasVindas(){
        String mensagem = String.format(
            "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s," +
            " conta %d e seu saldo R$%.2f já está disponível para saque.", 
            getNomeCliente(), getAgencia(), getNumeroConta(), getSaldo());
        
        System.out.println(mensagem);
    }

    //===============================================================
    // Getters e Setters
    //===============================================================

    /**
     * Obtém o número da conta bancária.
     * 
     * @return O número da conta bancária.
     */
    public int getNumeroConta() {
        return numeroConta;
    }

    /**
     * Obtém o número da agência bancária.
     * 
     * @return O número da agência bancária.
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * Obtém o nome do cliente.
     * 
     * @return O nome do cliente.
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * Obtém o saldo da conta bancária.
     * 
     * @return O saldo da conta bancária.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Define o número da conta bancária.
     * 
     * @param numeroConta O número da conta bancária.
     */
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    /**
     * Define o número da agência bancária.
     * 
     * @param agencia O número da agência bancária.
     */
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    /**
     * Define o nome do cliente.
     * 
     * @param nomeCliente O nome do cliente.
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * Define o saldo da conta bancária.
     * 
     * @param saldo O saldo inicial da conta bancária.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
