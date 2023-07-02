package Entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Entidades.enums.Status;

public class Pedido {
	
	private Date momento;
	private Status status;
	
	private List<ItemPedido> pedidos = new ArrayList<>(); 

	public Pedido() {
	}

	public Pedido(Date momento, Status status) {
		this.momento = momento;
		this.status = status;
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
	
    public void addPedidos(ItemPedido pItemPedido) {
    	pedidos.add(pItemPedido);
    }
    public void removerPedidos(ItemPedido pItemPedido) {
    	pedidos.remove(pItemPedido);
    }
    
    	
}
