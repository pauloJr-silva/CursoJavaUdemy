package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;




public class Listas {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Paulo");
		list.add("Carol");
		list.add("Rafa");
		list.add("Alice");
		list.add("Melissa");
		list.add("Livia");
		list.add("Lucas");
		list.add("Leticia");

		list.add(3, "Luiz");

		for (String obj : list) {
			System.out.println(obj);
		}

		System.out.println("------------------------");

		System.out.println("Remover quem começa com R");
		// list.remove("Luiz");
		list.removeIf(x -> x.charAt(0) == 'R'); // funcão Lambda *** removendo a partir do predicado. lê-se ( remover
												// todo String x , tal que x.charAt 0 seja igual a R. começa com R
		
		System.out.println("------------------------");
		System.out.println("Remover quem começa com A");
		list.removeIf(x -> x.charAt(0) == 'A');
			
		for (String obj : list) {
			System.out.println(obj);
		}

		System.out.println("------------------------");
		// encontrar a posição de um elemento

		System.out.println("Index of Melissa: " + list.indexOf("Melissa"));
		// quando o indexOf não encontrar o elemento: resultado é -1

		System.out.println("------------------------");

	
		// para filtrar uma lista
		// tenho que declara uma nova lista - converter a lista original em stream para
		// chmar a função filter
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'L').findFirst().orElse(null); // ->  o findFirst - encontra o primeiro elemento da stream 
																							//... que atendo o predicado filtrado (nome que começa com a letra 'L')
																							//se o elemento não existir ele vai retornar null ( orElse(null));
		
		
		System.out.println(name);
		
	}
	

}
