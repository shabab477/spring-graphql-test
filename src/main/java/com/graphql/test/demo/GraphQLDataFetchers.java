package com.graphql.test.demo;

import com.google.common.collect.ImmutableMap;
import graphql.schema.DataFetcher;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Component
public class GraphQLDataFetchers {

    private static List<Map<String, String>> persons = Arrays.asList(
            ImmutableMap.of("id", "user-1",
                    "name", "Jon Snow",
                    "age", "21"),
            ImmutableMap.of("id", "user-2",
                    "name", "Danyrys",
                    "age", "17"),
            ImmutableMap.of("id", "user-3",
                    "name", "Bran",
                    "age", "14")
    );

    public DataFetcher getAllPersons() {
        return dataFetchingEnvironment -> persons;
    }
}
