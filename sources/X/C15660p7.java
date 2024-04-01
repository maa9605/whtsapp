package X;

import android.content.ComponentName;

/* renamed from: X.0p7  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C15660p7 implements Comparable {
    public final ComponentName A00;
    public final C0M2 A01;

    public C15660p7(C0M2 c0m2, ComponentName componentName) {
        this.A01 = c0m2;
        this.A00 = componentName;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return this.A01.A00 - ((C15660p7) obj).A01.A00;
    }
}
