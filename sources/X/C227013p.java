package X;

import android.content.Intent;

/* renamed from: X.13p  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C227013p extends Exception {
    public final Intent mIntent;

    public C227013p(Intent intent) {
        super("Google Play Services not available");
        this.mIntent = intent;
    }
}
