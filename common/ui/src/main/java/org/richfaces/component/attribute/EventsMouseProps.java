/*
 * JBoss, Home of Professional Open Source
 * Copyright ${year}, Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
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
package org.richfaces.component.attribute;

import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.EventName;


/**
 * Interface defining the methods for events-mouse-props.xml
 * @author <a href="http://community.jboss.org/people/bleathem">Brian Leathem</a>
 */
public interface EventsMouseProps {
    /**
     * Javascript code executed when a pointer button is clicked over this element.
     */
    @Attribute(events = @EventName(value = "click"))
    String getOnclick();

    /**
     * Javascript code executed when a pointer button is double clicked over this element.
     */
    @Attribute(events = @EventName(value = "dblclick"))
    String getOndblclick();

    /**
     * Javascript code executed when a pointer button is pressed down over this element.
     */
    @Attribute(events = @EventName(value = "mousedown"))
    String getOnmousedown();

    /**
     * Javascript code executed when a pointer button is released over this element.
     */
    @Attribute(events = @EventName(value = "mouseup"))
    String getOnmouseup();

    /**
     * Javascript code executed when a pointer button is moved onto this element.
     */
    @Attribute(events = @EventName(value = "mouseover"))
    String getOnmouseover();

    /**
     * Javascript code executed when a pointer button is moved within this element.
     */
    @Attribute(events = @EventName(value = "mousemove"))
    String getOnmousemove();

    /**
     * Javascript code executed when a pointer button is moved away from this element.
     */
    @Attribute(events = @EventName(value = "mouseout"))
    String getOnmouseout();
}