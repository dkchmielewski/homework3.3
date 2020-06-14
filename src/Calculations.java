class Calculations {
    public static void main(String[] args) {
        Calculator calculation1 = new Calculator();
        calculation1.isEven(9);
        System.out.println("Is x even?: " + calculation1.isEven(9));

        Calculator calculation2 = new Calculator();
        calculation2.isOdd(7);
        System.out.println("Is y odd?: " + calculation1.isOdd(7));

        Calculator calculation3 = new Calculator();
        calculation3.circleField(5.0);
        System.out.println("The circle field with radius 5.0 is: " + calculation3.circleField(5.0));

        Calculator calculation4 = new Calculator();
        calculation4.power(4);
        System.out.println("The square of z is equal to: " + calculation4.power(4));

    }
}
