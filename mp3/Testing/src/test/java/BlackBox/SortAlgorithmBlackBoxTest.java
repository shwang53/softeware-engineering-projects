package BlackBox;

import BlackBox.Setups.SortSetup;
import org.junit.Test;

public class SortAlgorithmBlackBoxTest extends SortSetup {

    @Test
    public void dummyTest() {
        // @TODO: Delete/modify me

        // test null
        int[] input7 = null;
        int[] expectedOutput7 = null;
        sortAlgorithmPUT.run(input7, expectedOutput7);

        // test empty
        int[] input0 = new int[] { };
        int[] expectedOutput0 = new int[] { };
        sortAlgorithmPUT.run(input0, expectedOutput0);

        // test single value
        int[] input6 = new int[] {1};
        int[] expectedOutput6 = new int[] {1};
        sortAlgorithmPUT.run(input6, expectedOutput6);

        //test order
        int[] input = new int[] { 2, 1 };
        int[] expectedOutput = new int[] { 1, 2 };
        sortAlgorithmPUT.run(input, expectedOutput);

        // test if included negative number 2pts
        int[] input2 = new int[] { 5, -10, 2, -1 };
        int[] expectedOutput2 = new int[] { -10, -1, 2, 5 };
        sortAlgorithmPUT.run(input2, expectedOutput2);

        // test if extreme value
        int[] input3 = new int[] { Integer.MAX_VALUE, (Integer.MAX_VALUE+1)};
        int[] expectedOutput3 = new int[] {(Integer.MAX_VALUE+1), Integer.MAX_VALUE };
        sortAlgorithmPUT.run(input3, expectedOutput3);


        // test if extreme value
        int[] input33 = new int[] { (Integer.MIN_VALUE-1)};
        int[] expectedOutput33 = new int[] {(Integer.MIN_VALUE-1)};
        sortAlgorithmPUT.run(input33, expectedOutput33);

        // test
        int[] input1 = new int[] { 5, 10, 2, 1 };
        int[] expectedOutput1 = new int[] { 1, 2, 5, 10 };
        sortAlgorithmPUT.run(input1, expectedOutput1);
//
        int[] input44 = new int[] {1, 'a','b', 1000};
        int[] expectedOutput44 = new int[] {1, 'a','b', 1000};
        sortAlgorithmPUT.run(input44, expectedOutput44);



        //for line coverage --------
        // test if only duplicated
        int[] input5 = new int[] {1,-2,-2,10,10,10,2,10 };
        int[] expectedOutput5 = new int[] {-2,-2,1,2,10,10,10,10};
        sortAlgorithmPUT.run(input5, expectedOutput5);

        // test if only negative values
        int[] input4 = new int[] {1,3,2,4,3,5,3,6,7,3,4,5,6 };
        int[] expectedOutput4 = new int[] {1,2,3,3,3,3,4,4,5,5,6,6,7};
        sortAlgorithmPUT.run(input4, expectedOutput4);
        //-------------


    }

    // @TODO: Create more tests
    @Test
    public void newTest1() {
        int[] input = new int[]{8, 7, 6, -1, 5, 1, -1, 4, 3, 2, 1, -1, -1};
        int[] expectedOutput = new int[] {-1, -1, -1, -1, 1, 1, 2, 3, 4, 5, 6, 7, 8};
        sortAlgorithmPUT.run(input, expectedOutput);
    }

    @Test
    public void newTest2() {
        int[] input = new int[]{-2, -2, 8, 8, 8, 7, 6, -1, 4, 5, 1, -1, 4, 4, 4, 4, 4, 3, 2, 1, -1, -1};
        int[] expectedOutput = new int[] {-2, -2, -1, -1, -1, -1, 1, 1, 2, 3, 4, 4, 4, 4, 4, 4, 5, 6, 7, 8, 8, 8};
        sortAlgorithmPUT.run(input, expectedOutput);
    }

    @Test
    public void nullInputTest() {
        int[] input = null;
        int[] expectedOutput = null;
        sortAlgorithmPUT.run(input, expectedOutput);
    }

    @Test
    public void emptyInputTest() {
        int[] input = new int[0];
        int[] expectedOutput = new int[0];
        sortAlgorithmPUT.run(input, expectedOutput);
    }

    @Test
    public void singleInputTest() {
        int[] input = new int[]{1};
        int[] expectedOutput = new int[]{1};
        sortAlgorithmPUT.run(input, expectedOutput);
    }

    @Test
    public void maxValueInputTest() {
        int[] input = new int[]{Integer.MAX_VALUE, 1, 1};
        int[] expectedOutput = new int[]{1,1,Integer.MAX_VALUE};
        sortAlgorithmPUT.run(input,expectedOutput);
    }

    @Test
    public void minValueInputTest() {
        int[] input = new int[]{Integer.MIN_VALUE, 1, 1};
        int[] expectedOutput = new int[]{Integer.MIN_VALUE, 1, 1};
        sortAlgorithmPUT.run(input,expectedOutput);
    }

    @Test
    public void duplicateTest() {
        int[] input = new int[]{3,3,3,2,2,2,-1,-1,-1};
        int[] expectedOutput = new int[] {-1, -1, -1, 2, 2, 2, 3, 3, 3};
        sortAlgorithmPUT.run(input, expectedOutput);
    }

    @Test
    public void putItemToRight() {
        int[] input = new int[]{8, 7, 6, 5, 1, -1, 4, 3, 2, 1};
        int[] expectedOutput = new int[] {-1, 1, 1, 2, 3, 4, 5, 6, 7, 8};
        sortAlgorithmPUT.run(input, expectedOutput);
    }

    @Test
    public void sorted() {
        int[] input = new int[]{-1, 0, 1, 2, 3};
        int[] expectedOutput = new int[]{-1, 0, 1, 2, 3};
        sortAlgorithmPUT.run(input, expectedOutput);
    }
}
