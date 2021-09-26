package TiendaDrogueriaBack.TiendaDrogueriaBack.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import TiendaDrogueriaBack.TiendaDrogueriaBack.modelo.ClientesModel;

public interface IClientesDAO extends JpaRepository<ClientesModel, Long> {
	
}
