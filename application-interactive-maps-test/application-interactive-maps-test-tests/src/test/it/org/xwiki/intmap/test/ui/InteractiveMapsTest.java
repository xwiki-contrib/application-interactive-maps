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

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.xwiki.intmap.test.po.IntMapEditPage;
import org.xwiki.intmap.test.po.IntMapHomePage;
import org.xwiki.intmap.test.po.PointEditPage;
import org.xwiki.model.reference.DocumentReference;
import org.xwiki.model.reference.EntityReference;
import org.xwiki.panels.test.po.ApplicationsPanel;
import org.xwiki.test.ui.AbstractTest;
import org.xwiki.test.ui.SuperAdminAuthenticationRule;
import org.xwiki.test.ui.po.CreatePagePage;
import org.xwiki.test.ui.po.ViewPage;

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

    private final String MAP_NAME = "IslamabadMap";

    private final String[] MAP_SPACE = { "Maps", "Testing", MAP_NAME };

    private final String POINT_NAME = "Islamabad";

    private final String[] POINT_SPACE = { "Maps", "Testing", "Points", POINT_NAME };

    private final String WIKI_NAME = "xwiki";

    @Test
    public void testNewMap() throws Exception
    {
        // Check for the homepage
        ApplicationsPanel applicationsPanel = ApplicationsPanel.gotoPage();
        ViewPage mapsVP = applicationsPanel.clickApplication("Interactive Maps");

        IntMapHomePage mapsHomePage = IntMapHomePage.DEFAULT_HOME_PAGE;
        Assert.assertEquals(mapsHomePage.getSpace(), mapsVP.getMetaDataValue("space"));
        Assert.assertEquals(mapsHomePage.getPage(), mapsVP.getMetaDataValue("page"));

        // Delete the point if it already exists
        if (getUtil().pageExists(Arrays.asList(POINT_SPACE), "WebHome")) {
            EntityReference pointReference = new DocumentReference(WIKI_NAME, Arrays.asList(POINT_SPACE), "WebHome");
            getUtil().deletePage(pointReference);
        }

        EntityReference homeReference = new DocumentReference(WIKI_NAME, Arrays.asList("Maps"), "WebHome");
        getUtil().gotoPage(homeReference);

        // Create button for creating pages from templates
        WebElement createBtn = getDriver().findElementById("tmCreate");
        createBtn.click();

        // Create a point for the map
        CreatePagePage pointPage = new CreatePagePage();
        pointPage.createPageFromTemplate(String.join(".", POINTS_SPACE), POINT_NAME, "Maps.Code.PointProvider", true);
        PointEditPage pointEditPage = new PointEditPage();
        pointEditPage.setValuesForPoint("33.6844", "73.0479", true, "Some data");
        pointEditPage.clickSaveAndView();

        // Delete the map if it already exists
        if (getUtil().pageExists(Arrays.asList(MAP_SPACE), "WebHome")) {
            EntityReference mapReference = new DocumentReference(WIKI_NAME, Arrays.asList(MAP_SPACE), "WebHome");
            getUtil().deletePage(mapReference);
        }

        getUtil().gotoPage(homeReference);

        // Click on the create button and go to the create page
        createBtn = getDriver().findElementById("tmCreate");
        createBtn.click();

        // Create a page from template (MapProvider in this case)
        CreatePagePage cp = new CreatePagePage();
        cp.createPageFromTemplate(TEST_SPACE, MAP_NAME, "Maps.Code.MapProvider", true);

        // Perform actions on the map edit page
        IntMapEditPage mapEditPage = new IntMapEditPage();
        // Set the values for the new map
        String querySpace = String.join(".", POINTS_SPACE);
        mapEditPage.setValuesForMap(true, true, "space:" + querySpace, true, 14, "", "", "Islamabad", "Test");

        // Click and view the map
        mapEditPage.clickSaveAndView();

        // Check if the map exists
        WebElement leafletMap = getDriver().findElementByClassName("leaflet-map-pane");
        Assert.assertNotNull(leafletMap);

        // Check if the point is inside the map
        //  WebDriverWait waitForMarker = new WebDriverWait(getDriver(), 20);
        //  waitForMarker
        //          .until(ExpectedConditions.visibilityOf(getDriver().findElement(By.className("leaflet-marker-icon"))));
        //  WebElement leafletMarker = getDriver().findElementByClassName("leaflet-marker-icon");
        //  Assert.assertNotNull(leafletMarker);
    }
}