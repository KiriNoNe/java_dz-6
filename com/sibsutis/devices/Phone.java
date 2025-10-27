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
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (!(obj instanceof Phone)) return false;
        Phone ph = (Phone) obj;
        return this.getId() == ph.getId() && this.getPrice() == ph.getPrice() && this.getIp() == ph.getIp();  
    }
    @Override
    public int hashCode(){
        int result =  Integer.hashCode(getId());
        result = 31 * result + Intager.hashCode(getPrice());
        result = 31* result + getIp().hashCode();
        return result;
    }
}