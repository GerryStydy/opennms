/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2009-2012 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2012 The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * OpenNMS(R) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with OpenNMS(R).  If not, see:
 *      http://www.gnu.org/licenses/
 *
 * For more information contact:
 *     OpenNMS(R) Licensing <license@opennms.org>
 *     http://www.opennms.org/
 *     http://www.opennms.com/
 *******************************************************************************/

package org.opennms.netmgt.provision.adapters.link;

import java.util.Collection;

import org.opennms.netmgt.model.DataLinkInterface;
import org.opennms.netmgt.model.OnmsLinkState;

/**
 * <p>NodeLinkService interface.</p>
 *
 * @author ranger
 * @version $Id: $
 */
public interface NodeLinkService {
    
    /**
     * <p>getNodeLabel</p>
     *
     * @param nodeId a int.
     * @return a {@link java.lang.String} object.
     */
    public String getNodeLabel(int nodeId);
    /**
     * <p>createLink</p>
     *
     * @param nodeParentId a int.
     * @param nodeId a int.
     */
    public void createLink(int nodeParentId, int nodeId);
    /**
     * <p>saveLinkState</p>
     *
     * @param state a {@link org.opennms.netmgt.model.OnmsLinkState} object.
     */
    public void saveLinkState(OnmsLinkState state);
    /**
     * <p>getNodeId</p>
     *
     * @param endPoint a {@link java.lang.String} object.
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getNodeId(String endPoint);
    /**
     * <p>getLinkContainingNodeId</p>
     *
     * @param nodeId a int.
     * @return a {@link java.util.Collection} object.
     */
    public Collection<DataLinkInterface> getLinkContainingNodeId(int nodeId);
    /**
     * <p>updateLinkStatus</p>
     *
     * @param nodeParentId a int.
     * @param nodeId a int.
     * @param status a {@link java.lang.String} object.
     */
    public void updateLinkStatus(int nodeParentId, int nodeId, String status);
    /**
     * <p>getLinkStateForInterface</p>
     *
     * @param dataLinkInterface a {@link org.opennms.netmgt.model.DataLinkInterface} object.
     * @return a {@link org.opennms.netmgt.model.OnmsLinkState} object.
     */
    public OnmsLinkState getLinkStateForInterface(DataLinkInterface dataLinkInterface);
    /**
     * <p>getPrimaryAddress</p>
     *
     * @param nodeId a int.
     * @return a {@link java.lang.String} object.
     */
    public String getPrimaryAddress(int nodeId);
    /**
     * <p>nodeHasEndPointService</p>
     *
     * @param nodeId a int.
     * @return a boolean.
     */
    public boolean nodeHasEndPointService(int nodeId);
    /**
     * <p>getEndPointStatus</p>
     *
     * @param nodeId a int.
     * @return a {@link java.lang.Boolean} object.
     */
    public Boolean getEndPointStatus(int nodeId);
}
