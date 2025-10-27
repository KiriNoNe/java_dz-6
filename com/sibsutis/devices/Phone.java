package com.sibsutis.devices;
import com.sibsutis.devices.Device;

public class Phone extends Device{
    public Phone(int id, int price){
        super(id, price, "");
    }
    public Phone(int id, int price, String ip){
        super(id, price, ip);
    }
    @Override
    public String getDeviceType(){
        return "Phone";
    }
}