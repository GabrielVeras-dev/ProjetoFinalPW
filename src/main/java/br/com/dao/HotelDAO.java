package br.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import br.com.model.ConnectionFactory;
import br.com.model.HotelModel;



public class HotelDAO {

	
	private Connection connection;
	private PreparedStatement ps;
	private Statement st;
	//private ArrayList<ProdutosModel> produto = new ArrayList<ProdutosModel>();
	private ResultSet rs;
	private Connection con;
	
	ConnectionFactory conexao = new ConnectionFactory();
	
	public HotelDAO() {
		connection = new ConnectionFactory().getConnection();
		
	}
	

	
	public boolean addNome(HotelModel hotel) {
		String sql = "INSERT INTO pessoa (nome) VALUES(?)";
		
		try {
			
			ps = connection.prepareStatement(sql);
			ps.setString(1, hotel.getNome());
			ps.execute();
			ps.close();
			
			return true;
		} catch(Exception error){
			throw new RuntimeException("Erro de conexão" + error);			
		}
		
	}
	
	
	
	
	
	
}
