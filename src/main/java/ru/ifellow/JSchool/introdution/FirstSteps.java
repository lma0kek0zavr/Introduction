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
        int sum = 0;

        if (array == null) {
            sum = 0;
        }

        for (int i = 0; i <= array.length - 1; i++) { 
            sum += array[i];
        }

        return sum;
    }

    public int mul(int[] array){
        int res = 1;

        if (array == null) {
            res = 0;
        }

        for (int i = 0; i <= array.length - 1; i++) { 
            res *= array[i];
        }

        return res;
    }

    public int min(int[] array){
        int min = Integer.MAX_VALUE;

        if (array == null) {
            return min;
        }

        for (int i = 0; i <= array.length - 1; i++) { 
            min = min < array[i] ? min : array[i];
        }

        return min;
    }

    public int max(int[] array){
        int max = Integer.MIN_VALUE;
        
        if (array == null) {
            return max;
        }

        for (int i = 0; i <= array.length - 1; i++) { 
            max = array[i] > max ? max : array[i];
        }

        return max;
    }

    public double average(int[] array){
        int sum;
        if (array == null) {
            sum = 0;
        }

        sum = sum(array);
        return (double)sum / array.length;
    }

    public boolean isSortedDescendant(int[] array){
        boolean isSorted = true;

        if (array == null) { 
            return isSorted;
        }
        
        for (int i = 0; i < array.length - 1; i++) { 
            if (array[i] < array[i + 1]) {
                isSorted = false;
                break;
            }
        }

        return isSorted;
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
        if (array == null) {
            return false;
        }

        int[] temp = new int[array.length];
        System.arraycopy(array, 0, temp, 0, array.length);        
        reverse(temp);

        return array == temp;
    }

    public int sum(int[][] matrix){
        int sum = 0;

        for (int[] i : matrix) {
            sum += sum(i);
        }

        return sum;
    }

    public int max(int[][] matrix){
        int max = Integer.MIN_VALUE;

        for (int[] i : matrix) {
            max = max(i) > max ? max(i) : max;
        }

        return max;
    }

    public int diagonalMax(int[][] matrix){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            max = matrix[i][i] > max ? matrix[i][i] : max;
        }

        return max;
    }

    public boolean isSortedDescendant(int[][] matrix){
        boolean isSorted = true;

        if (matrix == null) { 
            return isSorted;
        }

        for (int[] i : matrix) {
            if (!isSortedDescendant(i)) {
                isSorted = false;
                break;
            }
        }

        return isSorted;
    }
}
