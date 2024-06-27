package Week11;

public class Task11 {
public static void main(String[] args) {
Spreadsheet ss = new Spreadsheet();
ss.addRow(20);
ss.addColumn(30);

Spreadsheet Ss1 = new MsExcel();
Ss1.addRow(30);
Ss1.addColumn(10);


MathOperation Mo = new MathOperation();
System.out.println(Mo.substraction(200, 140));
System.out.println(Mo.substraction(34,35, 12));
Mo.substraction(12);
Mo.substraction(23);
System.out.println(Mo.substraction(12, 23.2));
}
}

// Make a class Spreadsheet
// Make a function addRow that takes one int -> print( int row added)
// Make a function addColumn that takes one int -> print( int coloumn added)
// Make a subclass from Spreadsheet, MsExcel
// override both the function and print different output
// make attribute fileType as String
// Make an object of Spreadsheet
// Make an Object of Spreadsheet as MsExcel
// run both function from each object

class Spreadsheet {
void addRow(int num1){
System.out.println("int row added");
}

void addColumn (int num1){
System.out.println("int column added");
}
}

class MsExcel extends Spreadsheet {
String fileType;

}

// Make a function substraction
// take two int and return int
// take three double and return double
// take 1 double and print invalid operation
// take 1 int and print invalid operation
// take 2 int and double and return double
// call these function from MathOperation object


class MathOperation{
int substraction(int a, int b){
return a-b;
}

double substraction(double a, double b, double c){
return a-b-c;
}
 

void substraction(double a){
System.out.println("Invalid Operation");
}

void substraction(int a){
System.out.println("Invalid Operation");
}

double substraction(int a , double b){
return b-a;
}
}
