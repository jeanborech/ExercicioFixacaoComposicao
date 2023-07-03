package Entidades;

public class ItemPedido {

	private Integer quantidade;
	private Double preco;
	
	private Produto produto; //composição entre os objetos. criar uma referencia do item produto com item pedido para navegar entre eles
	
	public ItemPedido() {
	}

	
	public ItemPedido(Integer quantidade, Double preco, Produto produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}



	public Integer getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}


	public Double getPreco() {
		return preco;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}


	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	public double subTotal() {
	return	quantidade * preco;
	}


	@Override
	public String toString() {
		return produto.getNome()  //navegar no produto e getNome para pegar o nome 
				+", $" 
				+ String.format("%.2f", preco)   //String.format para formatar com 2 casas decimais
				+ ", Quantity: " 
				+ quantidade + 
				", Subtotal: $" 
				+ String.format("%.2f", subTotal());

}
}
