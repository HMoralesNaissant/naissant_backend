/**
 * Desarrollo por: Ing. Harry Morales
 * Dpto. Sistemas UniMetro - 2021
 **/
package com.naissant.naissantapp.Service;

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
public interface CommonService<T, K, R extends JpaRepository> {

    List<T> listar();

    Optional<T> listarId(K id);

    T add(T a);

    T edit(T a);

    T delete(K id);
    
    R getRepository();

}
