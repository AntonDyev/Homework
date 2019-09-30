public class Task28 {
    private static <T> void arrays(T[] arr, int index) {
        T[] massive = arr;
        System.out.println(massive[index]);
    }

    public static void main(String[] args) {
        String[] a = {"One", "Two ", "Three"};
        arrays(a, 2);
        Integer[] b = {1, 2, 3, 4, 5, 6, 7};
        arrays(b, 2);
    }
}
