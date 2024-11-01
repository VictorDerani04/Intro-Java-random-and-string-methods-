import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        problem1();
        problem2();
        problem3();
        problem4();

    }
    public static void problem1(){
        System.out.println("--- Triangle Side, Angle, and Area Calculator ---");

        System.out.print("Enter in the length of one side (a): ");
        Scanner scan1 = new Scanner(System.in);
        double numA = scan1.nextDouble();

        System.out.print("Enter in the length of another side (b): ");

        double numB = scan1.nextDouble();

        System.out.print("Enter in the measure of the Angle between the two sides (C), in °: " );
        double angleC = (Math.toRadians(scan1.nextDouble()));

        double numC = Math.sqrt(Math.pow(numA,2) + Math.pow(numB,2) - 2*numA*numB*Math.cos(angleC));

        System.out.println("Lengths: a=" + String.format("%.02f",numA) + ", b=" + String.format("%.02f",numB) + ", c=" + String.format("%.02f",numC));

        double angleA = Math.asin(Math.sin(angleC)/numC*numA);
        double angleB = Math.PI - angleA - angleC;

        System.out.println("Angles: A=" + String.format("%.02f", Math.toDegrees(angleA)) + "°, B=" + String.format("%.02f",Math.toDegrees(angleB)) + "°, C=" + String.format("%.02f",Math.toDegrees(angleC)) + "°");

        double semiP = (numA + numB + numC)/2;
        double area =  Math.sqrt(semiP*(semiP-numA)*(semiP-numB)*(semiP-numC));

        System.out.println("Area= " + String.format("%.02f\n\n",area));
        System.out.println("------------------------------------------------------------------------------------------\n\n");


    }
    public static void problem2 (){
        System.out.println("--- All-in One Strings ---");

        String First = "First name      " + "Last name      " + "Password\n";
        String Second = "Laura           " + "Dostert        " + "i@d1v3r\n";
        String Third = "Jimmy           " + "Lyons          " + "j!mmjam\n";
        String Fourth = "Kathryn         " + "Laco           " + "xc0un7ry\n";
        String Fifth = "Lillian         " + "Bruns          " + "1un@rulez\n";
        String Last = First.concat(Second.concat(Third.concat(Fourth.concat(Fifth))));

        System.out.println(Last + "\n\n");

        System.out.println("------------------------------------------------------------------------------------------\n\n");

    }
    public static void problem3 (){
        System.out.println("--- State of Florida SSN Generator ---");
        String name1 = "Bob Loblaw";
        String name2 = "Regina Phalange";

        int random1 = (int) (Math.random() * 512) + 261;
        int random2 = (int) (Math.random() * 99) + 1;
        int random3 = (int) (Math.random() * 9999) + 1;

        int random4 = (int) (Math.random() * 512) + 261;
        int random5 = (int) (Math.random() * 99) + 1;
        int random6 = (int) (Math.random() * 9999) + 1;

        System.out.println("Name: " + name1);
        System.out.println("SSN: " + random1 + "-" + String.format("%02d",random2) + "-" + String.format("%04d", random3));
        System.out.println("Name: " + name2);
        System.out.println("SSN: " + random4 + "-" + String.format("%02d",random5) + "-" + String.format("%04d\n\n", random6));

        System.out.println("------------------------------------------------------------------------------------------\n\n");

    }
    public static void problem4(){
        System.out.println("--- Strong Password Generator ---");

        System.out.print("Enter in your first word: ");
        Scanner scan = new Scanner(System.in);
        String first = scan.nextLine();

        System.out.print("Enter in your second word: ");
        String second = scan.nextLine();

        System.out.print("Enter in your third word: ");
        String third = scan.nextLine();

        String all = first.concat(second.concat(third));

        int rand = (int) (Math.random() * all.length());
        String password = all.substring(0,rand) + all.substring(rand, rand + 1).toUpperCase() + all.substring(rand + 1);

        String easyPassword= password.replace("e","3").replace("a","@").replace("o","0").replace("l","1").replace("t","7").replace("s","$").replace("i","!");

        System.out.println("Try this as your easy-to-remember password: " + easyPassword + "\n\n");

        System.out.println("------------------------------------------------------------------------------------------");
    }
}