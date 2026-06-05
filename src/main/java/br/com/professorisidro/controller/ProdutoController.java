package br.com.professorisidro.controller;

import br.com.professorisidro.model.Produto;
import br.com.professorisidro.services.IProdutoService;
import br.com.professorisidro.services.ProdutoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

    @Autowired
    IProdutoService ips;

    @GetMapping("/produto")
    public Produto recuperarProduto() {
        Produto prod;
        prod = new Produto();
        prod.setId(12345);
        prod.setDescricao("Computador");
        prod.setPreco(2000.00);
        prod = ips.aplicarDesconto(prod, 10);
        return prod;
    }

    @PostMapping("/novoproduto")
    public String cadastrarNovo(@RequestBody Produto prod) {

        System.out.println("Recebido: " + prod.getId()+ prod.getId() + prod.getDescricao() + prod.getPreco());
        return "Tudo certo";

    }
}
