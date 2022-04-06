package it.devlec.ProdottiSpringTest.avviso;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class ProdottoNonTrovatoRisposta {

    @ResponseBody
    @ExceptionHandler(ProdottoNonTrovato.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)

    public String RispostaNonTrovata(ProdottoNonTrovato ex) {
        return ex.getMessage();
    }

}
