package ca.owenpeterson;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import ca.owenpeterson.business.ProductServiceImpl;
import ca.owenpeterson.model.Product;

@WebService(endpointInterface="ca.owenpeterson.ProductCatalogInterface")
public class ProductCatalog implements ProductCatalogInterface {
	
	ProductServiceImpl productService = new ProductServiceImpl();

	/* (non-Javadoc)
	 * @see ca.owenpeterson.ProductCatalogInterface#getProductCategories()
	 */
	@Override
	public List<String> getProductCategories() {		
		return productService.getProductCategories();
	}
	
	/* (non-Javadoc)
	 * @see ca.owenpeterson.ProductCatalogInterface#getProducts(java.lang.String)
	 */
	@Override
	public List<String> getProducts(String category) {
		return productService.getProducts(category);
	}
	
	/* (non-Javadoc)
	 * @see ca.owenpeterson.ProductCatalogInterface#addProduct(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean addProduct(String category, String product) {
		return productService.addProduct(category, product);
	}
	
	/* (non-Javadoc)
	 * @see ca.owenpeterson.ProductCatalogInterface#getProductsv2(java.lang.String)
	 */
	@Override
	public List<Product> getProductsv2(String category) {
		return productService.getProductsv2(category);
	}
	
}
