package com.peerlabkyiv.di.context;

import com.peerlabkyiv.di.application.sequenceapp.SequenceAppConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.util.function.Supplier;

class ContextJUnit5Test {

    private static final String VERSION_SEQUENCE_SERVICE = "versionSequenceService";

    private Context context;

    @ParameterizedTest
    @EnumSource(ContextOption.class)
    void checkComponentServiceIsSingleton(ContextOption contextOption) {
        context = contextOption.getInstance();

        Assertions.assertSame(context.getComponent(VERSION_SEQUENCE_SERVICE), context.getComponent(VERSION_SEQUENCE_SERVICE));
        Assertions.assertTrue(context.isSingleton(VERSION_SEQUENCE_SERVICE));
    }

    @ParameterizedTest
    @EnumSource(ContextOption.class)
    void checkAllComponentsInitialized(ContextOption contextOption) {
        context = contextOption.getInstance();

        Assertions.assertTrue(context.containsComponent("versionSequenceService")
                && context.containsComponent("versionSequenceGenerator")
                && context.containsComponent("getVersionSequenceFormatter"));
    }

    private enum ContextOption {
        SPRING_CONTEXT(() -> new SpringApplicationContextAdapter(SequenceAppConfiguration.class)),
        ANNOTATION_CONTEXT(AnnotationProcessingBasedContext::new),
        SOURCE_PREPROCESSING_CONTEXT(SourceCodePreprocessingBasedContext::new),
        BYTECODE_INSTRUMENTATION_CONTEXT(ByteCodeInstrumentationBasedContext::new);

        private final Supplier<Context> factoryMethod;

        ContextOption(Supplier<Context> factoryMethod) {
            this.factoryMethod = factoryMethod;
        }

        Context getInstance() {
            return factoryMethod.get();
        }
    }
}