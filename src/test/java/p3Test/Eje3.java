package p3Test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import parcial1.filaB.p2.Ej2Notas;
import parcial1.filaB.p3.Ej3Utils;

import java.util.ArrayList;
import java.util.List;

@RunWith(value= Parameterized.class)

public class Eje3 {

    private String ci;
    private String expectedResult;

    public Eje3(String ci, String expectedResult) {
        this.ci = ci;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getData() {
        List<Object[]> objects = new ArrayList<>();

        objects.add(new Object[]{"", "ci no puede ser vacia"});
        objects.add(new Object[]{"0", "ci no puede ser 0"});
        objects.add(new Object[]{"123456", "C"});
    }

    @Test
    public void verificar_ci(){

        Ej3Utils ej3Utils = new Ej3Utils();
        String actualResult= ej3Utils.isCorrectCI(this.ci);
        Assert.assertEquals("ERROR! ",this.expectedResult,actualResult);
    }
}
