package br.com.model;

import br.com.dao.HotelDAO;


public class HotelBO {

	
	HotelDAO hotelDAO = new HotelDAO();
	
	
	public boolean addNome(HotelModel hotel) {
		return hotelDAO.addNome(hotel);
	}
	
	
	
}
