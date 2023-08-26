public class BinarySearch {
    private static int b_search(int [] arr,int k)
    {
        int left=0;
        int right=arr.length;

        while(left<=right)
        {
            int mid= left+(right-left)/2;

            if(arr[mid]==k)
                return mid;

            if(arr[mid]<k) left=mid+1;

            if(arr[mid]>k) right = mid-1;

        }
        return -1;
    }

    private static int recursive_BinarySearch(int [] arr,int l,int r,int k){

        if(l<=r)
        {
            int m = l+(r-l)/2;

            if(arr[m]==k) return m;

            if(arr[m]>k) return recursive_BinarySearch(arr,l,m-1,k);

            else return recursive_BinarySearch(arr,m+1,r,k);

        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr={1,4,8,12,18,23};
        int key=12;
        int result = b_search(arr,key);
        if(result!=-1)
            System.out.println("Search successful , element found at index: "+result);
        else System.out.println("Element not found");

        //Using recursion 👇 -------------------X----------------------

        int result2 = recursive_BinarySearch(arr,0,arr.length,key);
        if(result2!=-1)
            System.out.println("Search successful using recursion , element found at index: "+result);
        else System.out.println("Element not found");
    }
}
