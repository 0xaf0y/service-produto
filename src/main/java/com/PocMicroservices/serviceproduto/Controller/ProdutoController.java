package com.PocMicroservices.serviceproduto.Controller;

import com.PocMicroservices.serviceproduto.Controller.Data.Request.ProdutoPersistDto;
import com.PocMicroservices.serviceproduto.Controller.Data.Response.ProdutoResponseDto;
import com.PocMicroservices.serviceproduto.Model.Produto;
import com.PocMicroservices.serviceproduto.Service.ProdutoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("produto")
public class ProdutoController {

    private ModelMapper modelMapper;

    private final ProdutoService produtoService;

    public ProdutoController(ModelMapper modelMapper, ProdutoService produtoService) {
        this.modelMapper = modelMapper;
        this.produtoService = produtoService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutoResponseDto inserir(@Valid @RequestBody ProdutoPersistDto dto){
        Produto produto = new Produto(dto.getDescricao(), dto.getValor());
        Produto produtoPersistido = produtoService.inserir(produto);
        return modelMapper.map(produtoPersistido, ProdutoResponseDto.class);
    }

    @GetMapping("{id}")
    public ProdutoResponseDto one (@PathVariable("id") Long id){
        var produto = produtoService.one(id);
        return modelMapper.map(produto, ProdutoResponseDto.class);
    }

}
