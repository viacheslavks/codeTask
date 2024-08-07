package UniqueArr;

public class Unique {
    public static void main(String[] args) {
        System.out.println(Unique.findUniq(new double[]{1, 1, 1, 2, 1, 1}));
        System.out.println(Unique.findUniq(new double[]{0, 0, 0.55, 0, 0}));
        System.out.println(Unique.findUniq(new double[]{0, 1, 0}));
        NewTest newTest = new NewTest();

    }


    public static double findUniq(double[] arr) {
        double candidate1 = arr[0];
        double candidate2 = arr[1];
        double candidate3 = arr[2];

        if (candidate1 != candidate2 && candidate1 != candidate3) {
            return candidate1;
        } else if (candidate2 != candidate1 && candidate2 != candidate3) {
            return candidate2;
        } else if (candidate3 != candidate1 && candidate3 != candidate2) {
            return candidate3;
        }
        
        double result = 0;

        for (int i = 3; i < arr.length; i++) {
            if (arr[i] != candidate1) {
              result = arr[i];
            }
        }
        return result;
    }
}

class NewTest {

    NewTest () {
        System.out.println("NewTest");
    }

}

