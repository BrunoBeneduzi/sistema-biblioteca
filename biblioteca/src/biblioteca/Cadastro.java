package biblioteca;
import java.io.Serializable;
//teste parte 2, teste parte 3 as 13:45
public class Cadastro implements Serializable{
private int id, paginas, ano, edicao;
private String titulo, autor, editora;
private char genero;
private float valor;


public int getId() {
	return id;  
}
public void setId(int id) {
	this.id = id;
}
public int getPaginas() {
	return paginas;
}
public void setPaginas(int paginas) {
	this.paginas = paginas;
}
public int getAno() {
	return ano;
}
public void setAno(int ano) {
	this.ano = ano;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public String getEditora() {
	return editora;
}
public void setEditora(String editora) {
	this.editora = editora;
}
public char getGenero() {
	return genero;
}
public void setGenero(char genero) {
	this.genero = genero;
}
public float getValor() {
	return valor;
}
public void setValor(float valor) {
	this.valor = valor;
}
public int getEdicao() {
	return edicao;
}
public void setEdicao(int edicao) {
	this.edicao = edicao;
}

@Override
public String toString() {
	return "ID -> "+this.id+"| Autor -> "+this.autor+"| Titulo -> "+this.titulo+"| Genero -> "+this.genero+"| Editora -> " 
   +this.editora+"| Paginas -> "+this.paginas+ "| Ano de lançamento -> "+this.ano+"| Valor -> "+this.valor+"R$ | Edição -> "+this.edicao;
}

}
