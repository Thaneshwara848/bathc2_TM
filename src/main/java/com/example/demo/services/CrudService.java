package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repo.CrudRepo;

@Service
public class CrudService {
	
	@Autowired
	private  CrudRepo repo;
	
	public List<Product> fetchProductList(){
		
		return repo.findAll();
	
	}
    public Optional<Product> fetchProductListById(int id){
		
		return repo.findById(id);
	
	}
	
	public Product  saveProductToBD(Product product)
	{
		return repo.save(product);
		
	}
	
	 public String  deleteProductListById(int id){
			String result;
			 try {
				repo.deleteById(id);
				result="Deleted ";
			} catch (Exception e) {
				// TODO Auto-generated catch block
				result="Not Deleted";
			}
		
			 return result;
		}
	
}
