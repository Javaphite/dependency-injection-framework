package com.peerlabkyiv.di.context;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.util.function.Supplier;

class ContextJUnit5Test {

    private Context systemUnderTest;

    @ParameterizedTest
    @EnumSource(ContextOption.class)
    void shouldDoSomethingToTestSomething(ContextOption contextOption) {
        systemUnderTest = contextOption.getInstance();

        // Your test logic here, the same for any context
    }

    private enum ContextOption {
        SPRING_CONTEXT(SpringApplicationContextAdapter::new),
        ANNOTATION_CONTEXT(AnnotationProcessingBasedContext::new),
        SOURCE_PREPROCESSING_CONTEXT(SourceCodePreprocessingBasedContext::new),
        BYTECODE_INSTRUMENTATION_CONTEXT(ByteCodeInstrumentationBasedContext::new);

        private Supplier<Context> factoryMethod;

        ContextOption(Supplier<Context> factoryMethod) {
            this.factoryMethod = factoryMethod;
        }

        Context getInstance() {
            return factoryMethod.get();
        }
    }
}