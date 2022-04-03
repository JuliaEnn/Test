package firstTests;

// Домашнее задание №4, тест 2

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class FifthTest {

    @Test
    public void contain() {
        String first1 = "Привет";
        String second2 = "р";
        System.out.println("Первое слово  '" + first1 + "' содержит текст второго слова '" + second2 + "'?");

//        String text=null;
//        System.out.println("Строка  " + text);

        Assertion a = new Assertion();
        a.assertTrue(first1.contains(second2));
        System.out.println("Да, первое слово содержит текст второго параметра");

    }

}
