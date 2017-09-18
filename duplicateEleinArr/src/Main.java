public class Main {
    //hashing
    public static int findDupe(int arr[]){
        boolean visited[] = new boolean[arr.length+1];
        for(int i = 0; i<arr.length; i++){
            if (visited[arr[i]]) {
                return arr[i];
            }
            visited[arr[i]] = true;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,4,3,3};
        System.out.print("Duplicate element is " + findDupe(arr));
    }
}
