package MidTermEX2;


public class ExchangeRateBeam {
	static final int columnNum = 22;
	private int day=0;
	private String Dollar;
	private String TransactionBuy;
	private int BuyInCash;
	private int BuyIncurrentPrice;
	private int BuyF10;
	private int BuyF30;
	private int BuyF60;
	private int BuyF90;
	private int BuyF120;
	private int BuyF150;
	private int BuyF180;
	private String TransactionSell;
	private int SellOutCash;
	private int SellOutCurrentPrice;
	private int SellF10;
	private int SellF30;
	private int SellF60;
	private int SellF90;
	private int SellF120;
	private int SellF150;
	private int SellF180;
	
	public ExchangeRateBeam() {}
	public ExchangeRateBeam(ExchangeRateBeam bean) {
		if (bean ==null) {
			return;
			this.day=bean.day;
			this.Dollar = bean.Dollar;
			this.TransactionBuy=bean.TransactionBuy;
			this.BuyInCash=bean.BuyInCash;
			this.BuyIncurrentPrice=bean.BuyIncurrentPrice;
			this.BuyF10=bean.BuyF10;
			this.BuyF30=bean.BuyF30;
			this.BuyF60=bean.BuyF60;
			this.BuyF90=bean.BuyF90;
			this.BuyF120=bean.BuyF120;
			this.BuyF150=bean.BuyF150;
			this.BuyF180=bean.BuyF180;
			this.TransactionSell=bean.TransactionSell;
			this.SellOutCash=bean.SellOutCash;
			this.SellOutCurrentPrice=bean.SellOutCurrentPrice;
			this.SellF10=bean.SellF10;
			this.SellF30=bean.SellF30;
			this.SellF60=bean.SellF60;
			this.SellF90=bean.SellF90;
			this.SellF120=bean.SellF120;
			this.SellF150=bean.SellF150;
			this.SellF180=bean.SellF180;
			
			
		}
		
	}
	public void equalto(ExchangeRateBeam bean) {
		this.day=bean.day;
		this.Dollar = bean.Dollar;
		this.TransactionBuy=bean.TransactionBuy;
		this.BuyInCash=bean.BuyInCash;
		this.BuyIncurrentPrice=bean.BuyIncurrentPrice;
		this.BuyF10=bean.BuyF10;
		this.BuyF30=bean.BuyF30;
		this.BuyF60=bean.BuyF60;
		this.BuyF90=bean.BuyF90;
		this.BuyF120=bean.BuyF120;
		this.BuyF150=bean.BuyF150;
		this.BuyF180=bean.BuyF180;
		this.TransactionSell=bean.TransactionSell;
		this.SellOutCash=bean.SellOutCash;
		this.SellOutCurrentPrice=bean.SellOutCurrentPrice;
		this.SellF10=bean.SellF10;
		this.SellF30=bean.SellF30;
		this.SellF60=bean.SellF60;
		this.SellF90=bean.SellF90;
		this.SellF120=bean.SellF120;
		this.SellF150=bean.SellF150;
		this.SellF180=bean.SellF180;
	}
	
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getDollar() {
		return Dollar;
	}
	public void setDollar(String dollar) {
		Dollar = dollar;
	}
	public String getTransactionBuy() {
		return TransactionBuy;
	}
	public void setTransactionBuy(String transactionBuy) {
		TransactionBuy = transactionBuy;
	}
	public int getBuyInCash() {
		return BuyInCash;
	}
	public void setBuyInCash(int buyInCash) {
		BuyInCash = buyInCash;
	}
	public int getBuyIncurrentPrice() {
		return BuyIncurrentPrice;
	}
	public void setBuyIncurrentPrice(int buyIncurrentPrice) {
		BuyIncurrentPrice = buyIncurrentPrice;
	}
	public int getBuyF10() {
		return BuyF10;
	}
	public void setBuyF10(int buyF10) {
		BuyF10 = buyF10;
	}
	public int getBuyF30() {
		return BuyF30;
	}
	public void setBuyF30(int buyF30) {
		BuyF30 = buyF30;
	}
	public int getBuyF60() {
		return BuyF60;
	}
	public void setBuyF60(int buyF60) {
		BuyF60 = buyF60;
	}
	public int getBuyF90() {
		return BuyF90;
	}
	public void setBuyF90(int buyF90) {
		BuyF90 = buyF90;
	}
	public int getBuyF120() {
		return BuyF120;
	}
	public void setBuyF120(int buyF120) {
		BuyF120 = buyF120;
	}
	public int getBuyF150() {
		return BuyF150;
	}
	public void setBuyF150(int buyF150) {
		BuyF150 = buyF150;
	}
	public int getBuyF180() {
		return BuyF180;
	}
	public void setBuyF180(int buyF180) {
		BuyF180 = buyF180;
	}
	public String getTransactionSell() {
		return TransactionSell;
	}
	public void setTransactionSell(String transactionSell) {
		TransactionSell = transactionSell;
	}
	public int getSellOutCash() {
		return SellOutCash;
	}
	public void setSellOutCash(int sellOutCash) {
		SellOutCash = sellOutCash;
	}
	public int getSellOutCurrentPrice() {
		return SellOutCurrentPrice;
	}
	public void setSellOutCurrentPrice(int sellOutCurrentPrice) {
		SellOutCurrentPrice = sellOutCurrentPrice;
	}
	public int getSellF10() {
		return SellF10;
	}
	public void setSellF10(int sellF10) {
		SellF10 = sellF10;
	}
	public int getSellF30() {
		return SellF30;
	}
	public void setSellF30(int sellF30) {
		SellF30 = sellF30;
	}
	public int getSellF60() {
		return SellF60;
	}
	public void setSellF60(int sellF60) {
		SellF60 = sellF60;
	}
	public int getSellF90() {
		return SellF90;
	}
	public void setSellF90(int sellF90) {
		SellF90 = sellF90;
	}
	public int getSellF120() {
		return SellF120;
	}
	public void setSellF120(int sellF120) {
		SellF120 = sellF120;
	}
	public int getSellF150() {
		return SellF150;
	}
	public void setSellF150(int sellF150) {
		SellF150 = sellF150;
	}
	public int getSellF180() {
		return SellF180;
	}
	public void setSellF180(int sellF180) {
		SellF180 = sellF180;
	}
	

}
