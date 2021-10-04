package TiendaDrogueriaBack.TiendaDrogueriaBack.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import TiendaDrogueriaBack.TiendaDrogueriaBack.modelo.ProductosModel;

public interface IProductosDAO extends JpaRepository<ProductosModel, Long>{

}
