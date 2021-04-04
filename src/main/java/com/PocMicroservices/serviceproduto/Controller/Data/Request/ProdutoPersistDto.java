package com.PocMicroservices.serviceproduto.Controller.Data.Request;

import java.math.BigDecimal;

public class ProdutoPersistDto {

    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    private BigDecimal valor;
}
