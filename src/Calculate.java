public class Calculate {

    public double additionMethod(double a, double b) {
        return a + b;
    }

    public double subtractionMethod(double a, double b) {
        return a - b;
    }
    public double multiplicationMethod(double a, double b) {
        return a * b;
    }
    public double divisionMethod(double a, double b) {
        if(b == 0) {
            return 1;
        }
        else{
            return a / b;
        }
    }
}
