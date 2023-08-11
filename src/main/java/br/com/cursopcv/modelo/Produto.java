package br.com.cursopcv.modelo;
import javax.persistence.*;

@Table(name = "produtos")
@Entity(name = "produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cod;
	private String nome;
	private String descricao;
	private double preco;

	public Produto(){

	}

	public Produto(String nome, String descricao, double preco) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}
	public void setNome(String nome) {
		this.nome = nome;
		// TODO Auto-generated method stub

	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
		// TODO Auto-generated method stub

	}
	public void setPreco(double preco) {
		this.preco = preco;
		// TODO Auto-generated method stub

	}

	public String getNome() {
		return nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public double getPreco() {
		return preco;
	}

	public Long getCod() {
		return cod;
	}

	public void setCod(Long cod) {
		this.cod = cod;
	}
}