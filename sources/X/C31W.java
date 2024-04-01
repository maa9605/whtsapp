package X;

import com.whatsapp.jid.UserJid;
import java.util.Comparator;
import java.util.Set;

/* renamed from: X.31W  reason: invalid class name */
/* loaded from: classes2.dex */
public class C31W implements Comparator {
    public Set A00;
    public final C61772wh A01;

    public C31W(C02L c02l, C018708s c018708s) {
        this.A01 = new C61772wh(c02l, c018708s);
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        C06C c06c = (C06C) obj;
        C06C c06c2 = (C06C) obj2;
        Set set = this.A00;
        if (set != null) {
            if (set.contains(c06c.A03(UserJid.class)) && this.A00.contains(c06c2.A03(UserJid.class))) {
                return this.A01.compare(c06c, c06c2);
            }
            if (this.A00.contains(c06c.A03(UserJid.class))) {
                return -1;
            }
            if (this.A00.contains(c06c2.A03(UserJid.class))) {
                return 1;
            }
            return this.A01.compare(c06c, c06c2);
        }
        throw null;
    }
}
