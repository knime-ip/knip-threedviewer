package org.knime.knip.threedviewer.base;

import java.util.List;

import org.knime.core.data.DataValue;
import org.knime.knip.base.data.img.ImgPlusValue;
import org.knime.knip.cellviewer.interfaces.CellView;
import org.knime.knip.cellviewer.interfaces.CellViewFactory;

public class ThreeDViewFactory implements CellViewFactory {

    /**
     * {@inheritDoc}
     */
    @Override
    public int compareTo(final CellViewFactory o) {
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CellView createCellView() {
        return new ThreeDCellView();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getCellViewName() {
        return "Three D Viewer";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getCellViewDescription() {
        return "ThreeDViewerBlah";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCompatible(final List<Class<? extends DataValue>> values) {
        if (values.size() == 1 && ImgPlusValue.class.isAssignableFrom(values.get(0))) {
            return true;
        } else {
            return false;
        }
    }

}
