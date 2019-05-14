package buss.pedro.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import buss.pedro.domain.Item;
import buss.pedro.model.ItemModel;

@Transactional
@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemService itemService;
	
	@Override
	public Item cadastrar(ItemModel model) {
		return itemService.cadastrar(model);
	}

	@Override
	public Item alterar(ItemModel model) {
		return itemService.alterar(model);
	}

	@Override
	public List<ItemModel> mostrarTudo() {
		return itemService.mostrarTudo();
	}

	@Override
	public Item remover(Long id) {
		return itemService.remover(id);
	}

}
