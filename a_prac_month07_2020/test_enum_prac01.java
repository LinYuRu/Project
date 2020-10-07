package a_prac_month07_2020;

public class test_enum_prac01 {
	public static void main(String args[]) {
		int orderStatus = 0;
//		String OrderStatusDes = null;
//		if(orderStatus==0){
//		    OrderStatusDes ="訂單未支付";
//		}else if(orderStatus==1){
//		    OrderStatusDes ="訂單已支付";
//		}else if(orderStatus==2){
//		   OrderStatusDes ="已發貨"; 
//		}
//		System.out.println("OrderStatusDes: " + OrderStatusDes);
		
		String OrderStatusDes = OrderStatusEnum.of(0).getDesc();
		System.out.println(OrderStatusDes);
	}
}


