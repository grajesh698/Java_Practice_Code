package com.project.example.RestAPI;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String name;

	// Constructor, Getter, Setter, ToString
}
