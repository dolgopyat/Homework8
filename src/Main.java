public class Main {
    public static void main(String[] args) {
        // Задача 1-2.
        System.out.println("   Задача 1-2.");
        int [] number = new int [3];
        number [0] = 1;
        number [1] = 2;
        number [2] = 3;
        for (int i = 0; i < number.length; i++) {
            System.out.print(number [i] + ", ");
        }
        System.out.println();
        double [] fractionals = {1.57, 7.654, 9.986};
        for (int a = 0; a < fractionals.length; a++){
            System.out.print(fractionals[a] + ", ");
        }
        System.out.println();
        int [] numbers1 = {5, 10, 15};
        for (int b = 0; b < number.length; b++) {
            System.out.print(numbers1[b] + ", ");
        }
        // Дальше нифига не получается, где запись разбора домашек??? Там запись не с нашего курса!!!
    }
}