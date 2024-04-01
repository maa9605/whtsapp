package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.0Ny  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05260Ny {
    public final Jid A00;

    public C05260Ny(Jid jid) {
        this.A00 = jid;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("AxolotlSessionEvent{jid='");
        A0P.append(this.A00);
        A0P.append('\'');
        A0P.append('}');
        return A0P.toString();
    }
}
