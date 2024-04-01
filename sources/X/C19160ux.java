package X;

import android.content.Context;
import android.os.PowerManager;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.0ux  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C19160ux {
    public static C19160ux A02;
    public final PowerManager A00;
    public final ExecutorService A01 = Executors.newSingleThreadExecutor();

    public C19160ux(Context context) {
        this.A00 = (PowerManager) context.getSystemService("power");
    }
}
