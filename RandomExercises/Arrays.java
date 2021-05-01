import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {


        ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza");
        food.add("Ivan");

        food.set(1, "Hello There");

        for (int i = 0;i < food.size(); i++){
            System.out.println(food.get(i));
        }
    }
}
