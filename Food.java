package YourMeal;
import java.util.ArrayList;

public class Food {
	private String name;
	private String desc;
	private int spicyLevel;
	private int calories;
	private ArrayList<Ingredient> ingredientList = new ArrayList<>();
	
	public Food(String name, String desc, int spicyLevel, int calories) {
		this.name=name;
		this.desc=desc;
		this.spicyLevel=spicyLevel;
		this.calories=calories;
	}


	public String getName() {
		return name;
	}


	public String getDesc() {
		return desc;
	}


	public int getSpicyLevel() {
		return spicyLevel;
	}


	public int getCalories() {
		return calories;
	}


	public ArrayList<Ingredient> getIngredient() {
		return ingredientList;
	}


	public void addIngredient(Ingredient ingredient) {
		ingredientList.add(ingredient);
	}

	public void displayFood() {
		System.out.printf("%s (%d Kcal)\n", name, calories);
		System.out.println("Description: " + desc);
		System.out.println("Spicy Level: " + spicyLevel);
		System.out.println("Ingredients:");
		displayIngredient();
		System.out.println("----------------------------------------------------------------------------------------------------");
	
	}

	public void displayIngredient() {
		for(Ingredient ingredient : ingredientList) {
			if(ingredientList.getLast()==ingredient) System.out.println(ingredient.getIngredient());
			else System.out.printf("%s, ", ingredient.getIngredient());
		}
	}

}
