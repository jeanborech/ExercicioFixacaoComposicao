package Exerciciofixacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Entidades.Cliente;
import Entidades.ItemPedido;
import Entidades.Pedido;
import Entidades.Produto;
import Entidades.enums.Status;

public class ProgramaFixacao {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //para formatar a data que vai vir da classe cliente
	
		Scanner scanner = new Scanner(System.in);

		System.out.println("Dados do cliente: ");
		System.out.print("Nome: ");
		String nomeString = scanner.next();
		System.out.print("Email: ");
		String emailString = scanner.next();
		System.out.print("Data de nascimento  (DD/MM/YYYY): ");
		Date Daniversario = sdf.parse(scanner.next());  //sdf.parse para tranformar o string digitado em tipo Date
		
		//instanciado cliente a partir do dados digitados acima
		Cliente cliente = new Cliente(nomeString, emailString, Daniversario ); 
		
		System.out.println("Insira os dados do Pedido: ");
		System.out.print("Status: ");
		Status statusString = Status.valueOf(scanner.next()); //value.Of converter string digitado em tipo enum Status
		
		//instanciado o objeto Pedido associado ao objeto cliente
		Pedido pedido = new Pedido(new Date(), statusString, cliente);//new Date() para instancia horario e data do sistema
		
		System.out.print("Quantos itens terá o pedido? ");
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do produto " + i + ":");
			System.out.print("Nome do produto: ");
			scanner.nextLine();
			String nomeProduto = scanner.nextLine();
			System.out.print("Preço do produto: ");
			double precoProduto = scanner.nextDouble();
			System.out.print("Quantidade: ");
			int quantidadeProduto = scanner.nextInt();
			
			//instanciar objeto Produto
			Produto produto = new Produto(nomeProduto, precoProduto); 
			//Instanciar objeto itemPedido associado com o objeto produto
			ItemPedido itemPedido = new ItemPedido(quantidadeProduto, precoProduto, produto); 
           
			//para adicionar o itemPedido ao Pedido 
			pedido.addPedidos(itemPedido);
		}
		
		System.out.println();
		System.out.println("Resumo do pedido: ");
		System.out.println(pedido);
        
		scanner.close();
	}

}
