package factory;

public class GameProductStore extends Store{
	
	@Override
	public Product createProduct(String productType) {
		Product newProduct = null; 
		if(productType.equals("Game")) {
			newProduct = new GameProduct(); 
		}
		//Here goes more subproducts of the factory
		return newProduct;
	}

}
