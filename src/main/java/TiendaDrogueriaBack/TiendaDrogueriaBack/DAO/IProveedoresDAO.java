package TiendaDrogueriaBack.TiendaDrogueriaBack.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import TiendaDrogueriaBack.TiendaDrogueriaBack.modelo.ProveedoresModel;

public interface IProveedoresDAO extends JpaRepository<ProveedoresModel, Long> {

}
