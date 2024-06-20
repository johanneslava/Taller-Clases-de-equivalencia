package edu.unisabana.dyas.tdd.registry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Registry {

    List<Person> voters = new ArrayList<>();

    public RegisterResult registerVoter(Person p) {
        // TODO Validate person and return real result.
        RegisterResult result = RegisterResult.VALID;

        if (voters.contains(p)) {
            result = RegisterResult.DUPLICATED;
        }

        if (p.getAge() < 18){
            result = RegisterResult.UNDERAGE;
        }

        if(result.compareTo(RegisterResult.VALID) == 0){
            voters.add(p);
        }

        return result;
    }


}