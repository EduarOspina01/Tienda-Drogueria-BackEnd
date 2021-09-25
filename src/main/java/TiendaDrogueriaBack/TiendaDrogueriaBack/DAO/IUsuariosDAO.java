package TiendaDrogueriaBack.TiendaDrogueriaBack.DAO;
import org.springframework.data.jpa.repository.JpaRepository;
import TiendaDrogueriaBack.TiendaDrogueriaBack.modelo.UsuariosModel;

public interface IUsuariosDAO extends JpaRepository<UsuariosModel, Long> {
	
}
