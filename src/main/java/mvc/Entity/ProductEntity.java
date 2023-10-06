package mvc.Entity;

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

@Entity
@Table(name = "products")

public class ProductEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int id;
  @Column(name = "prName")
  private String prName;
  @Column(name = "unitPrice")
  private double unitPrice;
  @OneToMany(mappedBy = "products",fetch = FetchType.EAGER)
  private List<OrderDetailEntity> orderDetailEntityList=new ArrayList<>();

  public ProductEntity() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getPrName() {
    return prName;
  }

  public void setPrName(String prName) {
    this.prName = prName;
  }

  public double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(double unitPrice) {
    this.unitPrice = unitPrice;
  }

  public List<OrderDetailEntity> getOrderDetailEntityList() {
    return orderDetailEntityList;
  }

  public void setOrderDetailEntityList(List<OrderDetailEntity> orderDetailEntityList) {
    this.orderDetailEntityList = orderDetailEntityList;
  }
}
