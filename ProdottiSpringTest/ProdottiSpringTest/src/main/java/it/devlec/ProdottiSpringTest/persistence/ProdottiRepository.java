package it.devlec.ProdottiSpringTest.persistence;

import it.devlec.ProdottiSpringTest.model.Prodotto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ProdottiRepository extends JpaRepository<Prodotto, Long> {

    List<Prodotto> findByNome(String nome);
    List<Prodotto> findBydataacquisto(Date data);
    List<Prodotto> findByprezzoBetween(float min,float max);
    List<Prodotto> findAllByquantita(float quantita);
    List<Prodotto> findByquantitaLessThan(float max);
    List<Prodotto> findByOrderByQuantita();
}
