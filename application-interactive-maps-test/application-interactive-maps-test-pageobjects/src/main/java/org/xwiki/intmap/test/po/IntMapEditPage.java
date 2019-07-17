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
package org.xwiki.intmap.test.po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.xwiki.test.ui.po.InlinePage;

/**
 * Edit page for map edit and creation
 *
 * @version $Id$
 */
public class IntMapEditPage extends InlinePage
{
    /**
     * UI tests for the Interactive Maps Application.
     *
     * @version $Id$
     */
    @FindBy(id = "Maps.Code.MapClass_0_includeSearch")
    private WebElement locationSearch;

    @FindBy(id = "Maps.Code.MapClass_0_includeCurrentLocation")
    private WebElement currentLocation;

    @FindBy(id = "Maps.Code.MapClass_0_query")
    private WebElement query;

    @FindBy(id = "advanced-options-btn")
    private WebElement advancedOptions;

    @FindBy(id = "Maps.Code.MapClass_0_includeMapScale")
    private WebElement mapScale;

    @FindBy(id = "Maps.Code.MapClass_0_defaultZoom")
    private WebElement defaultZoom;

    @FindBy(id = "Maps.Code.MapClass_0_tiles")
    private WebElement tiles;

    @FindBy(id = "Maps.Code.MapClass_0_mapSize")
    private WebElement mapSize;

    @FindBy(id = "Maps.Code.MapClass_0_defaultLocation")
    private WebElement defaultLocation;

    @FindBy(id = "Maps.Code.MapClass_0_attribution")
    private WebElement attribution;

    public void setValuesForMap(boolean locationSearch, boolean currentLocation, String query, boolean mapScale,
            int defaultZoom, String tiles, String mapSize, String defaultLocation, String attribution)
    {
        handleCheckBox(this.locationSearch, locationSearch);
        handleCheckBox(this.currentLocation, currentLocation);
        this.query.clear();
        this.query.sendKeys(query);
        advancedOptions.click();
        handleCheckBox(this.mapScale, mapScale);
        this.defaultZoom.clear();
        this.defaultZoom.sendKeys(String.valueOf(defaultZoom));
        this.tiles.clear();
        this.tiles.sendKeys(tiles);
        this.mapSize.clear();
        this.mapSize.sendKeys(mapSize);
        this.defaultLocation.clear();
        this.defaultLocation.sendKeys(defaultLocation);
        this.attribution.clear();
        this.attribution.sendKeys(attribution);
    }

    private void handleCheckBox(WebElement element, boolean value)
    {
        if (value && !element.isSelected()) {
            element.click();
        } else if (!value && element.isSelected()) {
            element.click();
        }
    }
}