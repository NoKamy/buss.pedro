package buss.pedro.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import buss.pedro.domain.Item;
import buss.pedro.model.ItemModel;
import buss.pedro.service.impl.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {

	@Autowired
    private ItemService itemService;
    
    @PostMapping("/cadastrar")
    public ItemModel cadastrar(@RequestBody ItemModel model) {
        return new ItemModel(itemService.cadastrar(model));
    }
    
    @PutMapping("/alterar")
    public ItemModel alterar(@RequestBody ItemModel model) {
        return new ItemModel(itemService.alterar(model));
    }
    
    @GetMapping("/mostrar-tudo")
    public List<Item> mostrarTudo() {
        return itemService.mostrarTudo().stream().map(Item::new).collect(Collectors.toList());
    }
    
    @DeleteMapping("/remover")
    public ItemModel remover(@RequestParam Long id) {
        return new ItemModel(itemService.remover(id));
    }
}
