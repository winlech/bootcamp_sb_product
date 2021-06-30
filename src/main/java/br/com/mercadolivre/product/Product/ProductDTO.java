package br.com.mercadolivre.product.Product;

public class ProductDTO {

    private String name;
    private String description;
    private double value;
    private int qtd;

    public ProductDTO(String name, String description, double value, int qtd) {
        this.name = name;
        this.description = description;
        this.value = value;
        this.qtd = qtd;
    }

    public Product convert() {
        return new Product(this.name, this.description, this.value, this.qtd);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}
