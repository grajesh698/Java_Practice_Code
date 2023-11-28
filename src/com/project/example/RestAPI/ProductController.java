package com.project.example.RestAPI;

@RestController
@RequestMapping("/api/v1")
public class ProductController{
	
	@Autowired
	private final ProductService productService;
	
// Get a product by ID 
	@GetMapping("/getProductById/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable Long id)
	{
		Product product = productService.getProductById(id);
			return ResponeEntity.ok(product);
	}

// Get all products 
	@GetMapping("/products")  
	public List<Product> getAllProducts() 
	{ 
	    return productService.getAllProducts(); 
	}
	
// Create a new product 
	@PostMapping("/product") 
	public ResponseEntity<Product> saveProduct(@RequestBody Product product) 
	{ 
	    Product newProduct = productRepository.save(product); 
	    return ResponseEntity.ok(newProduct); 
	}
	
// Update a product 
	@PutMapping(path = "/products/{productId}") 
	public ResponseEntity<Product> updateProduct(@PathVariable(value = "productId") Long productId, @RequestBody Product product) 
	{ 
	    return productService.updateProduct(productId, product); 
	}
	
//Delete product	
	@DeleteMapping(value = "/products/{productId}") 
	public String deleteProduct(@PathVariable Long productId) 
	{ 
	    productService.deleteProduct(productId); 
	    return "Product Deleted Successfully against id " + productId + " "; 
	}
}