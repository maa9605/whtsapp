package X;

import android.content.ComponentName;
import android.content.Intent;
import java.util.Arrays;

/* renamed from: X.151  reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass151 {
    public final int A00;
    public final ComponentName A01;
    public final String A02;
    public final String A03;

    public AnonymousClass151(ComponentName componentName) {
        this.A02 = null;
        this.A03 = null;
        C07K.A1P(componentName);
        this.A01 = componentName;
        this.A00 = 129;
    }

    public AnonymousClass151(String str, String str2) {
        C07K.A1T(str);
        this.A02 = str;
        C07K.A1T(str2);
        this.A03 = str2;
        this.A01 = null;
        this.A00 = 129;
    }

    public final Intent A00() {
        String str = this.A02;
        return str != null ? new Intent(str).setPackage(this.A03) : new Intent().setComponent(this.A01);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnonymousClass151) {
            AnonymousClass151 anonymousClass151 = (AnonymousClass151) obj;
            return C07K.A1k(this.A02, anonymousClass151.A02) && C07K.A1k(this.A03, anonymousClass151.A03) && C07K.A1k(this.A01, anonymousClass151.A01) && this.A00 == anonymousClass151.A00;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A03, this.A01, Integer.valueOf(this.A00)});
    }

    public final String toString() {
        String str = this.A02;
        return str == null ? this.A01.flattenToString() : str;
    }
}
