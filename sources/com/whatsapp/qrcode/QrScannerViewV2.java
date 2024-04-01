package com.whatsapp.qrcode;

import X.AnonymousClass029;
import X.C003701t;
import X.C02E;
import X.C02O;
import X.C13090ka;
import X.C2YL;
import X.C2YM;
import X.C52222aG;
import X.C79503ll;
import X.InterfaceC471629w;
import X.InterfaceC49112In;
import X.InterfaceC70853Tw;
import X.SurfaceHolder$CallbackC49122Io;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.qrcode.QrScannerViewV2;
import com.whatsapp.util.Log;
import java.util.Map;

/* loaded from: classes2.dex */
public class QrScannerViewV2 extends C2YL implements C2YM {
    public InterfaceC49112In A00;
    public InterfaceC471629w A01;
    public C02E A02;
    public C003701t A03;
    public C02O A04;
    public InterfaceC70853Tw A05;
    public final Handler A06;

    @Override // X.C2YM
    public void ARd() {
    }

    @Override // X.C2YM
    public void ARp() {
    }

    public QrScannerViewV2(Context context) {
        super(context);
        this.A06 = new Handler(Looper.getMainLooper());
        this.A00 = new C79503ll(this);
        A00();
    }

    public QrScannerViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A06 = new Handler(Looper.getMainLooper());
        this.A00 = new C79503ll(this);
        A00();
    }

    public final void A00() {
        InterfaceC471629w surfaceHolder$CallbackC49122Io;
        Context context = getContext();
        if (this.A03.A0C(125) && (surfaceHolder$CallbackC49122Io = C52222aG.A00(context, AnonymousClass029.A07(this.A04, this.A02))) != null) {
            Log.i("QrScannerViewV2/LiteCameraView");
        } else {
            Log.i("QrScannerViewV2/CameraView");
            surfaceHolder$CallbackC49122Io = new SurfaceHolder$CallbackC49122Io(context);
        }
        this.A01 = surfaceHolder$CallbackC49122Io;
        surfaceHolder$CallbackC49122Io.setQrScanningEnabled(true);
        this.A01.setCameraCallback(this.A00);
        View view = (View) this.A01;
        setupTapToFocus(view);
        addView(view);
    }

    @Override // X.C2YM
    public boolean AFr() {
        return this.A01.AFr();
    }

    @Override // X.C2YM
    public boolean AVK() {
        return this.A01.AVK();
    }

    @Override // X.C2YM
    public void AVf() {
        this.A01.AVf();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        InterfaceC471629w interfaceC471629w = this.A01;
        if (i != 0) {
            interfaceC471629w.pause();
            return;
        }
        interfaceC471629w.ARs();
        this.A01.A6C();
    }

    @Override // X.C2YM
    public void setQrDecodeHints(Map map) {
        this.A01.setQrDecodeHints(map);
    }

    @Override // X.C2YM
    public void setQrScannerCallback(InterfaceC70853Tw interfaceC70853Tw) {
        this.A05 = interfaceC70853Tw;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        ((View) this.A01).setVisibility(i);
    }

    private void setupTapToFocus(View view) {
        final C13090ka c13090ka = new C13090ka(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: X.3U0
            {
                QrScannerViewV2.this = this;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                QrScannerViewV2.this.A01.A7u(motionEvent.getX(), motionEvent.getY());
                return true;
            }
        });
        view.setOnTouchListener(new View.OnTouchListener() { // from class: X.3U1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                c13090ka.A00.APj(motionEvent);
                return true;
            }
        });
    }
}
