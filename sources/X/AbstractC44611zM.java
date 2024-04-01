package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: X.1zM */
/* loaded from: classes2.dex */
public abstract class AbstractC44611zM {
    public static final Set A08 = Collections.unmodifiableSet(new HashSet(Arrays.asList("regular", "regular_low", "regular_high", "critical_block", "critical_unblock_low")));
    public static final Set A09 = Collections.unmodifiableSet(new HashSet(Arrays.asList("critical_block", "critical_unblock_low")));
    public C44651zQ A00;
    public boolean A01;
    public byte[] A02;
    public final int A03;
    public final long A04;
    public final C44841zk A05;
    public final String A06;
    public final String A07;

    public AbstractC44611zM(long j, String str, int i, C44651zQ c44651zQ, boolean z, C44841zk c44841zk, String str2) {
        this.A04 = j;
        this.A07 = str;
        this.A03 = i;
        this.A00 = c44651zQ;
        this.A05 = c44841zk;
        this.A06 = str2;
        this.A01 = z;
    }

    public static String A00(String[] strArr) {
        JSONArray jSONArray = new JSONArray();
        for (String str : strArr) {
            jSONArray.put(str);
        }
        String obj = jSONArray.toString();
        if (obj != null) {
            return obj;
        }
        throw null;
    }

    public C877940o A01() {
        C877940o c877940o = (C877940o) AnonymousClass204.A0L.AVX();
        long j = this.A04;
        c877940o.A02();
        AnonymousClass204 anonymousClass204 = (AnonymousClass204) c877940o.A00;
        anonymousClass204.A00 |= 1;
        anonymousClass204.A01 = j;
        return c877940o;
    }

    public AnonymousClass204 A02() {
        C877940o A01;
        if ((this instanceof C49252Jh) || (A01 = A01()) == null) {
            return null;
        }
        return (AnonymousClass204) A01.A01();
    }

    public String A03() {
        if (this instanceof C44771zc) {
            return "star";
        }
        if (this instanceof C20B) {
            return "sentinel";
        }
        if (this instanceof C49252Jh) {
            return ((C49252Jh) this).A00[0];
        }
        return !(this instanceof C44891zp) ? !(this instanceof C44671zS) ? !(this instanceof C44731zY) ? !(this instanceof C44711zW) ? !(this instanceof C20K) ? !(this instanceof C44801zf) ? !(this instanceof C44691zU) ? !(this instanceof C44881zo) ? !(this instanceof C44751za) ? "archive" : "clearChat" : "contact" : "deleteChat" : "deleteMessageForMe" : "setting_locale" : "markChatAsRead" : "mute" : "pin" : "setting_pushName";
    }

    public synchronized void A04(boolean z) {
        this.A01 = z;
    }

    public synchronized boolean A05() {
        return this.A01;
    }

    public String[] A06() {
        if (this instanceof C44771zc) {
            C44771zc c44771zc = (C44771zc) this;
            return AnonymousClass205.A02(new String[]{"star"}, c44771zc.A01, c44771zc.A00);
        } else if (this instanceof C20B) {
            return new String[]{"sentinel", this.A06};
        } else {
            if (this instanceof C49252Jh) {
                return ((C49252Jh) this).A00;
            }
            if (this instanceof C44891zp) {
                return new String[]{"setting_pushName"};
            }
            if (this instanceof C44671zS) {
                return new String[]{"pin", ((C44671zS) this).A00.getRawString()};
            }
            if (this instanceof C44731zY) {
                return new String[]{"mute", ((C44731zY) this).A01.getRawString()};
            }
            if (this instanceof C44711zW) {
                return new String[]{"markChatAsRead", ((C44711zW) this).A01.getRawString()};
            }
            if (this instanceof C20K) {
                return new String[]{"setting_locale"};
            }
            if (this instanceof C44801zf) {
                C44801zf c44801zf = (C44801zf) this;
                return AnonymousClass205.A02(new String[]{"deleteMessageForMe"}, c44801zf.A02, c44801zf.A01);
            } else if (this instanceof C44691zU) {
                C44691zU c44691zU = (C44691zU) this;
                AbstractC005302j abstractC005302j = c44691zU.A01;
                boolean z = c44691zU.A02;
                String[] strArr = new String[3];
                strArr[0] = "deleteChat";
                strArr[1] = abstractC005302j.getRawString();
                strArr[2] = z ? "1" : "0";
                return strArr;
            } else if (this instanceof C44881zo) {
                return new String[]{"contact", ((C44881zo) this).A00.getRawString()};
            } else {
                if (this instanceof C44751za) {
                    C44751za c44751za = (C44751za) this;
                    AbstractC005302j abstractC005302j2 = c44751za.A01;
                    boolean z2 = c44751za.A03;
                    boolean z3 = c44751za.A02;
                    String[] strArr2 = new String[4];
                    strArr2[0] = "clearChat";
                    strArr2[1] = abstractC005302j2.getRawString();
                    strArr2[2] = z2 ? "1" : "0";
                    strArr2[3] = z3 ? "1" : "0";
                    return strArr2;
                }
                return new String[]{"archive", ((C44601zL) this).A01.getRawString()};
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC44611zM abstractC44611zM = (AbstractC44611zM) obj;
        if (Arrays.equals(A06(), abstractC44611zM.A06()) && this.A05.equals(abstractC44611zM.A05)) {
            AnonymousClass204 A02 = A02();
            byte[] A0B = A02 == null ? null : A02.A0B();
            AnonymousClass204 A022 = abstractC44611zM.A02();
            return Arrays.equals(A0B, A022 == null ? null : A022.A0B());
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(A06())), this.A05, A02()});
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("SyncMutation{rowId='");
        C000200d.A1P(A0P, this.A07, '\'', ", timestamp=");
        A0P.append(this.A04);
        A0P.append(", operation=");
        A0P.append(this.A05);
        A0P.append(", collectionName='");
        C000200d.A1P(A0P, this.A06, '\'', ", version=");
        A0P.append(this.A03);
        A0P.append(", keyId=");
        A0P.append(this.A00);
        A0P.append(", areDependenciesMissing=");
        A0P.append(this.A01);
        A0P.append('}');
        return A0P.toString();
    }
}
