package com.softwareguild.mvc.dal;

import com.softwareguild.mvc.model.Product;

import java.util.List;

public interface IDataMapper {

    public Product Product = null;
    public void Create();
    public List<Object> Read(Object dataObject);
    public void Update();
    public void Delete();
}
