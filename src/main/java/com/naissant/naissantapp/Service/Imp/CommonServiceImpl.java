/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas - Naissant 2025
 **/

package com.naissant.naissantapp.Service.Imp;

import com.naissant.naissantapp.Entity.CommonEntity;
import com.naissant.naissantapp.Service.CommonService;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author hmorales
 * @param <T>
 * @param <K>
 * @param <R>
 */
public class CommonServiceImpl<T extends CommonEntity, K, R extends JpaRepository>
        implements CommonService<T, K, R> {

    private final R repository;

    public CommonServiceImpl(R repository) {
        this.repository = repository;
    }

    @Override
    public List<T> listar() {
        return this.repository.findAll();
    }

    @Override
    public Optional<T> listarId(K id) {
        return (Optional<T>) this.repository.findById(id);
    }

    @Override
    public T add(T a) {
        return (T) this.repository.save(a);
    }

    @Override
    public T edit(T a) {
        return (T) this.repository.save(a);
    }

    @Override
    public T delete(K id) {
        Optional<T> object = this.listarId(id);
        if (object != null && object.isPresent()) {
            ((CommonEntity) object.get()).setEstado("I");
            return this.edit(object.get());
        }
        return null;
    }

    @Override
    public R getRepository() {
        return this.repository;
    }

}
