package geco;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoginServiceTest extends TestCase {

    private LoginService logServ;
    private List<String> startingWithA;

    @Before
    protected void setUp() {
        String[] init = {"a", "ab", "aba", "b", "c", "d"};
        logServ = new LoginService(init);
        startingWithA = new ArrayList<>(Arrays.asList("a", "ab", "aba"));
    }

    @Test
    public void testLoginExists(){
        assertEquals("Le login 'a' existe dans le loginService", true, logServ.loginExists("a"));
        assertEquals("Le login \"Rend pas fou\" n'existe pas dans le loginService", false, logServ.loginExists("Rend pas fou"));
    }

    @Test
    public void testAddLogin(){
        logServ.addLogin("Maxence");
        assertEquals("Le login \"Maxence\" existe", true, logServ.loginExists("Maxence"));
    }

    @Test
    public void testFindAllLoginsStartingWith(){
        assertEquals("Les login qui commencent par a sont \"a\", \"ab\" et \"aba\"", startingWithA, logServ.findAllLoginsStartingWith("a"));
    }

    @Test
    public void testFindAllLogins(){
        assertEquals("Flemme d'écrire",new ArrayList<String>(Arrays.asList("a", "ab", "aba", "b", "c", "d")), logServ.findAllLogins());
    }
}