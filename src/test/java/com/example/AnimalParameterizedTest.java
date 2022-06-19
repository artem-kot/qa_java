package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalParameterizedTest {
    private final String animalKind;
    private final ArrayList expectedFoodList;

    public AnimalParameterizedTest(String animalKind, ArrayList expectedFoodList){
        this.animalKind = animalKind;
        this.expectedFoodList = expectedFoodList;
    }
    @Parameterized.Parameters
    public static Object[] getAnimalKind() {
        ArrayList<String> herbivoresFoodList = new ArrayList<>(Arrays.asList("Трава", "Различные растения"));
        ArrayList<String> carnivoresFoodList = new ArrayList<>(Arrays.asList("Животные", "Птицы", "Рыба"));
        return new Object[][] {
                {"Травоядное", herbivoresFoodList},
                {"Хищник", carnivoresFoodList},
                {"Всеядное", new ArrayList<>()}
        };
    }

    @Test
    public void getFood() throws Exception {
        Animal animal = new Animal();
        try {
            assertEquals(animal.getFood(animalKind), expectedFoodList);
        } catch (Exception exception) {
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
        }
    }
}