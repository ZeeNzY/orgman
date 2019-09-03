package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {


    @Test
    public void buildOrganisationUser() {
        OrganisationUser organisationUser = OrganisationUserFactory.buildOrganisationUser("011","zeegee@mail.com");
        Assert.assertNotNull(organisationUser.getOrgCode());
        Assert.assertEquals("zeegee@mail.com",organisationUser.getUserEmail());
        Assert.assertEquals("011",organisationUser.getOrgCode());
    }
}