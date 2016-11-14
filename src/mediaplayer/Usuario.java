/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaplayer;

/**
 *
 * @author gisleude
 */
public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private int nivel_acesso;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the nivel_acesso
     */
    public int getNivel_acesso() {
        return nivel_acesso;
    }

    /**
     * @param nivel_acesso the nivel_acesso to set
     */
    public void setNivel_acesso(int nivel_acesso) {
        this.nivel_acesso = nivel_acesso;
    }
    
    public Usuario(String nome, String email, String senha, int nivel_acesso){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.nivel_acesso = nivel_acesso;
    }
}
