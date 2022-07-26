package fly;

public class Order {
	private String orderName;
	private int orderId;
	
	public Order() {
		super();
	}
	
	public Order(String orderName,int orderId) {
		super();
		this.orderName = orderName;
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj instanceof Order) {
			Order otherObj = (Order)obj;
			return otherObj.orderName.equals(this.orderName) && otherObj.orderId == this.orderId;
		}else {
			return false;
		}
	}
}





















