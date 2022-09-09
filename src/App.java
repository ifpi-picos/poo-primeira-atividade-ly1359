import java.util.ArrayList;
import java.util.List;
import modelo.aluno.edu.br.Aluno;
import modelo.aluno.edu.br.Professor;
import modelo.aluno.edu.br.Curso;

public class App {
    public static void main(String[] args) throws Exception {
        Professor professor = new Professor("Bob");

        Curso curso = new Curso("ADs", 2000, "Tecnico", "Superior");
   
        Aluno tessan = new Aluno("tessan", "email@email");
        Aluno lee = new Aluno("Lee taeho", "eamil@eamil");
        Aluno woo = new Aluno("Woo young", "email@eamil");

        List<Aluno> alunos = new ArrayList<Aluno>();
        alunos.add(tessan);
        alunos.add(lee);
        alunos.add(woo);
    
        curso.alunos = alunos;
        ImprimirDados(professor, curso);

    }

    static void ImprimirDados(Professor professor, Curso curso) {
        System.out.format("Nome do curso: %s\nCarga Horaria: %d\nModalidade: %s\nNivel: %s",
        curso.getNome(),
        curso.getCh(),
        curso.getModalidade(),
        curso.getNivel());
        System.out.format("\nNome do Professor: %s\n", professor.getNome());
        for(Aluno aluno: curso.alunos ){
            System.out.println("Alunos Do Curso: " + aluno.getNome());
        }
    }
}

