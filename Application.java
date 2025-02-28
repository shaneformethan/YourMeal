package YourMeal;
import java.util.ArrayList;

public class Application {
	private ArrayList<Food> foodList = new ArrayList<>();
	private ArrayList<Order> orderList = new ArrayList<>();
	
	public void addNewFood(Food food) {
		foodList.add(food);
		System.out.println(food.getName() + " was successfully added to the kitchen!");
	}

	public void order(User user, Food food, String date) {
		orderList.add(new Order(user, food, date));
		System.out.println(user.getName() + " ordered "+ food.getName() +" on " + date);
	}

	public void displayFoods() {
		System.out.println("Food List:");
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		for(Food food: foodList) {
			System.out.printf("%s (%d Kcal)\n", food.getName(), food.getCalories());
			System.out.println("Description: " + food.getDesc());
			System.out.println("Spicy Level: " + food.getSpicyLevel());
			System.out.println("Ingredients:");
			food.displayIngredient();
			System.out.println("----------------------------------------------------------------------------------------------------");
		}
		
	}

	public void displayOrders() {
		System.out.println("Order List:");
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		for(Order order: orderList) {
			System.out.println("User: " + order.getUser().getName() + " - " + order.getUser().getId());
			System.out.println("Food: " + order.getFood().getName());
			System.out.println("Date: " + order.getDate());
			System.out.println("----------------------------------------------------------------------------------------------------");
		}
	}

}
