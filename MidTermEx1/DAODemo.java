package MidTermEx1;

import java.sql.SQLException;
import java.util.*;

public class DAODemo {

	public static void main(String[] args) {
		ERcreateEx dao = new ERDAO();
		try {
			dao.getConnection();
			
			//insert
			Pojo ExchangeRate1 = new Pojo();
			ExchangeRate1.setDate("20190531");
			ExchangeRate1.setDollars("USA");
			ExchangeRate1.setBuyin("31.18");
			ExchangeRate1.setSellout("31.87");
			int count1 = dao.insert(ExchangeRate1);
			System.out.println("insert"+count1+"rows");
			System.out.println("---------------------------------");
			
			//update
//			Pojo ExchangeRate2 = new Pojo();
//			ExchangeRate2.setDate("20190531");
//			ExchangeRate2.setDollars("USA");
//			ExchangeRate2.setBuyin("31.18");
//			ExchangeRate2.setSellout("31.87");
//			int count2 = dao.insert(ExchangeRate2);
//			System.out.println("Insert"+count2+"rows");
//			System.out.println("---------------------------------");
			
			//find by primary Key
//			Pojo ExchangeRate3 = dao.findDate("20190529");
//			System.out.println("Date"+ExchangeRate3.getDate());
//			System.out.println("Dollars"+ExchangeRate3.getDollars());
//			System.out.println("BuyIn"+ExchangeRate3.getBuyin());
//			System.out.println("Sellout"+ExchangeRate3.getSellout());
//			System.out.println("---------------------------------");
			
			
			//get all ER
//			List<Pojo>ERR = dao.getAll();
//			for(Pojo ExchangeRate4 : ERR) {
//				System.out.println(ExchangeRate4.getDate());
//				System.out.println(ExchangeRate4.getDollars());
//				System.out.println(ExchangeRate4.getBuyin());
//				System.out.println(ExchangeRate4.getSellout());
//			}		
//			System.out.println("---------------------------------");
			
//			delete
//			int count3 = dao.delete("20190531");
//			System.out.println("delete " + count3 + " rows");
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try {
				dao.closeConn();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
