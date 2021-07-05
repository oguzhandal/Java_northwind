package kodlamaio.northwind.api.controllers;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utulities.results.DataResult;
import kodlamaio.northwind.core.utulities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/products/")
public class ProductsController {


    private ProductService productService;


    @Autowired
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    //veri istediğimiz zaman GetMapping yapılır
    @GetMapping("getall")
    public DataResult<List<Product>> getAll() {

        return this.productService.getAll();
    }

    @GetMapping("getAllByPage")
    public DataResult<List<Product>> getAll(int pageNo, int pageSize) {

        return this.productService.getAll(pageNo, pageSize);
    }

    @GetMapping("getAllDesc")
    public DataResult<List<Product>> getAllSorted() {
        return this.productService.getAllSorted();
    }

    @PostMapping("add")
    //@RequestBody product nesnesinin alanlarını gönderir.
    public Result add(@RequestBody Product product) {
        return this.productService.add(product);
    }

    @GetMapping("getByProductName")
    public DataResult<Product> getByProductName(@RequestParam String productName) {
        return this.productService.getByProductName(productName);
    }

    @GetMapping("getByProductNameAndCategoryId")
    public DataResult<Product> getByProductNameAndCategoryId(@RequestParam("productName") String productName, @RequestParam("categoryId") int categorId) {
        return this.productService.getByProductNameAndCategoryId(productName, categorId);
    }

    @GetMapping("getByProductNameOrCategoryId")
    public DataResult<List<Product>> getByProductNameOrCategoryId(@RequestParam("productName") String productName, @RequestParam("categorId") int categorId) {
        return this.productService.getByProductNameOrCategoryId(productName, categorId);
    }

    @GetMapping("getByCategoryIdIn")
    public DataResult<List<Product>> getByCategoryIdIn(@RequestParam ArrayList<Integer> categories) {
        return this.productService.getByCategoryIdIn(categories);
    }

    @GetMapping("getByProductNameContains")
    public DataResult<List<Product>> getByProductNameContains(@RequestParam String productName) {
        return this.productService.getByProductNameContains(productName);
    }

    @GetMapping("getByProductNameStartingWith")
    public DataResult<List<Product>> getByProductNameStartingWith(@RequestParam String productName) {
        return this.productService.getByProductNameStartingWith(productName);
    }

    @GetMapping("getByNameAndCategory")
    public DataResult<List<Product>> getByNameAndCategory(@RequestParam("productName") String productName, @RequestParam("categoryId") int categoryId) {
        return this.productService.getByNameAndCategory(productName, categoryId);
    }


}
