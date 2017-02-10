package com.sebastian_daschner.jaxrs_analyzer.analysis.results.testclasses.typeanalyzer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sebastian_daschner.jaxrs_analyzer.analysis.results.TypeUtils;
import com.sebastian_daschner.jaxrs_analyzer.model.rest.TypeIdentifier;
import com.sebastian_daschner.jaxrs_analyzer.model.rest.TypeRepresentation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @JsonIgnore in superclass
 */
public class TestClass26 extends SuperTestClass26 {

    private String foobar;

    public String getFoobar() {
        return foobar;
    }

    public void setFoobar(String foobar) {
        this.foobar = foobar;
    }

    public static Set<TypeRepresentation> expectedTypeRepresentations() {
        final Map<String, TypeIdentifier> properties = new HashMap<>();

        properties.put("foobar", TypeUtils.STRING_IDENTIFIER);

        return Collections.singleton(TypeRepresentation.ofConcrete(expectedIdentifier(), properties));
    }

    public static TypeIdentifier expectedIdentifier() {
        return TypeIdentifier.ofType("Lcom/sebastian_daschner/jaxrs_analyzer/analysis/results/testclasses/typeanalyzer/TestClass26;");
    }

}


class SuperTestClass26 {

    @JsonIgnore
    private String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

}