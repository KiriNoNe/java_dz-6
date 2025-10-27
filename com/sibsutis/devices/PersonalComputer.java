package com.sibsutis.devices;
import com.sibsutis.devices.Device;

public class PersonalComputer extends Device {
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
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (!(obj instanceof PersonalComputer)) return false;
        PersonalComputer pc = (PersonalComputer) obj;
        return this.getId() == pc.getId() && this.getPrice() == pc.getPrice() && this.getIp() == pc.getIp();  
    }
    @Override
    public int hashCode(){
        int result =  Integer.hashCode(getId());
        result = 31 * result + Integer.hashCode(getPrice());
        result = 31* result + getIp().hashCode();
        return result;
    }
}