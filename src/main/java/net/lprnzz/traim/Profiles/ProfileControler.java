package net.lprnzz.traim.Profiles;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ProfileControler {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "boas vindas nessa rota";
    }

}
