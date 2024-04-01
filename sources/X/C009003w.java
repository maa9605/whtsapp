package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.03w  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C009003w extends AbstractC008503r {
    public final File A00;
    public final String A01;

    public C009003w(Context context, String str, File file) {
        super(context, str);
        this.A00 = file;
        this.A01 = "^lib/([^/]+)/([^/]+\\.so)$";
    }
}
