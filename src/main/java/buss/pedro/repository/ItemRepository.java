package buss.pedro.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import buss.pedro.domain.Item;

public class ItemRepository {
	@Repository
	public interface ProdutoRepository extends JpaRepository<Item, Long> {
	}
}
