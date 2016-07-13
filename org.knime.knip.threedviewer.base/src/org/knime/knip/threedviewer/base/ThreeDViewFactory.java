package org.knime.knip.threedviewer.base;

import java.util.List;

import org.knime.core.data.DataValue;
import org.knime.knip.cellviewer.interfaces.CellView;
import org.knime.knip.cellviewer.interfaces.CellViewFactory;

public class ThreeDViewFactory implements CellViewFactory {

    /**
     * {@inheritDoc}
     */
    @Override
    public int compareTo(final CellViewFactory o) {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CellView createCellView() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getCellViewName() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getCellViewDescription() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCompatible(final List<Class<? extends DataValue>> values) {
        // TODO Auto-generated method stub
        return false;
    }

}
