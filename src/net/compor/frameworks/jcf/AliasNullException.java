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

import net.compor.commons.lang.ComporRuntimeException;
import net.compor.commons.util.ComporResourceBundleMessageFormat;

/**
 * This exception is thrown when a service alias is defined null.
 * @author <a href="mailto:marcos@compor.net">Marcos Pereira</a>
 * @version 1.0
 */
public class AliasNullException extends ComporRuntimeException {

  /**
   * Service name.
   */
  private String serviceName;

  /**
   * Creates a new reference to <code>AliasNullException</code>.
   * @param _serviceName service name.
   */
  public AliasNullException(final String _serviceName) {
    serviceName = _serviceName;
  }

  /**
   * Returns the service name.
   * @return String service name
   */
  public final String getServiceName() {
    return serviceName;
  }

  /**
   * {@inheritDoc}
   */
  protected String getFormattedMessage() {
    return ComporResourceBundleMessageFormat.formatProperty(JCFMessages
        .getInstance().get("exception.aliasnull"), //$NON-NLS-1$
        new Object[] { this.getServiceName() });
  }
}
