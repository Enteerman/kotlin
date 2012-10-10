/*
 * Copyright 2010-2012 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.jetbrains.jet.di;

import org.jetbrains.jet.lang.resolve.TopDownAnalyzer;
import org.jetbrains.jet.lang.resolve.TopDownAnalysisContext;
import org.jetbrains.jet.lang.resolve.BodyResolver;
import org.jetbrains.jet.lang.resolve.ControlFlowAnalyzer;
import org.jetbrains.jet.lang.resolve.DeclarationsChecker;
import org.jetbrains.jet.lang.resolve.DescriptorResolver;
import com.intellij.openapi.project.Project;
import org.jetbrains.jet.lang.resolve.TopDownAnalysisParameters;
import org.jetbrains.jet.lang.resolve.BindingTrace;
import org.jetbrains.jet.lang.descriptors.ModuleDescriptor;
import org.jetbrains.jet.lang.BuiltinsScopeExtensionMode;
import org.jetbrains.jet.lang.ModuleConfiguration;
import org.jetbrains.jet.lang.resolve.java.JavaBridgeConfiguration;
import org.jetbrains.jet.lang.resolve.java.JavaDescriptorResolver;
import org.jetbrains.jet.lang.resolve.java.PsiClassFinderImpl;
import org.jetbrains.jet.lang.resolve.NamespaceFactoryImpl;
import org.jetbrains.jet.lang.resolve.DeclarationResolver;
import org.jetbrains.jet.lang.resolve.AnnotationResolver;
import org.jetbrains.jet.lang.resolve.calls.CallResolver;
import org.jetbrains.jet.lang.types.expressions.ExpressionTypingServices;
import org.jetbrains.jet.lang.resolve.TypeResolver;
import org.jetbrains.jet.lang.resolve.QualifiedExpressionResolver;
import org.jetbrains.jet.lang.resolve.calls.OverloadingConflictResolver;
import org.jetbrains.jet.lang.resolve.ImportsResolver;
import org.jetbrains.jet.lang.resolve.ScriptHeaderResolver;
import org.jetbrains.jet.lang.resolve.OverloadResolver;
import org.jetbrains.jet.lang.resolve.OverrideResolver;
import org.jetbrains.jet.lang.resolve.TypeHierarchyResolver;
import org.jetbrains.jet.lang.resolve.ScriptBodyResolver;
import org.jetbrains.jet.lang.resolve.java.JavaSemanticServices;
import org.jetbrains.jet.lang.resolve.java.JavaTypeTransformer;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaClassResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaAnnotationResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaCompileTimeConstResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaClassObjectResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaSupertypesResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaNamespaceResolver;
import org.jetbrains.jet.lang.resolve.java.JavaDescriptorSignatureResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaConstructorResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaValueParameterResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaFunctionResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaInnerClassResolver;
import org.jetbrains.jet.lang.resolve.java.resolver.JavaPropertiesResolver;
import org.jetbrains.annotations.NotNull;
import javax.annotation.PreDestroy;

/* This file is generated by org.jetbrains.jet.di.AllInjectorsGenerator. DO NOT EDIT! */
public class InjectorForTopDownAnalyzerForJvm implements InjectorForTopDownAnalyzer {

    private TopDownAnalyzer topDownAnalyzer;
    private TopDownAnalysisContext topDownAnalysisContext;
    private BodyResolver bodyResolver;
    private ControlFlowAnalyzer controlFlowAnalyzer;
    private DeclarationsChecker declarationsChecker;
    private DescriptorResolver descriptorResolver;
    private final Project project;
    private final TopDownAnalysisParameters topDownAnalysisParameters;
    private final BindingTrace bindingTrace;
    private final ModuleDescriptor moduleDescriptor;
    private final BuiltinsScopeExtensionMode builtinsScopeExtensionMode;
    private JavaBridgeConfiguration moduleConfiguration;
    private JavaDescriptorResolver javaDescriptorResolver;
    private PsiClassFinderImpl psiClassFinder;
    private NamespaceFactoryImpl namespaceFactory;
    private DeclarationResolver declarationResolver;
    private AnnotationResolver annotationResolver;
    private CallResolver callResolver;
    private ExpressionTypingServices expressionTypingServices;
    private TypeResolver typeResolver;
    private QualifiedExpressionResolver qualifiedExpressionResolver;
    private OverloadingConflictResolver overloadingConflictResolver;
    private ImportsResolver importsResolver;
    private ScriptHeaderResolver scriptHeaderResolver;
    private OverloadResolver overloadResolver;
    private OverrideResolver overrideResolver;
    private TypeHierarchyResolver typeHierarchyResolver;
    private ScriptBodyResolver scriptBodyResolver;
    private JavaSemanticServices javaSemanticServices;
    private JavaTypeTransformer javaTypeTransformer;
    private JavaClassResolver javaClassResolver;
    private JavaAnnotationResolver javaAnnotationResolver;
    private JavaCompileTimeConstResolver javaCompileTimeConstResolver;
    private JavaClassObjectResolver javaClassObjectResolver;
    private JavaSupertypesResolver javaSupertypesResolver;
    private JavaNamespaceResolver javaNamespaceResolver;
    private JavaDescriptorSignatureResolver javaDescriptorSignatureResolver;
    private JavaConstructorResolver javaConstructorResolver;
    private JavaValueParameterResolver javaValueParameterResolver;
    private JavaFunctionResolver javaFunctionResolver;
    private JavaInnerClassResolver javaInnerClassResolver;
    private JavaPropertiesResolver javaPropertiesResolver;

    public InjectorForTopDownAnalyzerForJvm(
        @NotNull Project project,
        @NotNull TopDownAnalysisParameters topDownAnalysisParameters,
        @NotNull BindingTrace bindingTrace,
        @NotNull ModuleDescriptor moduleDescriptor,
        @NotNull BuiltinsScopeExtensionMode builtinsScopeExtensionMode
    ) {
        this.topDownAnalyzer = new TopDownAnalyzer();
        this.topDownAnalysisContext = new TopDownAnalysisContext();
        this.bodyResolver = new BodyResolver();
        this.controlFlowAnalyzer = new ControlFlowAnalyzer();
        this.declarationsChecker = new DeclarationsChecker();
        this.descriptorResolver = new DescriptorResolver();
        this.project = project;
        this.topDownAnalysisParameters = topDownAnalysisParameters;
        this.bindingTrace = bindingTrace;
        this.moduleDescriptor = moduleDescriptor;
        this.builtinsScopeExtensionMode = builtinsScopeExtensionMode;
        this.moduleConfiguration = new JavaBridgeConfiguration();
        this.javaDescriptorResolver = new JavaDescriptorResolver();
        this.psiClassFinder = new PsiClassFinderImpl();
        this.namespaceFactory = new NamespaceFactoryImpl();
        this.declarationResolver = new DeclarationResolver();
        this.annotationResolver = new AnnotationResolver();
        this.callResolver = new CallResolver();
        this.expressionTypingServices = new ExpressionTypingServices();
        this.typeResolver = new TypeResolver();
        this.qualifiedExpressionResolver = new QualifiedExpressionResolver();
        this.overloadingConflictResolver = new OverloadingConflictResolver();
        this.importsResolver = new ImportsResolver();
        this.scriptHeaderResolver = new ScriptHeaderResolver();
        this.overloadResolver = new OverloadResolver();
        this.overrideResolver = new OverrideResolver();
        this.typeHierarchyResolver = new TypeHierarchyResolver();
        this.scriptBodyResolver = new ScriptBodyResolver();
        this.javaSemanticServices = new JavaSemanticServices();
        this.javaTypeTransformer = new JavaTypeTransformer();
        this.javaClassResolver = new JavaClassResolver();
        this.javaAnnotationResolver = new JavaAnnotationResolver();
        this.javaCompileTimeConstResolver = new JavaCompileTimeConstResolver();
        this.javaClassObjectResolver = new JavaClassObjectResolver();
        this.javaSupertypesResolver = new JavaSupertypesResolver();
        this.javaNamespaceResolver = new JavaNamespaceResolver();
        this.javaDescriptorSignatureResolver = new JavaDescriptorSignatureResolver();
        this.javaConstructorResolver = new JavaConstructorResolver();
        this.javaValueParameterResolver = new JavaValueParameterResolver();
        this.javaFunctionResolver = new JavaFunctionResolver();
        this.javaInnerClassResolver = new JavaInnerClassResolver();
        this.javaPropertiesResolver = new JavaPropertiesResolver();

        this.topDownAnalyzer.setBodyResolver(bodyResolver);
        this.topDownAnalyzer.setContext(topDownAnalysisContext);
        this.topDownAnalyzer.setDeclarationResolver(declarationResolver);
        this.topDownAnalyzer.setModuleDescriptor(moduleDescriptor);
        this.topDownAnalyzer.setNamespaceFactory(namespaceFactory);
        this.topDownAnalyzer.setOverloadResolver(overloadResolver);
        this.topDownAnalyzer.setOverrideResolver(overrideResolver);
        this.topDownAnalyzer.setTopDownAnalysisParameters(topDownAnalysisParameters);
        this.topDownAnalyzer.setTrace(bindingTrace);
        this.topDownAnalyzer.setTypeHierarchyResolver(typeHierarchyResolver);

        this.topDownAnalysisContext.setTopDownAnalysisParameters(topDownAnalysisParameters);

        this.bodyResolver.setCallResolver(callResolver);
        this.bodyResolver.setContext(topDownAnalysisContext);
        this.bodyResolver.setControlFlowAnalyzer(controlFlowAnalyzer);
        this.bodyResolver.setDeclarationsChecker(declarationsChecker);
        this.bodyResolver.setDescriptorResolver(descriptorResolver);
        this.bodyResolver.setExpressionTypingServices(expressionTypingServices);
        this.bodyResolver.setScriptBodyResolverResolver(scriptBodyResolver);
        this.bodyResolver.setTopDownAnalysisParameters(topDownAnalysisParameters);
        this.bodyResolver.setTrace(bindingTrace);

        this.controlFlowAnalyzer.setTopDownAnalysisParameters(topDownAnalysisParameters);
        this.controlFlowAnalyzer.setTrace(bindingTrace);

        this.declarationsChecker.setTrace(bindingTrace);

        this.descriptorResolver.setAnnotationResolver(annotationResolver);
        this.descriptorResolver.setExpressionTypingServices(expressionTypingServices);
        this.descriptorResolver.setTypeResolver(typeResolver);

        this.moduleConfiguration.setBuiltinsScopeExtensionMode(builtinsScopeExtensionMode);
        this.moduleConfiguration.setJavaSemanticServices(javaSemanticServices);
        this.moduleConfiguration.setProject(project);

        javaDescriptorResolver.setClassResolver(javaClassResolver);
        javaDescriptorResolver.setConstructorResolver(javaConstructorResolver);
        javaDescriptorResolver.setFunctionResolver(javaFunctionResolver);
        javaDescriptorResolver.setInnerClassResolver(javaInnerClassResolver);
        javaDescriptorResolver.setNamespaceResolver(javaNamespaceResolver);
        javaDescriptorResolver.setPropertiesResolver(javaPropertiesResolver);

        psiClassFinder.setProject(project);

        this.namespaceFactory.setConfiguration(moduleConfiguration);
        this.namespaceFactory.setModuleDescriptor(moduleDescriptor);
        this.namespaceFactory.setTrace(bindingTrace);

        declarationResolver.setAnnotationResolver(annotationResolver);
        declarationResolver.setContext(topDownAnalysisContext);
        declarationResolver.setDescriptorResolver(descriptorResolver);
        declarationResolver.setImportsResolver(importsResolver);
        declarationResolver.setScriptHeaderResolver(scriptHeaderResolver);
        declarationResolver.setTrace(bindingTrace);

        annotationResolver.setCallResolver(callResolver);
        annotationResolver.setExpressionTypingServices(expressionTypingServices);

        callResolver.setDescriptorResolver(descriptorResolver);
        callResolver.setExpressionTypingServices(expressionTypingServices);
        callResolver.setOverloadingConflictResolver(overloadingConflictResolver);
        callResolver.setTypeResolver(typeResolver);

        expressionTypingServices.setCallResolver(callResolver);
        expressionTypingServices.setDescriptorResolver(descriptorResolver);
        expressionTypingServices.setProject(project);
        expressionTypingServices.setTypeResolver(typeResolver);

        typeResolver.setAnnotationResolver(annotationResolver);
        typeResolver.setDescriptorResolver(descriptorResolver);
        typeResolver.setModuleConfiguration(moduleConfiguration);
        typeResolver.setQualifiedExpressionResolver(qualifiedExpressionResolver);

        importsResolver.setConfiguration(moduleConfiguration);
        importsResolver.setContext(topDownAnalysisContext);
        importsResolver.setQualifiedExpressionResolver(qualifiedExpressionResolver);
        importsResolver.setTrace(bindingTrace);

        scriptHeaderResolver.setContext(topDownAnalysisContext);
        scriptHeaderResolver.setDependencyClassByQualifiedNameResolver(javaDescriptorResolver);
        scriptHeaderResolver.setNamespaceFactory(namespaceFactory);
        scriptHeaderResolver.setTopDownAnalysisParameters(topDownAnalysisParameters);
        scriptHeaderResolver.setTrace(bindingTrace);

        overloadResolver.setContext(topDownAnalysisContext);
        overloadResolver.setTrace(bindingTrace);

        overrideResolver.setContext(topDownAnalysisContext);
        overrideResolver.setTopDownAnalysisParameters(topDownAnalysisParameters);
        overrideResolver.setTrace(bindingTrace);

        typeHierarchyResolver.setContext(topDownAnalysisContext);
        typeHierarchyResolver.setDescriptorResolver(descriptorResolver);
        typeHierarchyResolver.setImportsResolver(importsResolver);
        typeHierarchyResolver.setNamespaceFactory(namespaceFactory);
        typeHierarchyResolver.setScriptHeaderResolver(scriptHeaderResolver);
        typeHierarchyResolver.setTrace(bindingTrace);

        scriptBodyResolver.setContext(topDownAnalysisContext);
        scriptBodyResolver.setExpressionTypingServices(expressionTypingServices);
        scriptBodyResolver.setTrace(bindingTrace);

        javaSemanticServices.setDescriptorResolver(javaDescriptorResolver);
        javaSemanticServices.setPsiClassFinder(psiClassFinder);
        javaSemanticServices.setTrace(bindingTrace);
        javaSemanticServices.setTypeTransformer(javaTypeTransformer);

        javaTypeTransformer.setJavaSemanticServices(javaSemanticServices);
        javaTypeTransformer.setResolver(javaDescriptorResolver);

        javaClassResolver.setAnnotationResolver(javaAnnotationResolver);
        javaClassResolver.setClassObjectResolver(javaClassObjectResolver);
        javaClassResolver.setJavaDescriptorResolver(javaDescriptorResolver);
        javaClassResolver.setNamespaceResolver(javaNamespaceResolver);
        javaClassResolver.setPsiClassFinder(psiClassFinder);
        javaClassResolver.setSemanticServices(javaSemanticServices);
        javaClassResolver.setSignatureResolver(javaDescriptorSignatureResolver);
        javaClassResolver.setSupertypesResolver(javaSupertypesResolver);
        javaClassResolver.setTrace(bindingTrace);

        javaAnnotationResolver.setClassResolver(javaClassResolver);
        javaAnnotationResolver.setCompileTimeConstResolver(javaCompileTimeConstResolver);

        javaCompileTimeConstResolver.setAnnotationResolver(javaAnnotationResolver);
        javaCompileTimeConstResolver.setClassResolver(javaClassResolver);

        javaClassObjectResolver.setJavaDescriptorResolver(javaDescriptorResolver);
        javaClassObjectResolver.setSemanticServices(javaSemanticServices);
        javaClassObjectResolver.setSupertypesResolver(javaSupertypesResolver);
        javaClassObjectResolver.setTrace(bindingTrace);

        javaSupertypesResolver.setClassResolver(javaClassResolver);
        javaSupertypesResolver.setSemanticServices(javaSemanticServices);
        javaSupertypesResolver.setTrace(bindingTrace);
        javaSupertypesResolver.setTypeTransformer(javaTypeTransformer);

        javaNamespaceResolver.setJavaSemanticServices(javaSemanticServices);
        javaNamespaceResolver.setPsiClassFinder(psiClassFinder);
        javaNamespaceResolver.setTrace(bindingTrace);

        javaDescriptorSignatureResolver.setJavaSemanticServices(javaSemanticServices);

        javaConstructorResolver.setTrace(bindingTrace);
        javaConstructorResolver.setTypeTransformer(javaTypeTransformer);
        javaConstructorResolver.setValueParameterResolver(javaValueParameterResolver);

        javaValueParameterResolver.setTypeTransformer(javaTypeTransformer);

        javaFunctionResolver.setAnnotationResolver(javaAnnotationResolver);
        javaFunctionResolver.setParameterResolver(javaValueParameterResolver);
        javaFunctionResolver.setSignatureResolver(javaDescriptorSignatureResolver);
        javaFunctionResolver.setTrace(bindingTrace);
        javaFunctionResolver.setTypeTransformer(javaTypeTransformer);

        javaInnerClassResolver.setClassResolver(javaClassResolver);

        javaPropertiesResolver.setAnnotationResolver(javaAnnotationResolver);
        javaPropertiesResolver.setClassResolver(javaClassResolver);
        javaPropertiesResolver.setJavaDescriptorSignatureResolver(javaDescriptorSignatureResolver);
        javaPropertiesResolver.setSemanticServices(javaSemanticServices);
        javaPropertiesResolver.setTrace(bindingTrace);

        moduleConfiguration.init();

        psiClassFinder.initialize();

    }

    @PreDestroy
    public void destroy() {
    }

    public TopDownAnalyzer getTopDownAnalyzer() {
        return this.topDownAnalyzer;
    }

    public TopDownAnalysisContext getTopDownAnalysisContext() {
        return this.topDownAnalysisContext;
    }

    public BodyResolver getBodyResolver() {
        return this.bodyResolver;
    }

    public ControlFlowAnalyzer getControlFlowAnalyzer() {
        return this.controlFlowAnalyzer;
    }

    public DeclarationsChecker getDeclarationsChecker() {
        return this.declarationsChecker;
    }

    public DescriptorResolver getDescriptorResolver() {
        return this.descriptorResolver;
    }

    public Project getProject() {
        return this.project;
    }

    public TopDownAnalysisParameters getTopDownAnalysisParameters() {
        return this.topDownAnalysisParameters;
    }

    public BindingTrace getBindingTrace() {
        return this.bindingTrace;
    }

    public ModuleConfiguration getModuleConfiguration() {
        return this.moduleConfiguration;
    }

    public NamespaceFactoryImpl getNamespaceFactory() {
        return this.namespaceFactory;
    }

}
