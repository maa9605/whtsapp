package X;

import android.content.SharedPreferences;
import java.util.Map;

/* renamed from: X.03C  reason: invalid class name */
/* loaded from: classes.dex */
public final class C03C extends C03A {
    public final String A00;

    public C03C(String str, String str2) {
        super(str, str);
        this.A00 = str2;
    }

    @Override // X.C03A
    public void A00(Map map, SharedPreferences.Editor editor) {
        AnonymousClass024.A0Y(super.A00, (String) map.get(this.A01), editor);
    }
}
