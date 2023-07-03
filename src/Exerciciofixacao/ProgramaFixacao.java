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

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
		Scanner scanner = new Scanner(System.in);

		System.out.println("Dados do cliente: ");
		System.out.print("Nome: ");
		String nomeString = scanner.next();
		System.out.print("Email: ");
		String emailString = scanner.next();
		System.out.print("Data de nascimento  (DD/MM/YYYY): ");
		Date Daniversario = sdf.parse(scanner.next());
		
		Cliente cliente = new Cliente(nomeString, emailString, Daniversario );
		
		System.out.println("Insira os dados do Pedido: ");
		System.out.print("Status: ");
		Status statusString = Status.valueOf(scanner.next());
		
		Pedido pedido = new Pedido(new Date(), statusString, cliente);
		
		System.out.print("Quantos itens terá o pedido? ");
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do produto " + i + ":");
			System.out.print("Nome do produto: ");
			scanner.nextLine();
			String nomeProduto = scanner.nextLine();
			System.out.print("Preço do produto: ");
			double precoProduto = scanner.nextDouble();
			
			Produto produto = new Produto(nomeProduto, precoProduto);
			
			System.out.print("Quantidade: ");
			int quantidadeProduto = scanner.nextInt();
			
			ItemPedido itemPedido = new ItemPedido(quantidadeProduto, precoProduto, produto);

			pedido.addPedidos(itemPedido);
		}
		
		System.out.println();
		System.out.println("Resumo do pedido: ");
		System.out.println(pedido);
        
		scanner.close();
	}

}
