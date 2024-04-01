package X;

import android.hardware.display.DisplayManager;

/* renamed from: X.132  reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass132 implements DisplayManager.DisplayListener {
    public final DisplayManager A00;
    public final /* synthetic */ AnonymousClass134 A01;

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayRemoved(int i) {
    }

    public AnonymousClass132(AnonymousClass134 anonymousClass134, DisplayManager displayManager) {
        this.A01 = anonymousClass134;
        this.A00 = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayChanged(int i) {
        if (i == 0) {
            this.A01.A00();
        }
    }
}
