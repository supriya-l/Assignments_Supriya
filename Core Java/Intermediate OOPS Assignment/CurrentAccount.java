import java.util.ArrayList;
class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() {	
    	return totalDeposits - creditLimit;}
}
class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash() {
    	return totalDeposits + fixedDepositAmount;
    		}
}
 class Assignment2Q3 {
    public static int totalCashInBank(ArrayList<Integer> cash){
    	int total = 0;
    	
        for(int i = 0; i < cash.size(); i++)
               total += cash.get(i);
        return total;
    }
    
    public int getCash(){
    	return 0;
    }
    public static void main(String[] args) {
    	CurrentAccount curAccount = new CurrentAccount();
    	SavingsAccount sbAccount = new SavingsAccount();
    	
    	int curAmount = curAccount.getCash();
    	int sbAmount = sbAccount.getCash();
    	
    	ArrayList<Integer> cash = new ArrayList<Integer>(2);
    	cash.add(curAmount);
    	cash.add(sbAmount);
    	System.out.println("Total cash in the Bank is "+totalCashInBank(cash));
    }
}