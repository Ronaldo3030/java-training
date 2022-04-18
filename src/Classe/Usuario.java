package Classe;

public class Usuario {
    private String nome, idade, senha;
    
    public Usuario(){}
    
    public Usuario(String nome, String idade, String senha){
        this.nome = nome;
        this.idade = idade;
        this.senha = senha;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getIdade(){
        return idade;
    }
    
    public void setIdade(String idade){
        this.idade = idade;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
}
