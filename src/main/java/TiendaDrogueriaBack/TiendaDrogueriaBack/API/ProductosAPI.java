package TiendaDrogueriaBack.TiendaDrogueriaBack.API;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TiendaDrogueriaBack.TiendaDrogueriaBack.DAO.IProductosDAO;
import TiendaDrogueriaBack.TiendaDrogueriaBack.modelo.ProductosModel;


@Service
public class ProductosAPI {
	
	@Autowired
	private IProductosDAO productosdao;
	
	//CREATE UPDATE
		public ProductosModel guardarProveedor(ProductosModel productos) {
			return productosdao.save(productos);
		}
		
		public Optional<ProductosModel> listarProveedoresPorId(long id){
			return productosdao.findById(id);
		}
		
		
		public List<ProductosModel> listarProveedores(){
			return productosdao.findAll();
		}
		

		public boolean eliminarProveedor(Long id) {
			try {
				productosdao.deleteById(id);
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
				// TODO: handle exception
			}
		}
}
