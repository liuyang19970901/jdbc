package com.ServiceImpl;

import com.dao.ProductDao;
import com.entity.Product;
import com.service.ProductService;

import java.util.List;

public abstract class ProductServiceImpl<Autowired> implements ProductService {

    private ProductDao productDao;

    @Override
    public Product updateProduct(Product product) {
        return ProductDao.updatelist(product);
    }

    @Override
    public void deleteProduct(Product theClass) {
        ProductDao.deleteList();

    }

    @Override
    public List<Product> findAll() {
        return ProductDao.findAll();
    }

    @Override
    public Product findByIDbyJPA(int id) {
        return ProductDao.getOne(id);
    }
}


