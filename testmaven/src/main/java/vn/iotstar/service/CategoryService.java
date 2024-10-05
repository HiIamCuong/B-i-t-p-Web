package vn.iotstar.service;

import java.util.List;

import vn.iotstar.models.Category;

public interface CategoryService {
	List<Category> findall();
	Category findbyid(int id);
	void insert(Category category);
	void update(Category category);
	void delete(int id);
	List<Category>findname(String keyword);
}
