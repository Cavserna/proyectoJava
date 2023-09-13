package ps.ja15.Entregable.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ps.ja15.Entregable.model.Cuenta;
import ps.ja15.Entregable.repository.CuentaRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class CuentaService  implements  ICuentaService{
    @Autowired
    CuentaRepository cuentaRepository;

    public Cuenta save(Cuenta cuenta) throws Exception{
        Optional<Cuenta> cuentaExistente = cuentaRepository.findByNumeroCuenta(cuenta.getNumeroCuenta());
        if (cuentaExistente.isPresent()) {
            throw new Exception("Ya existe una cuenta con el mismo número de cuenta.");
        }
            if (cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0) {
                throw new Exception("El saldo no puede ser negativo.");
            }
            return cuentaRepository.save(cuenta);
    }
    public Cuenta update(Cuenta cuenta)throws Exception{
            return cuentaRepository.save(cuenta);
    }

    public void deleteById(Long id){
        cuentaRepository.deleteById(id);
    }
    public Cuenta findById(Long id) throws Exception{
        return cuentaRepository.findById(id).get();
    }
    public List<Cuenta> findByAll()throws Exception{
        return cuentaRepository.findAll();
    }
}


