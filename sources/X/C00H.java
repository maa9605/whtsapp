package X;

import android.os.Handler;
import android.os.Looper;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.GlVideoRenderer;
import com.whatsapp.voipcalling.Voip;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.00H  reason: invalid class name */
/* loaded from: classes.dex */
public class C00H {
    public static volatile C00H A02;
    public final C07E A00;
    public final C07D A01;

    public C00H(final C00J c00j, final C00J c00j2, final C00J c00j3, final C00J c00j4, final C00J c00j5, final C00J c00j6, final C00J c00j7, final C00J c00j8) {
        HashSet hashSet = new HashSet();
        hashSet.add(C007203d.A00(new InterfaceC007103c() { // from class: X.1mo
            @Override // X.InterfaceC007103c
            public final Object get() {
                final C03030Dw c03030Dw = (C03030Dw) C00J.this.get();
                return new C07G(c03030Dw) { // from class: X.1mr
                    public final C03030Dw A00;

                    {
                        this.A00 = c03030Dw;
                    }

                    @Override // X.C07G
                    public void A00() {
                        this.A00.A01(0);
                    }
                };
            }
        }));
        hashSet.add(C007203d.A00(new InterfaceC007103c() { // from class: X.07C
            @Override // X.InterfaceC007103c
            public final Object get() {
                return new C37701mq(C001200o.A01, new Handler(Looper.getMainLooper()));
            }
        }));
        HashMap hashMap = new HashMap();
        hashMap.put("com.facebook.stella", C007203d.A00(new InterfaceC007103c() { // from class: X.1mp
            @Override // X.InterfaceC007103c
            public final Object get() {
                C00J c00j9 = C00J.this;
                C00J c00j10 = c00j3;
                C00J c00j11 = c00j4;
                C00J c00j12 = c00j5;
                C00J c00j13 = c00j6;
                C00J c00j14 = c00j7;
                C00J c00j15 = c00j8;
                final C1PN c1pn = (C1PN) c00j9.get();
                final C37741mu c37741mu = (C37741mu) c00j10.get();
                final C00G c00g = (C00G) c00j11.get();
                final C37761mw c37761mw = (C37761mw) c00j12.get();
                final C02970Dp c02970Dp = (C02970Dp) c00j13.get();
                final C37751mv c37751mv = (C37751mv) c00j14.get();
                final C37731mt c37731mt = (C37731mt) c00j15.get();
                return new C07G(c1pn, c37741mu, c00g, c37761mw, c02970Dp, c37751mv, c37731mt) { // from class: X.1mx
                    public final C1PN A00;
                    public final C37731mt A01;
                    public final C37741mu A02;
                    public final C37751mv A03;
                    public final C02970Dp A04;
                    public final C37761mw A05;
                    public final C00G A06;
                    public final String A07 = "com.facebook.stella";

                    {
                        this.A00 = c1pn;
                        this.A02 = c37741mu;
                        this.A06 = c00g;
                        this.A05 = c37761mw;
                        this.A04 = c02970Dp;
                        this.A03 = c37751mv;
                        this.A01 = c37731mt;
                    }

                    @Override // X.C07G
                    public void A01() {
                        C1PR c1pr = new C1PR(this.A01.A00(), null);
                        try {
                            C1PN c1pn2 = this.A00;
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("action", c1pr.A00);
                            jSONObject.putOpt("payload", c1pr.A01);
                            c1pn2.A00(jSONObject.toString(), this.A07, false);
                        } catch (JSONException unused) {
                            Log.e("StellaEventHandler/failed to create event");
                        }
                    }

                    @Override // X.C07G
                    public void A03(int i) {
                        String str;
                        C1PR c1pr;
                        try {
                            C07F A03 = this.A06.A03(this.A07);
                            C37741mu c37741mu2 = this.A02;
                            CallInfo callInfo = Voip.getCallInfo();
                            switch (i) {
                                case 1:
                                case 2:
                                case 14:
                                case 18:
                                    str = "user_ended_call";
                                    break;
                                case 3:
                                case 5:
                                case 6:
                                case GoogleMigrateImporterActivity.A0E /* 11 */:
                                case 13:
                                case 15:
                                case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                                case 17:
                                case C0M6.A01 /* 20 */:
                                case 21:
                                case 22:
                                case 23:
                                    str = "call_failed";
                                    break;
                                case 4:
                                case 19:
                                default:
                                    str = "other";
                                    break;
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 25:
                                    str = "not_accepted";
                                    break;
                                case 12:
                                    str = "rejected";
                                    break;
                                case 24:
                                    str = "missing_voip_permissions";
                                    break;
                            }
                            String A04 = callInfo == null ? null : c37741mu2.A00.A04(A03, callInfo.callId);
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("call_ended_reason", str);
                                jSONObject.put("call_id", A04);
                                c1pr = new C1PR(c37741mu2.A00(), jSONObject);
                            } catch (JSONException unused) {
                                c1pr = null;
                            }
                            A06(c1pr);
                        } catch (SecurityException e) {
                            Log.e("StellaEventHandler/cannot create event for untrusted package", e);
                        }
                    }

                    @Override // X.C07G
                    public void A04(AnonymousClass092 anonymousClass092) {
                        AnonymousClass094 anonymousClass094 = anonymousClass092.A0n;
                        boolean z = anonymousClass094.A02;
                        if (z || anonymousClass092.A0g) {
                            return;
                        }
                        try {
                            C07F A03 = this.A06.A03(this.A07);
                            C37761mw c37761mw2 = this.A05;
                            C1PR c1pr = null;
                            if (anonymousClass092 instanceof C03890Hn) {
                                JSONObject jSONObject = new JSONObject();
                                AbstractC005302j abstractC005302j = anonymousClass094.A00;
                                String str = ((C03890Hn) anonymousClass092).A00;
                                C02990Ds c02990Ds = c37761mw2.A00;
                                JSONArray jSONArray = new JSONArray();
                                JSONArray put = jSONArray.put(1).put(str).put(z);
                                if (abstractC005302j != null) {
                                    put.put(abstractC005302j.getRawString());
                                    try {
                                        jSONObject.put("message_id", c02990Ds.A01.A04(A03, jSONArray.toString()));
                                        c1pr = new C1PR(c37761mw2.A00(), jSONObject);
                                    } catch (JSONException unused) {
                                    }
                                } else {
                                    throw null;
                                }
                            }
                            A06(c1pr);
                            A06(this.A04.A01(anonymousClass092, A03));
                        } catch (SecurityException unused2) {
                            Log.e("StellaEventHandler/cannot create event for untrusted package");
                        }
                    }

                    @Override // X.C07G
                    public void A05(Voip.CallState callState, CallInfo callInfo) {
                        C1PR c1pr;
                        if (C0F1.A02(callState).equals(C0F1.A02(callInfo.callState))) {
                            return;
                        }
                        try {
                            C07F A03 = this.A06.A03(this.A07);
                            C37751mv c37751mv2 = this.A03;
                            try {
                                c1pr = new C1PR(c37751mv2.A00(), C0F1.A03(callInfo.callState, callInfo, c37751mv2.A00, c37751mv2.A01, c37751mv2.A02, A03, c37751mv2.A04, c37751mv2.A03));
                            } catch (JSONException unused) {
                                c1pr = null;
                            }
                            A06(c1pr);
                        } catch (SecurityException e) {
                            Log.e("StellaEventHandler/cannot create event for untrusted package", e);
                        }
                    }

                    public final void A06(C1PR c1pr) {
                        if (c1pr == null) {
                            return;
                        }
                        try {
                            C1PN c1pn2 = this.A00;
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("action", c1pr.A00);
                            jSONObject.putOpt("payload", c1pr.A01);
                            c1pn2.A00(jSONObject.toString(), this.A07, true);
                        } catch (JSONException unused) {
                            Log.e("StellaEventHandler/failed to create event");
                        }
                    }
                };
            }
        }));
        this.A01 = new C07D(hashSet, null);
        this.A00 = new C07E(hashMap, null);
    }
}
