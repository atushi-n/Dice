package i.keiji.dice;

import java.util.Random;

public class Custom {

    private String[] matome;

    private int sum;

    public Custom(String text){

        String[] nums = text.split(",");

        this.matome = new String[nums.length];

        sum = 0;

        for(String a : nums){

            matome[sum] = a;
            sum++;
        }


    }


    public String getNumber(){

        Random random = new Random();
        int rnd = random.nextInt(sum);

        return matome[rnd];
    }






    }



