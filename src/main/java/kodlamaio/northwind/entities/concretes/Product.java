package kodlamaio.northwind.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int id;

    // @Column(name = "category_id")
    // private int categoryId;
    //Aşağıda @JoinColumn ile ilişkilendirdiğimiz için burada bu bilgiyi tutmaya gerek yok.
    //Category tablosundaki categoryId yi ilişkilendirerek Product tablosundaki categoryId verilerini tutarız

    @Column(name = "product_name")
    private String productName;

    @Column(name = "unit_price")
    private double unitPrice;

    @Column(name = "units_in_stock")
    private short unitsInStock;

    @Column(name = "quantity_per_unit")
    private String quantityPerUnit;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
