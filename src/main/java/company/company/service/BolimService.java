package company.company.service;

import company.company.entity.Bolim;
import company.company.repository.BolimRepository;
import org.springframework.stereotype.Service;

@Service
public class BolimService {
    private final BolimRepository bolimRepository;


    public BolimService(BolimRepository bolimRepository) {
        this.bolimRepository = bolimRepository;
    }

    public Bolim add(Bolim bolim){
        return bolimRepository.save(bolim);
    }

    public void delete(Long id){
        bolimRepository.deleteById(id);
    }



}
