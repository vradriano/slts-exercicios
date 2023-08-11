package br.com.cursopcv.testes;

import br.com.cursopcv.RepositorioProduto.RepositorioProduto;
import br.com.cursopcv.modelo.Produto;

public class RemocaoDeProduto {
    public static void main(String[] args) {
        RepositorioProduto repProduto = new RepositorioProduto();

        Produto prop = repProduto.obterPorCod(3);

        if(prop != null) {
            repProduto.remove(prop);
            System.out.println("O produto foi removido com sucesso: " + prop);
        }
    }
}
