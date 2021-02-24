package p1Test;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.omg.CORBA.UShortSeqHelper;
import parcial1.filaB.p1.Ej1UtilsNumeros;

import java.util.ArrayList;
import java.util.List;

@RunWith(value = Parameterized.class)

public class Eje1 {
    private boolean primo;
    private boolean actualRes;

    @BeforeClass
    public static void beforeClass(){
        System.out.println(" -------BEFORE CLASS EJE1");
    }
    private int num;
    private boolean expRes;

    public Eje1(int num, boolean expRes) {
        this.num = num;
        this.expRes = expRes;
    }

    @Before
    public void before(){
        System.out.println(" ------- BEFORE VERIFICACIÓN PRIMO");
    }

    public Iterable<Object[]> getData(){

        List<Object[]>objects =  new ArrayList<>();

        objects.add(new Object[]{-1,false });
        objects.add(new Object[]{7,true });
        objects.add(new Object[]{100,false });
        
        return objects;
    }

    @Test
    public void verificar_Primo(){

        Ej1UtilsNumeros ej1UtilsNumeros = new Ej1UtilsNumeros();
        Boolean actualRes= ej1UtilsNumeros.esPrimo(this.num);
        Assert.assertEquals("ERROR! ",this.actualRes, expRes);

    }
    @After
    public void after(){
        System.out.println(" -------AFTER VERIFICACIÓN PRIMO");
    }


    @AfterClass
    public static void afterClass(){
        System.out.println("------- AFTER CLASS EJE1");
    }

}
