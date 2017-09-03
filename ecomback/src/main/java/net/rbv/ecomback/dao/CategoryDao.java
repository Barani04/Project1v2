package net.rbv.ecomback.dao;

import java.util.List;

import net.rbv.ecomback.model.Category;

public interface CategoryDao {

	List<Category> list();

	Category getById(int id);
}
