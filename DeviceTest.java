
import com.sibsutis.devices.PersonalComputer;
import com.sibsutis.devices.Phone;
import com.sibsutis.devices.Device;

public class DeviceTest {
    public static void main(String[] args) {

        // Создание объектов
        PersonalComputer pc1 = new PersonalComputer(1, 50000, "192.168.0.1");
        PersonalComputer pc2 = new PersonalComputer(1, 50000, "192.168.0.1");
        PersonalComputer pc3 = new PersonalComputer(2, 60000);

        Phone phone1 = new Phone(10, 20000, "10.0.0.1");
        Phone phone2 = new Phone(10, 20000, "10.0.0.1");
        Phone phone3 = new Phone(11, 25000);

        // --- Тест print() ---
        System.out.println("=== Print тест ===");
        System.out.println(pc1.print());
        System.out.println(phone1.print());

        // --- Тест getDeviceType() ---
        System.out.println("\n=== getDeviceType() тест ===");
        System.out.println(pc1.getDeviceType());
        System.out.println(phone1.getDeviceType());

        // --- Тест equals() ---
        System.out.println("\n=== equals() тест ===");
        System.out.println("pc1 equals pc2? " + pc1.equals(pc2)); // true
        System.out.println("pc1 equals pc3? " + pc1.equals(pc3)); // false
        System.out.println("phone1 equals phone2? " + phone1.equals(phone2)); // true
        System.out.println("phone1 equals phone3? " + phone1.equals(phone3)); // false
        System.out.println("pc1 equals phone1? " + pc1.equals(phone1)); // false

        // --- Тест hashCode() ---
        System.out.println("\n=== hashCode() тест ===");
        System.out.println("pc1.hashCode() = " + pc1.hashCode());
        System.out.println("pc2.hashCode() = " + pc2.hashCode());
        System.out.println("pc3.hashCode() = " + pc3.hashCode());
        System.out.println("phone1.hashCode() = " + phone1.hashCode());
        System.out.println("phone2.hashCode() = " + phone2.hashCode());
        System.out.println("phone3.hashCode() = " + phone3.hashCode());

        // Проверка согласованности equals() и hashCode()
        System.out.println("\n=== equals и hashCode согласованность ===");
        System.out.println("pc1.equals(pc2) && pc1.hashCode() == pc2.hashCode()? " +
                (pc1.equals(pc2) && pc1.hashCode() == pc2.hashCode()));
        System.out.println("phone1.equals(phone2) && phone1.hashCode() == phone2.hashCode()? " +
                (phone1.equals(phone2) && phone1.hashCode() == phone2.hashCode()));
    }
}
