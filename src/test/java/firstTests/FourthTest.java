package firstTests;

import javaSimple.ForConstructor;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class FourthTest extends BaseTest {

    Integer firstP = 1000;
    Integer secondP = 50;

// Домашнее задание №4, тест 1

    @Parameters({"name1", "name2"})
    @Test
    public void compare(Integer firstParam, Integer secondParam) {
        System.out.println("Первый параметр " + firstParam + " > Второго параметра " + secondParam + "?");
        Assertion a = new Assertion();
        a.assertTrue(firstParam > secondParam, "Второй параметр > первого параметра");
        System.out.println("Ответ: да, больше");

        if (firstP > firstParam) {
            System.out.println("Но " + firstP + " > первого параметра " + firstParam);
        }

        if (secondP > firstParam) {
            System.out.println("Но " + secondP + " > первого параметра " + firstParam);
        }


    }

}
