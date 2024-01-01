package loops;
// print odd number using continue
public class continuestatement {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%2==0){
                continue; // skip this iteration
            }
            System.out.println(i);
        }
    }
}
