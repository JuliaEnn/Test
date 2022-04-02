package firstTests;

import javaSimple.ForConstructor;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FourthTest extends BaseTest {

    Integer firstParam = 1;
    Integer secondParam = 300;

// Домашнее задание №4, тест 1

    @Parameters({"name1", "name2"})
    @Test
    public void compare(int firstParam, int secondParam) {
        System.out.println("Первый параметр " + firstParam + " > Второго параметра " + secondParam + "?");
        System.out.println("Но " + this.firstParam + " > " + this.secondParam );

        this.firstParam=firstParam;
        this.secondParam=secondParam;

    }

}
