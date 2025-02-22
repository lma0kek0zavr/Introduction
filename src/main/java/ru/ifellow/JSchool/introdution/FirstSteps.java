package ru.ifellow.JSchool.introdution;

public class FirstSteps {

    public int sum (int x, int y){
        return x + y;
    }

    public int mul (int x, int y){
        return x * y;
    }

    public int div (int x, int y){
        return x / y;
    }

    public int mod (int x, int y){
        return x % y;
    }

    public boolean isEqual (int x, int y){
        return x == y;
    }

    public boolean isGreater (int x, int y){
        return x > y;
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y){
        return (xLeft <= x && x <= xRight) && (yTop <= y && y <= yBottom);
    }

    public int sum(int[] array){
        if (array == null || array.length == 0) {
            return 0;
        }

        int sum = 0;

        for (int i = 0; i <= array.length - 1; i++) { 
            sum += array[i];
        }

        return sum;
    }

    public int mul(int[] array){
        if (array == null || array.length == 0) {
            return 0;
        }

        int res = 1;

        for (int i = 0; i <= array.length - 1; i++) { 
            res *= array[i];
        }

        return res;
    }

    public int min(int[] array){
        if (array == null || array.length == 0) {
            return Integer.MAX_VALUE;
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= array.length - 1; i++) { 
            min = min < array[i] ? min : array[i];
        }

        return min;
    }

    public int max(int[] array){ 
        if (array == null || array.length == 0) {
            return Integer.MIN_VALUE;
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i <= array.length - 1; i++) { 
            max = array[i] > max ? array[i] : max;
        }

        return max;
    }

    public double average(int[] array){
        if (array == null || array.length == 0) {
            return 0;
        }

        return (double)sum(array) / array.length;
    }

    public boolean isSortedDescendant(int[] array){
        if (array == null || array.length == 0) {
            return true;
        }
        
        for (int i = 0; i < array.length - 1; i++) { 
            if (array[i] < array[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public void cube(int[]array){
        for (int i = 0; i <= array.length - 1; i++) { 
            array[i] = (int)Math.pow(array[i], 3);
        }
    }

    public boolean find(int[]array, int value){
        for (int i = 0; i <= array.length - 1; i++) { 
            if (array[i] == value) {
                return true;
            }
        }

        return false;
    }

    public void reverse(int[]array){
        int[] temp = new int[array.length];
        
        for (int i = array.length - 1; i >= 0; i--) {
            temp[array.length - 1 - i] = array[i];
        }

        System.arraycopy(temp, 0, array, 0, array.length);
    }

    public boolean isPalindrome(int[]array){
        if (array == null || array.length == 0) {
            return true;
        }

        for (int i = 0; i <= array.length - 1; i++) { 
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }

        return true;
    }

    public int sum(int[][] matrix){
        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        int sum = 0;

        for (int[] i : matrix) {
            sum += sum(i);
        }

        return sum;
    }

    public int max(int[][] matrix){
        if (matrix == null || matrix.length == 0) {
            return Integer.MIN_VALUE;
        }

        int max = Integer.MIN_VALUE;

        for (int[] i : matrix) {
            max = max(i) > max ? max(i) : max;
        }

        return max;
    }

    public int diagonalMax(int[][] matrix){
        if (matrix == null || matrix.length == 0) {
            return Integer.MIN_VALUE;
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            max = matrix[i][i] > max ? matrix[i][i] : max;
        }

        return max;
    }

    public boolean isSortedDescendant(int[][] matrix){
        boolean isSorted = true;

        for (int[] i : matrix) {
            if (!isSortedDescendant(i)) {
                isSorted = false;
                break;
            }
        }

        return isSorted;
    }
}
