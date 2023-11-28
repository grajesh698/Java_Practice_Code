package com.project.example.RestAPI;

import java.util.Optional;

@Service
public class ProductService{
	
//Save new Product
	public ResponseEntity<Product> saveProduct(@RequestBody Product product) 
	{ 
	    Product newProduct = productRepository.save(product); 
	    return ResponseEntity.ok(newProduct); 
	}

// Get a product by ID 
	@Autowired
	private final ProductRepository productRepository;
	//Constructor
	public ResponseEntity<Optional<Product>> getProductById(Long id){
		Optional<Product> p = productRepository.findById(id);
		if(p.isPresent())
			ResponseEntity.ok(product);
		else
			ResponseEntity.notFound().build();
	}
	
// Get all products 
	public ResponseEntity<List<Product> > fetchAllProducts() 
	{ 
	    return ResponseEntity.ok(productRepository.findAll()); 
	}
	
//Update product
	public ResponseEntity<Product> updateProduct(Long id, Product updatedProduct) 
	{ 
	    if (id == null) { 
	        throw new IllegalArgumentException( 
	            "ID cannot be null"); 
	    } 
	    Product Existingproduct 
	        = productRepository.findById(id).orElseThrow(()-> new EntityNotFoundException(String.valueOf(id))); 
	    Existingproduct.setName(updatedProduct.getName()); 
	    Existingproduct.setPrice(updatedProduct.getPrice()); 
	    Existingproduct.setQuantity(updatedProduct.getQuantity()); 
	    Product savedEntity= productRepository.save(Existingproduct); 
	    return ResponseEntity.ok(savedEntity); 
	}
	
//Delete product	
	public ResponseEntity<String> deleteProduct(Long id) 
	{ 
	    productRepository.deleteById(id); 
	    return ResponseEntity.ok("Product Deleted Successfully"); 
	}
}