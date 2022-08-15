package daos;

import java.util.List;

public interface CRUDmethods<T> {

    public T findById(Integer id);
    public List<T> findAll();
    public T update(String make, String model, Integer vin);
    public T create(Integer id, String make, String model, Integer vin);
    public T delete(Integer id);

}

