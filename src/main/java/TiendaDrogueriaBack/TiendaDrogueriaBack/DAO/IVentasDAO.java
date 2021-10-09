package TiendaDrogueriaBack.TiendaDrogueriaBack.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import TiendaDrogueriaBack.TiendaDrogueriaBack.modelo.VentasModel;

public interface IVentasDAO extends JpaRepository<VentasModel, Long> {

}
