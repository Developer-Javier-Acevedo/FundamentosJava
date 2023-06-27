package fundamentos_Java.aplicacion;

import java.sql.SQLException;

import fundamentos_Java.dao.Cliente;

public class AppInvocador {
	
	public static void main(String[] args) {
		
		try {
			
			Cliente cliente = new Cliente();
			int n = cliente.insertar("javier/ingreso/", "javier.acevedo", "clave123");
			System.out.print("n=" + n);
			
		} catch (SQLException e1 ) {
			
			e1.printStackTrace();
			System.out.print("error al intentar ejecutar la instruccion");
			
		}
		
		
	}

}
