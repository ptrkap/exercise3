import org.misc.House;
import org.misc.Kitchen;
import org.misc.LivingRoom;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringokitoDemo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("conf/spring.services.xml");

        LivingRoom livingRoom = (LivingRoom) context.getBean("livingRoom");
        livingRoom.setWidth(5);

        House house = (House)context.getBean("house");
        System.out.println(house);

        System.out.println(livingRoom);

        Kitchen kitchen = (Kitchen) context.getBean("kitchen");
        System.out.println(kitchen);

    }
}
