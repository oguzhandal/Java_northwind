package kodlamaio.northwind.dataAccess.abstracts;

import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository= verdiğin veri için Entity anotasyonu ile süslenmiş(Product) ve priamaryKey alanını ver
public interface ProductDao extends JpaRepository<Product, Integer> {


}
