package buss.pedro.model;

import buss.pedro.domain.Item;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class ItemModel {
	    
	    private Long id;
	    private String nome;
	    private Double valor;
	    private Integer quantidade;
	   	    
	    public ItemModel(Item domain) {
	        this.quantidade = domain.getQuantidade();
	        this.nome = domain.getNome();
	        this.valor = domain.getValor();
	    }
}
