package vn.iotstar.service;

import java.util.List;

import vn.iotstar.dao.CategoryDao;
import vn.iotstar.dao.CategoryDaoImpl;
import vn.iotstar.models.Category;

public class CategoryServiceImpl implements CategoryService{
	public CategoryDao cateDao=new CategoryDaoImpl();
	@Override
	public List<Category> findall() {
		return cateDao.findall();
	}

	@Override
	public Category findbyid(int id) {
		return cateDao.findbyid(id);
	}

	@Override
	public void insert(Category category) {
		cateDao.insert(category);
		
	}

	@Override
	public void update(Category category) {
		Category cate=new Category();
		cate=cateDao.findbyid(category.getCategoryid());
		if(cate!=null)
		{
			cateDao.update(category);
		}
		cateDao.update(category);
	}

	@Override
	public void delete(int id) {
		Category cate=new Category();
		cate=cateDao.findbyid(id);
		if(cate!=null)
		{
			cateDao.delete(id);
		}
	}

	@Override
	public List<Category> findname(String keyword) {
		return cateDao.findname(keyword);
	}

}
