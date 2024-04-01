package X;

import android.content.SharedPreferences;
import java.util.Map;

/* renamed from: X.03D  reason: invalid class name */
/* loaded from: classes.dex */
public final class C03D extends C03A {
    public final float A00;

    public C03D() {
        super("critical_battery_event_threshold", "critical_battery_event_threshold");
        this.A00 = Float.MAX_VALUE;
    }

    @Override // X.C03A
    public void A00(Map map, SharedPreferences.Editor editor) {
        AnonymousClass024.A0W(super.A00, (String) map.get(this.A01), editor);
    }
}
