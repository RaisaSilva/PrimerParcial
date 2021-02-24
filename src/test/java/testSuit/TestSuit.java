package testSuit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import p1Test.Eje1;
import p2Test.Eje2;
import p3Test.Eje3;
import p4Test.Ej4;
import p5Test.Eje5;

@RunWith(value= Suite.class)
@Suite.SuiteClasses(
        {Eje1.class, Eje2.class, Eje3.class, Ej4.class, Eje5.class}
})
public class TestSuit {
}
