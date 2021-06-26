package kodlamaio.northwind.api.controllers;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utulities.results.DataResult;
import kodlamaio.northwind.core.utulities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductsController {


    private ProductService productService;

    @Autowired
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    //veri istediğimiz zaman GetMapping yapılır
    @GetMapping("/getall")
    public DataResult<List<Product>> getAll() {

        return this.productService.getAll();
    }

    @PostMapping("/add")
    //@RequestBody product nesnesinin alanlarını gönderir.
    public Result add(@RequestBody Product product) {
        return this.productService.add(product);
    }

}
