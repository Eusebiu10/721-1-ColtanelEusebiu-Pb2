package Controller;

import Model.Product;

import java.util.List;

public interface PCInterface {

    /**
     * Adds an Product
     * @param id Integer
     * @param name String
     * @param Price Integer
     * @return Product
     */
    Product addProduct(Integer id, String name, Integer Price);

    /**
     * Deletes an Product
     * @param id Integer
     */
    void deleteProduct(Integer id);

    /**
     * Updates an Product
     * @param id Integer
     * @param name String
     * @param Price Integer
     */
    void updateActor(Integer id, String name, Integer Price);

    /**
     * Get all Products
     */
    List<Product> getAll();

    /**
     * Finds an Product by a specified id
     * @param id Integer
     * @return Product
     */
    Product findById(Integer id);
}
