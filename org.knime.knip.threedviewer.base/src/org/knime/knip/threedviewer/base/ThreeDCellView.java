package org.knime.knip.threedviewer.base;

import java.util.List;

import javax.swing.JPanel;

import org.knime.core.data.DataValue;
import org.knime.knip.base.data.img.ImgPlusValue;
import org.knime.knip.cellviewer.interfaces.CellView;

import net.imagej.ImgPlus;
import net.imglib2.type.numeric.RealType;

public class ThreeDCellView implements CellView {

    /**
     * {@inheritDoc}
     */
    @Override
    public JPanel getViewComponent() {
        return new JPanel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void updateComponent(final List<DataValue> valuesToView) {
        ImgPlus<RealType> imp = ((ImgPlusValue)valuesToView.get(0)).getImgPlus();

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onClose() {
        // FIXME
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onReset() {
        // FIXME
    }

}
