package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRoleFactoryTest {


    @Test
    public void buildUserRole() {
        UserRole userRole = UserRoleFactory.buildUserRole("001","zeegee@mail.com","002");
        Assert.assertEquals("001",userRole.getOrgCode());
        Assert.assertEquals("zeegee@mail.com",userRole.getUserEmail());
        Assert.assertEquals("002", userRole.getRoleId());
    }
}