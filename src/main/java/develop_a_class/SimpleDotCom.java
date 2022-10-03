package develop_a_class;

import lombok.*;

import java.beans.ConstructorProperties;

@AllArgsConstructor
@Setter
@Getter
@Data
@Builder
public class SimpleDotCom {

    int[] locationCell;
    int numbersOfHits = 0;

    SimpleDotCom() {

    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess); // convert String to int

        String result = "miss";  //make a variable to hold the result we'll return / put 'miss' in as
        //  default (asusme a miss);
        for (int cell : locationCell) {  //repeat with each cell in the
                                        // locationCells array (each call location of the object)
            if (guess == cell) { // compare the user guess  to this element (cell) in the array

                result = "hit";     // we have a hit here
                 numbersOfHits++;
                break;                  //get out of the loop. no more test other cells
            }
        }
        if (numbersOfHits == locationCell.length) {
            result = "kill";               //we re out of the loop but let s see if we are dead
                                            // hit 3 times and change the result String to kill
        }
        System.out.println(result);        //display the result for the user
        return result;   //return the result to the calling method
    }

}
