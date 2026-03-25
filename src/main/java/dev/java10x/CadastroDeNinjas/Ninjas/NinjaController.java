package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ninja")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService){
        this.ninjaService = ninjaService;
    }

    @PostMapping("/create")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja){
        return ninjaService.createNinja(ninja);
    }

     //Buscar ninja por id
     @GetMapping("/{id}")
     public NinjaModel getNinjaId(@PathVariable Long id){
         return ninjaService.getNinjaId(id);
     }

     //Buscar todos os ninjas
     @GetMapping("/all")
     public List<NinjaModel> allNinjas(){
         return ninjaService.allNinjas();
     }

     //Alterar dados do ninja
     @PutMapping("/update/{id}")
     public NinjaModel updateNinja(@PathVariable Long id, @RequestBody NinjaModel ninjaUpdate){
         return ninjaService.updateNinja(id, ninjaUpdate);
     }

     @DeleteMapping("/delete/{id}")
     public void delete(@PathVariable Long id){
        ninjaService.deleteNinja(id);
     }
}
