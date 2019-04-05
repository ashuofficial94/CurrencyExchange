package com;
import java.sql.*;

public class ExchangeService {
	
	private ExchangeDAO dao = new ExchangeDAO();
	private Connection connection = dao.getConnection();
			
	public int exchangeCurrency(double amount, double exchangeRate) throws SQLException {
		
		String sql = "insert into currency(inputAmount, outputAmount, inputCurrency, outputCurrency) values(?, ?, ? , ?)";
		PreparedStatement stmt = connection.prepareStatement(sql);
		
		stmt.setDouble(1, amount);
		stmt.setDouble(2, amount*exchangeRate);
		stmt.setString(3, "inr");
		stmt.setString(4, "usd");
		
		int i = stmt.executeUpdate();
		return i;
	}
	
}
