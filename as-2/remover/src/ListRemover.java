import model.Aluno;

import java.util.List;

public class ListRemover {

    public static List<Aluno> removeByName(List<Aluno> alunos, String removeName) {
        Aluno removeAluno = null;
        for (Aluno aluno : alunos) {
            if (aluno.getName().equalsIgnoreCase(removeName)) removeAluno = aluno;
        }
        alunos.remove(removeAluno);
        return alunos;
    }
}
