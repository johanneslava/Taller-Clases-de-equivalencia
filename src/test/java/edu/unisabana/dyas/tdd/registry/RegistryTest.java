package edu.unisabana.dyas.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {
    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {
        Person person = new Person("", 1, 18, Gender.FEMALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }
    // TODO Complete with more test cases

    //DUPLICADO
    @Test
    public void validateDuplicatedTest(){
        Person personOne = new Person("", 1, 18, Gender.MALE, true);
        registry.registerVoter(personOne);
        RegisterResult resultTwo = registry.registerVoter(personOne);
        Assert.assertEquals(RegisterResult.DUPLICATED, resultTwo);
    }

    //UNDER AGE
    @Test
    public void validateLegalAgeTest(){
        Person personOne = new Person("", 1, 18, Gender.MALE, true);
        Assert.assertEquals(RegisterResult.VALID, registry.registerVoter(personOne));
    }

    @Test
    public void validateUnderAgeTest(){
        Person personOne = new Person("", 1, 17, Gender.MALE, true);
        Assert.assertEquals(RegisterResult.UNDERAGE, registry.registerVoter(personOne));
    }


    //DEAD

    //INVALID_AGE


}