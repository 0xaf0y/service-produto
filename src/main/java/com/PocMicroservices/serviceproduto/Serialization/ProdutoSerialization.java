package com.PocMicroservices.serviceproduto.Serialization;

import com.PocMicroservices.serviceproduto.Controller.Data.Response.ProdutoResponse;
import com.PocMicroservices.serviceproduto.Model.Produto;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;

@JsonComponent
public class ProdutoSerialization extends JsonSerializer<Produto> {

    @Autowired  private ModelMapper modelMapper;

    public ProdutoSerialization(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public void serialize(Produto produto, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
       ProdutoResponse produtoResponse = modelMapper.map(produto, ProdutoResponse.class);
       jsonGenerator.writeObject(produtoResponse);
    }
}

