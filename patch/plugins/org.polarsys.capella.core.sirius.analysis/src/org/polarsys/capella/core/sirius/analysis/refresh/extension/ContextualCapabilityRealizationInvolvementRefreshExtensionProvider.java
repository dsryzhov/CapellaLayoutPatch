/*******************************************************************************
 * Copyright (c) 2019, 2020 THALES GLOBAL SERVICES.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.core.sirius.analysis.refresh.extension;

import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.business.api.refresh.IRefreshExtension;
import org.eclipse.sirius.diagram.business.api.refresh.IRefreshExtensionProvider;
import org.polarsys.capella.core.sirius.analysis.IDiagramNameConstants;

public class ContextualCapabilityRealizationInvolvementRefreshExtensionProvider implements IRefreshExtensionProvider {

  private static final ContextualCapabilityRealizationInvolvementRefreshExtension REFRESH_EXTENSION = new ContextualCapabilityRealizationInvolvementRefreshExtension();

  @Override
  public boolean provides(DDiagram viewPoint) {
    return IDiagramNameConstants.CONTEXTUAL_CAPABILITY_REALIZATION_INVOLVEMENT
        .equals(viewPoint.getDescription().getName());
  }

  @Override
  public IRefreshExtension getRefreshExtension(DDiagram viewPoint) {
    return REFRESH_EXTENSION;
  }

}
