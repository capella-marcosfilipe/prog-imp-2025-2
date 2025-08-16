public class Exemplo01 {
    public static final int QTD_REPETICOES = 5;
    public static void main(String[] args) {
        System.out.println("Impressão em Ordem Crescente");
        for (int i = 1; i <= QTD_REPETICOES; i++) {
            System.out.printf("%2d. Olá, Turma!\n", i);
        }
        
        System.out.println("Impressão em Ordem Descrescente");
        for (int i = QTD_REPETICOES; i >= 1; i--) {
            System.out.printf("%2d. Olá, Turma!\n", i);
        }

        System.out.println("Impressão em Ordem Descrescente, apesar do 'i' do FOR ser crescente");
        for (int i = 1; i <= QTD_REPETICOES; i += 1) {
            System.out.printf("%2d. Olá, Turma!\n", QTD_REPETICOES - i + 1);
        }
    }
}