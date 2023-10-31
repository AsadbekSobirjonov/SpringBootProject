package company.company.service;

import company.company.entity.Pasport;
import company.company.repository.PasportRepository;
import org.springframework.stereotype.Service;

import java.time.Year;

@Service
public class PasportService {
    private final PasportRepository pasportRepository;

    public PasportService(PasportRepository pasportRepository) {
        this.pasportRepository = pasportRepository;
    }
    public Pasport save(Pasport pasport){
        return pasportRepository.save(pasport);
    }
    public boolean chekAge(Integer tugilgan_yili){
        int yosh = Year.now().getValue() - tugilgan_yili;
        return yosh<16;
    }
    public Pasport getPasport(Long seria){
        Pasport result=pasportRepository.getById(seria);
        return result;
    }
}
