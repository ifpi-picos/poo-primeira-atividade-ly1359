package modelo.aluno.edu.br;

public class Professor {
    
    private String nome;
    private String formacao;
    private String email;

    //Método Construtor
    public Professor(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public String getFormacao() {
        return formacao;
    }
    public String getEmail() {
        return email;
    }

    
}