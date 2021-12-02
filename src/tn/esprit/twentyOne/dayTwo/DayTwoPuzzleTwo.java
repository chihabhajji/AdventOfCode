package tn.esprit.twentyOne.dayTwo;

import tn.esprit.helpers.PathToFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DayTwoPuzzleTwo {
    public static void main(String[] args) {
        int horizontal = 0 , depth = 0 , aim = 0 , val;
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(PathToFile.convertActual("dayTwo.txt")))) {
            while ((line = br.readLine()) != null) {
                if(line.startsWith("up")){
                    val = Integer.parseInt(line.replace("up ",""));
                    aim -= val;
                } else if (line.startsWith("down")){
                    val = Integer.parseInt(line.replace("down ",""));
                    aim += val;
                } else {
                    // Forward
                    val = Integer.parseInt(line.replace("forward ",""));
                    horizontal += val;
                    depth += aim * val;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(horizontal*depth);
        // Horizontal :2083
        // Depth      :1002964
        // Sum        :2089174012
    }
}