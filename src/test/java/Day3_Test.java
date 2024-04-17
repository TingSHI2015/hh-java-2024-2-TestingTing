import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day3_Test {

    @Test
    public void additionWhen5Plus100ThenReturen105() {            //Test method without static & Datatype!!!
        //GIVEN
        int a =5;
        int b = 100;

        //WHEN
        int actualSum = Day3_ClassForTest.addition(a,b);

        //THEN
        int expectedSum = 105;

        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void checkIf5IsEven() {
        //GIVEN
        int a =5;

        //WHEN
        boolean actualIfIsEven = Day3_ClassForTest.checkIfAGivenNumberIsEven(a);

        //THEN
        boolean expectedIfIsEven = false;

        // assertEquals(expectedIfIsEven, actualIfIsEven);
        assertEquals(expectedIfIsEven, actualIfIsEven, "test failed for checkIf5IsEven");

    }


    @Test
    public void testWhen3multiple201Is603() {

        //GIVEN
        int a =3;
        int b = 201;

        //WHEN
        int actualMultiple = Day3_ClassForTest.multiply(a,b);

        //THEN
        int expectedMultiple = 603;

        assertEquals(expectedMultiple, actualMultiple, "test failed for testWhen3multiple201Is603");
    }

    @Test
    public void testWhenConvert_iLoVEu98_ToUppercase() {
        //GIVEN
        String str = "iLoVEu98";

        //WHEN
        String actualMultiple = Day3_ClassForTest.convertsToUppercase(str);

        //THEN
        String expectedMultiple = "ILOVEU98";

        assertEquals(expectedMultiple, actualMultiple, "test failed for testWhenConvert_iLoVEu98_ToUppercase");

    }

    @Test
    public void checkIfMinusFiveIsPositive() {
        //GIVEN
        int a = -5;

        //WHEN
        boolean actual_IfIsPositive = Day3_ClassForTest.ifIsPositive(a);

        //Then
        boolean expected_IfIsPositive = false;

        assertEquals(expected_IfIsPositive,actual_IfIsPositive, "test failed for checkIfMinusFiveIsPositive");
    }

}
