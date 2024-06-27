public class PolymorphismTask {
    public static void main(String[] args) {
       
        Spreadsheet ss = new Spreadsheet();
        ss.addRow(20);
        ss.addColumn(30);

      
        Spreadsheet ss1 = new MsExcel();
        ss1.addRow(30);
        ss1.addColumn(10);

        MathOperation mo = new MathOperation();
        System.out.println(mo.subtract(200, 140));
        System.out.println(mo.subtract(34, 35, 12));
        mo.subtract(12);
        mo.subtract(23);
        System.out.println(mo.subtract(12, 23.2));
    }
}


class Spreadsheet {
    void addRow(int num) {
        System.out.println(num + " row added");
    }

    void addColumn(int num) {
        System.out.println(num + " column added");
    }
}


class MsExcel extends Spreadsheet {
    String fileType;

    @Override
    void addRow(int num) {
        System.out.println(num + " row added in MsExcel");
    }

    @Override
    void addColumn(int num) {
        System.out.println(num + " column added in MsExcel");
    }
}

class MathOperation {
    int subtract(int a, int b) {
        return a - b;
    }

    double subtract(double a, double b, double c) {
        return a - b - c;
    }

    void subtract(double a) {
        System.out.println("Invalid Operation");
    }

    void subtract(int a) {
        System.out.println("Invalid Operation");
    }

    double subtract(int a, double b) {
        return b - a;
    }
}
