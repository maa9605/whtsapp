package X;

import android.content.Context;

/* renamed from: X.0Rl  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C06080Rl {
    public static C06080Rl A01 = new C06080Rl();
    public C06090Rm A00 = null;

    public static C06090Rm A00(Context context) {
        C06090Rm c06090Rm;
        C06080Rl c06080Rl = A01;
        synchronized (c06080Rl) {
            c06090Rm = c06080Rl.A00;
            if (c06090Rm == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                c06090Rm = new C06090Rm(context);
                c06080Rl.A00 = c06090Rm;
            }
        }
        return c06090Rm;
    }
}
