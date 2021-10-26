package Exercicio21;

public class Aluno {

    private String nome;
    private String cpf;
    private Integer idade;

    public Aluno( String nome, String cpf, Integer idade ) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj) {
        Aluno stub = (Aluno) obj;
        return (this.cpf == stub.getCpf());
    }

}
