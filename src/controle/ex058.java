package controle;

import java.util.Scanner;

public class ex058 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int idadeAluno, qtdAlunos = -1, somaIdadeAlunos = 0;
        double mediaAlunos;
        boolean stop = true;

        while (stop) {
            System.out.print("insira a idade do aluno/a: ");
            idadeAluno = in.nextInt();
            somaIdadeAlunos += idadeAluno;
            qtdAlunos++;

            if (idadeAluno == 999) {
                stop = false;
            }

        }

        mediaAlunos = somaIdadeAlunos / qtdAlunos;
        System.out.println("programa encerrado.");
        System.out.println("resultado: ");
        System.out.println("quantidade de aluno: " + qtdAlunos);
        System.out.println("média de idade na turma: " + mediaAlunos);
    }
}
