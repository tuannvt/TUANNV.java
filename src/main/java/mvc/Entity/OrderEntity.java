package mvc.Entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "orders")
public class OrderEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int id;
  @Column(name = "orderDate")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private LocalDate orderDate;
  @Column(name = "customerName")
  private String customerName;
  @OneToMany(mappedBy = "orders",fetch = FetchType.EAGER)
  private List<OrderDetailEntity> orderDetailEntityList=new ArrayList<>();

  public OrderEntity() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public LocalDate getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(LocalDate orderDate) {
    this.orderDate = orderDate;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public List<OrderDetailEntity> getOrderDetailEntityList() {
    return orderDetailEntityList;
  }

  public void setOrderDetailEntityList(List<OrderDetailEntity> orderDetailEntityList) {
    this.orderDetailEntityList = orderDetailEntityList;
  }
}
