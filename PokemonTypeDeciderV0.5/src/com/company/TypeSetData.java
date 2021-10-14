package com.company;

public class TypeSetData {

    private int returnType;



    public int typeSet(String userInput){

        switch(userInput){

            case "electric" : returnType = 0;
            break;
            case "water": returnType = 1;
            break;
            case "fire" : returnType = 2;
            break;
            case "grass" : returnType = 3;
            break;
            default : returnType = 3001;

        }

        if (returnType == 3001){

            System.out.println("Over 9000?! Type could not be decided.");
        }

        return returnType;
    }

    public int getReturnType(){

        return returnType;

    }


}
/*TypeMatch Key (For Reference)
 *
 * 0 == Electric
 * 1 == Water
 * 2 == Fire
 * 3 == Grass
 *
 * Effectiveness Key ==
 * 0 == Normal
 * 1 == No Effect
 * 2 == Not Very Effective
 * 3 == Super Effective
 * */