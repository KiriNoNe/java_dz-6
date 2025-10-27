package com.sibsutis.devices;
import com.sibsutis.devices.Device;

class PersonalComputer extends Device {
    public PersonalComputer(int id, int price){
        super(id, price, "");
    }
    public PersonalComputer(int id, int price, String ip){
        super(id, price, ip);
    }

    @Override
    public  String getDeviceType(){
        return "PersonalComputer";
    }
}