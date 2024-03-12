package interfaces_prac.payments;

import java.util.List;

public interface PaymentsGateway {

    void doTransaction(Long mobileNum, List<String> BankDetails);

    void mobileRecharge(Long mobileNum);

    default <T> String BookTickets(Long mobileNum, List<T> paymentAppName) {
       return ("your booking is confirmed");
    }
}
