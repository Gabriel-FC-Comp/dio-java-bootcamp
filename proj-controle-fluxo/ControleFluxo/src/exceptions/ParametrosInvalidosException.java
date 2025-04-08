
package exceptions;

/**
 * Classe de exceção lançada quando os parâmetros informados pelo usuário não estão dentro das regras
 * do programa.
 * <p>
 * Por exemplo, quando o segundo parâmetro é maior que o primeiro. 
 * @author Gabriel Finger Conte
 * @since 08/04/2025
 */
public class ParametrosInvalidosException extends RuntimeException{  

    /**
     * Cria uma nova instância de {@code ParametrosInvalidosException} com uma mensagem de erro específica.
     *
     * @param arg0 a mensagem que descreve o motivo da exceção.
    */
    public ParametrosInvalidosException(String arg0){
        super(arg0);
    }
}
