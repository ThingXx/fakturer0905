package eu.programisci.Test.user.repository;

import eu.programisci.Test.user.ob.KontrahentOB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by student on 09.05.17.
 */
@Repository
public interface IKontrahentRepository extends JpaRepository<KontrahentOB,Long> {

}
