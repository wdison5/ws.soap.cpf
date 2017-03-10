/*
 * Projeto criado e mantido pela PRODESP.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.soap.cpf;

/**
 *
 * @author Jose Wdison de Souza <a>wdison@hotmail.com</a>
 */
public class Pessoa {
    private String cpf;
    private String nome;

    public Pessoa() {
        
    }
    
    public Pessoa(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
