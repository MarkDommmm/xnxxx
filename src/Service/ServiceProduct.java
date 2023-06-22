package Service;

import Database.Data;
import Model.Product;

import java.util.ArrayList;
import java.util.List;

public class ServiceProduct extends Data implements IService<Product, Integer> {



    @Override
    public List<Product> getAll() {
        return null;
    }

    @Override
    public void save(Product entity) {

    }


    @Override
    public Product update(Product product) {
        return null;
    }

    @Override
    public void deleteById(Product id) {

    }


    @Override
    public Product findById(Product product) {
        return null;
    }

    @Override
    public Integer newId(Product id) {
        int max = 0;
        for (Product product : Data.product) {
            if (product != null && product.getId() > max) {
                max = product.getId();
            }
        }
        return max + 1;
    }
}
