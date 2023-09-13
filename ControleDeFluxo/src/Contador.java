import java.util.Scanner;

public class Contador {
    public static void verificar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        if (primeiroParametro >= segundoParametro) {
            throw new ParametrosInvalidosException();
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        int contagem = parametroDois - parametroUm;
        int numeroImpressoNaTela = parametroUm+1;
        for(int i = 1; i <= contagem; i++){
            System.out.println("O número " + i + " é: " + numeroImpressoNaTela);
            numeroImpressoNaTela++;
        }
    }

    public static void main(String[] args) {
        Scanner parametrosRecebidos = new Scanner(System.in);

        System.out.println("Informe o primeiro parâmetro: ");
        int parametro1 = parametrosRecebidos.nextInt();

        System.out.println("Informe o segundo parâmetro: ");
        int parametro2 = parametrosRecebidos.nextInt();

        try {
            verificar(parametro1, parametro2);
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}