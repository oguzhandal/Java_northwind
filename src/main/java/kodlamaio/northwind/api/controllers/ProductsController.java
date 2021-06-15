package kodlamaio.northwind.api.controllers;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//kodlama.io/api/products url si gelirse o url i burası karşılayacak
@RequestMapping("api/products")
public class ProductsController {


    private ProductService productService;

    @Autowired
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    //veri istediğimiz zaman GetMapping yapılır
    @GetMapping("/getall")
    public List<Product> getAll() {
        return this.productService.getAll();
    }

}
