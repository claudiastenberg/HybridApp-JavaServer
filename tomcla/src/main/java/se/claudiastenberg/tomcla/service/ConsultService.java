package se.claudiastenberg.tomcla.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.claudiastenberg.tomcla.model.Consult;
import se.claudiastenberg.tomcla.repository.ConsultRepository;

@Service
public class ConsultService {

    private final ConsultRepository repository;

    @Autowired
    public ConsultService(ConsultRepository repository) {
        this.repository = repository;
    }

    public Consult createConsut(Consult consult){
        return repository.save(consult);
    }
    public Iterable<Consult> getAllConsults(){
        return repository.findAll();
    }
}
