package com.buschmais.jqassistant.core.store.impl;

import com.buschmais.jqassistant.core.model.api.descriptor.AbstractDescriptor;

/**
 * A hierarchical name of a descriptor.
 */
public class Name {

    /**
     * The local name.
     */
    private final String name;

    /**
     * The full qualified name.
     */
    private final String fullQualifiedName;

    /**
     * Constructor.
     *
     * @param parent    The parent descriptor.
     * @param separator The separator to use.
     * @param name      The name.
     */
    public Name(AbstractDescriptor parent, char separator, String name) {
        this.name = name;
        if (parent != null) {
            this.fullQualifiedName = parent.getFullQualifiedName() + separator + name;
        } else {
            this.fullQualifiedName = name;
        }
    }

	/**
	 * Constructor for root nodes.
	 *
	 * @param name
	 *            The name.
	 */
	public Name(String name) {
		this.name = name;
		this.fullQualifiedName = name;
	}

    /**
     * Return the name.
     *
     * @return The name.
     */
    public String getName() {
        return name;
    }

    /**
     * Return the full qualified name.
     *
     * @return The full qualified name.
     */
    public String getFullQualifiedName() {
        return fullQualifiedName;
    }
}