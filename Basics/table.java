public class table{
    public static void main (String[] args){
        for(int i=1; i<=20; i++) {
            int tableOf = i;
            for(int j=1; j<=20; j++) {
                System.out.print(tableOf * j +" ");
            }
            System.out.println();
        }
    }
}