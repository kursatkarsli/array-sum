 public class NewClass {
    public static void main(String[] args) {      
       int result = 0;
       Scanner s = new Scanner(System.in);
       int a = s.nextInt();
       int[] array = new int[a];
       for (int i = 0 ; i<array.length ; i++){
           int b = s.nextInt();
           array[i] = b;
       }
           for (int j = 0; j < array.length; j++) {
               result += array[j];
       }
           System.out.println(result);
