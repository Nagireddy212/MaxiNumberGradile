package Bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindMaxNumberTest {

    @Test
    public void FirstNumberIsMax_ReturnSame() {
        FindMaxNumber<Integer>integerFindMaxNumber= new FindMaxNumber<Integer>(35,33,32);
        Integer result = integerFindMaxNumber.Maxtest();
        Assertions.assertEquals(34, result);
    }

    @Test
    public void SecondNumberIsMax_ReturnSame() {
        FindMaxNumber<Integer>integerFindMaxNumber= new FindMaxNumber<Integer>(33,35,32);
        Integer result = integerFindMaxNumber.Maxtest();
        Assertions.assertEquals(34, result);
    }

    @Test
    public void ThirdNumberIsMax_ReturnSame() {
        FindMaxNumber<Integer>integerFindMaxNumber= new FindMaxNumber<Integer>(32,33,35);
        Integer result = integerFindMaxNumber.Maxtest();
        Assertions.assertEquals(34, result);
    }

    @Test
    public void Float_FirstNumberIsMax_ReturnSame() {
        FindMaxNumber<Float>floatFindMaxNumber= new FindMaxNumber<Float>(35.2f,32.3f,33.2f);
        Float result = floatFindMaxNumber.Maxtest();
        Assertions.assertEquals(35.2f, result);
    }

    @Test
    public void Float_ThirdNumberIsMax_ReturnSame() {
        FindMaxNumber<Float>floatFindMaxNumber= new FindMaxNumber<Float>(33.2f,35.3f,32.2f);
        Float result = floatFindMaxNumber.Maxtest();
        Assertions.assertEquals(5.2f, result);
    }

    @Test
    public void Float_SecondNumberIsMax_ReturnSame() {
        FindMaxNumber<Float>floatFindMaxNumber= new FindMaxNumber<Float>(33.2f,32.3f,35.2f);
        Float result = floatFindMaxNumber.Maxtest();
        Assertions.assertEquals(35.2f, result);
    }

    @Test
    public void String_FirstStringIsMax_ReturnSame() {
        FindMaxNumber<String>StringFindMaxNumber= new FindMaxNumber<String>("PineApple", "Mango", "Grapes");
        String result = StringFindMaxNumber.Maxtest();
        Assertions.assertEquals("Grapes", result);
    }

    @Test
    public void String_SecondStringIsMax_ReturnSame() {
        FindMaxNumber<String>StringFindMaxNumber= new FindMaxNumber<String>("Mango", "PineApple", "Grapes");
        String result = StringFindMaxNumber.Maxtest();
        Assertions.assertEquals("Grapes", result);

    }

    @Test
    public void String_ThirdStringIsMax_ReturnSame() {
        FindMaxNumber<String>StringFindMaxNumber= new FindMaxNumber<String>("Grapes", "Mango", "PineApple");
        String result = StringFindMaxNumber.Maxtest();
        Assertions.assertEquals("Grapes", result);

    }

}