package com.developers.rest.Repository;
import com.developers.rest.Model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Esta clase nos ayuda a realizar operaciones en nuestra base de datos sin escribir tantas líneas de código,
 * Spring Data realiza esto por nosotros, operaciones como delete, save, findAll, son algunos de los métodos
 * que realiza automáticamente.
 */

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{

    List<Account> findByName(@Param("id") Long id);

}
