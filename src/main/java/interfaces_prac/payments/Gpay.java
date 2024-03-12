package interfaces_prac.payments;

import java.util.List;

public class Gpay implements PaymentsGateway{

    @Override
    public void doTransaction(Long mobileNum, List<String> BankDetails) {
        System.out.println("payment completed");
    }

    @Override
    public void mobileRecharge(Long mobileNum) {
        System.out.println("Mobile recharge successful");
    }
}
