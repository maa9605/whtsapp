package X;

import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1zr  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C44911zr extends C0JU {
    public C55302kC A00;
    public boolean A01;

    @Override // X.C0JU
    public String A18() {
        return "high";
    }

    public C44911zr(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, (byte) 38);
        this.A01 = false;
    }

    public C44911zr(AnonymousClass094 anonymousClass094, long j, C55302kC c55302kC) {
        super(anonymousClass094, j, (byte) 38);
        this.A01 = false;
        this.A00 = c55302kC;
    }

    @Override // X.C0JU
    public String A19() {
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.beginObject();
            C55302kC c55302kC = this.A00;
            if (c55302kC != null) {
                jsonWriter.name("appStateSyncKeyShareProtoString").value(Base64.encodeToString(c55302kC.A0B(), 2));
                jsonWriter.name("isNewlyGeneratedKey").value(this.A01);
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
                return stringWriter.toString();
            }
            throw null;
        } catch (IOException e) {
            Log.e("FMessageAppStateSyncKeyShare/writeData failed", e);
            return null;
        }
    }

    @Override // X.C0JU
    public void A1A(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    int hashCode = nextName.hashCode();
                    if (hashCode != -1807872114) {
                        if (hashCode == 3288564) {
                            if (nextName.equals("keys")) {
                                HashMap hashMap = new HashMap();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    Pair A00 = C44961zw.A00((C87433ze) C0AZ.A03(C87433ze.A03, Base64.decode(jsonReader.nextString(), 2)));
                                    hashMap.put(A00.first, A00.second);
                                }
                                jsonReader.endArray();
                                A1C(hashMap);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append("FMessageAppStateSyncKeyShare/readData/unexpected name \"");
                                sb.append(nextName);
                                sb.append("\"");
                                Log.w(sb.toString());
                            }
                        } else {
                            if (hashCode == 1970709011 && nextName.equals("isNewlyGeneratedKey")) {
                                this.A01 = jsonReader.nextBoolean();
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("FMessageAppStateSyncKeyShare/readData/unexpected name \"");
                            sb2.append(nextName);
                            sb2.append("\"");
                            Log.w(sb2.toString());
                        }
                    } else if (nextName.equals("appStateSyncKeyShareProtoString")) {
                        this.A00 = (C55302kC) C0AZ.A03(C55302kC.A01, Base64.decode(jsonReader.nextString(), 2));
                    } else {
                        StringBuilder sb22 = new StringBuilder();
                        sb22.append("FMessageAppStateSyncKeyShare/readData/unexpected name \"");
                        sb22.append(nextName);
                        sb22.append("\"");
                        Log.w(sb22.toString());
                    }
                }
                jsonReader.endObject();
            } finally {
            }
        } catch (C44921zs | IOException e) {
            Log.e("FMessageAppStateSyncKeyShare/readData failed", e);
        }
    }

    public HashMap A1B() {
        C55302kC c55302kC = this.A00;
        if (c55302kC != null) {
            HashMap hashMap = new HashMap();
            for (C87433ze c87433ze : c55302kC.A00) {
                Pair A00 = C44961zw.A00(c87433ze);
                hashMap.put(A00.first, A00.second);
            }
            return hashMap;
        }
        throw null;
    }

    public void A1C(HashMap hashMap) {
        C44981zy c44981zy;
        C0CT AVX = C55302kC.A01.AVX();
        for (Map.Entry entry : hashMap.entrySet()) {
            C44651zQ c44651zQ = (C44651zQ) entry.getKey();
            C44961zw c44961zw = (C44961zw) entry.getValue();
            if (c44961zw != null) {
                c44981zy = c44961zw.A00;
            } else {
                c44981zy = null;
            }
            C0CT AVX2 = C87433ze.A03.AVX();
            C87483zj A03 = c44651zQ.A03();
            AVX2.A02();
            C87433ze c87433ze = (C87433ze) AVX2.A00;
            if (A03 != null) {
                c87433ze.A02 = A03;
                c87433ze.A00 |= 1;
                if (c44981zy != null) {
                    C0CT AVX3 = C87453zg.A04.AVX();
                    C0AN A00 = C0AN.A00(c44981zy.A02);
                    AVX3.A02();
                    C87453zg c87453zg = (C87453zg) AVX3.A00;
                    c87453zg.A00 |= 1;
                    c87453zg.A02 = A00;
                    long j = c44981zy.A00;
                    AVX3.A02();
                    C87453zg c87453zg2 = (C87453zg) AVX3.A00;
                    c87453zg2.A00 |= 4;
                    c87453zg2.A01 = j;
                    AnonymousClass201 A01 = c44981zy.A01.A01();
                    AVX3.A02();
                    C87453zg c87453zg3 = (C87453zg) AVX3.A00;
                    if (A01 != null) {
                        c87453zg3.A03 = A01;
                        c87453zg3.A00 |= 2;
                        C87453zg c87453zg4 = (C87453zg) AVX3.A01();
                        AVX2.A02();
                        C87433ze c87433ze2 = (C87433ze) AVX2.A00;
                        if (c87453zg4 != null) {
                            c87433ze2.A01 = c87453zg4;
                            c87433ze2.A00 |= 2;
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                }
                C0AZ A012 = AVX2.A01();
                AVX.A02();
                C55302kC c55302kC = (C55302kC) AVX.A00;
                if (A012 != null) {
                    C0CX c0cx = c55302kC.A00;
                    if (!((C0CY) c0cx).A00) {
                        c0cx = C0AZ.A05(c0cx);
                        c55302kC.A00 = c0cx;
                    }
                    c0cx.add(A012);
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        this.A00 = (C55302kC) AVX.A01();
    }

    @Override // X.AnonymousClass099
    public void A5o(C40551sS c40551sS) {
        C0CT AVX = C48512Fn.A0A.AVX();
        EnumC55282kA enumC55282kA = EnumC55282kA.APP_STATE_SYNC_KEY_SHARE;
        AVX.A02();
        C48512Fn.A0B((C48512Fn) AVX.A00, enumC55282kA);
        C55302kC c55302kC = this.A00;
        AVX.A02();
        C48512Fn c48512Fn = (C48512Fn) AVX.A00;
        if (c55302kC != null) {
            c48512Fn.A06 = c55302kC;
            c48512Fn.A00 |= 32;
            C48512Fn c48512Fn2 = (C48512Fn) AVX.A01();
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
