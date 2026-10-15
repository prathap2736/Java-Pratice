import java.util.Scanner;

class hello {
    public static void main(String args[]){
        // String name = "peter parker";
        // int age = 23;

        // System.out.println("My name is" + name);
        // System.out.println("My age is" + age);

        // Scanner scan = new Scanner(System.in);
        // String name = scan.nextLine();
        // int age = scan.nextInt();

        // System.out.println("My name is " + name);
        // System.out.println("My age is " + age);



        // Scanner scan = new Scanner(System.in);
        // String name = scan.nextLine();
        // int age = scan.nextInt();
        // scan.nextLine(); // consume the newline character left by nextInt()
        // String address = scan.nextLine();

        // System.out.println("My name is " + name);
        // System.out.println("My age is " + age); 
        // System.out.println("My address is " + address);



        // Scanner scan = new Scanner(System.in);
        // int a = scan.nextInt();
        // int b = scan.nextInt();
        // int c = scan.nextInt();
        // int d = a*b*c;
        // int e = a+b+c;
        // System.out.println(d/e);




        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        double score = scan.nextDouble();
        scan.nextLine(); // consume the newline character
        String department = scan.nextLine();
        System.out.println("My name is " + name);
        System.out.println("My score is " + score/10 +"/10");
        System.out.println("My department is " + department);

    }
}