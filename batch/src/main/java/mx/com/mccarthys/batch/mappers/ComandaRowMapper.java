package mx.com.mccarthys.batch.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.com.mccarthys.batch.model.*;

public class ComandaRowMapper  implements RowMapper<Comanda>{

	public Comanda mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Comanda comanda = new Comanda();

		comanda.setFoliodet(rs.getLong("foliodet"));
		comanda.setMovimiento(rs.getLong("movimiento"));
		comanda.setCantidad(rs.getInt("cantidad"));
		comanda.setIdProducto(rs.getString("idProducto"));
		comanda.setDescuento(rs.getFloat("descuento"));
		comanda.setPrecio(rs.getFloat("precio"));
		comanda.setImpuesto(rs.getFloat("impuesto"));
		comanda.setHora(rs.getDate("hora"));
		comanda.setIdestacion(rs.getString("idestacion"));
		comanda.setHoraproduc(rs.getDate("horaproduc"));
		comanda.setIdmeseropr(rs.getString("idmeseropr"));
		
		return comanda;
	}
	
}
