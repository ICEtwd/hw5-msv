public class Main {
    public static void main(String[] args) {

        //Task 1

        //1
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        int one = numbers[0];
        int two = numbers[1];
        int three = numbers[2];

        //2
        double[] nums = {1.57, 7.654, 9.986};

        //3
        int[] snums = new int[2];
        snums[0] = 135;
        snums[1] = 225;

        //Task 2
        for (int i = 0; i < 3; i++) {
            System.out.print(numbers[i]+",");
        }


        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.print(nums[i]+",");
        }

        System.out.println();

        for (int i = 0; i < 2; i++) {
            System.out.print(snums[i]+",");
        }


        //Task 3
        System.out.println();

        System.out.print(three + ",");
        System.out.print(two + ",");
        System.out.print(one);

        System.out.println();


        System.out.print(nums[2] + ",");
        System.out.print(nums[1] + ",");
        System.out.print(nums[0]);

        System.out.println();

        System.out.print(snums[1] + ",");
        System.out.print(snums[0]);


        //Task 4
        System.out.println();

        for (int i = 0; i < 3; i++) {
            if (numbers[i] %2 !=0){
                numbers[i]++;
                System.out.print(numbers[i]);
            }else {
                System.out.print(numbers[i]);
            }
        }


    }
}