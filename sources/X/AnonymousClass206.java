package X;

import java.util.Arrays;
import org.json.JSONArray;

/* renamed from: X.206  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass206 {
    public final int A00;
    public final C44841zk A01;
    public final C44651zQ A02;
    public final AnonymousClass204 A03;
    public final String A04;
    public final byte[] A05;
    public final String[] A06;

    public String toString() {
        return "SyncMutationData";
    }

    public AnonymousClass206(AbstractC44611zM abstractC44611zM) {
        this.A00 = abstractC44611zM.A03;
        this.A04 = AbstractC44611zM.A00(abstractC44611zM.A06());
        this.A02 = abstractC44611zM.A00;
        this.A06 = abstractC44611zM.A06();
        this.A01 = abstractC44611zM.A05;
        this.A03 = abstractC44611zM.A02();
        this.A05 = abstractC44611zM.A02;
    }

    public AnonymousClass206(String str, int i, C44651zQ c44651zQ, C44841zk c44841zk, byte[] bArr) {
        AnonymousClass204 anonymousClass204;
        this.A00 = i;
        this.A04 = str;
        this.A02 = c44651zQ;
        this.A06 = A00(str);
        this.A01 = c44841zk;
        if (bArr != null) {
            anonymousClass204 = (AnonymousClass204) C0AZ.A03(AnonymousClass204.A0L, bArr);
        } else {
            anonymousClass204 = null;
        }
        this.A03 = anonymousClass204;
        this.A05 = null;
    }

    public AnonymousClass206(String str, int i, C44651zQ c44651zQ, String[] strArr, C44841zk c44841zk, AnonymousClass204 anonymousClass204, byte[] bArr) {
        this.A04 = str;
        this.A00 = i;
        this.A02 = c44651zQ;
        this.A06 = strArr;
        this.A01 = c44841zk;
        this.A03 = anonymousClass204;
        this.A05 = bArr;
    }

    public static String[] A00(String str) {
        JSONArray jSONArray = new JSONArray(str);
        int length = jSONArray.length();
        String[] strArr = new String[length];
        for (int i = 0; i < jSONArray.length(); i++) {
            strArr[i] = jSONArray.getString(i);
            if (strArr[i].isEmpty()) {
                throw new IllegalArgumentException(C000200d.A0D("SyncMutationData/getValidKeyArrayIndex: The key is empty in the keyArray at position: ", i));
            }
        }
        if (length > 0) {
            return strArr;
        }
        throw new IllegalArgumentException("SyncMutationData/getValidKeyArrayIndex: keyArray length should have action name");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnonymousClass206) {
            AnonymousClass206 anonymousClass206 = (AnonymousClass206) obj;
            return this.A04.equals(anonymousClass206.A04) && AnonymousClass024.A0l(this.A03, anonymousClass206.A03) && this.A01.equals(anonymousClass206.A01);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, this.A03, this.A01});
    }
}
