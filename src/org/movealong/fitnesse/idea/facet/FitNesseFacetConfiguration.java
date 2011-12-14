package org.movealong.fitnesse.idea.facet;

import com.intellij.facet.FacetConfiguration;
import com.intellij.facet.ui.FacetEditorContext;
import com.intellij.facet.ui.FacetEditorTab;
import com.intellij.facet.ui.FacetValidatorsManager;
import com.intellij.openapi.util.InvalidDataException;
import com.intellij.openapi.util.WriteExternalException;
import org.jdom.Element;
import org.movealong.fitnesse.idea.facet.ui.FitNesseSettingTab;

/**
 * Created by IntelliJ IDEA.
 * User: inkblot
 * Date: 12/13/11
 * Time: 10:46 PM
 */
public class FitNesseFacetConfiguration implements FacetConfiguration {
    public FacetEditorTab[] createEditorTabs(FacetEditorContext editorContext, FacetValidatorsManager validatorsManager) {
        return new FacetEditorTab[]{new FitNesseSettingTab(editorContext)};
    }

    public void readExternal(Element element) throws InvalidDataException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void writeExternal(Element element) throws WriteExternalException {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
