package devoir2;
import junit.framework.TestCase;

public class testFighter extends TestCase{
Fighter F= new Fighter();
boolean b=F.isDead();

public void testgetnbrVie() {

    assertEquals(10,F.getnbrVie());
}

public void testgetnom() {

    assertEquals("",F.getnom());
}

public void testfire() {

   
}

public void testIsDead() {
	
	assertEquals(b,F.isDead());
}

}
