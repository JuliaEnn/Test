package firstTests;

// Домашнее задание №4, тест 2

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class FifthTest {

    @Test
    public void contain(int firstParam, int secondParam) {
        String first1 = "Привет";
        String second2 = "р";
        System.out.println("Первое слово  '" + firstParam + "' содержит текст второго слова '" + secondParam + "'?");

        String text=null;
        System.out.println("Строка  " + text);

        Assertion a = new Assertion();
        a.assertTrue(first1.contains(second2), "Да, первое слово содержит текст второго параметра");

    }

}
