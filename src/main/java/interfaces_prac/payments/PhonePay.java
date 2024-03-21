package interfaces_prac.payments;

import java.util.List;

public class PhonePay implements PaymentsGateway {
    @Override
    public void doTransaction(Long mobileNum, List<String> BankDetails) {

    }

    @Override
    public void mobileRecharge(Long mobileNum) {

    }


}
