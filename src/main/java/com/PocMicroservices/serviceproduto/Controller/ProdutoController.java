package com.PocMicroservices.serviceproduto.Controller;

import com.PocMicroservices.serviceproduto.Controller.Data.Request.ProdutoPersistDto;
import com.PocMicroservices.serviceproduto.Controller.Data.Response.ProdutoResponseDto;
import com.PocMicroservices.serviceproduto.Model.Produto;
import com.PocMicroservices.serviceproduto.Service.ProdutoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produto")
public class ProdutoController {

     private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public ProdutoResponseDto inserir(@RequestBody ProdutoPersistDto dto){
        Produto produto = new Produto(dto.getDescricao(), dto.getValor());
        Produto produtoPersistido = produtoService.inserir(produto);
        return new ProdutoResponseDto(produtoPersistido.getId(), produtoPersistido.getDescricao());
    }

}
