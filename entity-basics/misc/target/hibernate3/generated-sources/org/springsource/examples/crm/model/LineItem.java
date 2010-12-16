package org.springsource.examples.crm.model;
// Generated Dec 16, 2010 1:06:09 PM by Hibernate Tools 3.2.0.CR1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * LineItem generated by hbm2java
 */
@Entity
@Table(name="line_item"
    ,schema="public"
)
public class LineItem  implements java.io.Serializable {


     private long id;
     private Purchase purchase;
     private Product product;

    public LineItem() {
    }

    public LineItem(long id, Purchase purchase, Product product) {
       this.id = id;
       this.purchase = purchase;
       this.product = product;
    }
   
     @Id 
    
    @Column(name="id", unique=true, nullable=false)
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="purchase_id", nullable=false)
    public Purchase getPurchase() {
        return this.purchase;
    }
    
    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="product_id", nullable=false)
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }




}


