package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.List;

/* renamed from: X.0sd  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C17760sd {
    public List A01 = null;
    public int A00 = 0;

    public C17760sd() {
    }

    public C17760sd(C17660sS c17660sS) {
    }

    public void A00() {
        this.A00 += SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Object obj : this.A01) {
            sb.append(obj);
            sb.append(' ');
        }
        sb.append('[');
        sb.append(this.A00);
        sb.append(']');
        return sb.toString();
    }
}
