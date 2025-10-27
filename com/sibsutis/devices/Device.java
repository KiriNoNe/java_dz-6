package com.sibsutis.devices;
import com.sibsutis.Printable;
abstract public class Device implements Printable{
    private int id;
    private int price;
    private String ip;

    public Device(int id,int price, String ip){
        this.id = id;
        this.price = price;
        this.ip = ip;
    }
    public int getId(){
        return id;
    }   
    public int getPrice(){
        return price;
    }

    public String getIp(){
        return ip;
    }
    
    @Override
    public String print(){
        System.out.println(this.id + this.price + this.ip);
        return this.id + this.price + this.ip;
    }

    public abstract String getDeviceType();
}