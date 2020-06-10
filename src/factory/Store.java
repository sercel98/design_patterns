package factory;

public abstract class Store {
	
	
	public Product createOrder(String productType) {
		
		Product product = createProduct(productType); 	
		product.sell(); 
		product.pack(); 
		product.ship(); 
		return product; 
	}
	
	public abstract Product createProduct(String productType); 
	

}
