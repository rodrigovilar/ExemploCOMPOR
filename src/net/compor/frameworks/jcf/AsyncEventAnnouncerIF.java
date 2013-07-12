/*
 * COMPOR Java Component Framework (JCF) JCF is a subproject of the COMPOR
 * project (http://www.compor.net). JCF is a component-based framework for
 * developing software supporting dynamic unanticipated software evolution. JCF
 * is a Java implementation of the COMPOR Component Model Specification (CMS).
 * Further information can be found at http://www.compor.net. 
 * 
 * Copyright (C) 2006 Embedded Systems and Pervasive Computing Lab, 
 *                      Federal University of Campina Grande 
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by the Free
 * Software Foundation; either version 2 of the License, or (at your option) any
 * later version. This program is distributed in the hope that it will be
 * useful, but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details. You should have received a copy of the GNU
 * General Public License along with this program; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301, USA.
 */

package net.compor.frameworks.jcf;

/**
 * Represents a asyncronous announcer of events.
 * @author <a href="mailto:hyggo@compor.net">Hyggo Almeida</a>
 * @version 1.0
 */
public interface AsyncEventAnnouncerIF {

  /**
   * Announce asyncronous event.
   * @param _eventAnnouncement
   *          event
   * @throws InvalidParametersException
   *           if some parameter is invalid.
   * @throws IllegalAccessMethodException
   *           if there is an error while accessing the method that implements
   *           the service.
   * @throws ServiceNotImplementedException
   *           if the service is not implemented by the component.
   * @throws ComponentNotStartedException
   *           if the component has not been started yet.
   */
  void announceAsyncEvent(final EventAnnouncement _eventAnnouncement)
      throws InvalidParametersException, ServiceNotImplementedException,
      IllegalAccessMethodException, ComponentNotStartedException;
}
