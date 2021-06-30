package br.com.mercadolivre.product.Product;

public class Product {

    private static Long idCounter = 0L;
    private Long id;
    private String name;
    private String description;
    private double value;
    private int qtd;

    public Product(String name, String description, double value, int qtd) {
        idCounter += 1L;
        this.id = idCounter;
        this.name = name;
        this.description = description;
        this.value = value;
        this.qtd = qtd;
    }

    public Long getId() {
        return id;
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
