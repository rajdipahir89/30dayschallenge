class Solution {
    boolean checkTriplet(int[] arr, int n) {
        // code here
       if(n<3)
    return false;
    Arrays.sort(arr);
    for(int i=0;i<n;i++){
        arr[i]=arr[i]*arr[i]; 
    }
    for(int c=2;c<n;c++){
    int a=0,b=1;
    while(b<c&&a>=0){
        if(arr[c]==arr[a]+arr[b])
        return true;
        else if(arr[c]>arr[a]+arr[b])
        {
            a=b;
            b++;
        }
        else{
            a--;
        }
        
    }
    }
    return false;
    }
}