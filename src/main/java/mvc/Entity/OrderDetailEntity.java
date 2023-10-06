package mvc.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "orderDetails")

public class OrderDetailEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int id;
  @Column(name = "quantity")
  private double quantity;
  @ManyToOne
  @JoinColumn(name = "orderId")
  private OrderEntity orders;
  @ManyToOne
  @JoinColumn(name = "proId")
  private ProductEntity products;

  public OrderDetailEntity() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public double getQuantity() {
    return quantity;
  }

  public void setQuantity(double quantity) {
    this.quantity = quantity;
  }

  public OrderEntity getOrders() {
    return orders;
  }

  public void setOrders(OrderEntity orders) {
    this.orders = orders;
  }

  public ProductEntity getProducts() {
    return products;
  }

  public void setProducts(ProductEntity products) {
    this.products = products;
  }
}
