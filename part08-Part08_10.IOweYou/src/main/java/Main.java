
public class Main {

    public static void main(String[] args) {
        // Test your program here
        
        
        IOU mattsIOU = new IOU(); 
        
        mattsIOU.setSum("Anton", 51.1);
        mattsIOU.setSum("Johan", 10);
        
        System.out.println(mattsIOU.howMuchDoIOweTo("Anton"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Johan"));
    }
}
