package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createCatTest() {
        String name = "Opie";
        Date birthDate = new Date();
        Cat testCat = AnimalFactory.createCat(name, birthDate);
        Assert.assertEquals("meow!", testCat.speak());
        Assert.assertEquals("Opie", testCat.getName());
    }

    @Test
    public void createDogTest() {
        String name = "Maximus";
        Date birthDate = new Date();
        Dog testDog = AnimalFactory.createDog(name, birthDate);
        Assert.assertEquals("bark!", testDog.speak());
        Assert.assertEquals("Maximus", testDog.getName());



    }
}
