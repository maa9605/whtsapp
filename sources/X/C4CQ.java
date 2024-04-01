package X;

import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.4CQ */
/* loaded from: classes3.dex */
public abstract class C4CQ {
    public List A00;
    public final JSONArray A01 = new JSONArray();

    public C4CQ A00(PublicKey... publicKeyArr) {
        ArrayList arrayList = new ArrayList();
        try {
            for (PublicKey publicKey : publicKeyArr) {
                arrayList.add(C40841sx.A0T(publicKey));
            }
            this.A00 = arrayList;
            return this;
        } catch (NoSuchAlgorithmException e) {
            Log.e("PAY: DefaultTrustTokenBuilder/generateKeyFingerprints", e);
            throw new C897348f(e);
        }
    }

    public String A01() {
        if (!(this instanceof C91914Gu)) {
            return ((C91904Gt) this).A00;
        }
        try {
            return C40841sx.A0K(((C91914Gu) this).A00.toString());
        } catch (UnsupportedEncodingException e) {
            throw new C897348f(e);
        }
    }
}
