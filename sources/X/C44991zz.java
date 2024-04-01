package X;

import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import android.util.JsonWriter;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1zz  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C44991zz extends C0JU {
    public final Set A00;

    @Override // X.C0JU
    public String A18() {
        return "high";
    }

    public C44991zz(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, (byte) 39);
        this.A00 = new HashSet();
    }

    public C44991zz(AnonymousClass094 anonymousClass094, long j, C55312kD c55312kD) {
        super(anonymousClass094, j, (byte) 39);
        this.A00 = new HashSet();
        for (C87483zj c87483zj : c55312kD.A00) {
            C44651zQ A00 = C44651zQ.A00(c87483zj);
            if (A00 != null) {
                this.A00.add(A00);
            } else {
                StringBuilder sb = new StringBuilder("FMessageAppStateSyncKeyRequest message missing fields for keyId: ");
                sb.append(c87483zj);
                Log.e(sb.toString());
            }
        }
    }

    @Override // X.C0JU
    public String A19() {
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.beginObject();
            jsonWriter.name("key-ids").beginArray();
            for (C44651zQ c44651zQ : this.A00) {
                jsonWriter.value(Base64.encodeToString(c44651zQ.A03().A0B(), 2));
            }
            jsonWriter.endArray();
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e) {
            Log.e("FMessageAppStateSyncKeyRequest/writeData failed", e);
            return null;
        }
    }

    @Override // X.C0JU
    public void A1A(String str) {
        Set set = this.A00;
        set.clear();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (nextName.hashCode() == -816618934 && nextName.equals("key-ids")) {
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        C44651zQ A00 = C44651zQ.A00((C87483zj) C0AZ.A03(C87483zj.A02, Base64.decode(jsonReader.nextString(), 2)));
                        if (A00 != null) {
                            set.add(A00);
                        }
                    }
                    jsonReader.endArray();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("FMessageAppStateSyncKeyRequest/readData/unexpected name \"");
                    sb.append(nextName);
                    sb.append("\"");
                    Log.w(sb.toString());
                }
            }
            jsonReader.endObject();
            jsonReader.close();
        } catch (IOException e) {
            Log.e("FMessageAppStateSyncKeyRequest/readData failed", e);
        }
    }

    @Override // X.AnonymousClass099
    public void A5o(C40551sS c40551sS) {
        C0CT AVX = C55312kD.A01.AVX();
        for (C44651zQ c44651zQ : this.A00) {
            C87483zj A03 = c44651zQ.A03();
            AVX.A02();
            C55312kD c55312kD = (C55312kD) AVX.A00;
            if (A03 != null) {
                C0CX c0cx = c55312kD.A00;
                if (!((C0CY) c0cx).A00) {
                    c0cx = C0AZ.A05(c0cx);
                    c55312kD.A00 = c0cx;
                }
                c0cx.add(A03);
            } else {
                throw null;
            }
        }
        C0CT AVX2 = C48512Fn.A0A.AVX();
        EnumC55282kA enumC55282kA = EnumC55282kA.APP_STATE_SYNC_KEY_REQUEST;
        AVX2.A02();
        C48512Fn.A0B((C48512Fn) AVX2.A00, enumC55282kA);
        AVX2.A02();
        C48512Fn c48512Fn = (C48512Fn) AVX2.A00;
        if (c48512Fn != null) {
            c48512Fn.A05 = (C55312kD) AVX.A01();
            c48512Fn.A00 |= 64;
            C48512Fn c48512Fn2 = (C48512Fn) AVX2.A01();
            C40541sR c40541sR = c40551sS.A01;
            c40541sR.A02();
            C40531sQ c40531sQ = (C40531sQ) c40541sR.A00;
            if (c48512Fn2 != null) {
                c40531sQ.A0R = c48512Fn2;
                c40531sQ.A00 |= 2048;
                return;
            }
            throw null;
        }
        throw null;
    }
}
