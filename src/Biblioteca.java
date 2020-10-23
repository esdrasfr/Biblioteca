
public class Biblioteca {
public static void main(String[] args) {
	
	Livro l1, l2;
	
	l1 = new Livro();
	l2 = new Livro();
		
	l1.setTitulo("Teste");
	l1.setAutor("A");
	l1.setAnoPublicacao("2010");
	l1.setaCategoria("Ciencias");
	l1.setPosprateleria("A2");
			
	l1.exibirLivro();

	
 }
}
