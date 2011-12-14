package org.movealong.fitnesse.idea.facet;

import com.intellij.facet.Facet;
import com.intellij.facet.FacetType;
import com.intellij.openapi.module.Module;

/**
 * Created by IntelliJ IDEA.
 * User: inkblot
 * Date: 12/13/11
 * Time: 10:45 PM
 */
public class FitNesseFacet extends Facet<FitNesseFacetConfiguration> {
    public FitNesseFacet(@org.jetbrains.annotations.NotNull FacetType facetType, @org.jetbrains.annotations.NotNull Module module, @org.jetbrains.annotations.NotNull String name, @org.jetbrains.annotations.NotNull FitNesseFacetConfiguration configuration, Facet underlyingFacet) {
        super(facetType, module, name, configuration, underlyingFacet);
    }
}
