package br.com.professorisidro.controller;

import br.com.professorisidro.model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

    @GetMapping("/produto")
    public Produto recuperarProduto() {
        Produto prod;
        prod = new Produto();
        prod.setId(12345);
        prod.setDescricao("Computador");
        prod.setPreco(2000.00);
        return prod;
    }

    @PostMapping("/novoproduto")
    public String cadastrarNovo(@RequestBody Produto prod) {

        System.out.println("Recebido: " + prod.getId()+ prod.getId() + prod.getDescricao() + prod.getPreco());
        return "Tudo certo";

    }
}
