public class Steel {
    public static void main(String[] args){
        int n=5;

       for(int i=0;i<=n;i++){
           int space=n-i;
           for(int j=1;j<=n;j++) {
               if(space>=j)
                  System.out.print(" ");
               else
                   System.out.print(j-space);
           }
           System.out.println();
       }
    }
}
