package test20230718;

public class ArrayCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 課題の説明を表示
        System.out.println("このプログラムは、2つの配列内の最小値と最大値を求め、結果を表示します。");

        // 2つの配列を設定
        int[] array1 = {12, 5, 8, 23, 16, 9, 14}; // 配列1
        int[] array2 = {7, 2, 11, 28, 19, 6, 10}; // 配列2

        // 配列1の最小値と最大値を求めて表示
        int min1 = findMin(array1);
        int max1 = findMax(array1);
        System.out.println("配列1の最小値: " + min1);
        System.out.println("配列1の最大値: " + max1);

        // 配列2の最小値と最大値を求めて表示
        int min2 = findMin(array2);
        int max2 = findMax(array2);
        System.out.println("配列2の最小値: " + min2);
        System.out.println("配列2の最大値: " + max2);
    }

    // 配列内の最小値を求めるメソッド
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // 配列内の最大値を求めるメソッド
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
