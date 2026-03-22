package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ninja")
public class NinjaController {

    @PostMapping("/create")
    public String criarNinja(){
        return "Ninja criado!";
    }

     //Buscar ninja por id
     @GetMapping("/byId")
     public String getNinjaId(){
         return "Ninja ID!";
     }

     //Buscar todos os ninjas
     @GetMapping("/all")
     public String getNinjas(){
         return "Todos os ninjas";
     }

     //Alterar dados do ninja
     @PutMapping("/update")
     public String putNinja(){
         return "Ninja atualizado";
     }

     @DeleteMapping("/delete")
     public String deletetNinja(){
         return "Ninja deletado!";
     }

}
