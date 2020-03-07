package com.peerlabkyiv.di.context;
/*
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Supplier;
/*
@RunWith(Parameterized.class)
public class ContextJUnit4Test {

    @Parameterized.Parameters
    public static Collection<ContextOption> parameterValues() {
        return Arrays.asList(ContextOption.values());
    }

    private Context systemUnderTest;

    public ContextJUnit4Test(ContextOption contextOption) {
        this.systemUnderTest = contextOption.getInstance();
    }

    @Test
    void checkComponentServiceIsSingleton() {

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
}*/