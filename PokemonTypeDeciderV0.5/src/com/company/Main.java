package com.company;
import java.awt.event.InputMethodListener;
import java.util.Scanner;

import com.company.TypeSetData;
import com.company.TypeRubric;
public class Main {


    public static void main(String[] args) {

        TypeSetData typeSetData = new TypeSetData();
        TypeRubric typeRubric = new TypeRubric();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input the first type now...");

        String userInput = scanner.nextLine();

        typeRubric.setType(typeSetData.typeSet(userInput));

        int type = typeRubric.getType();

        typeRubric.inputTypeMatch(type);

    }



    private void typeSetInit(){

        TypeSetData typeSetData;
        TypeRubric typeRubric;

    }

}
