import org.joda.time.LocalTime;

//import java.time.LocalTime;

public class Hello {
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("local time is: " + currentTime);
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
