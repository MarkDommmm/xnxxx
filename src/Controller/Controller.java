package Controller;

import Model.Product;
import Service.IService;

import java.util.ArrayList;
import java.util.List;

public class Controller implements IService {
    List<Product> products = new ArrayList<>();

    @Override
    public List getAll() {
        return products;
    }

    @Override
    public void save(Object entity) {

    }


    @Override
    public Object update(Object o) {
        return null;
    }

    @Override
    public void deleteById(Object id) {

    }


    @Override
    public Object findById(Object o) {
        return null;
    }
}
