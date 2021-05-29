package usermanagement.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import usermanagement.entity.Person;

@RunWith(MockitoJUnitRunner.class)
public class TransformServiceTest {

    @InjectMocks
    private TransformService transformService;

    @Test
    public void toUserDomainTest() {
        Person person = new Person();

        person.setfName("fName");
        person.setlName("lName");
        person.setCompanyName("company");

        User user = transformService.toUserDomain(person);

        assertEquals("fName", user.getFirstName());
        assertEquals("lName", user.getLastName());
        assertEquals("company", user.getCompanyName());
    }

    @Test
    public void toUserEntityTest() {
        User user = new User();

        user.setFirstName("fName");
        user.setLastName("lName");
        user.setCompanyName("company");

        Person person = transformService.toUserEntity(user);

        assertEquals("fName", person.getfName());
        assertEquals("lName", person.getlName());
        assertEquals("company", person.getCompanyName());
    }
}
