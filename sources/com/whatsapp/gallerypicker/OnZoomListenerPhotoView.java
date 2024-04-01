package com.whatsapp.gallerypicker;

import X.AbstractC68733Lh;
import X.InterfaceC61182vj;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

/* loaded from: classes2.dex */
public class OnZoomListenerPhotoView extends AbstractC68733Lh {
    public InterfaceC61182vj A00;

    public OnZoomListenerPhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.whatsapp.mediaview.PhotoView, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        return super.onDoubleTap(motionEvent);
    }

    @Override // com.whatsapp.mediaview.PhotoView, android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return super.onScaleBegin(scaleGestureDetector);
    }

    @Override // com.whatsapp.mediaview.PhotoView, android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        super.onScaleEnd(scaleGestureDetector);
    }

    public void setOnZoomListener(InterfaceC61182vj interfaceC61182vj) {
        this.A00 = interfaceC61182vj;
    }
}
