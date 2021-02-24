package p2Test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import parcial1.filaB.p2.Ej2Notas;

import java.util.ArrayList;
import java.util.List;

@RunWith(value= Parameterized.class)
public class Eje2 {

    private int nota;
    private String expectedResult;

    public Eje2(int nota, String expectedResult) {
        this.nota = nota;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getData() {
        List<Object[]> objects = new ArrayList<>();
       // objects.add(new Object[]{0, "VALOR INCORRECTO"}); // cree un nuevo caso en la lógica para 0
        objects.add(new Object[]{1, "F"});
        objects.add(new Object[]{2, "F"});

        objects.add(new Object[]{4, "F"});
        objects.add(new Object[]{5, "F"});
        objects.add(new Object[]{6, "C"});

        objects.add(new Object[]{9, "B"});
        objects.add(new Object[]{10, "A"});
        objects.add(new Object[]{11, "VALOR INCORRECTO"});

        objects.add(new Object[]{-5, "VALOR INCORRECTO"});
        objects.add(new Object[]{1000, "VALOR INCORRECTO"});

        return objects;
    }

    @Test
    public void verificar_notas(){

        Ej2Notas ej2Notas = new Ej2Notas();
        String actualResult= ej2Notas.notasCualitativas(this.nota);
        Assert.assertEquals("ERROR! ",this.expectedResult,actualResult);
    }
}