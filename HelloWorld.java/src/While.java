public class While {
    public static void main(String[] args) {
        String[] candidatos = {"Lucas", "Julia", "Emilly", "Cristian", "Eloisa", "Carol", "Eliane", "Claiton"};
        final int numVagas = 5;
        int vagaAtual = 0;

        String[] vaga = new String[numVagas];

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println(candidatos[i]);
        }

        String candidato = "INDEFINIDO";
        String log;

        while (vagaAtual < numVagas) {
            candidato = candidatos[vagaAtual];
            log = "O candidato: " + candidato + " se candidatou a vaga: " + (vagaAtual + 1) + "\n";
            vaga[vagaAtual] = candidato;
            vagaAtual++;
            System.out.println(log);
        }
    }
}
