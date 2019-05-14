package buss.pedro.service.impl;

import java.util.List;

import buss.pedro.domain.Item;
import buss.pedro.model.ItemModel;

public interface ItemService {

	Item cadastrar(ItemModel model);
	Item alterar(ItemModel model);
	List<ItemModel> mostrarTudo();
	Item remover(Long id);

}
