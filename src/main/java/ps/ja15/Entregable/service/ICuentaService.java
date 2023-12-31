package ps.ja15.Entregable.service;

import ps.ja15.Entregable.model.Cuenta;

import java.util.List;

public interface ICuentaService {
    Cuenta save(Cuenta cuenta)throws Exception;
    Cuenta update(Cuenta cuenta)throws Exception;
    void deleteById(Long id);
    Cuenta findById(Long id)throws Exception;
    List<Cuenta> findByAll()throws Exception;
}
