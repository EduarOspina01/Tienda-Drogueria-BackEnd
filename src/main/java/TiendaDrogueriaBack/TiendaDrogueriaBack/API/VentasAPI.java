package TiendaDrogueriaBack.TiendaDrogueriaBack.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TiendaDrogueriaBack.TiendaDrogueriaBack.DAO.IVentasDAO;
import TiendaDrogueriaBack.TiendaDrogueriaBack.modelo.VentasModel;

@Service
public class VentasAPI {

	@Autowired
	private IVentasDAO ventaDAO;
	
	public VentasModel guardarVentas(VentasModel ventas) {
		return ventaDAO.save(ventas);
	}	
	
	public List<VentasModel> listarVentas(){
		return ventaDAO.findAll();
	}
	
}
