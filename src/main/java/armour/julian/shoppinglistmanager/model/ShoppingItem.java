package armour.julian.shoppinglistmanager.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "shopping_item")
@Data
public class ShoppingItem {

    public ShoppingItem(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "quantity")
    private int quantity;
}
