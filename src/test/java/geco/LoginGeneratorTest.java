package geco;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class LoginGeneratorTest extends TestCase{

    LoginService loginService;
    LoginGenerator loginGenerator;

    @Before
    public void setUp(){
        loginService = new LoginService(new String[] {"JROL", "BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
        loginGenerator = new LoginGenerator(loginService);
    }
    @Test
    public void testMethode(){
        assertEquals("PDUR", loginGenerator.generateLoginForNomAndPrenom("Durand", "Paul"));

    }

}