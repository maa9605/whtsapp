package X;

import android.app.ActivityOptions;
import android.os.Bundle;

/* renamed from: X.1Sz  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C28641Sz extends C08950cN {
    public final ActivityOptions A00;

    public C28641Sz(ActivityOptions activityOptions) {
        this.A00 = activityOptions;
    }

    @Override // X.C08950cN
    public Bundle A01() {
        return this.A00.toBundle();
    }
}
