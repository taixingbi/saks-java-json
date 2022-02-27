package hello;

public class Orders {
    String amount;
    String currency_iso_code;
    String customer_id;
    String order_id;
    String payment_status;
    String transaction_date;
    String transaction_number;

    public Orders(String amount, String currency_iso_code,
                  String customer_id, String order_id,
                  String payment_status, String transaction_date,
                  String transaction_number) {
        this.amount= amount;
        this.currency_iso_code= currency_iso_code;
        this.customer_id= customer_id;
        this.order_id= order_id;
        this.payment_status= payment_status;
        this.transaction_date= transaction_date;
        this.transaction_number= transaction_number;
    }
}

