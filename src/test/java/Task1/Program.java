package Task1;

public class Program {

    public static void main(String[] args) {
        byte a = 100;
        short b = 30000;
        int c = 1000;
        long d = 300000;
        double e = 10.5;
        float f = 20.54f;
        boolean bool = true;
        boolean bool2 = false;
        char g = 'g';
        char str = 'g';

        boolean result1= a==b;
        System.out.println(a + " = " + b + "? ");
        System.out.println(result1);

        boolean result2= f>e;
        System.out.println(f + " > " + e + "? ");
        System.out.println(result2);

        boolean result3= c!=d;
        System.out.println(c + " != " + d + "? ");
        System.out.println(result3);

        boolean result4= g==str;
        System.out.println(g + " = " + str + "? ");
        System.out.println(result4);

        boolean result5= bool || bool2;
        System.out.println(bool + " || " + bool2 + "? ");
        System.out.println(result5);


        if (a<0){
            System.out.println(a + " - отрицательное число");
        } else if (a>=0) {
            System.out.println(a + " - положительное число");
        } else {
            System.out.println(a + " - не число");
        }

        if (bool2){
            System.out.println(bool2);
        } else if (c>=900) {
            System.out.println(c);
        } else {
            System.out.println("Ничего не найдено");
        }

        char animal = 'C';

        switch(animal)
        {
            case 'A' :
            case 'B' :
                System.out.println("Медведь");
                break;
            case 'C' :
                System.out.println("Кошка");
                break;
            case 'D' :
                System.out.println("Собака");
            case 'F' :
                System.out.println("Птица");
                break;
            default :
                System.out.println("Неверная буква");
        }

        String[]  lst = {"Кошка", "Собака", "Птица", "Кролик"};
        int m = 0;
        while(m++ < lst.length){
            System.out.print(lst[m] + " ");
        }

        int j = 0;
        do {
            j++;
            System.out.print(Integer.valueOf(j) + " ");
        } while(5 > j);

        for (int i = 0; i < lst.length; i++) {
            System.out.print(lst[i] + " ");
        }


    }
}
