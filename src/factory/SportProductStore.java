package factory;

public class SportProductStore extends Store{

	@Override
	public Product createProduct(String productType) {
		
		Product newProduct = null; 
		if(productType.equals("Sport")) {
			newProduct = new SportProduct(); 
		} 
		//Here goes more subproducts of the factory
		return newProduct;
	}
}
