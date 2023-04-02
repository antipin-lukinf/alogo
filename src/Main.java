public class Main {
    public static void main(String[] args) {
//        Реализовать сортировку подсчетом
//        Она заключается в подсчете количества вхождений элементов в массив и восстановление по этой информации.
//        [1, 3, 1, 5, 7, 7, 3, 2, 5, 7]
//        1 -> 2
//        2 -> 1
//        3 -> 2
//        5 -> 2
//        7 -> 3
//                [1, 1, 2, 3, 3, 5, 5, 7, 7, 7]

        int[] arrayChis = new int [] {1, 3, 1, 5, 7, 7, 3, 2, 5, 7};
        int[] arrayCount = new int [arrayChis.length+1];


        for (int arr : arrayChis) {
            System.out.print(arr);
            System.out.print(' ');
            arrayCount[arr]++;
        }
        System.out.println(' ');

        int b = 0;
        for (int i = 0; i < arrayChis.length; i++) {
            for (int j = 0; j < arrayCount[i]; j++) {
                arrayChis[b++] = i;

                System.out.print(i);
                System.out.print(' ');
            }
        }
    }

}