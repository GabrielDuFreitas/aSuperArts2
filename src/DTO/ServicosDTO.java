/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Administrador
 */
public class ServicosDTO {
    private Integer id_servico;
    private String nome;
    private Integer quantidade;
    private Double valor;

    public Integer getId_servico() {
        return id_servico;
    }

    public void setId_servico(Integer id_servico) {
        this.id_servico = id_servico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

}
