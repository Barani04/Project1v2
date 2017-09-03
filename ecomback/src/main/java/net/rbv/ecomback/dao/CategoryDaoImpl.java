package net.rbv.ecomback.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.rbv.ecomback.model.Category;

@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao {

	private static List<Category> categories = new ArrayList<>();
	
	static{
		Category category = new Category();
		category.setCatId(1);
		category.setCatName("Toys");
		category.setCatDescription("Toy Type of Gagets...");
		category.setCatImgUrl("CAT_1.png");
		
		categories.add(category);
		
		category = new Category();
		category.setCatId(2);
		category.setCatName("Utility");
		category.setCatDescription("Utility Type of Gagets...");
		category.setCatImgUrl("CAT_2.png");
		
		categories.add(category);
		
		category = new Category();
		category.setCatId(3);
		category.setCatName("Spy");
		category.setCatDescription("Spying Gagets...");
		category.setCatImgUrl("CAT_3.png");
	
		categories.add(category);
	
	}
	
	@Override
	public List<Category> list() {
		
		return categories;
	}

	@Override
	public Category getById(int id) {
		
		//Enhanced for loop for getting single category
		for(Category category : categories){
			if(category.getCatId() == id)
				return category;
		}
		return null;
	}

}
