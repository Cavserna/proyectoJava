package ps.ja15.Entregable.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ps.ja15.Entregable.model.Cuenta;

@Repository
public interface CuentaRepository extends JpaRepository <Cuenta,Long> {
}
