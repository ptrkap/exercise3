package com.hr;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.fail;

public class PersonTest {

    @Test
    public void shouldSayHello() {
        Person person = new Person();
        Assert.assertEquals("Hello and welcome everyone", person.sayHello());
        fail("not yet implemented");
    }
}