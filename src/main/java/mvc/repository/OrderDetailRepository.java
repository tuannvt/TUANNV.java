package mvc.repository;

import java.time.LocalDate;
import java.util.List;
import mvc.Entity.OrderDetailEntity;
import mvc.Entity.ProductEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface OrderDetailRepository extends CrudRepository<OrderDetailEntity,Integer> {
  @Query(value = "SELECT * " +
      "FROM orderDetails  " +
      "where orderId like %?1%"
      ,nativeQuery = true)
  List<OrderDetailEntity> findByView(int id);
}
