package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.05p  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C011305p extends Exception {
    public C011305p(Jid jid) {
        super(jid.getObfuscatedString());
    }

    public C011305p(String str) {
        super(str);
    }
}
