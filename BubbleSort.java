public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={23,45,3,21,463,223,1,32,98};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp; 
                }  
            } 
        }
        System.out.println("The sorted array array by Using Bubble Sort: " );
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}