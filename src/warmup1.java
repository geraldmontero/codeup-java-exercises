public class warmup1 {
    public static void main(String[] args) {
//Write a program that creates an array, and then prints the sum of the even and odd integers in a new array [sumOdd, sumEven]
        int arr[]={12,43,57,66,69,84};
        int oddSum=0,evenSum=0;
        for(int i=0; i<6; i++){
            if(arr[i]%2==0){
                evenSum=evenSum+arr[i];
            }
            else{
                oddSum=oddSum+arr[i];
            }
        }
        System.out.println("\nSum of even is: "+evenSum);
        System.out.println("\nSum of odd is: "+oddSum);
    }
}
















