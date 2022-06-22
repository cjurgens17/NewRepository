import java.util.SortedMap;

public class ChrisClass {
    //fields
    private int age;
    private String name;

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String s) {
        s = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        a = age;
    }
    //methods


    public void charCity() {
        char a = '0';

        for (int i = 0; i < 79; i++) {
            System.out.print(a);
            a++;
        }
        System.out.println();
    }

    public void howOld(int age) {
        if (age % 2 == 1) {
            System.out.println("You have an odd age!");
        } else if (age % 2 == 0) {
            System.out.println("You have an even age!");
        } else {
            System.out.println("Your an alien");
        }


    }
}
