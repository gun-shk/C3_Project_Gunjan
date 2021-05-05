import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderTotalTest {
    Restaurant restaurant;

    //>>>>>>>>>>>>>>>>>>>>>>>>>>>ORDER TOTAL<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    @Test
    public void calculate_item_total(){
        LocalTime openingTime = LocalTime.parse("10:30:00");
        LocalTime closingTime = LocalTime.parse("22:00:00");
        restaurant =new Restaurant("Amelie's cafe","Chennai",openingTime,closingTime);
        restaurant.addToMenu("Sweet corn soup",119);
        restaurant.addToMenu("Vegetable lasagne", 269);
        restaurant.addToOrder(119);
        restaurant.addToOrder(269);

        int orderTotal = restaurant.getOrderTotal();

        restaurant.addToMenu("Sizzling brownie",319);
        restaurant.addToOrder(319);
        assertEquals(orderTotal+ 319,restaurant.getOrderTotal());
    }


    //<<<<<<<<<<<<<<<<<<<<<<<ORDER TOTAL>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
}