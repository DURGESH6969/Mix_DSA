public class FindingBounds {


        static int lower(int[] arr,int x)
        {
            int ans=-1;
            int n = arr.length;
            int low=0;
            int high=n-1;

            while(low<=high)
            {
                int mid = (low+high)/2;

                if(arr[mid]>=x){
                    ans=mid;
                    high=mid-1;
                }
                else
                {
                    low=mid+1;
                }
            }
            return ans;
        }

        static int upper(int[] arr,int x) {
            int ans = -1;
            int n = arr.length;
            int low = lower(arr, x);
            int high = n - 1;

            while (low <= high) {
                int mid = (low + high) / 2;

                if (arr[mid] <= x) {
                    ans = mid;
                    high = mid + 1;
                } else {
                    low = mid - 1;
                }
            }
            return ans;

        }

    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int x=8;
        System.out.println(lower(arr,x));
        System.out.println(upper(arr,x));
    }
    }

