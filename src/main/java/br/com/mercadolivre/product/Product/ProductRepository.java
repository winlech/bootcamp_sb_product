package br.com.mercadolivre.product.Product;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class ProductRepository implements IProductRepository{

    private final List<Product> products;

    public ProductRepository() {
        this.products = new ArrayList<>();
    }

    @Override
    public Product findById(Long id) {
        Product result =  this.products.stream()
            .filter(product -> product.getId().equals(id))
            .findFirst()
            .orElse(null);
        return result;
    }

    @Override
    public Product save(Product product) {
        this.products.add(product);
        return product;
    }

    @Override
    public List<Product> findAll() {
        return this.products;
    }

    @Override
    public boolean delProduct(Long id) {
        Optional<Product> result =  this.products.stream()
            .filter(product -> product.getId().equals(id))
            .findFirst();
        if (result.isPresent()) {
            this.products.remove(result.get());
            return true;
        } else
            return false;
    }

    @Override
    public Product update(Long id, ProductDTO product) {
        int arrayIndex = -1;
        for (int i = 0; i< this.products.size(); i++) {
            if (this.products.get(i).getId().equals(id)) {
                arrayIndex = i;
            }
        }

        if (arrayIndex >= 0) {
            this.products.get(arrayIndex).setName(product.getName());
            this.products.get(arrayIndex).setDescription(product.getDescription());
            this.products.get(arrayIndex).setValue(product.getValue());
            this.products.get(arrayIndex).setQtd(product.getQtd());

            return this.products.get(arrayIndex);
        } else {
            return null;
        }
    }
}
