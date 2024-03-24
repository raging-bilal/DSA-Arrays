public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={232,453,2,345,32,25455,11,23};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int minValue=arr[minIndex];
            for(int k=minIndex;k>i;k--){
                arr[k]=arr[k-1];
            }
            arr[i]=minValue;
        }
        System.out.println("Sorted array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        // System.out.println();
    }
    
}
