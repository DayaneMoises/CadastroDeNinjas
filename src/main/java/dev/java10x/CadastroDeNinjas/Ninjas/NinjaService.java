package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {
    //service tem acesso ao -> repository
    //atributo
    private final NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    //Listar todos os ninjas
    //Criar metodo com tipo Lista de ninjas(model)
    public List<NinjaModel> allNinjas() {
        return ninjaRepository.findAll();
    }

    //Busca ninja por id
    public NinjaModel getNinjaId(Long id) {
        Optional<NinjaModel> ninjaId = ninjaRepository.findById(id);
        return ninjaId.orElse(null);
    }

    //cria ninja
    public NinjaModel createNinja(NinjaModel ninja) {
        return ninjaRepository.save(ninja);
    }

    //deleta ninja por id
    public void deleteNinja(Long id) {
        ninjaRepository.deleteById(id);
    }

    //ATUALIZAR ninja
    public NinjaModel updateNinja(Long id, NinjaModel ninjaUpdate){
       if (ninjaRepository.existsById(id)){
           ninjaUpdate.setId(id);
           return ninjaRepository.save(ninjaUpdate);
       }
        return null;
    }
}
