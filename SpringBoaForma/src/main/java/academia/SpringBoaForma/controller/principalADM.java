package academia.SpringBoaForma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class principalADM {

    @GetMapping("/homeADM")
    public String paginaPrincipalADM() {
        return "gestor/homeADM";
    }
}
