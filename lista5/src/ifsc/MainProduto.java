package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {

		Produto h20 = new Produto();

		h20.setNome("Nome do produto agua");
		h20.setCodBarras(5654654l);
		h20.setPreco(5.00);
		h20.setFornecedor("Fornecedor Nicole");

		Produto mate = new Produto();

		mate.setNome("Nome do produto erva mate");
		mate.setCodBarras(5650044l);
		mate.setPreco(12.00);
		mate.setFornecedor("Fornecedor Vitoria");
		
		Produto canudo = new Produto();

		canudo.setNome("Nome do produto canudo de plastico");
		canudo.setCodBarras(876046754l);
		canudo.setPreco(2.00);
		canudo.setFornecedor("Fornecedor Prof Bruna");
		
		
	    ArrayList <Produto> Produto = new ArrayList <>();
	    
	    Produto.add(mate);
		Produto.add(canudo);
		Produto.add(h20);
		
		System.out.println(Produto.size());
		
		for (Produto produto : Produto) {
			System.out.println(produto.getNome());
			System.out.println(produto.getCodBarras());
			System.out.println(produto.getPreco());
			System.out.println(produto.getFornecedor());
			

	}

}
}
