package ps.ja15.Entregable.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ps.ja15.Entregable.model.Cuenta;
import ps.ja15.Entregable.model.Transferencia;
import ps.ja15.Entregable.repository.TransferenciaRepository;

import java.util.Optional;

@Service
public class TransferenciaService {

    @Autowired
    TransferenciaRepository transferenciaRepository;

    public Transferencia save(Transferencia transferencia){
        return transferenciaRepository.save(transferencia);
    }
    public void  delete(Transferencia transferencia){
         transferenciaRepository.delete(transferencia);
    }

}
