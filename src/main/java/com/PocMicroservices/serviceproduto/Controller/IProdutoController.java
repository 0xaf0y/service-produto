package com.PocMicroservices.serviceproduto.Controller;

import com.PocMicroservices.serviceproduto.Controller.Data.Request.ProdutoPersistDto;
import com.PocMicroservices.serviceproduto.Controller.Data.Response.ProdutoResponseDto;
import com.PocMicroservices.serviceproduto.Model.Produto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

public interface IProdutoController {

    @Operation(summary = "Retorna o produto referente ao identificador recuperado por parametro")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "404",
                    content = @Content(
                            mediaType = "application/json",
                            examples = @ExampleObject(
                                    value = "{\n" +
                                            "    \"codigo\": \"X_100\",\n" +
                                            "    \"mensagem\": \"Produto de código 5778 não encontrado.\",\n" +
                                            "    \"urlDocumentacao\": null\n" +
                                            "}"
                            )
                    )
            )
    }
    )
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Produto inserir(@Valid @RequestBody ProdutoPersistDto dto);


    @GetMapping("{id}")
    Produto one(@PathVariable("id") Long id);
}
