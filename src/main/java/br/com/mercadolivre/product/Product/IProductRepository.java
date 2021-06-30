package br.com.mercadolivre.product.Product;

import java.util.List;

public interface IProductRepository {

    Product findById(Long id);
    Product save(Product product);

    List<Product> findAll();

    boolean delProduct(Long id);

    Product update(Long id, ProductDTO product);
}
