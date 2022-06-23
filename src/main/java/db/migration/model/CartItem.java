package db.migration.model;

import javax.persistence.*;

@Entity
@Table(name = "cart_items")
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    @ManyToOne
    @JoinColumn(name = "cart_id", table = "carts")
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "product_id", table = "products")
    private Product product;

    @Column(name="quantity", nullable = false)
    private long quantity;
}
