package it.devlec.ProdottiSpringTest.persistence;

import it.devlec.ProdottiSpringTest.model.Prodotto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ProdottiRepository extends JpaRepository<Prodotto, Long> {

    List<Prodotto> findBynome(String nome);
    //List<Prodotto> findByPrezzoBetween(float min,float max);
    //List<Prodotto> findBydataBetween(Date datada,Date dataa);
}
