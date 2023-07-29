import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterf {
ATM atm=new ATM();
Map<Double,String>ministmt=new HashMap<>();
    @Override
public void viewBalance(){
System.out.println("Available balance is " +atm.getBalance());
}
@Override
public void withdrawAmount(double withdrawAmount){
if(withdrawAmount<=atm.getBalance()){
   ministmt.put(withdrawAmount,"Amount Withdrawn"); 
System.out.println("Collect the Cash"+withdrawAmount);
atm.setBalance(atm.getBalance()-withdrawAmount);
viewBalance();
}
else{
    System.out.println("Insufficient Balance");
}
}
@Override
public void depositAmount(double depositAmount){
    ministmt.put(depositAmount,"Amount Deposit");
System.out.println(depositAmount+"Deposited successfully");
atm.setBalance(atm.getBalance()+depositAmount);
viewBalance();
}
@Override
public void viewMiniStatement(){
     for(Map.Entry<Double,String>m:ministmt.entrySet()){
        System.out.println(m.getKey()+""+m.getValue());
     }
}
}