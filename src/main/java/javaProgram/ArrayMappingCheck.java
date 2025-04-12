package javaProgram;

public class ArrayMappingCheck {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 2, 7, 5, 6};
        int[] arr2 = {4, 2, 1, 3, 6, 5, 7};

        for(int i = 0 ; i < arr1.length ; i ++){
            boolean found = false;

            for(int j = 0; j < arr2.length; j ++){
                if(arr1[i] == arr2[j]){
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("found :"+found);
                return;
            }
        }
        System.out.println("found :"+true);
        return;
    }
}
