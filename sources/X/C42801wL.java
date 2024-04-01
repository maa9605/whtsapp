package X;

import com.whatsapp.jid.UserJid;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1wL  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C42801wL {
    public final ConcurrentHashMap A00 = new ConcurrentHashMap();

    public int A00() {
        return this.A00.size();
    }

    public C42811wM A01(UserJid userJid) {
        return (C42811wM) this.A00.get(userJid);
    }

    public boolean A02(UserJid userJid, int i, long j) {
        if (j <= 0) {
            return false;
        }
        ConcurrentHashMap concurrentHashMap = this.A00;
        C42811wM c42811wM = (C42811wM) concurrentHashMap.get(userJid);
        if (c42811wM == null) {
            c42811wM = C42811wM.A03;
        }
        if (i == 5) {
            long j2 = c42811wM.A00;
            if (j2 > 0 && j2 <= j) {
                return false;
            }
            c42811wM = new C42811wM(j, c42811wM.A02, c42811wM.A01);
        } else if (i == 8) {
            long j3 = c42811wM.A01;
            if (j3 > 0 && j3 <= j) {
                return false;
            }
            c42811wM = new C42811wM(c42811wM.A00, c42811wM.A02, j);
        } else if (i == 13) {
            long j4 = c42811wM.A02;
            if (j4 > 0 && j4 <= j) {
                return false;
            }
            c42811wM = new C42811wM(c42811wM.A00, j, c42811wM.A01);
        }
        concurrentHashMap.put(userJid, c42811wM);
        return true;
    }
}
