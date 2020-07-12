package com.service;

import com.entity.Product;

import java.util.List;

public interface ProductService {
    //修改
  Product editProduct(Product product);
    //更新
    Product updateProduct( Product product);
    //删除
    void deleteProduct( Product  product);
    //查询所有
    List<Product> findAll();
    //根据主键查询
    Product findByIDbyJPA(int id);
}


