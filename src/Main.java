public class Main {
    public static void main(String[] args) {

        //Task 1

        //1
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        //2
        double[] nums = {1.57, 7.654, 9.986};

        //3
        int[] snums = new int[2];
        snums[0] = 135;
        snums[1] = 225;

        //Task 2
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i<numbers.length-1){
                System.out.print(",");
            }
        }


        System.out.println();

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i<numbers.length-1){
                System.out.print(",");
            }
        }

        System.out.println();

        for (int i = 0; i < snums.length; i++) {
            System.out.print(snums[i]);
            if (i<numbers.length){
                System.out.print(",");
            }
        }


        //Task 3
        System.out.println();

        for (int i = numbers.length -1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i>0){
                System.out.print(",");
            }
        }


        System.out.println();

        for (int i = nums.length -1; i >= 0; i--) {
            System.out.print(nums[i]);
            if (i>0){
                System.out.print(",");
            }
        }

        System.out.println();


        for (int i = snums.length -1; i >= 0; i--) {
            System.out.print(snums[i]);
            if (i>0){
                System.out.print(",");
            }
        }


        //Task 4
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] %2 !=0){
                numbers[i]++;
            }
            System.out.print(numbers[i]);
            if (i<2){
                System.out.print(",");
            }
        }


    }
}