package fundamentos_Java.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Cliente {
	

	public int insertar(String url,String usuario, String clave)throws SQLException {		
		String sql= "insertando en SQL";
		Connection cn = DriverManager.getConnection(url,usuario,clave);
		return 0;
	}
	
	public int delete(String url,String usuario, String clave)throws SQLException {
			String sql= "Borrando un dato en SQL";
			Connection cn = DriverManager.getConnection(url,usuario,clave);
			return 0;
		}
	public int update(String url,String usuario, String clave)throws SQLException {
		String sql= "Actualizando en SQL";
		Connection cn = DriverManager.getConnection(url,usuario,clave);
		return 0;
	}

}
