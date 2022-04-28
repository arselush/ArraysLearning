public class ArraysIntroPractice {
    public static void main(String[] args) {
        int[] array = {1, 4, 8, 10};
        for(int i = 0;i < array.length;i++){
            System.out.print(array[i] + " ");
        }
        for(int i = array.length - 1;i >= 0;i--){
            System.out.print(array[i] + " ");
        }
        for(int i = 0;i < array.length;i++){
            array[i] += 10;
            System.out.print(array[i] + " ");
        }
        for(int i = 0;i < array.length;i++){
            array[i] *= 5;
            System.out.print(array[i] + " ");
        }
        for(int i = 0;i < array.length;i++) {
            if(array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        int result = 0;
        for(int i = 0;i < array.length;i++){
            result += array[i];
        }
        System.out.print(result);
        int result = 1;
        for(int i = 0;i < array.length;i++){
            result *= array[i];
        }
        System.out.print(result);

    }
}
