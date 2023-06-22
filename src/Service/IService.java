package Service;

import Model.Product;

import java.util.List;

public interface IService<E, S> {
    List<E> getAll();

    void save(E entity);


    E update(E e);

    void deleteById(E id);


    E findById(E e);

    S newId(E id);


}
