public class LogicalOperator {
    static void main(String[] args) {
        int a = 100;
        int b  = 20;
        int c = 30;

        if (a > b && a > c){
            System.out.println("A is greater");
        } else if (b > c) {
            System.out.println("B is Greater");
        }else{
            System.out.println("C is greater");
        }
    }
}
