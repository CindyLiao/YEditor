/*
 * Created on 09/12/2003
 * YAWLEditor v1.0 
 *
 * @author Lindsay Bradford
 * 
 * 
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *
 */

package org.yawlfoundation.yawl.editor.actions.palette;

import javax.swing.Action;

import org.yawlfoundation.yawl.editor.swing.TooltipTogglingWidget;
import org.yawlfoundation.yawl.editor.swing.menu.ControlFlowPalette;

public class MultipleAtomicTaskAction extends ControlFlowPaletteAction implements TooltipTogglingWidget {

  private static final long serialVersionUID = 1L;

  {
    putValue(Action.SHORT_DESCRIPTION, getDisabledTooltipText());
    putValue(Action.NAME, "Multiple Atomic Task");
    putValue(Action.LONG_DESCRIPTION, "Add a new Multiple Atomic Task");
    putValue(Action.SMALL_ICON, getPaletteIconByName("PaletteMultipleAtomicTask"));
  }
  
  public MultipleAtomicTaskAction(ControlFlowPalette palette) {
    super(palette);
  }
  public String getEnabledTooltipText() {
    return " Add multiple Atomic Tasks ";
  }
  
  public String getDisabledTooltipText() {
    return " You must have an open specification, and selected net to use the palette ";
  }

  public String getButtonStatusText() {
    return getClickAnywhereText() + "multiple atomic task.";
  }

  public ControlFlowPalette.SelectionState getSelectionID() {
    return ControlFlowPalette.SelectionState.MULTIPLE_ATOMIC_TASK;
  }
}
