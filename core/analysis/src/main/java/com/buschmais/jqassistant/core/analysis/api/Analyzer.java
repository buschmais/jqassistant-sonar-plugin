package com.buschmais.jqassistant.core.analysis.api;

import com.buschmais.jqassistant.core.analysis.api.rule.RuleSet;

/**
 * Defines the interface for the analyzer.
 */
public interface Analyzer {

    /**
     * Executes the given rules set.
     * 
     * @param ruleSet
     *            The rules set.
     * @throws AnalysisListenerException
     *             If the report cannot be written.
     */
    void execute(RuleSet ruleSet) throws AnalysisException;

}
