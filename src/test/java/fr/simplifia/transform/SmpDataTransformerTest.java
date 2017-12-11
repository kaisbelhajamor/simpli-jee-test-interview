package fr.simplifia.transform;

import fr.simplifia.input.validator.SmpInputValidator;
import org.mockito.Mockito;
import org.testng.annotations.Test;

import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;


public class SmpDataTransformerTest {

    private SmpInputValidator validator;
    final SmpDataTransformer transformer;

    public SmpDataTransformerTest(){
        //TODO : mocking strategy
        //when(validator.validateInput(input)).thenReturn();

        validator = Mockito.mock(SmpInputValidator.class);
        transformer = Mockito.mock(SmpDataTransformer.class);
    }

    @Test
    public void testTransformOk() throws Exception {
        when(transformer.transform("test","fr")).thenReturn("test : bienvenue chez Simplifia!");
        assertEquals(transformer.transform("test","fr"), "test : bienvenue chez Simplifia!");
    }

    @Test
    public void testTransformNotOk() throws Exception {
        when(transformer.transform("test","fr")).thenReturn("test : bienvenue chez Simplifia!");
        assertNotEquals(transformer.transform("test","fr"), "test : welcome to Simplifia!");
    }

    @Test
    public void testTransformEmpty() throws Exception {

    }

    @Test
    public void testTransformNull() throws Exception {

    }

}

