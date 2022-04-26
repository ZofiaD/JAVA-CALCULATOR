public class Calculator {
    private int x;
    private int y;



    public Calculator() {
    }

    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public int setY() {
        return y;
    }

    public void numbers() {
        System.out.println(x + " , " + y);
    }

    public int getSum() {
        return  x + y ;

    }

    public int getDifference(){
        return x - y;
    }

    public int getProduct() {
        return x * y;
    }

    public int getQuotient() {
        return x / y ;
    }

}







