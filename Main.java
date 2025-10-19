public class Main {
    public static void main(String[] args){
        Car[] cars = new Car[4];
        cars[0] = new Car(1,"Honda", "ter", 2002, "yellow", 20000.0, 8947534);
        cars[1] = new Car(2,"BMW", "xx", 2001, "green", 22000.0, 437534);
        cars[2] = new Car(3,"Lada", "baical", 2000, "yellow", 23000.0, 8657534);
        cars[3] = new Car(4,"Lada", "seda", 2011, "yellow", 24000.0, 891534);
        
        Car[] ladaCars = getCarByBrend(cars, "Lada");
        System.out.println("Найдено lad: "+ladaCars.length);
        for (Car item : ladaCars){
            System.out.println(item.getId());
            System.out.println(item.getMarka());
            System.out.println(item.getModel());
        }

        System.out.println("Найдено каких-то машин...");
        Car[] Cars2 = getCarByBrendAndYearOperational(cars, "Lada", 20);
        System.out.println("Найдено lad: "+Cars2.length);
        for (Car item : Cars2){
            System.out.println(item.getId());
            System.out.println(item.getMarka());
            System.out.println(item.getModel());
        }
    }
    
    public static Car[] getCarByBrend(Car[] cars, String brend){
        int count = 0;
        for (Car car: cars){
            if(car.getMarka().equalsIgnoreCase(brend)){
                count++;
            }
        }

        Car[] result = new Car[count];
        int index = 0;
        
        for (Car car : cars){
            if(car.getMarka().equalsIgnoreCase(brend)){
                result[index++] = car;
            } 
        }
        
        return result;
    }
    public static Car[] getCarByBrendAndYearOperational(Car[] cars, String brend, int years){
        int count = 0;
        for (Car car: cars){
            if((car.getMarka().equalsIgnoreCase(brend)) && ((2025 - car.getYear()) >= years)){
                count++;
            }
        }

        Car[] result = new Car[count];
        int index = 0;
        
        for (Car car : cars){
            if((car.getMarka().equalsIgnoreCase(brend)) && ((2025 - car.getYear()) >= years)){
                result[index++] = car;
            } 
        }
        
        return result;
    }
}
