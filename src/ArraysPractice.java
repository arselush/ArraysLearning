public class ArraysPractice {
    public static void main(String[] args) {
       int[] array = {2, 3, 4, 5, 6};
//        for(int i = 0;i < array.length;i++){
//            if (array[i] % 2 == 0){
//                System.out.print(array[i] + " ");
//            }
//        }
        int result = 1;
        for (int i = 0; i < array.length; i++) {
           result *= array[i];
        }
        System.out.println(result);
    }
}
