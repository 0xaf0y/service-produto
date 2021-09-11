package com.PocMicroservices.serviceproduto.Controller.Data.Response;

import javax.validation.constraints.NotNull;

public class ProdutoResponse {

    private Long id;
    private String descricao;
    private Long valor;

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
