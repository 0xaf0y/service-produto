package com.PocMicroservices.serviceproduto.Controller.Data.Response;

public class ProdutoResponse {

    private Long id;
    private String descricao;

    @Deprecated
    public ProdutoResponse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
