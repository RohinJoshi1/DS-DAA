import java.util.Arrays;

public class beatifulArray {
    public static void main(String[] args) {
        int arr[] = {-1,1,3};
        int ans = solve(arr);
        System.out.println(ans);

    }
    static int solve(int[] arr){
    //     int min = Integer.MAX_VALUE;
    //     int size = arr.length;
    //     int df = 0;
    //     int p[] = new int[size+1];
    //     p[0]=0;
    //     for(int i=1;i<size;i++){
    //         p[i] = p[i-1] + arr[i-1];
    //     }
    //     Arrays.sort(p);
    //     System.out.println(Arrays.toString(p));
    //     for(int i=1;i<p.length-1;i++){
    //         df = p[i] - p[i-1];
    //         if(df<min){
                
    //             min = df;
                
          
    //         }
    //     }
    //     return min;
    // }
    int val = Math.abs(arr[0]);
    int currMin = val;
    int Min = val;
    for(int i=0;i<arr.length;i++){
        currMin = Math.min(Math.abs(arr[i]),Math.abs(currMin+arr[i]));
        Min = Math.min(currMin,Min);

    }
    return Min;
}}
