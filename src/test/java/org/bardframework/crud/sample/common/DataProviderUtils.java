package org.bardframework.crud.sample.common;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.UUID;

public abstract class DataProviderUtils {
    public static String getEmailValid() {
        return RandomStringUtils.randomAlphabetic(1, 10);
    }

    public static String getNameValid() {
        return RandomStringUtils.randomAlphabetic(1, 10);
    }

    public static String getDescriptionValid() {
        return RandomStringUtils.randomAlphanumeric(0, 100);
    }

    public static User getUser() {
        return new User(UUID.randomUUID().toString(), RandomStringUtils.randomAlphabetic(50));
    }

    public static String getInvalidId() {
        return RandomStringUtils.randomAlphanumeric(100, 200);
    }

    public static String getInvalidName() {
        return RandomStringUtils.randomAlphabetic(500);
    }
}
