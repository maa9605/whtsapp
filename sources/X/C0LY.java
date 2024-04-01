package X;

import com.whatsapp.util.Log;

/* renamed from: X.0LY  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0LY extends C04300Jq {
    public int A00;

    public C0LY(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, 60);
    }

    @Override // X.AnonymousClass092
    public synchronized String A0G() {
        return String.valueOf(this.A00);
    }

    @Override // X.AnonymousClass092
    public synchronized void A0l(String str) {
        try {
            this.A00 = Integer.valueOf(str).intValue();
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("FMessageSystemEphemeralSettingNotApplied/setData cannot convert data to int, data=");
            sb.append(str);
            Log.w(sb.toString(), e);
            this.A00 = 0;
        }
    }
}
