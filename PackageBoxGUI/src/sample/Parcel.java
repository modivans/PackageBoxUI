package sample;

import java.util.Date;
import java.util.Random;
import java.text.SimpleDateFormat;

/**
 * Created by Leon on 14.12.17.
 */
public class Parcel {

    int weight;
    String deliveryTime;

    public Parcel() {
        this.weight = generateWeight();
        this.deliveryTime = generateSimpleDateFormat();
    }


    public String getDeliveryTime() {
        return deliveryTime;
    }

    private int generateWeight(){

        Random rand = new Random();

        int  n = rand.nextInt(50) + 1;

        return n;
    }

    private String generateSimpleDateFormat() {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd - HH:mm:ss ");
        Date currentTime = new Date();
        return (formatter.format(currentTime));        // 2012.04.14 - 21:34:07
    }
}
