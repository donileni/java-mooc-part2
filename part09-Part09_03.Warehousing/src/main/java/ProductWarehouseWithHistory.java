
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory changeHistoryObject = new ChangeHistory();
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super (productName, capacity);
        super.addToWarehouse(initialBalance);
        this.changeHistoryObject.add(initialBalance);
    }
    
    public String history(){
        return this.changeHistoryObject.toString();
    } 
    
    public void addToWarehouse(double amount){
        double result = (double) super.getBalance() + amount; 
        this.changeHistoryObject.add(result);
        
        super.addToWarehouse(amount);
    }
    
    public double takeFromWarehouse(double amount){
        double result = (double) super.getBalance() - amount;
        this.changeHistoryObject.add(result);
        
        return super.takeFromWarehouse(amount);
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + history()); 
        System.out.println("Largest amount of product: " + this.changeHistoryObject.maxValue());
        System.out.println("Smallest amount of product: " + this.changeHistoryObject.minValue());
        System.out.println("Average: " + this.changeHistoryObject.average());
    }
}
