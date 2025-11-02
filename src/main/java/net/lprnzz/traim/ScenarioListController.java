package net.lprnzz.traim;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ScenarioListController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "boas vindas nessa rota";
    }


}
