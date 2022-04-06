package it.devlec.ProdottiSpringTest.config;

import it.devlec.ProdottiSpringTest.model.Prodotto;
import it.devlec.ProdottiSpringTest.persistence.ProdottiRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Configuration
public class PrimoInseirmento {

    private static final Logger logger = LoggerFactory.getLogger(PrimoInseirmento.class);
    @Bean
    CommandLineRunner inserimentroProdotti(ProdottiRepository repository) {
        return args -> {
            SimpleDateFormat data = new SimpleDateFormat("dd-MM-yyyy");

            Date dataAcquisto = data.parse("01-04-2020");
            Date dataScadenza = data.parse("05-06-2025");
            Prodotto p1 = new Prodotto("Pasta Divella",dataAcquisto,dataScadenza,0.50f,100.0f);

            dataAcquisto = data.parse("30-03-2020");
            dataScadenza = data.parse("10-01-2022");
            Prodotto p2 = new Prodotto("Tonno",dataAcquisto,dataScadenza,3.50f,50.0f);

            List<Prodotto> prodotto = new ArrayList<>();
            prodotto.add(p1);
            prodotto.add(p2);
            repository.saveAll(prodotto);
        };
    }


}
