package org.xwiki.intmap.test.po;

import java.util.Arrays;

import org.xwiki.model.EntityType;
import org.xwiki.model.reference.DocumentReference;
import org.xwiki.model.reference.EntityReference;
import org.xwiki.model.reference.WikiReference;
import org.xwiki.test.ui.po.ViewPage;

public class IntMapHomePage extends ViewPage
{
    private EntityReference homeReference;

    public static IntMapHomePage DEFAULT_HOME_PAGE = new IntMapHomePage(new DocumentReference("xwiki", Arrays.asList("Maps"), "WebHome"));

    public IntMapHomePage(EntityReference homeReference)
    {
        this.homeReference = homeReference;
    }

    public void gotoPage()
    {
        getUtil().gotoPage(this.homeReference);
    }

    public String getPage()
    {
        return this.homeReference.getName();
    }

    public String getSpace()
    {
        return getUtil().serializeReference(
                this.homeReference.extractReference(EntityType.SPACE).removeParent(new WikiReference("xwiki")));
    }
}
