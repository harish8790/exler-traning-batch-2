public class Demo061 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        if (array.length > 0) {
            int firstElement = array[0]; 
            int lastElement = array[array.length - 1];

            System.out.println("First Element: " + firstElement);
            System.out.println("Last Element: " + lastElement);
        } else {
            System.out.println("The array is empty.");
        }
    }
}
