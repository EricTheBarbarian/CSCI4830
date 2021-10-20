package q2.csvfilesource;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestComputation_CsvFileSource {

   
   @ParameterizedTest
   @CsvFileSource(resources = "computation_dataset.csv")
   public void testGetDiscount(int input1, int input2, int expected) throws Exception {

	   Computation comp = new Computation();
      int actualResult =comp.getDiscount(input1, input2); 
      Assert.assertEquals(expected, actualResult);

   }
}
