public class _26_RemoveDuplicatesFromSortedArray {

    private static final int[] INPUT_1 = new int[]{1, 1, 2};
    private static final int[] INPUT_2 = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

    //Input: nums = [0,0,1,1,1,2,2,3,3,4]
    //Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
    //
    //Модифицировать отсортированный массив убрав дубликаты в начале массива
    public static void main(String[] args) {
        System.out.println(removeDuplicates(INPUT_1)); //2
        System.out.println(removeDuplicates(INPUT_2)); //5
    }

    //O(n) //O(1)
    private static int removeDuplicates(int[] nums) {
        //Указатель на текущий индекс уникального элемента
        int insertIndex = 1;

        for (int i = 1; i < nums.length; i++) {
            //Если следующий элемент отличается, перемещаем его на текущий индекс и увеличиваем индекс
            if (nums[i - 1] != nums[i]) {
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        return insertIndex;
    }
}
