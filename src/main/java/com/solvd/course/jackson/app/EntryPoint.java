package com.solvd.course.jackson.app;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.course.jackson.binary.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class EntryPoint {
    private final static Logger log = LogManager.getLogger(EntryPoint.class);

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            JavaType type = objectMapper.getTypeFactory().constructCollectionType(List.class, User.class);
//            TypeReference<List<User>> type = new TypeReference<List<User>>() {}; - can be used as an option
            List<User> users = objectMapper.readValue(new File("src/main/resources/jackson/example.json"), type);
            log.info(users.toString());
        } catch (JsonProcessingException e) {
            log.error("Error while parsing json file", e);
        } catch (IOException e) {
            log.error("Error while reading file", e);
        }
    }
}
