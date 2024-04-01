package java.lang;

import X.C29X;
import X.C2Il;
import X.C52242aI;
import X.SurfaceHolder$CallbackC49122Io;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class RunnableEBaseShape0S0100002_I0 extends RunnableEmptyBase implements Runnable {
    public float A00;
    public float A01;
    public Object A02;
    public final int A03;

    public RunnableEBaseShape0S0100002_I0(Object obj, float f, float f2, int i) {
        this.A03 = i;
        this.A02 = obj;
        this.A00 = f;
        this.A01 = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C29X c29x;
        switch (this.A03) {
            case 0:
                float f = this.A00;
                float f2 = this.A01;
                C52242aI c52242aI = ((C2Il) this.A02).A01.A0M;
                float left = c29x.A07.getLeft() + f;
                float top = c29x.A07.getTop() + f2;
                float f3 = c52242aI.A00 / 2.0f;
                c52242aI.A01 = new RectF(left - f3, top - f3, left + f3, f3 + top);
                c52242aI.A02 = null;
                c52242aI.setVisibility(0);
                c52242aI.invalidate();
                c52242aI.removeCallbacks(c52242aI.A04);
                return;
            case 1:
                final SurfaceHolder$CallbackC49122Io surfaceHolder$CallbackC49122Io = (SurfaceHolder$CallbackC49122Io) this.A02;
                float f4 = this.A00;
                float f5 = this.A01;
                synchronized (surfaceHolder$CallbackC49122Io) {
                    Camera camera = surfaceHolder$CallbackC49122Io.A07;
                    if (camera == null || !surfaceHolder$CallbackC49122Io.A0O) {
                        return;
                    }
                    camera.cancelAutoFocus();
                    Camera.Parameters parameters = surfaceHolder$CallbackC49122Io.A07.getParameters();
                    if (parameters.getMaxNumFocusAreas() > 0) {
                        float dimension = surfaceHolder$CallbackC49122Io.getContext().getResources().getDimension(R.dimen.autofocus_box_size) / 2.0f;
                        RectF rectF = new RectF(f4 - dimension, f5 - dimension, f4 + dimension, dimension + f5);
                        Matrix matrix = new Matrix();
                        matrix.setScale(surfaceHolder$CallbackC49122Io.A0P ? -1.0f : 1.0f, 1.0f);
                        matrix.postRotate(surfaceHolder$CallbackC49122Io.A01);
                        float width = surfaceHolder$CallbackC49122Io.getWidth();
                        float height = surfaceHolder$CallbackC49122Io.getHeight();
                        matrix.postScale(width / 2000.0f, height / 2000.0f);
                        matrix.postTranslate(width / 2.0f, height / 2.0f);
                        matrix.invert(matrix);
                        matrix.mapRect(rectF);
                        Rect rect = new Rect();
                        int A00 = SurfaceHolder$CallbackC49122Io.A00(rectF.left);
                        rect.left = A00;
                        int A002 = SurfaceHolder$CallbackC49122Io.A00(rectF.top);
                        rect.top = A002;
                        int A003 = SurfaceHolder$CallbackC49122Io.A00(rectF.right);
                        rect.right = A003;
                        int A004 = SurfaceHolder$CallbackC49122Io.A00(rectF.bottom);
                        rect.bottom = A004;
                        if (Math.abs(A002 - A004) < 10) {
                            rect.top = A002 - 5;
                            rect.bottom = A004 + 5;
                        }
                        if (Math.abs(A00 - A003) < 10) {
                            rect.left = A00 - 5;
                            rect.right = A003 + 5;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new Camera.Area(rect, SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS));
                        parameters.setFocusAreas(arrayList);
                        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
                        if (supportedFocusModes != null && supportedFocusModes.contains("auto")) {
                            parameters.setFocusMode("auto");
                        }
                        surfaceHolder$CallbackC49122Io.A07.setParameters(parameters);
                        surfaceHolder$CallbackC49122Io.A0H.AHd(f4, f5);
                    }
                    surfaceHolder$CallbackC49122Io.A07.autoFocus(new Camera.AutoFocusCallback() { // from class: X.2oJ
                        @Override // android.hardware.Camera.AutoFocusCallback
                        public final void onAutoFocus(boolean z, Camera camera2) {
                            SurfaceHolder$CallbackC49122Io.this.A0H.AHe(z);
                        }
                    });
                    return;
                }
            default:
                return;
        }
    }
}
