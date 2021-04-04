package com.PocMicroservices.serviceproduto.Service;

import com.PocMicroservices.serviceproduto.Model.Produto;

public interface ProdutoService {

    Produto inserir(Produto produto);

    Produto one(Long id);
}
