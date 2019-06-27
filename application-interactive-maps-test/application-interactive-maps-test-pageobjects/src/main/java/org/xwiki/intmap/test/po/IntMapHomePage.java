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
