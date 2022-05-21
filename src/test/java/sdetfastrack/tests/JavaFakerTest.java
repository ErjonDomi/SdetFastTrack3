package sdetfastrack.tests;


import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerTest {

    @Test
    public void javaFaker(){
        Faker faker=new Faker();

        String firsName=faker.name().firstName();
        System.out.println("firsName = " + firsName);

        String fullName=faker.name().fullName();
        System.out.println("fullName = " + fullName);

        String address=faker.address().fullAddress();
        System.out.println("address = " + address);

        String ssn= faker.idNumber().ssnValid();
        System.out.println("ssn = " + ssn);

        String cc=faker.business().creditCardNumber();
        System.out.println("cc = " + cc);

    }

}
