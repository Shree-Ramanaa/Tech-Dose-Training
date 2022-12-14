void selectionSort(int[] arr){
    for(int i=0; i<arr.length - 1; i++){
        int minInd = i;
        for(int j = i+1; j<arr.length; j++){
            if(arr[minInd]>arr[j]){
                minInd = j;
            }
        }
        swap(minInd,i);
    }
}

public void swap(int a , int b , int[] arr){
    arr[a] ^= arr[b];
    arr[b] ^= arr[a];
    arr[a] ^= arr[b];
}


/*

Time Complexity 
-----------------
Best Case : O(N^2)
Worst Case : O(N^2)
Average Case : O(N^2)

Not depend on nature of the input
*/
