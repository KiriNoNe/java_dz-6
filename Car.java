public class Car {
    private int id;
    private String marka;
    private String model;
    private int year;
    private String color;
    private Double cost;
    private int reg_num;
    
    public Car(int id, String marka, String model, int year, String color, Double cost,int reg_num){
        this.id = id;
        this.marka = marka;
        this.model = model;
        this.year = year;
        this.color = color;
        this.cost = cost;
        this.reg_num = reg_num;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getMarka(){
        return marka;
    }
    public void setMarka(String marka){
        this.marka = marka;
    }

    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public Double getCost(){
        return cost;
    }
    public void setCost(Double cost){
        this.cost = cost;
    }

    public int getReg_num(){
        return reg_num;
    }
    public void setReg_num(int reg_num){
        this.reg_num = reg_num;
    }
}
