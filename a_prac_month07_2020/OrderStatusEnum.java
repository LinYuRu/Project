package a_prac_month07_2020;

public enum OrderStatusEnum {
    UN_PAID(0,"訂單未支付"),PAIDED(1,"訂單已支付"),SENDED(2,"已發貨"),;
    
    private int index;
    private String desc;

    public int getIndex() {
        return index;
    }

    public String getDesc() {
        return desc;
    }

    OrderStatusEnum(int index, String desc){
        this.index = index;
        this.desc =desc;
    }

    static OrderStatusEnum of(int orderStatus) {
        for (OrderStatusEnum temp : OrderStatusEnum.values()) {
            if (temp.getIndex() == orderStatus) {
                return temp;
            }
        }
        return null;
    }
    
	public static void main(String args[]) {
		//int orderStatus = 0;
		
		String OrderStatusDes = OrderStatusEnum.of(1).getDesc();
		System.out.println(OrderStatusDes);
	}
}
