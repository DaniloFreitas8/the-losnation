package ListaContatos;

import java.util.ArrayList;
import java.util.Scanner;


public class ListaContatos {
	private Scanner scanner = new Scanner(System.in);
	private ArrayList<String> lista = new ArrayList<>();

	private String mostrarMenu() {
		StringBuilder sb = new StringBuilder();
		sb.append("1- Ver a lista \n");
		sb.append("2- Adicionar pessoa na lista \n ");
		sb.append("3- Remover pessoa da lista \n ");
		sb.append("4- Limpar Lista \n ");
		sb.append("5- Sair \n ");
		
		System.out.println(sb.toString());
		
		return scanner.nextLine();
		
	}
	
	public void iniciar() {
		String opcao = mostrarMenu();
		while(!opcao.equals("5")) {
			switch (opcao) {
			case "1":
				System.out.println(lista);
				opcao = mostrarMenu();
				break;
			case "2":
				System.out.println("Digite o nome da pessoa: ");
				String item = scanner.nextLine();
				lista.add(item);
				
				opcao = mostrarMenu();
				break;
			case "3":
				System.out.println("Digite o índice do item para remover da lista:");
				int indice = Integer.valueOf(scanner.nextLine());
				lista.remove(indice);
				System.out.println(lista);
				
				opcao = mostrarMenu();
				
				break;
			case "4":
				lista.clear();
				
				opcao = mostrarMenu();
		
				break;
			default:
				System.out.println("Opção inválida");
				opcao = mostrarMenu();
					
				break;
			}
			
		}
		scanner.close();
		System.out.println("Obrigado");	
	}

}
