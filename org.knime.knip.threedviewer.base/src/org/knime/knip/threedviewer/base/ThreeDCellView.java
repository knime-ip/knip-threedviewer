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
        // TODO Auto-generated method stub
        return null;
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
        // TODO Auto-generated method stub

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onReset() {
        // TODO Auto-generated method stub

    }

}
