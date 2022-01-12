package br.com.casadocodigo.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.casadocodigo.models.Livro;

// CDI

// A anotação @Named indica que o CDI passa a gerenciar a comunicação entre a classe e a tela do navegador.
// por padrão o nome da classe no CDI é o nome completo com a primeira letra minúscula
// podemos alterar este valor default informando o parâmetro value na classe

@Named(value="adminLivrosBean")
@RequestScoped
public class AdminLivrosBean {

	private Livro livro = new Livro();

	public void salvar() {
		System.out.println("Livro cadastrado: " + livro);
		System.out.println("Livro salvo com sucesso!");
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

}
