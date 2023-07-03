package Entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Entidades.enums.Status;

public class Pedido {
	
	private Date momento;
	private Status status;
	
	private Cliente cliente; //tem um
	private List<ItemPedido> pedidos = new ArrayList<>(); //tem vários

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public Pedido() {
	}


    public Pedido(Date momento, Status status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}



	public Date getMomento() {
		return momento;
	}


	public void setMomento(Date momento) {
		this.momento = momento;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
     //e sem get senão dara acesso a lista ao metodos de inserir e remover
    //tipo lista não usamos set e sim metodos para adicionar e remover itens da lista
	
	public void addPedidos(ItemPedido pItemPedido) {
    	pedidos.add(pItemPedido);
    }
    public void removerPedidos(ItemPedido pItemPedido) {
    	pedidos.remove(pItemPedido);
    }
    
    	public double total() {
    	double soma = 0.0;
    	for (ItemPedido item : pedidos) {  //para cada ItemPedido do tipo item na list pedidos
    		soma += item.subTotal();	   //acumula o valor na soma com o subTotal da classe ItemPedido
		}
		return soma;
    	}
    	public String toString() {
    		StringBuilder sb = new StringBuilder();
    		sb.append("Momento do pedido: ");
    		sb.append(sdf.format(momento) + "\n");
    		sb.append("Order status: ");
    		sb.append(status + "\n");
    		sb.append("Cliente: ");
    		sb.append(cliente + "\n");
    		sb.append("Itens pedidos:\n");
    		for (ItemPedido item : pedidos) {
    			sb.append(item + "\n");
    		}
    		sb.append("Preço total: $");
    		sb.append(String.format("%.2f", total()));
    		return sb.toString();
    	
    	}	
}
