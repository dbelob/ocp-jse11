package acme.study_guide.chapter22.cloning_objects;

import java.util.ArrayList;

public final class Animal implements Cloneable {
    private final ArrayList<String> favoriteFoods;

    public Animal(ArrayList<String> favoriteFoods) {
        if (favoriteFoods == null)
            throw new RuntimeException("favoriteFoods is required");
        this.favoriteFoods = new ArrayList<>(favoriteFoods);
    }

    public int getFavoriteFoodsCount() {
        return favoriteFoods.size();
    }

    public String getFavoriteFoodsElement(int index) {
        return favoriteFoods.get(index);
    }

    public Animal clone() {
        ArrayList<String> listClone = (ArrayList) favoriteFoods.clone();
        return new Animal(listClone);
    }

    public static void main(String... args) throws Exception {
        ArrayList<String> food = new ArrayList<>();
        food.add("grass");
        Animal sheep = new Animal(food);
        Animal clone = (Animal) sheep.clone();
        System.out.println(sheep == clone);
        System.out.println(sheep.favoriteFoods == clone.favoriteFoods);
    }
}
