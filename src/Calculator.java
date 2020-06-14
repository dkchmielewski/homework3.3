class Calculator {
        Boolean isEven(int x) {
            Integer modEven = x % 2;
            boolean even = modEven == 0;
            return even;
        }
        Boolean isOdd(int y) {
            Integer modOdd = y % 2;
            boolean odd = modOdd != 0;
            return odd;
        }
        Double circleField(double r) {
            Double result = 0.0;
            result = 3.14 * (r * r);
            return result;
        }
        Integer power(Integer z) {
            Integer result = z * z;
            return result;
        }
}
