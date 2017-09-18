
public class Main {
    public static void sortArr(int arr[], int len){
        int j = 0;
        for (int i=0; i<len; i++){
            if(arr[i] == 0){
               arr[j++] = 0;
            }
        }
        for(int i=j; i<len;i++){
            arr[j++] =1;
        }

    }

    public static void main(String[] args) {
        int a[] = {0,0,1,0,1,10,0,0};
        int n = a.length;
        sortArr(a, n);
        for(int k=0;k<n;k++){
            System.out.print(a[k]+ " ");
        }
    }
}
