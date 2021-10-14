package com.company;
import com.company.TypeSetData;

public class TypeRubric {

    private int[][] InputType = {{0, 3, 0, 0}, {2, 0, 3, 2}, {0, 2, 0, 3}, {0, 3, 2, 0}};
    private int type;
    private TypeSetData typeSetData;
    private String[][] returnArrayArray;

    private String reverseInputMatch(int currentType) {

        String typeString = switch (currentType) {
            case 0 -> "electric";
            case 1 -> "water";
            case 2 -> "fire";
            case 3 -> "grass";
            default -> "Could not be defined.";
        };


        return typeString;

    }

    public void setType(int type) {

        this.type = type;
        System.out.println("TypeID" + type);

    }

    public int getType(){

        return type;

    }

    public void inputTypeMatch(int type) {

        for (int i = 0; i <= InputType[type].length; i++) {

            if (InputType[type][i] != 0) {

                switch (InputType[type][i]) {
                    case 1 -> System.out.println("Not Effective against " + reverseInputMatch(i) + "!");
                    case 2 -> System.out.println("Not Very Effective against " + reverseInputMatch(i) + "!");
                    case 3 -> System.out.println("Super Effective against " + reverseInputMatch(i) + "!");
                    default -> System.out.println("Effectiveness not found...");
                }

            }

        }
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