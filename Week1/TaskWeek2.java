
import java.util.Scanner;
public class TaskWeek2 {
    public static void main(String[] args) {
        // 1. Write a program to check whether a person can cast a vote or not. The condition is you must be over 18 years old to vote.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the age of person");
        int age = scan.nextInt();
        if (age < 18) {
            System.out.println("The person can't vote");
        }else{
            System.out.println("you can vote");
        }

        // 2. Write a program to calculate SI. 
        int p = 1000;
        int t = 3;
        int r = 2;
        float SI = (p*t*r)/100;
        System.out.println("The SI is" + SI);

        // 3. Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.
        int b = 30;
        int h = 20;
        float AT = 0.5f*b*h;
        System.out.println("The area of Triangle is " + AT);

        int s = 10;
        int VC = s*s*s;
        System.out.println("The volume of cube is " + VC);

        int l = 10;
        int b = 20;
        int h = 30;
        int VCU = l*b*h;
        System.out.println("The volume of cuboid is " + VCU);

        // 4. Write the ternary operator for question no. 1
        System.out.println("Enter the age of person: ");
        int a = scan.nextInt();
        String b = a > 18 ? "The person can vote" : "The person can not vote";
        System.out.println(b);
        
        // 5. Write a program to take two integer inputs from the user and print the sum and product of them.
        System.out.println("Enter the value of first integer");
        int f = scan.nextInt();
        System.out.println("Enter the value of second integer ");
        int s = scan.nextInt();
        int sum = f + s ;
        int pro = f*s;
        System.out.println("The sum of number is " + sum);
        System.out.println("The product of two number is " + pro);

        // 6. Take two integer inputs from the user. First, calculate the sum of two, then the product of two. 
        // Finally, calculate the division of the thus obtained sum and product and print the result. 
        System.out.println("Enter the first number");
        int first = scan.nextInt();
        System.out.println("Enter the value of second number");
        int second = scan.nextInt();
        int SUM = first + second ;
        int product = first * second ;
        int div = SUM / product;
        System.out.println("The division is " + div);

        // 7. Take the name, roll number, and field of interest from the user and print in the format below:
        //  Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz
        System.out.println("Enter your Name");
        String name = scan.nextLine();
        System.out.println("Enter the roll number ");
        int roll = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your field of interests ");
        String field = scan.nextLine();
        System.out.printf("Hey, my name is %s and my roll number is %d. My field of Interest are %s", name,roll,field);
        

        // 9.  Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.
        System.out.println("Enter the length of rectangle:");
        double l = scan.nextDouble();
        System.out.println("Enter the breadth of rectangle");
        double b = scan.nextDouble();
        double  Area = l * b;
        int intarea = (int) Area;
        System.out.println("The area is " + intarea);


        // 10. Write a program to calculate the total marks of four subjects of a student and
        // the total percentage secured. And use the following conditions to generate the final result;
        // a. If equal to or more than 70 -> First Class
        // b. If more than 59 -> Upper Second Class
        // c. If more than 49 -> Second class
        // d. If more than 39 -> Third class and if below than 40 the result is fail. 

        System.out.println("enter the marks of First subject");
        int first = scan.nextInt();
        System.out.println("Enter the marks of second subject");
        int second = scan.nextInt();
        System.out.println("enter the marks of third subject");
        int third = scan.nextInt();
        System.out.println("Enter the marks of fourth subject");
        int fourth = scan.nextInt();
        int Total = first+second+third+fourth;
        double Per = (Total/4.0);
        System.out.println("Total marks " + Total);
        System.out.println("Percentage is " + Per);
        String result = (Per>= 70) ? "First Class" :
                        (Per> 59) ? "Upper Second Class" :
                        (Per> 49) ? "Second Class" :
                        (Per> 39) ? "Third Class" : "Fail";
        System.out.println(result);
        scan.close();



    }
}
    
}
