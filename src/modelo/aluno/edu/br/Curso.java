package modelo.aluno.edu.br;

import java.util.Date;
import java.util.List;

public class Curso{
    private String nome;
    private int ch;
    private String modalidade;
    private String nivel;
    private Date dataDeInc;
    private Date dataDeFim;
    private Professor professor;
    public List<Aluno> alunos;

    //Método construtor
    public Curso(String nome, int ch, String modalidade, String nivel){
        this.nome = nome;
        this.ch = ch;
        this.modalidade = modalidade;
        this.nivel = nivel;
    }

    //Método Construtor
    public Curso(Date dataDeInc, Date dataDeFim){
        this.dataDeInc = dataDeInc;
        this.dataDeFim = dataDeFim;

    }

    public String getNome() {
        return nome;
    }
    public int getCh() {
        return ch;
    }
    public String getModalidade() {
        return modalidade;
    }
    public String getNivel() {
        return nivel;
    }
    public Date getDataDeInc() {
        return dataDeInc;
    }
    public Date getDataDeFim() {
        return dataDeFim;
    }
    public Professor getProfessor() {
        return professor;
    }
    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    

}