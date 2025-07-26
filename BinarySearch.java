public class BinarySearch {
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7,8,9,10};
        int lowerBound=0;
        int upperBound=a.length-1;
        int key=7;
        while(lowerBound<=upperBound){
           int mid=(lowerBound+upperBound)/2;
           if(a[mid]==key){
            System.out.println("Element found at the position of "+mid);
            break;
           }
           else if (a[mid]<key) {
             lowerBound=mid+1;
               
           }
           else if (a[mid]>key) {
            upperBound=mid-1;
               
           }
        }
    }
}
