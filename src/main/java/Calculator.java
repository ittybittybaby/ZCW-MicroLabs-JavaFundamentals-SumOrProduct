public class Calculator {

    private int number;
    private char operator;

    public Calculator() {
        number = 0;
        operator = ' ';
    }

    public void setNumber(int n) {
        number = n;
    }

    public void setOperator(char op) {
        operator = op;
    }


    public void giveAnswer() {
        int ans = 0;
        if('+' == operator) {
            ans = this.sumAllToNumber(number);
            System.out.println(ans);
        }
        else if(operator == '*') {
            ans = this.productAllToNumber(number);
            System.out.println(ans);
        }
        else {
            System.out.println("Invalid input. Try again.");
        }

    }

    public static int sumAllToNumber(int n) {
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int productAllToNumber(int n) {
        int product = 1;
        for(int i = n; i > 0 ; i--) {
            product *= i;
        }
        return product;
    }
}
