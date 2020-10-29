package FilaAtendimento;

import java.util.ArrayList;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;



public class FilaAtendimento {
	private Scanner scanner = new Scanner(System.in);
	private Queue<String> fila = new LinkedList<>();
	private ArrayList<String> lista = new ArrayList<>();
	private Stack<Integer> stack = new Stack<>();
	
	private String mostrarMenu() {
		StringBuilder sb = new StringBuilder();
	
		
		sb.append("1 - Consultar lista de Contatos \n");
		sb.append("2 - Inserir contato na lista de Contatos \n");
		sb.append("3 - Remover contato da lista de Contatos  \n");
		sb.append("4 - Inserir pedido na fila \n");
		sb.append("5 - Chamar próxima pessoa da fila \n");
		sb.append("6 - Organizar as entregas \n");
		sb.append("7 - Desempilhar as entregas \n");
		sb.append("8 - Sair\n");
	
		System.out.println(sb.toString());
		
		return scanner.nextLine();
		
	}
	
	public void iniciar() {
		String opcao = mostrarMenu();
		while(!opcao.equals("8")) {
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
				
			case "4":
				System.out.println("Digite o nome da pessoa e do pedido na fila: ");
				String item2 = scanner.nextLine();
			
				fila.add(item2);
				System.out.println(fila);
				opcao = mostrarMenu();
				break;
			case "5":
				System.out.println("Chamar próximo da fila: " + fila.remove());
				System.out.println(fila);
				
				opcao = mostrarMenu();
				break;
			
			case "6":
				System.out.println("Digite a lista de distância para organizar: " );
				String str[] = scanner.nextLine().split(",");
				ArrayList<Integer> distancias = new ArrayList<>();
				for (int i = 0; i < str.length; i++) {
					distancias.add(Integer.valueOf(str[i])); 
				}
				
				while (!distancias.isEmpty()) {
					int indiceMaiorDistancia = 0;
					int maiorDistancia = distancias.get(indiceMaiorDistancia);
					
					for (int i = 1; i < distancias.size(); i++) {
						if (distancias.get(i) > maiorDistancia) {
							maiorDistancia = distancias.get(i);
							indiceMaiorDistancia = i;
						}
	
					}
					stack.add(maiorDistancia);
					distancias.remove(indiceMaiorDistancia);
					
				}
				
				System.out.println(stack);
				
				opcao = mostrarMenu();
				break;
				/*String item3 = scanner.nextLine();
				
				stack.add(item3);
				System.out.println(stack);
				opcao = mostrarMenu();*/
			
			case "7":
				System.out.println("Elemento verificado: " + stack.pop());
				
				//System.out.println(stack);
				 
				opcao = mostrarMenu();
				break;

			case "8":
				fila.clear();
				System.out.println(fila);
				
				stack.clear();
				System.out.println(stack);
				
				lista.clear();
				System.out.println(lista);
				
				opcao = mostrarMenu();
				break;
			default:
				System.out.println("Operação inválida");
				opcao = mostrarMenu();
				
			}
	
		}
		
	}

}






