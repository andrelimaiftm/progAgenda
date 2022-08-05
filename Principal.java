import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        int opcao = 0;
        Scanner entrada = new Scanner(System.in);
        Contato[] vetor = new Contato[10];
        int contador = 0;
        do {
            System.out.println("--- Menu ---");
            System.out.println("1 - Adicionar Contato");
            System.out.println("2 - Buscar Contato por numero");
            System.out.println("3 - Remover Contato por numero");
            System.out.println("4 - Editar Contato");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opcao: ");
            opcao = entrada.nextInt();
            int numero = 0;
            String nome = "";
            String email = "";
            String telefone = "";
            switch (opcao) {
                case 0:
                    System.out.println("Adeus!!!");
                    break;
                case 1:
                    System.out.println("Digite um numero: ");
                    numero = entrada.nextInt();
                    entrada.nextLine();
                    System.out.println("Digite um nome: ");
                    nome =  entrada.nextLine();
                    System.out.println("Digite um E-mail: ");
                    email = entrada.nextLine();
                    System.out.println("Digite um telefone:");
                    telefone = entrada.nextLine();
                    Contato c = new Contato(numero, nome, email, telefone);
                    vetor[contador] = c;
                    //contador = contador + 1;
                    contador++;
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;

                default:
                    System.out.println(
                        "Opcao invalida ... Tente outra vez!!");
                    break;
            }
        } while (opcao != 0);
    }
}
