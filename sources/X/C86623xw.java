package X;

import android.content.Context;

/* renamed from: X.3xw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C86623xw extends AbstractC84003t2 {
    public final C73043b0 A00;

    public C86623xw(Context context) {
        super(context);
        setClipToOutline(true);
        C73043b0 c73043b0 = new C73043b0();
        this.A00 = c73043b0;
        setOutlineProvider(c73043b0);
    }

    public void setIsFullscreen(boolean z) {
        this.A00.A00 = !z;
    }
}
