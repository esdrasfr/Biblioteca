public class Livro {
	
	private String 	Livro;
	private String 	titulo;
	private String 	autor;
	private int    	anoPublicacao;
	private String 	categoria;
	private int    	posPrateleira;
	private boolean emprestado;
	
	public void exibirLivro() {
		System.out.println(titulo);
		System.out.println(autor);
		System.out.println(anoPublicacao);
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
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getPosPrateleira() {
		return posPrateleira;
	}
	public void setPosPrateleira(int posPrateleira) {
		this.posPrateleira = posPrateleira;
	}
	public boolean isEmprestado() {
		return emprestado;
	}
	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}

	
		
}
