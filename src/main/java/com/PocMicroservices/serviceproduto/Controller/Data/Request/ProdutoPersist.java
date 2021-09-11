package com.PocMicroservices.serviceproduto.Controller.Data.Request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class ProdutoPersist {

    @NotEmpty
    private String descricao;

    @NotNull
    private BigDecimal valor;

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }



}
