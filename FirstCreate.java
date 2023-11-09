import java.util.Arrays;

public class FirstCreate {
    public static int searchInsert(int[] nums, int target) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i; // Если число найдено, возвращаем индекс
            } else if (target < nums[i]) {
                break; // Если число меньше, прерываем цикл
            }
            index++;
        }

        // Если число не найдено, добавляем его в нужное место и сортируем
        int[] newNums = Arrays.copyOf(nums, nums.length + 1);
        newNums[nums.length] = target;
        Arrays.sort(newNums);

        for (int i = 0; i < newNums.length; i++) {
            if (target == newNums[i]) {
                return i; // Возвращаем индекс вставленного числа
            }
        }

        return index;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 2, 5, 6}, 5));
        System.out.println(searchInsert(new int[]{1, 2, 5, 6}, 2));
        System.out.println(searchInsert(new int[]{1, 2, 5, 6}, 7));
    }
}
