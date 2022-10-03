package develop_a_class;

public class TestSimpleDotCom {
    public static void main(String[] args) {

        SimpleDotCom dot = new SimpleDotCom();

        int[] locations = {};
        dot.setLocationCell(locations);


        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
      //  String testResult = "failed";
       // if (result.equals("hit")) {
     ///       testResult = "passed";
    //    }
        //System.out.println(testResult);

       // int randomNum = (int)(Math.random()*5);  // a random numb, from 0-5
       // System.out.println(randomNum);

    }
}
