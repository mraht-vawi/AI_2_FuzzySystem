package application.product;

public class StoredProduct {
    private Product product;

    public Product getProduct() {
	return product;
    }

    public void setProduct(Product product) {
	this.product = product;
    }

    private int amount;

    public int getAmount() {
	return amount;
    }

    public void setAmount(int amount) {
	this.amount = amount;
    }

    public double getPrice() {
	return (product.getPrice() * amount);
    }

    public StoredProduct(Product product, int amount) {
	this.product = product;
	this.amount = amount;
    }
}