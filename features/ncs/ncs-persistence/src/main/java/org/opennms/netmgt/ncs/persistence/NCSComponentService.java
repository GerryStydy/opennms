package org.opennms.netmgt.ncs.persistence;

import org.opennms.netmgt.eventd.EventIpcManager;
import org.opennms.netmgt.model.ncs.NCSComponent;
import org.opennms.netmgt.ncs.rest.NCSRestService.ComponentList;

public interface NCSComponentService {
	public EventIpcManager getEventIpcManager();
	public void setEventIpcManager(EventIpcManager eventIpcManager);

	public NCSComponent getComponent(String type, String foreignSource, String foreignId);
	public ComponentList findComponentsWithAttribute(String string, String string2);

	public NCSComponent addOrUpdateComponents(NCSComponent component, boolean deleteOrphans);
	public NCSComponent addSubcomponent(String type, String foreignSource, String foreignId, NCSComponent subComponent, boolean deleteOrphans);
	public void deleteComponent(String type, String foreignSource, String foreignId, boolean deleteOrphans);
}