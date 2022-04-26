public class Main {
    public static void main(String[] args) {

        Calculator adding = new Calculator(10,5);
        Calculator subtraction = new Calculator(20,7);
        Calculator multiplication = new Calculator(3,5);
        Calculator division = new Calculator(25,5);


        subtraction.numbers();
        System.out.println(adding.getX());
        System.out.println(multiplication.getX());
        multiplication.setX(7);
        System.out.println(multiplication.getX());
        System.out.println(adding.getSum());
        System.out.println(multiplication.getProduct());
        System.out.println(division.getQuotient());




    }
}
