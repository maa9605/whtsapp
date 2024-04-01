package X;

import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.1ua  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C41831ua {
    public static volatile C41831ua A03;
    public Set A00 = null;
    public final C44351yv A01;
    public final C0EJ A02;

    public C41831ua(C0EJ c0ej, C44351yv c44351yv) {
        this.A02 = c0ej;
        this.A01 = c44351yv;
    }

    public static C41831ua A00() {
        if (A03 == null) {
            synchronized (C41831ua.class) {
                if (A03 == null) {
                    A03 = new C41831ua(C0EJ.A00(), C44351yv.A00());
                }
            }
        }
        return A03;
    }

    public static boolean A01(String str) {
        try {
            String string = new JSONArray(str).getString(0);
            return "clearChat".equals(string) || "deleteChat".equals(string) || "deleteMessageForMe".equals(string);
        } catch (JSONException unused) {
            throw new IllegalArgumentException("SyncMutationData/getValidMutationName: corrupt index");
        }
    }
}
