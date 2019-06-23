import org.junit.Assert;
import org.junit.Test;
import com.company.ArraysUtils;


public class ArraysUtilsTest {


        @Test
        public void binarySearchTest(){

            int[] array = {1, 3, 5, 7, 9, 10};
            int n=7;
            int result = new ArraysUtils().binarySearch(array, n);
            Assert.assertEquals(3, result);


        }

    @Test
    public void binarySearchTest2(){

        int[] array = {1, 3, 5, 7, 9, 10};
        int n=4;
        int result2 = new ArraysUtils().binarySearch(array, n);
        Assert.assertEquals(-3, result2);
        }

        @Test
    public void bubbleSortTest(){

            //definim un array nesortat
            int[] arrayBubble = {1, 2, 3, 5, 4, 6, 7};
            // sorteaza array nesortat
            new ArraysUtils().bubbleSort(arrayBubble);
            // definim cum ne asteptam sa fie array
            int[] expected = {1, 2, 3, 4, 5, 6, 7};
            // compara si testeaza daca sunt la fel array asteptat si array sortat mai sus (ca nr elemente si ordinea lor)
            Assert.assertArrayEquals(expected,arrayBubble);

            // rezultatul e fara eroare. array sortat este egal cu array expected ! ! !


        }


}
