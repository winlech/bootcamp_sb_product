package br.com.mercadolivre.product.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getProduct(Long id) {
        return productRepository.findById(id);
    }

    public Product addProduct(ProductDTO product) {
        Product convertedProduct = product.convert();
        return productRepository.save(convertedProduct);
    }

    public List<Product> getProductAll() {
        return productRepository.findAll();
    }

    public boolean delProduct(Long id) {
        return productRepository.delProduct(id);
    }

    public Product updateProduct(Long id, ProductDTO fromDTO) {
        return productRepository.update(id, fromDTO);
    }
}
