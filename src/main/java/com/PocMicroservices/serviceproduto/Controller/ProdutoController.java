package com.PocMicroservices.serviceproduto.Controller;

import com.PocMicroservices.serviceproduto.Controller.Data.Request.ProdutoPersist;
import com.PocMicroservices.serviceproduto.Model.Produto;
import com.PocMicroservices.serviceproduto.Service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("produto")
public class ProdutoController implements IProdutoController{

    @Autowired
    private ProdutoService produtoService;
//
//    public ProdutoController(ProdutoService produtoService) {
//        this.produtoService = produtoService;
//    }

    @Override
    @PostMapping
    public Produto inserir(@Valid @RequestBody ProdutoPersist dto){
        Produto produto = new Produto(dto.getDescricao(), dto.getValor());
        return produtoService.inserir(produto);
    }

    @Override
    @GetMapping("{id}")
    public Produto one (@PathVariable("id") Long id){
        return produtoService.one(id);
    }

}
