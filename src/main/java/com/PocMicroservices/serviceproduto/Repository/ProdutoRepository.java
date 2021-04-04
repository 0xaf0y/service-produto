package com.PocMicroservices.serviceproduto.Repository;

import com.PocMicroservices.serviceproduto.Model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
