package javaProgram;

public class AABBCtoA2B2C {
    public static void main(String[] args) {
        System.out.println("Solution.........");
        String str = "DEE6777";
        char[] c = str.toCharArray();

        StringBuilder result = new StringBuilder();
        int count = 1;
        for(int i = 1; i <= c.length; i++){
            if(i < c.length && c[i-1] == c[i]){
                count++;
            }else{
                result.append(c[i-1]);
                if(count > 1){
                    result.append(count);
                    count =1;
                }
            }
        }
        System.out.println(result);
    }

}
