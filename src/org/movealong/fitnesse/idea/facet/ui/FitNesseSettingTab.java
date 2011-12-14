package org.movealong.fitnesse.idea.facet.ui;

import com.intellij.facet.ui.FacetEditorContext;
import com.intellij.facet.ui.FacetEditorTab;
import com.intellij.openapi.options.ConfigurationException;
import org.jetbrains.annotations.Nls;

import javax.swing.*;

/**
 * Created by IntelliJ IDEA.
 * User: inkblot
 * Date: 12/13/11
 * Time: 11:16 PM
 */
public class FitNesseSettingTab extends FacetEditorTab {
    private final FacetEditorContext editorContext;

    public FitNesseSettingTab(FacetEditorContext editorContext) {
        this.editorContext = editorContext;
    }

    @Nls
    public String getDisplayName() {
        return "FitNesse";
    }

    public JComponent createComponent() {
        return null;
    }

    public boolean isModified() {
        return false;
    }

    public void apply() throws ConfigurationException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void reset() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void disposeUIResources() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
