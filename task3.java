public class task3 {
    public static boolean isPolyndrome(String str){
        var strReverse = "";
        for(int i = str.length() - 1; i >= 0; i--){
            strReverse += str.charAt(i);
        }
        return str.equalsIgnoreCase(strReverse);
    }
    public static void main(String[] args){
        System.out.println(isPolyndrome("Шалаш"));
    }
}