package com.PocMicroservices.serviceproduto.Controller.Data.Response;

import lombok.NonNull;

import java.util.Objects;

public class Error {

    private final String codigo ;
    private final String mensagem;
    private String urlDocumentacao;

    public Error(@NonNull String codigo,@NonNull String mensagem) {
        this.codigo = Objects.requireNonNull(codigo);
        this.mensagem = Objects.requireNonNull(mensagem);
        // todo
    }

    public String getCodigo() {
        return codigo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getUrlDocumentacao() {
        return urlDocumentacao;
    }
}
