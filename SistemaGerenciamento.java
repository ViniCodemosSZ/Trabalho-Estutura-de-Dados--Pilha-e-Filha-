import java.util.Scanner;

public class SistemaGerenciamento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pilha historicoSolicitacoes = new Pilha();
        Fila filaAtendimento = new Fila();

        preencherDadosIniciais(historicoSolicitacoes, filaAtendimento);

        int opcao = -1;

        do {
            System.out.println("\n===== Sistema de Gerenciamento de Atendimento =====");
            System.out.println("1. Adicionar Nova Solicitação ao Histórico (Pilha)");
            System.out.println("2. Remover Última Solicitação do Histórico (Pilha)");
            System.out.println("3. Ver Histórico de Solicitações (Pilha)");
            System.out.println("-------------------------------------------------");
            System.out.println("4. Adicionar Cliente à Fila de Atendimento");
            System.out.println("5. Atender Próximo Cliente da Fila");
            System.out.println("6. Ver Fila de Atendimento");
            System.out.println("-------------------------------------------------");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.print("ID da Solicitação: ");
                        String idReq = scanner.nextLine();
                        System.out.print("Descrição: ");
                        String desc = scanner.nextLine();
                        System.out.print("Data e Hora (ex: 2024-10-14 18:30): ");
                        String data = scanner.nextLine();
                        historicoSolicitacoes.adicionar(Elemento.criarSolicitacao(idReq, desc, data));
                        break;
                    case 2:
                        historicoSolicitacoes.remover();
                        break;
                    case 3:
                        historicoSolicitacoes.mostrarHistorico();
                        break;
                    case 4:
                        System.out.print("ID do Cliente: ");
                        String idCli = scanner.nextLine();
                        System.out.print("Nome do Cliente: ");
                        String nome = scanner.nextLine();
                        System.out.print("Motivo do Atendimento: ");
                        String motivo = scanner.nextLine();
                        filaAtendimento.adicionar(Elemento.criarCliente(idCli, nome, motivo));
                        break;
                    case 5:
                        filaAtendimento.atenderProximo();
                        break;
                    case 6:
                        filaAtendimento.mostrarFila();
                        break;
                    case 0:
                        System.out.println("Encerrando o sistema...");
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("Erro na entrada de dados. Por favor, insira um número válido.");
                scanner.nextLine();
                opcao = -1;
            }

        } while (opcao != 0);

        scanner.close();
    }

    public static void preencherDadosIniciais(Pilha historico, Fila fila) {
        System.out.println("...Carregando dados iniciais no sistema...");

        historico.adicionar(Elemento.criarSolicitacao("REQ001", "Instalação de software", "2024-08-20 10:30"));
        historico.adicionar(Elemento.criarSolicitacao("REQ002", "Manutenção preventiva", "2024-08-20 11:00"));
        historico.adicionar(Elemento.criarSolicitacao("REQ003", "Atualização de sistema", "2024-08-20 11:30"));

        fila.adicionar(Elemento.criarCliente("CLI001", "Maria Silva", "Dúvida sobre produto"));
        fila.adicionar(Elemento.criarCliente("CLI002", "João Souza", "Reclamação de serviço"));
        fila.adicionar(Elemento.criarCliente("CLI003", "Ana Costa", "Solicitação de reembolso"));

        System.out.println("...Dados carregados.\n");
    }
}