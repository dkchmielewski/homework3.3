class Calculations {
    public static void main(String[] args) {
        Calculator calculation = new Calculator();
        calculation.isEven(9);
        System.out.println("Is x even?: " + calculation.isEven(9));
        calculation.isOdd(7);
        System.out.println("Is y odd?: " + calculation.isOdd(7));
        calculation.circleField(5.0);
        System.out.println("The circle field with radius 5.0 is: "
                + calculation.circleField(5.0));
        calculation.power(4);
        System.out.println("The square of z is equal to: " + calculation.power(4));

    }
}
