package mvc.repository;

import java.time.LocalDate;
import java.util.List;
import mvc.Entity.OrderDetailEntity;
import mvc.Entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductEntity,Integer> {

}
