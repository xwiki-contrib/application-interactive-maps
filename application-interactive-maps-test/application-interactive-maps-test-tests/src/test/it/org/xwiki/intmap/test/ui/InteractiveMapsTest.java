/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.intmap.test.ui;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xwiki.intmap.test.po.IntMapEditPage;
import org.xwiki.intmap.test.po.IntMapHomePage;
import org.xwiki.model.reference.DocumentReference;
import org.xwiki.model.reference.EntityReference;
import org.xwiki.panels.test.po.ApplicationsPanel;
import org.xwiki.test.ui.AbstractTest;
import org.xwiki.test.ui.SuperAdminAuthenticationRule;
import org.xwiki.test.ui.po.CreatePagePage;
import org.xwiki.test.ui.po.ViewPage;
import org.xwiki.test.ui.po.editor.EditPage;

/**
 * UI tests for the Interactive Maps Application.
 *
 * @version $Id$
 */
public class InteractiveMapsTest extends AbstractTest
{
    @Rule
    public SuperAdminAuthenticationRule authenticationRule = new SuperAdminAuthenticationRule(getUtil());

    private final String[] POINTS_SPACE = { "Maps", "Testing", "Points" };

    private final String TEST_SPACE = "Maps.Testing";

    private final String MAP_NAME = "Islamabad";

    @Test
    public void testNewMap()
    {
        // Check for the homepage
        ApplicationsPanel applicationsPanel = ApplicationsPanel.gotoPage();
        ViewPage mapsVP = applicationsPanel.clickApplication("Interactive Maps");

        IntMapHomePage mapsHomePage = IntMapHomePage.DEFAULT_HOME_PAGE;
        Assert.assertEquals(mapsHomePage.getSpace(), mapsVP.getMetaDataValue("space"));
        Assert.assertEquals(mapsHomePage.getPage(), mapsVP.getMetaDataValue("page"));

        // Create a point for the map
        createPageWithPoint(POINTS_SPACE, "Islamabad", "This point is Islamabad.", "Islamabad");

        // Now that a point is created, we want to create a map
        // Click on the create button and go to the create page
        WebElement createBtn = getDriver().findElementById("tmCreate");
        createBtn.click();

        // Create a page from template (MapProvider in this case)
        CreatePagePage cp = new CreatePagePage();
        cp.createPageFromTemplate(TEST_SPACE, MAP_NAME, "Maps.Code.MapProvider");
        cp.clickCreate();

        //PASS TILL THIS POINT

//        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), 10);
//
//        WebElement body = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.id("Maps.Code.MapClass_0_defaultLocation")));
//        body.sendKeys("TESTING");

//        IntMapEditPage mapEditPage = new IntMapEditPage();
////        // Set the values for the new map
////        String querySpace = String.join(".", POINTS_SPACE);
////        mapEditPage.setValuesForMap(14, "", true, true, "space:" + querySpace, "Islamabad");
//
//        // Finally click and view the map
//        mapEditPage.clickSaveAndView();
    }

    public ViewPage createPageWithPoint(String[] space, String title, String content, String location)
    {
        EntityReference entityReference = new DocumentReference("xwiki", Arrays.asList(space), title);
        getUtil().deletePage(entityReference);
        ViewPage pointPage = getUtil().createPage(entityReference, content, title);
        Map<String, String> pointPageObject = new HashMap<>();
        pointPageObject.put("location", location);
        getUtil().addObject(entityReference, "Maps.Code.PointClass", pointPageObject);
        getUtil().gotoPage(entityReference);
        return pointPage;
    }
}