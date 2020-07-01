package geekbrains.java.HM_1;

import java.util.ArrayList;
import java.util.Arrays;

public class BOX<T extends Fruit> {
    private ArrayList<T> box1;

    public BOX(T...fruits){
        this.box1 = new ArrayList<T>(Arrays.asList(fruits));
    }
    //Сделать метод getWeight()
    // который высчитывает вес коробки,
    // зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
    public float getWeight(){

        if (box1.size() == 0){
            return 0.0f;
        }
        float wght = 0.0f;
        for (int i = 0; i < box1.size(); i++) {
            wght = wght + box1.get(i).getWeight();
        }
        return wght;
    }

}
