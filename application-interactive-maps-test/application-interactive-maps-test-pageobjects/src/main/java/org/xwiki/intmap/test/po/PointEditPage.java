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
import org.xwiki.test.ui.po.editor.EditPage;

/**
 * Edit page for map edit and creation
 *
 * @version $Id$
 */
public class PointEditPage extends EditPage
{
    /**
     * UI tests for the Interactive Maps Application.
     *
     * @version $Id$
     */
    @FindBy(id = "Maps.Code.PointClass_0_includePopup")
    private WebElement includePopup;

    @FindBy(id = "content")
    private WebElement popupContent;

    @FindBy(id = "pointLat")
    private WebElement pointLat;

    @FindBy(id = "pointLng")
    private WebElement pointLng;

    public void setValuesForPoint(String latitude, String longitude, boolean includePopup, String popupContent)
    {
        setAttribute(this.pointLat, "value", latitude);
        setAttribute(this.pointLng, "value", longitude);
        handleCheckBox(this.includePopup, includePopup);
        this.popupContent.clear();
        this.popupContent.sendKeys(popupContent);
    }

    private void handleCheckBox(WebElement element, boolean value)
    {
        if (value && !element.isSelected()) {
            element.click();
        } else if (!value && element.isSelected()) {
            element.click();
        }
    }

    private void setAttribute(WebElement element, String attName, String attValue) {
        getDriver().executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);",
                element, attName, attValue);
    }

}