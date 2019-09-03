package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {

    private java.util.Date Date;
    UserDemography userDemography;


    @Test
    public void buildUserDemography() {

        userDemography = UserDemographyFactory.buildUserDemography("zeegee@mail.com","Miss","001","002",Date);
        Assert.assertNotNull(userDemography.getGenderId(),userDemography.getRaceId());
        Assert.assertEquals("zeegee@mail.com",userDemography.getUserEmail());
        Assert.assertEquals("Miss", userDemography.getUserTitle());
        Assert.assertEquals("001",userDemography.getGenderId());
        Assert.assertEquals("002",userDemography.getRaceId());
    }
}