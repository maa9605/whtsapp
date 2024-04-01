package X;

import android.content.SharedPreferences;
import java.util.Map;

/* renamed from: X.03B  reason: invalid class name */
/* loaded from: classes.dex */
public final class C03B extends C03A {
    public final boolean A00;

    public C03B(String str, String str2, boolean z) {
        super(str, str2);
        this.A00 = z;
    }

    @Override // X.C03A
    public void A00(Map map, SharedPreferences.Editor editor) {
        AnonymousClass024.A0Z(super.A00, (String) map.get(this.A01), editor);
    }
}
