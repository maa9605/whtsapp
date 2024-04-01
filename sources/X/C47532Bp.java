package X;

import android.net.TrafficStats;
import android.os.Build;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2Bp  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C47532Bp {
    public static volatile C47532Bp A09;
    public final AbstractC000600i A00;
    public final C018508q A01;
    public final C02L A02;
    public final C001200o A03;
    public final C000500h A04;
    public final C002301c A05;
    public final AnonymousClass035 A06;
    public final C2CK A07;
    public final C004902f A08;

    public C47532Bp(C001200o c001200o, C018508q c018508q, AbstractC000600i abstractC000600i, C02L c02l, C004902f c004902f, C002301c c002301c, AnonymousClass035 anonymousClass035, C000500h c000500h, C2CK c2ck) {
        this.A03 = c001200o;
        this.A01 = c018508q;
        this.A00 = abstractC000600i;
        this.A02 = c02l;
        this.A08 = c004902f;
        this.A05 = c002301c;
        this.A06 = anonymousClass035;
        this.A04 = c000500h;
        this.A07 = c2ck;
    }

    public static C47532Bp A00() {
        if (A09 == null) {
            synchronized (C47532Bp.class) {
                if (A09 == null) {
                    A09 = new C47532Bp(C001200o.A01, C018508q.A00(), AbstractC000600i.A00(), C02L.A00(), C004902f.A00(), C002301c.A00(), AnonymousClass035.A00(), C000500h.A00(), C2CK.A00());
                }
            }
        }
        return A09;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (r3.A00.A05() == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C42531vt A01(java.lang.String r7, X.AnonymousClass263 r8) {
        /*
            r6 = this;
            X.2CK r3 = r6.A07
            X.00h r0 = r3.A01
            android.content.SharedPreferences r4 = r0.A00
            r0 = 0
            java.lang.String r2 = "sticker_store_backoff_time"
            long r4 = r4.getLong(r2, r0)
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L1f
            X.0E7 r0 = r3.A00
            boolean r1 = r0.A05()
            r0 = 1
            if (r1 != 0) goto L20
        L1f:
            r0 = 0
        L20:
            r2 = 0
            if (r0 != 0) goto L29
            java.lang.String r0 = "StickerPackNetworkProvider/getStickerPackById skipped due to backoff time"
            com.whatsapp.util.Log.i(r0)
            return r2
        L29:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: X.C47572Bt -> L60
            r1.<init>()     // Catch: X.C47572Bt -> L60
            java.lang.String r0 = "https://static.whatsapp.net/sticker?id="
            r1.append(r0)     // Catch: X.C47572Bt -> L60
            r1.append(r7)     // Catch: X.C47572Bt -> L60
            java.lang.String r0 = "&lg="
            r1.append(r0)     // Catch: X.C47572Bt -> L60
            X.01c r0 = r6.A05     // Catch: X.C47572Bt -> L60
            java.util.Locale r0 = r0.A0I()     // Catch: X.C47572Bt -> L60
            java.lang.String r0 = X.AbstractC003201n.A05(r0)     // Catch: X.C47572Bt -> L60
            r1.append(r0)     // Catch: X.C47572Bt -> L60
            java.lang.String r0 = r1.toString()     // Catch: X.C47572Bt -> L60
            X.2CL r0 = r6.A02(r0, r2, r8)     // Catch: X.C47572Bt -> L60
            r3.A01()     // Catch: X.C47572Bt -> L60
            if (r0 == 0) goto L5f
            java.util.List r1 = r0.A01     // Catch: X.C47572Bt -> L60
            r0 = 0
            java.lang.Object r0 = r1.get(r0)     // Catch: X.C47572Bt -> L60
            X.1vt r0 = (X.C42531vt) r0     // Catch: X.C47572Bt -> L60
            return r0
        L5f:
            return r2
        L60:
            r1 = move-exception
            r3.A02()
            java.lang.String r0 = "StickerPackNetworkProvider/getStickerPackById failed"
            com.whatsapp.util.Log.e(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47532Bp.A01(java.lang.String, X.263):X.1vt");
    }

    /* JADX WARN: Not initialized variable reg: 21, insn: 0x02aa: MOVE  (r5 I:??[OBJECT, ARRAY]) = (r21 I:??[OBJECT, ARRAY]), block:B:90:0x02aa */
    public final C2CL A02(String str, String str2, AnonymousClass263 anonymousClass263) {
        HttpsURLConnection httpsURLConnection;
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                TrafficStats.setThreadStatsTag(9);
                httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
                httpsURLConnection.setSSLSocketFactory(this.A06.A04());
                httpsURLConnection.setRequestProperty("User-Agent", this.A08.A02());
                httpsURLConnection.setConnectTimeout(15000);
                httpsURLConnection.setReadTimeout(30000);
                httpsURLConnection.setRequestMethod("GET");
                if (str2 != null) {
                    try {
                        try {
                            httpsURLConnection.setRequestProperty("If-None-Match", str2);
                            if (Build.VERSION.SDK_INT < 19) {
                                httpsURLConnection.setRequestProperty("Accept-Encoding", "");
                            }
                        } catch (EOFException unused) {
                            this.A00.A09("StickerPackNetworkProvider/getStickerPacks/EOFException", null, true);
                            if (httpsURLConnection != null) {
                                httpsURLConnection.disconnect();
                            }
                            TrafficStats.clearThreadStatsTag();
                            return null;
                        } catch (IOException e) {
                            e = e;
                            throw new C47572Bt("StickerPackNetworkProvider/getStickerPacks/IOException/error fetching sticker pack json", e);
                        }
                    } catch (IllegalArgumentException e2) {
                        e = e2;
                        this.A00.A09("StickerPackNetworkProvider/error fetching sticker pack json", null, true);
                        throw new C47572Bt("StickerPackNetworkProvider/getStickerPacks/IllegalArgumentException/error fetching sticker pack json", e);
                    }
                }
                int responseCode = httpsURLConnection.getResponseCode();
                if (responseCode != 200) {
                    if (responseCode == 304) {
                        httpsURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        return null;
                    } else if (responseCode == 404 && anonymousClass263 != null) {
                        this.A01.A02.post(new RunnableEBaseShape6S0100000_I0_6(anonymousClass263, 48));
                        httpsURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        return null;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("StickerPackNetworkProvider/getStickerPacks/StickerError/connection is not 200, result code: ");
                        sb.append(responseCode);
                        sb.append(", reason: ");
                        sb.append(httpsURLConnection.getResponseMessage());
                        sb.append(", url: ");
                        sb.append(str);
                        Log.e(sb.toString());
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("StickerPackNetworkProvider/getStickerPacks/StickerError/connection is not 200, result code: ");
                        sb2.append(responseCode);
                        sb2.append(", reason: ");
                        sb2.append(httpsURLConnection.getResponseMessage());
                        throw new C47572Bt(sb2.toString());
                    }
                }
                String headerField = httpsURLConnection.getHeaderField("ETag");
                try {
                    InputStream inputStream = httpsURLConnection.getInputStream();
                    try {
                        String A0D = AnonymousClass024.A0D(inputStream);
                        if (A0D != null) {
                            JSONArray jSONArray = new JSONArray(A0D);
                            ArrayList arrayList = new ArrayList(jSONArray.length());
                            for (int i = 0; i < jSONArray.length(); i++) {
                                C2CJ c2cj = new C2CJ();
                                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                                String str3 = (String) jSONObject.get("sticker-pack-id");
                                if (jSONObject.has("stickers")) {
                                    JSONArray jSONArray2 = jSONObject.getJSONArray("stickers");
                                    ArrayList arrayList2 = new ArrayList(jSONArray2.length());
                                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                                        C0JM c0jm = new C0JM();
                                        JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                                        c0jm.A0B = jSONObject2.getString("file-hash");
                                        c0jm.A00 = jSONObject2.getInt("file-size");
                                        c0jm.A0E = jSONObject2.getString("url");
                                        c0jm.A07 = jSONObject2.getString("enc-file-hash");
                                        c0jm.A09 = jSONObject2.getString("media-key");
                                        c0jm.A0A = jSONObject2.getString("mimetype");
                                        c0jm.A02 = jSONObject2.getInt("height");
                                        c0jm.A03 = jSONObject2.getInt("width");
                                        c0jm.A05 = jSONObject2.getString("direct-path");
                                        JSONArray optJSONArray = jSONObject2.optJSONArray("emojis");
                                        if (optJSONArray != null) {
                                            ArrayList arrayList3 = new ArrayList(optJSONArray.length());
                                            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                                                arrayList3.add(optJSONArray.getString(i3));
                                            }
                                            c0jm.A06 = TextUtils.join(" ", arrayList3);
                                        }
                                        c0jm.A0D = str3;
                                        arrayList2.add(c0jm);
                                    }
                                    c2cj.A0J = arrayList2;
                                }
                                c2cj.A0B = str3;
                                c2cj.A0D = (String) jSONObject.get("name");
                                c2cj.A0F = (String) jSONObject.get("publisher");
                                c2cj.A02 = (String) jSONObject.get("description");
                                c2cj.A0G = (String) jSONObject.get("tray-image-id");
                                c2cj.A0H = (String) jSONObject.get("tray-image-preview");
                                JSONArray jSONArray3 = jSONObject.getJSONArray("preview-image-ids");
                                ArrayList arrayList4 = new ArrayList(jSONArray3.length());
                                for (int i4 = 0; i4 < jSONArray3.length(); i4++) {
                                    arrayList4.add(jSONArray3.get(i4));
                                }
                                c2cj.A0I = arrayList4;
                                c2cj.A01 = jSONObject.getLong("file-size");
                                c2cj.A0C = jSONObject.getString("image-data-hash");
                                int optInt = jSONObject.optInt("animated", 0);
                                boolean z = true;
                                if (optInt != 1) {
                                    z = false;
                                }
                                c2cj.A0K = z;
                                arrayList.add(c2cj.A00());
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            C2CL c2cl = new C2CL(headerField, arrayList);
                            httpsURLConnection.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            return c2cl;
                        }
                        throw null;
                    } finally {
                    }
                } catch (IOException e3) {
                    throw new C47572Bt("StickerPackNetworkProvider/getStickerPacks/IOException/error parsing sticker pack json", e3);
                } catch (JSONException e4) {
                    throw new C47572Bt("StickerPackNetworkProvider/getStickerPacks/JSONException/error parsing json data", e4);
                }
            } catch (EOFException unused2) {
                httpsURLConnection = null;
            } catch (IOException e5) {
                e = e5;
            } catch (IllegalArgumentException e6) {
                e = e6;
            }
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection2 = httpURLConnection;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }
}
