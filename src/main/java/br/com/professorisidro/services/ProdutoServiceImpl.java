package br.com.professorisidro.services;

import br.com.professorisidro.model.Produto;
import org.springframework.stereotype.Component;

@Component
public class ProdutoServiceImpl implements IProdutoService{


    @Override
    public Produto aplicarDesconto(Produto prod, double percentual) {
        double novoPreco = prod.getPreco() - prod.getPreco() * percentual / 100;
        prod.setPreco(novoPreco);
        return prod;
    }
}
