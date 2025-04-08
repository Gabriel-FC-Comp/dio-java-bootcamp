import java.util.InputMismatchException;
import java.util.Scanner;
import exceptions.ParametrosInvalidosException;

/**
 * Classe principal responsável por iniciar o programa de contagem com base em dois parâmetros fornecidos pelo usuário.
 * <p>
 * Adaptação de glysns (https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/controle-fluxo)
 * 
 * @author Gabriel Finger Conte
 * @since 08/04/2025
 */
public class Contador {

    /**
     * Método principal que executa a leitura dos parâmetros do usuário e inicia o processo de contagem.
     * <p>
     * Solicita dois números inteiros via terminal. Se o primeiro número for maior que o segundo, uma exceção personalizada é lançada
     * e uma mensagem de erro é exibida.
     * 
     * @param args parâmetros passados durante a execução do programa (não utilizados neste caso).
     */
    public static void main(String[] args) {

        // Scanner para obter os dados do usuário
        Scanner terminal = new Scanner(System.in);
        int parametroUm;
        int parametroDois;

        do { // Exige que os parâmetros informados pelo sejam números inteiros
            try {
                System.out.println("Digite o primeiro parâmetro");
                parametroUm = terminal.nextInt();
                System.out.println("Digite o segundo parâmetro");
                parametroDois = terminal.nextInt();
                
                // Fecha o terminal
                terminal.close();
                break;
            } catch (InputMismatchException e) {
                System.err.println("Os parâmetros devem ser ambos NÚMEROS INTEIROS!");
                // Limpa o buffer de entrada
                terminal.next();
            } // try-catch
        } while (true);

        try {
            // chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            // imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.err.println("O segundo parâmetro DEVE ser MAIOR que o primeiro!");
        } // try-catch
        
    }// void main

    /**
     * Realiza uma contagem com base nos dois parâmetros informados pelo usuário.
    * <p>
    * A contagem inicia em 1 e vai até a diferença entre {@code parametroDois} e {@code parametroUm} (inclusive).
     * @param parametroUm primeiro parâmetro informado pelo usuário (deve ser <= ao segundo).
     * @param parametroDois segundo parâmetro informado pelo usuário.
     * @throws ParametrosInvalidosException se {@code parametroUm} for maior que {@code parametroDois}.
     */
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException("O primeiro parâmetro deve ser MENOR que o segundo.");

        int contagem = parametroDois - parametroUm;
        // realizar o for para imprimir os números com base na variável contagem
        for (int contador = 1; contador <= contagem + 1; contador++) {
            System.out.println("Imprimindo o número " + contador);
        } // for
    }// void contar
}
