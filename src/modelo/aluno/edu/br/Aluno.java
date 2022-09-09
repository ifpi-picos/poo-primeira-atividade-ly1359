package modelo.aluno.edu.br;

import java.util.Date;

public class Aluno{
    private String nome;
    private Date dataDeNasc;
    private String email;

    //Método Construtor
    public Aluno(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }
    public Date getDataDeNasc() {
        return dataDeNasc;
    }
    public String getEmail() {
        return email;
    }


}

