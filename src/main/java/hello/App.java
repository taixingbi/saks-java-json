package hello;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("----------app----------");
        serializeUserObj();
        System.out.println("----------app end----------");
    }

    private static void serializeUserObj(){
        List<Orders> orders= new ArrayList<>();
        orders.add( new Orders("370", "USD", "Customer_id_001", "Order_00014-B", "OK", "2019-04-02T10:45:53+01", "Trx-00321"));
        Payment restaurant = new Payment(orders);
        Gson gson = new Gson();
        String json= gson.toJson(restaurant);
        System.out.println("json: "+ json);
    }
}
