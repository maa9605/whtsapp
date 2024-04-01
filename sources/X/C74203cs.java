package X;

import com.whatsapp.util.Log;

/* renamed from: X.3cs  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C74203cs {
    public final C0G2 A03;
    public long A02 = 0;
    public double A01 = Double.NaN;
    public double A00 = Double.NaN;

    public C74203cs(C0G2 c0g2) {
        this.A03 = c0g2;
    }

    public double A00() {
        C0G3 c0g3 = this.A03.A00;
        double A00 = c0g3.A00();
        String bool = Boolean.toString(c0g3.A01());
        StringBuilder sb = new StringBuilder("voip/call/battery_monitor percent = ");
        sb.append(A00);
        sb.append(", charging = ");
        sb.append(bool);
        Log.i(sb.toString());
        return A00;
    }
}
