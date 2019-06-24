package org.xwiki.intmap.test.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.xwiki.test.ui.po.InlinePage;
import org.xwiki.test.ui.po.editor.EditPage;

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
    @FindBy(id = "Maps.Code.MapClass_0_defaultZoom")
    private WebElement defaultZoom;

    @FindBy(id = "Maps.Code.MapClass_0_tiles")
    private WebElement tiles;

    @FindBy(id = "Maps.Code.MapClass_0_includeSearch")
    private WebElement locationSearch;

    @FindBy(id = "Maps.Code.MapClass_0_includeCurrentLocation")
    private WebElement currentLocation;

    @FindBy(id = "Maps.Code.MapClass_0_query")
    private WebElement query;

    @FindBy(id = "Maps.Code.MapClass_0_defaultLocation")
    private WebElement defaultLocation;

    public void setValuesForMap(int defaultZoom, String tiles, boolean locationSearch, boolean currentLocation,
            String query, String defaultLocation)
    {
        this.defaultZoom.clear();
        this.defaultZoom.sendKeys(String.valueOf(defaultZoom));
        this.tiles.clear();
        this.tiles.sendKeys(tiles);
        this.query.clear();
        this.query.sendKeys(query);
        this.defaultLocation.clear();
        this.defaultLocation.sendKeys(defaultLocation);

        if (locationSearch && !this.locationSearch.isSelected()) {
            this.locationSearch.click();
        } else if (!locationSearch && this.locationSearch.isSelected()){
            this.locationSearch.click();
        }

        if (currentLocation && !this.currentLocation.isSelected()) {
            this.currentLocation.click();
        } else if (!currentLocation && this.currentLocation.isSelected()){
            this.currentLocation.click();
        }

    }
}