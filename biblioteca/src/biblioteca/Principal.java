package biblioteca;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Principal {
//fazendo o ultimo teste de git
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	adcadastro livro = new adcadastro();
	ArrayList<Cadastro> adiciona = util.ler();
	int escolha;
	do {
		System.out.print("Digite 1 para adicionar um livro novo" + "\n" + "Digite 2 para visualizar o Estoque de livros"
				+ "\n" + "Digite 3 para editar alguma informação" + "\n" + "Digite 4 para excluir algum dado" + "\n" + "Ou digite 5 para sair" 
				+ "\n" +"-> ");
		
		escolha = sc.nextInt();
		
		System.out.println("----------------------------------------------------------------------------------------------------------");
		if(escolha == 1) {
			livro.setAdc(adiciona);
			System.out.println("----------------------------------------------------------------------------------------------------------");
		}
		else if(escolha == 2) {
			livro.getInf(adiciona);
			System.out.println("----------------------------------------------------------------------------------------------------------");
		}
		else if(escolha == 3) {
			livro.editar(adiciona);
			System.out.println("----------------------------------------------------------------------------------------------------------");
		}
		else if(escolha == 4) {
			livro.remove(adiciona);
			System.out.println("----------------------------------------------------------------------------------------------------------");
		}
		else if(escolha > 5) {
			System.out.println("Digite um numero valido entre 1 e 5");
			System.out.println("----------------------------------------------------------------------------------------------------------");
		}
	
	}while(escolha != 5);
	util.gravar(adiciona);
	System.out.println("Programa finalizado...................... :)");
	}
}

