package X;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0Dp */
/* loaded from: classes.dex */
public class C02970Dp extends C0Dq {
    public static volatile C02970Dp A0A;
    public final C02L A00;
    public final C05W A01;
    public final C018708s A02;
    public final C02E A03;
    public final C001200o A04;
    public final C0C7 A05;
    public final C02990Ds A06;
    public final C02980Dr A07;
    public final C02O A08;
    public final C0CB A09;

    @Override // X.C0Dq
    public String A00() {
        return "incoming_message";
    }

    public C02970Dp(C001200o c001200o, C02980Dr c02980Dr, C02L c02l, C05W c05w, C02E c02e, C018708s c018708s, C0CB c0cb, C02O c02o, C0C7 c0c7, C02990Ds c02990Ds) {
        this.A04 = c001200o;
        this.A07 = c02980Dr;
        this.A00 = c02l;
        this.A01 = c05w;
        this.A03 = c02e;
        this.A02 = c018708s;
        this.A09 = c0cb;
        this.A08 = c02o;
        this.A05 = c0c7;
        this.A06 = c02990Ds;
    }

    public C1PR A01(AnonymousClass092 anonymousClass092, C07F c07f) {
        NotificationChannelGroup notificationChannelGroup;
        AbstractC005302j abstractC005302j = anonymousClass092.A0n.A00;
        if (abstractC005302j != null) {
            C0CB c0cb = this.A09;
            if (!c0cb.A0Q(abstractC005302j)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    String A0C = ((C03400Fo) c0cb.A07(abstractC005302j)).A0C();
                    NotificationManager notificationManager = (NotificationManager) this.A04.A00.getSystemService("notification");
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(A0C);
                    if (notificationChannel != null) {
                        if (notificationChannel.getImportance() != 0) {
                            if (Build.VERSION.SDK_INT >= 28 && (notificationChannelGroup = notificationManager.getNotificationChannelGroup(notificationChannel.getGroup())) != null && notificationChannelGroup.isBlocked()) {
                                return null;
                            }
                        } else {
                            return null;
                        }
                    }
                }
                JSONObject A03 = A03(anonymousClass092, c07f);
                if (A03 == null) {
                    return null;
                }
                return new C1PR(A00(), A03);
            }
            return null;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0Dr] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r3v5 */
    public final String A02(String str, List list) {
        SpannableStringBuilder A0Q = AnonymousClass029.A0Q(this.A03, this.A08, C002701i.A0p(str));
        if (list != null && !list.isEmpty() && !TextUtils.isEmpty(A0Q)) {
            A0Q = A0Q instanceof SpannableStringBuilder ? (SpannableStringBuilder) A0Q : new SpannableStringBuilder(A0Q);
            final ArrayList arrayList = new ArrayList();
            this.A07.A04(A0Q, list, new InterfaceC10010f9() { // from class: X.1ms
                @Override // X.InterfaceC10010f9
                public final void ANr(SpannableStringBuilder spannableStringBuilder, int i, int i2, C06C c06c) {
                    List list2 = arrayList;
                    if (spannableStringBuilder.charAt(i) == '@') {
                        list2.add(Integer.valueOf(i));
                    }
                }
            });
            Collections.sort(arrayList, Collections.reverseOrder());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                A0Q.delete(intValue, intValue + 1);
            }
        }
        CharSequence A09 = AnonymousClass024.A09(A0Q);
        if (A09 == null) {
            return null;
        }
        return A09.toString();
    }

    public JSONObject A03(AnonymousClass092 anonymousClass092, C07F c07f) {
        JSONObject jSONObject;
        C05W c05w;
        C06C A0A2;
        String str;
        String str2;
        try {
            jSONObject = new JSONObject();
        } catch (JSONException unused) {
        }
        if ((anonymousClass092 instanceof C0JJ) && anonymousClass092.A0m == 0) {
            AnonymousClass093 anonymousClass093 = anonymousClass092.A0F;
            if (anonymousClass093 == null) {
                str2 = "text";
            } else if (anonymousClass093.A02 == 5 || !this.A00.A0A(anonymousClass093.A0B)) {
                return null;
            } else {
                str2 = "payment";
            }
            jSONObject.put("text", A02(anonymousClass092.A0G(), anonymousClass092.A0c));
            A04(jSONObject, anonymousClass092);
            jSONObject.put("type", str2);
        } else {
            if (!(anonymousClass092 instanceof C04160Iu) && !(anonymousClass092 instanceof C10040fC) && !(anonymousClass092 instanceof InterfaceC03910Hq)) {
                if (anonymousClass092 instanceof AnonymousClass095) {
                    jSONObject.put("text", A02(C0DU.A08(anonymousClass092), anonymousClass092.A0c));
                    A04(jSONObject, anonymousClass092);
                    jSONObject.put("type", "image");
                } else if (anonymousClass092 instanceof C09G) {
                    jSONObject.put("type", "audio");
                } else if (anonymousClass092 instanceof C0JP) {
                    jSONObject.put("text", A02(C0DU.A08(anonymousClass092), anonymousClass092.A0c));
                    A04(jSONObject, anonymousClass092);
                    jSONObject.put("type", "video");
                } else if (anonymousClass092 instanceof C04040Ie) {
                    jSONObject.put("type", "sticker");
                } else if (anonymousClass092 instanceof C0LO) {
                    jSONObject.put("text", A02(C0DU.A08(anonymousClass092), anonymousClass092.A0c));
                    A04(jSONObject, anonymousClass092);
                    jSONObject.put("type", "gif");
                } else if (anonymousClass092 instanceof C0KD) {
                    jSONObject.put("type", "location");
                } else if (!(anonymousClass092 instanceof C0D8) && !(anonymousClass092 instanceof C0DA)) {
                    if (!(anonymousClass092 instanceof C09E)) {
                        return null;
                    }
                    jSONObject.put("type", "document");
                } else {
                    jSONObject.put("type", "contact");
                }
            }
            return null;
        }
        AbstractC005302j A0A3 = anonymousClass092.A0A();
        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
        AbstractC005302j abstractC005302j = anonymousClass094.A00;
        boolean A0U = C003101m.A0U(abstractC005302j);
        if (A0U && A0A3 != null) {
            c05w = this.A01;
            A0A2 = c05w.A0A(A0A3);
        } else {
            c05w = this.A01;
            if (abstractC005302j != null) {
                A0A2 = c05w.A0A(abstractC005302j);
            } else {
                throw null;
            }
        }
        if (A0U) {
            if (abstractC005302j == null) {
                throw null;
            }
            str = this.A02.A08(c05w.A0A(abstractC005302j), false);
        } else {
            str = null;
        }
        jSONObject.putOpt("group_name", str);
        jSONObject.put("author_name", this.A02.A09(A0A2, false));
        C0C7 c0c7 = this.A05;
        Jid A02 = A0A2.A02();
        if (A02 != null) {
            C0F0 c0f0 = c0c7.A01;
            jSONObject.put("author_id", c0f0.A04(c07f, A02.getRawString()));
            if (abstractC005302j != null) {
                jSONObject.put("chat_id", c0f0.A04(c07f, abstractC005302j.getRawString()));
                C02990Ds c02990Ds = this.A06;
                JSONArray jSONArray = new JSONArray();
                JSONArray put = jSONArray.put(1).put(anonymousClass094.A01).put(anonymousClass094.A02);
                if (abstractC005302j != null) {
                    put.put(abstractC005302j.getRawString());
                    jSONObject.put("message_id", c02990Ds.A01.A04(c07f, jSONArray.toString()));
                    return jSONObject;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public final void A04(JSONObject jSONObject, AnonymousClass092 anonymousClass092) {
        List<Jid> list = anonymousClass092.A0c;
        if (list == null) {
            return;
        }
        for (Jid jid : list) {
            if (this.A00.A0A(jid)) {
                jSONObject.put("user_mentioned", true);
                return;
            }
        }
    }
}
