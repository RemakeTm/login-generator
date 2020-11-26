package geco;

import junit.framework.TestCase;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class LoginGeneratorTest{

    LoginService loginService;
    LoginGenerator loginGenerator;

    @Before
    public void setUp(){
        loginService = new LoginService(new String[] {"JROL", "BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
        loginGenerator = new LoginGenerator(loginService);
    }
    @Test
    public void CT1(){
        assertEquals("PDUR", loginGenerator.generateLoginForNomAndPrenom("Durand", "Paul"));
    }

    @Test
    public void CT2(){
        assertEquals("JRAL2", loginGenerator.generateLoginForNomAndPrenom("Ralling", "John"));
    }

    @Test
    public void CT3(){
        assertEquals("JROL1", loginGenerator.generateLoginForNomAndPrenom("Rolling", "JK"));
    }

}