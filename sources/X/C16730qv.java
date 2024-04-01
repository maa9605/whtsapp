package X;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* renamed from: X.0qv  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C16730qv {
    public static final String A01 = AbstractC16430qO.A01("SystemJobInfoConverter");
    public final ComponentName A00;

    public C16730qv(Context context) {
        this.A00 = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }
}
