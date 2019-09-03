package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {


    @Test
    public void buildUser() {
        User user = UserFactory.buildUser("zeegee@mail.com","Zinzi","Gulwa");
        Assert.assertEquals("zeegee@mail.com",user.getUserEmail());
        Assert.assertEquals("Zinzi",user.getFirstName());
        Assert.assertEquals("Gulwa", user.getLastName());
    }
}