package buss.pedro.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import buss.pedro.model.ItemModel;
import lombok.Getter;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Getter

@Entity
@Table(name = "Itens")
public class Item {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotNull
    @Column(name="nome", length = 128)
	private String nome;
	
	@NotNull
    @Column(name="quantidade")
	private Integer quantidade;

	@NotNull
    @Column(name="valor")
	private Double valor;
	
	public Item(ItemModel model) {
        this.quantidade = model.getQuantidade();
        this.nome = model.getNome();
        this.valor = model.getValor();
    }
	
	public void addItem(Integer qtd) {
        this.quantidade += qtd;
    }

public void removerItem(Integer qtd) {
        
        if (this.quantidade >= qtd) {
            this.quantidade -= qtd;
        } else {
            throw new RuntimeException("Erro ao trocar item de lugar");
        }
    }
}
