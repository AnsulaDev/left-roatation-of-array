 class Leftotation {
    static void leftrotation(int a[],int n){
        int res = a[0];
        for(int i=1; i<n;i++){
            a[i-1]=a[i];



        }
        a[n-1]=res;


    }
     public static void main(String args[]){
         int a[] = {10, 5, 0, 8, 0, 9};
         int n = 6;
         leftrotation(a,n);
         for(int i =0;i<n;i++){
             System.out.print(a[i] + " ");
         }
     }

}
