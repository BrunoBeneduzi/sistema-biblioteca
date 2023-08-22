package biblioteca;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class adcadastro {
// fazendo o teste, estou enviando do meu notebook local para o github para atualizar e aparecer essas palavras
Scanner sc = new Scanner(System.in);

	public void setAdc(ArrayList<Cadastro> adiciona) {//adiciona os dados a lista
		boolean teste = false, teste2 = true;
		Cadastro livro = new Cadastro();
		char verifica;
		
		System.out.println("Digite o ID do livro que deseja adicionar -> ");
	
		try {
			livro.setId(sc.nextInt()); 
			for(Cadastro i: adiciona) {
				if(i.getId() == livro.getId()) teste = true ;// verifica se o ID já existe
			}
			if(!teste) {
				sc.nextLine();
	
				System.out.println("Digite o nome do Autor -> ");
				livro.setAutor(sc.nextLine());
	
				System.out.println("Digite o titulo da obra -> ");
				livro.setTitulo(sc.nextLine());
			
				System.out.println("Digite o numero de paginas do livro -> ");
				livro.setPaginas(sc.nextInt());
				sc.nextLine();
	
				System.out.println("Digite o nome da Editora do livro -> ");
				livro.setEditora(sc.nextLine());
	
				System.out.println("Digite a edição da obra -> ");
				livro.setEdicao(sc.nextInt());
				
				do {
					System.out.println("Digite o Genero da Obra, (D)rama, (A)ventura, (F)icção ou (O)utro ");
					verifica = sc.next().charAt(0);
					
					if(verifica == 'D' || verifica == 'A' || verifica == 'F' || verifica == 'O' || verifica == 'd' || verifica == 'a' || verifica == 'f' || verifica == 'o') {
						livro.setGenero(verifica);
						teste2 = false;
					}
					else System.out.println("Colocar um valor valido");
				}while(teste2);
				
				System.out.println("Digite o ano que foi lançada -> ");
				livro.setAno(sc.nextInt());
	
				System.out.println("Digite o valor da obra -> ");
				livro.setValor(sc.nextFloat());
	
				adiciona.add(livro);
			}
			else System.out.println("ID já existe!!!!!!");
		}catch(InputMismatchException e) {//se for digitado algo errado o programa vai começar de novo mas sem perder os dados anteriores
			sc.nextLine();
			System.out.println("Erro de digitação detectado, começe novamente e cuidado com o que digita!!");
		}
	}
	


	public void getInf(ArrayList<Cadastro> adiciona){//retorna todos os dados
		for(Cadastro i: adiciona) {
			System.out.println(i);
		}
	}
	
	public void remove(ArrayList<Cadastro> adiciona) {//deleta um valor pelo id
		int cont = 0;
		int id = 0;
		boolean existe = false;
		System.out.print("Digite o ID que deseja remover -> ");
		id = sc.nextInt();
	
		for(Cadastro i: adiciona) {
			if(i.getId() == id) {
				existe = true;
				break;
			}
			cont++;		
		}
		
		if(existe) adiciona.remove(cont);
		else System.out.println("o ID informado não existe");
	}
	
	public void editar(ArrayList<Cadastro> adiciona) {// edita alguma informação
		char verifica;
		int escolha = 0, id = 0, cont = 0;
		boolean teste = false, teste2 = true;
		
		
		System.out.print("Digite o ID que deseja alterar -> ");
		id = sc.nextInt();
		sc.nextLine();
		
		for(Cadastro i: adiciona) {//verifica se o ID está na lista
			if(i.getId() == id) {
				teste = true;
				break;
			}
			cont++;
		}
		
		if(teste) {
			System.out.print("Digite o que deseja editar" + "\n" + "1- Titulo" + "\n" + "2- Autor" + "\n" + "3- Genero" + "\n" +
						  "4- Paginas" + "\n" + "5- Editora" + "\n" + "6- Ano" + "\n" + "7- Edição" + "\n" + "8- Valor" + "\n" + "->");
	
			escolha = sc.nextInt();
			sc.nextLine();
			
			if(escolha == 1) {
				System.out.print("Digite o novo nome do titulo -> "); 
				adiciona.get(cont).setAutor(sc.nextLine());		
			}
			else if(escolha == 2) {
				System.out.print("Digite o novo nome do autor -> ");
				adiciona.get(cont).setAutor(sc.nextLine());
			}
			else if(escolha == 3) {
				do {
					System.out.print("Digite o novo Genero da obra -> ");
					verifica = sc.next().charAt(0);
						
						if(verifica == 'D' || verifica == 'A' || verifica == 'F' || verifica == 'O' || verifica == 'd' || verifica == 'a' || verifica == 'f' || verifica == 'o') {
							adiciona.get(cont).setGenero(verifica);
							teste2 = false;
						}
						else System.out.println("Colocar um valor valido");
				}while(teste2);
			}
			else if(escolha == 4) {
				System.out.print("Digite o novo numero de paginas da obra -> ");
				adiciona.get(cont).setPaginas(sc.nextInt());
			
			}
			else if(escolha == 5) {
				System.out.print("Digite o novo nome da editora -> ");
				adiciona.get(cont).setEditora(sc.nextLine());
			}
			else if(escolha == 6) {
				System.out.print("Digite o novo ano de lançamento da obra -> ");
				adiciona.get(cont).setAno(sc.nextInt());
			}
			else if(escolha == 7) {
				System.out.print("Digite a nova edição da obra -> ");
				adiciona.get(cont).setEdicao(sc.nextInt());
			}
			else if(escolha == 8) {
				System.out.print("Digite um novo valor para o livro -> ");
				adiciona.get(cont).setValor(sc.nextFloat());
			}
			else System.out.println("Digite um numero valido");
		}
		else System.out.println("ID não encontrado....");
	}
}	