package core;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.instanceOf;

import org.testng.annotations.Test;

public class DivideTest {
	@Test
    public void divide_test_instanceOf() {
		assertThat(Calculator.divide(4, 2), instanceOf(Double.class));}
    @Test
    public void divide_test_2_param() {
    	assertThat(Calculator.divide(5.1, 2), closeTo(2.5, 0.09));   }     //2.55
    @Test
    public void divide_test_3_param() {
    		assertThat(Calculator.divide(10, 3, 2), closeTo(1.6, 0.09));     }      //1.6666666666666667
    @Test
    public void divide_test_4_param() {
    			assertThat(Calculator.divide(22, 4, 3, 2), closeTo(0.9, 0.09));  }    //0.9166666666666666
}

       