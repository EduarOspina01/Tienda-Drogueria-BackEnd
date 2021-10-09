package TiendaDrogueriaBack.TiendaDrogueriaBack.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "ventas")
public class VentasModel {
	
	@Id
	private Long codigo_cedula;
	private Long cedula_cliente;
	private Long cedula_usuario;
	private Long ivaventa;
	private Long total_venta;
	private Long valor_venta;
	
	
	public Long getCodigo_cedula() {
		return codigo_cedula;
	}
	public void setCodigo_cedula(Long codigo_cedula) {
		this.codigo_cedula = codigo_cedula;
	}
	public Long getCedula_cliente() {
		return cedula_cliente;
	}
	public void setCedula_cliente(Long cedula_cliente) {
		this.cedula_cliente = cedula_cliente;
	}
	public Long getCedula_usuario() {
		return cedula_usuario;
	}
	public void setCedula_usuario(Long cedula_usuario) {
		this.cedula_usuario = cedula_usuario;
	}
	public Long getIva_venta() {
		return ivaventa;
	}
	public void setIva_venta(Long iva_venta) {
		this.ivaventa = iva_venta;
	}
	public Long getTotal_venta() {
		return total_venta;
	}
	public void setTotal_venta(Long total_venta) {
		this.total_venta = total_venta;
	}
	public Long getValor_venta() {
		return valor_venta;
	}
	public void setValor_venta(Long valor_venta) {
		this.valor_venta = valor_venta;
	}
	
	
	

}
