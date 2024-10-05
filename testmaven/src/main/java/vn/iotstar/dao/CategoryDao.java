package vn.iotstar.dao;

import java.util.List;

import vn.iotstar.models.Category;

public interface CategoryDao {
	List<Category> findall();
	Category findbyid(int id);
	void insert(Category category);
	void update(Category category);
	void delete(int id);
	List<Category>findname(String keyword);
}
