package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missao")
public class MissoesController {

    @GetMapping("/all")
    public String getAll(){
        return "Todas as missões";
    }

    @GetMapping("/byId")
    public String getbyId(){
        return "Missões por id";
    }

    @PostMapping("/create")
    public String create(){
        return "Cria missão";
    }

    @PutMapping("/update")
    public String update(){
        return "Atualiza missão";
    }

    @DeleteMapping("/delete")
    public String delete(){
        return "Delete missão";
    }

}
