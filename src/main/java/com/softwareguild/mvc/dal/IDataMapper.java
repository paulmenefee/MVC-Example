package com.softwareguild.mvc.dal;

import com.softwareguild.mvc.model.Product;

public interface IDataMapper {

    public Product Product = null;
    public void Create();
    public void Read();
    public void Update();
    public void Delete();
}
