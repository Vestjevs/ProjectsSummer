package Book.Implements;

import java.util.Objects;

public class GenericMethodDemo {

    /*The generalized method(Обобщённый метод)
    * <список_параметров_типа> возвращаемый тип имя_метоа(список параметров) {//
    *
    *
    *
    * */
    protected <T extends Comparable<T>, V extends Number> boolean
    arraysEqual(T[] x, V[] y) {
//        if (x.length != y.length) return false;

        for (int i = 0; i < x.length; i++) {
            for (int i1 = 0; i1 < y.length; i1++) {
                if (!x[i].equals(y[i]))
                    return false;
            }
        }
        return true;
    }

    private static <T extends Comparable<T>, V extends T> boolean
    stringEqual(String x, String y) {
//        if (x.length() != y.length()) return false;
        for (int i = 0; i < x.length(); i++) {
//            for (int j = 0; j < y.length(); j++) {
            if (!Objects.equals(x.charAt(i), y.charAt(i))) return false;

        }
        return true;
    }

    public static void main(String[] args) {
        Integer nums1[] = new Integer[5];
        Double nums2[] = new Double[5];
        Integer nums3[] = {1, 2, 7, 4, 5};
        Integer nums4[] = {1, 2, 7, 4, 5, 6};
        String str1 = "abcdefu";
        String str2 = "abcdefg";

        if (stringEqual(str1, str2)) {
            System.err.println("str1 equal str2");
        } else System.err.println("str1 !equal str2");

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = i + 1;
            nums2[i] = i + 1.0;
        }

//        if (arraysEqual(nums1, nums1))
//            System.err.println("nums1 equals nums1");
//        if (arraysEqual(nums1, nums2))
//            System.err.println("nums1 equals nums2");
//        if (arraysEqual(nums1, nums3))
//            System.err.println("nums1 equals nums3");
//        if (arraysEqual(nums1, nums4))
//            System.err.println("nums1 equals nums4");
//        Double dvals[] = new Double[5];
//        for (int i = 0; i < dvals.length; i++) {
//            dvals[i] = i + 1.1;
//        }
//        if (arraysEqual(nums1, dvals)) {
//            System.err.println("nums equals dvals");
//        }


    }
}
