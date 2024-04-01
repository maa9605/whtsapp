package X;

import android.net.Uri;

/* renamed from: X.1PQ  reason: invalid class name */
/* loaded from: classes.dex */
public interface C1PQ {
    public static final Uri A00;
    public static final Uri A01;

    static {
        Uri build = new Uri.Builder().scheme("content").authority("com.whatsapp.provider.instrumentation").build();
        A01 = build;
        A00 = build.buildUpon().appendPath("contacts").build();
    }
}
