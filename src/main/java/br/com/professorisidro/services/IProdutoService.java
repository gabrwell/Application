package br.com.professorisidro.services;

import br.com.professorisidro.model.Produto;

public interface IProdutoService {

    public Produto aplicarDesconto(Produto prod, double percentual);
}
