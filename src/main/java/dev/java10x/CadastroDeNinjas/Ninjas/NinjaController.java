package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Bem vindo";
    }

    //Criar ninja
    @PostMapping("/ninja")
    public String criarNinja(){
        return "Ninja criado!";
    }

     //Buscar ninja por id
     @GetMapping("/ninja/id")
     public String getNinjaId(){
         return "Ninja ID!";
     }

     //Buscar todos os ninjas
     @GetMapping("/ninjas")
     public String getNinjas(){
         return "Todos os ninjas";
     }

     //Alterar dados do ninja
     @PutMapping("/ninja/atualiza")
     public String putNinja(){
         return "Ninja atualizado";
     }

     //Deletar ninja
     //Alterar dados do ninja
     @DeleteMapping("/ninja/delete")
     public String deletetNinja(){
         return "Ninja deletado!";
     }

}
