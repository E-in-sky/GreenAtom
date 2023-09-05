public class task2 {
    public static void swap(int numFirst, int numSecond) {
        System.out.println(numFirst + " " + numSecond);
        numFirst += numSecond;
        numSecond = numFirst - numSecond;
        numFirst -= numSecond;
        System.out.println(numFirst + " " + numSecond);
    }
    public static void main(String[] args){
        var num1 = 21;
        var num2 =13;
        swap(num1, num2);
    }
}
