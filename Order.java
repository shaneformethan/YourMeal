package YourMeal;

public class Order {
	
	private User user;
	private Food food;
	private String date;
	private static int count;
	
	public Order(User user, Food food, String date) {
		this.user=user;
		this.food=food;
		this.date=date;
	}
	
	public static void setCount(int count_) {
		count = count_;
	}

	public User getUser() {
		return user;
	}

	public Food getFood() {
		return food;
	}

	public String getDate() {
		return date;
	}

	public static int getCount() {
		return count;
	}
	
}
