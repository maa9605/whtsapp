package X;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.GetStatusPrivacyJob;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.protocol.VoipStanzaChildNode;
import com.whatsapp.report.ReportActivity;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0Yd  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C07420Yd {
    public final /* synthetic */ C2SA A00;

    public C07420Yd(C2SA c2sa) {
        this.A00 = c2sa;
    }

    public void A00() {
        this.A00.A00.A0E();
        Log.i("xmpp/writer/write/active");
    }

    public void A01() {
        C40581sV c40581sV = this.A00.A00;
        int i = c40581sV.A00 + 1;
        c40581sV.A00 = i;
        String hexString = Integer.toHexString(i);
        c40581sV.A0c.put(hexString, new C0SF() { // from class: X.2SK
            @Override // X.C0SF
            public void A00(int i2) {
                C000200d.A0p("Connection/sendClearFbnsToken/failed to clear code=", i2);
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                Log.i("Connection/sendClearFbnsToken/successfully cleared");
            }
        });
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("id", hexString, null, (byte) 0), new C04P("xmlns", "urn:xmpp:whatsapp:push", null, (byte) 0), new C04P("type", "set", null, (byte) 0), new C04P("to", C04260Jm.A00)}, new C02590Ca("clear", new C04P[]{new C04P("platform", "fbns", null, (byte) 0)}, null, null)));
        Log.i("xmpp/writer/write/clear_fbns_token;");
    }

    public void A02() {
        final C40581sV c40581sV = this.A00.A00;
        int i = c40581sV.A00 + 1;
        c40581sV.A00 = i;
        String hexString = Integer.toHexString(i);
        c40581sV.A0c.put(hexString, new C0SF() { // from class: X.2SL
            @Override // X.C0SF
            public void A00(int i2) {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                String str;
                C02590Ca A0D = c02590Ca.A0D("lists");
                if (A0D != null) {
                    for (C02590Ca c02590Ca2 : A0D.A0H("list")) {
                        C40581sV c40581sV2 = C40581sV.this;
                        AbstractC000600i abstractC000600i = c40581sV2.A04;
                        C0I1 c0i1 = (C0I1) c02590Ca2.A08(C0I1.class, "id", abstractC000600i);
                        C04P A0A = c02590Ca2.A0A("name");
                        if (A0A != null) {
                            str = A0A.A03;
                        } else {
                            str = null;
                        }
                        List<C02590Ca> A0H = c02590Ca2.A0H("recipient");
                        UserJid[] userJidArr = new UserJid[A0H.size()];
                        int i2 = 0;
                        for (C02590Ca c02590Ca3 : A0H) {
                            userJidArr[i2] = c02590Ca3.A08(UserJid.class, "jid", abstractC000600i);
                            i2++;
                        }
                        C0ES c0es = c40581sV2.A0B;
                        List asList = Arrays.asList(userJidArr);
                        if (c0es != null) {
                            StringBuilder sb = new StringBuilder("groupmgr/onParticipatingList/jid:");
                            sb.append(c0i1);
                            sb.append("/name:");
                            sb.append(str);
                            sb.append("/recipients:");
                            sb.append(Arrays.deepToString(asList.toArray()));
                            Log.i(sb.toString());
                            if (!c0es.A0I.A0E(c0i1) && !c0es.A0P.A01.containsKey(c0i1)) {
                                c0es.A0V.A02(c0es.A07(c0i1, asList), 1);
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("groupmgr/onParticipatingList/jid:");
                                sb2.append(c0i1);
                                sb2.append(" already exists");
                                Log.i(sb2.toString());
                            }
                            C05W c05w = c0es.A08;
                            if (c05w.A09(c0i1) == null) {
                                c05w.A06(c0i1, str, System.currentTimeMillis());
                            }
                        } else {
                            throw null;
                        }
                    }
                }
                C0ES c0es2 = C40581sV.this.A0B;
                if (c0es2 != null) {
                    Log.i("groupmgr/onParticipatingList/onParticipatingListsComplete");
                    C000200d.A0j(c0es2.A0E, "refresh_broadcast_lists", false);
                    return;
                }
                throw null;
            }
        });
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("id", hexString, null, (byte) 0), new C04P("xmlns", "w:b", null, (byte) 0), new C04P("type", "get", null, (byte) 0), new C04P("to", C04260Jm.A00)}, new C02590Ca("lists", null, null, null)));
        Log.i("xmpp/writer/write/get-broadcast-lists");
    }

    public void A03() {
        final C40581sV c40581sV = this.A00.A00;
        int i = c40581sV.A00 + 1;
        c40581sV.A00 = i;
        String hexString = Integer.toHexString(i);
        c40581sV.A0c.put(hexString, new C0SF() { // from class: X.2SM
            @Override // X.C0SF
            public void A00(int i2) {
                if (i2 == 404) {
                    C467628d c467628d = C40581sV.this.A0G;
                    if (c467628d != null) {
                        Log.i("xmpp/reader/on-get-pre-key-digest-none");
                        ((HandlerC467828f) c467628d.A00).A00(Message.obtain(null, 0, 83, 0));
                        return;
                    }
                    throw null;
                } else if (i2 != 503) {
                } else {
                    C467628d c467628d2 = C40581sV.this.A0G;
                    if (c467628d2 != null) {
                        Log.i("xmpp/reader/on-get-pre-key-digest-server-error");
                        ((HandlerC467828f) c467628d2.A00).A00(Message.obtain(null, 0, 84, 0));
                        return;
                    }
                    throw null;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r8v0, types: [byte[][], java.io.Serializable] */
            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                int i2;
                C02590Ca A0E = c02590Ca.A0E("digest");
                C02590Ca A0E2 = A0E.A0E("registration");
                C02590Ca A0E3 = A0E.A0E("type");
                C02590Ca A0E4 = A0E.A0E("skey").A0E("id");
                C02590Ca A0E5 = A0E.A0E("list");
                C02590Ca A0E6 = A0E.A0E("hash");
                C02590Ca[] c02590CaArr = A0E5.A03;
                if (c02590CaArr != null) {
                    i2 = c02590CaArr.length;
                } else {
                    i2 = 0;
                }
                ?? r8 = new byte[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    C02590Ca.A01(c02590CaArr[i3], "id");
                    r8[i3] = C02590Ca.A03(c02590CaArr[i3], 3);
                }
                C467628d c467628d = C40581sV.this.A0G;
                byte[] A03 = C02590Ca.A03(A0E2, 4);
                byte b = C02590Ca.A03(A0E3, 1)[0];
                byte[] A032 = C02590Ca.A03(A0E4, 3);
                byte[] A033 = C02590Ca.A03(A0E6, 20);
                if (c467628d != null) {
                    Log.i("xmpp/reader/on-get-pre-key-digest");
                    InterfaceC467728e interfaceC467728e = c467628d.A00;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("registration", A03);
                    bundle.putByte("type", b);
                    bundle.putByteArray("signedKeyId", A032);
                    bundle.putSerializable("keyIds", r8);
                    bundle.putByteArray("hash", A033);
                    ((HandlerC467828f) interfaceC467728e).A00(Message.obtain(null, 0, 82, 0, bundle));
                    return;
                }
                throw null;
            }
        });
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("id", hexString, null, (byte) 0), new C04P("xmlns", "encrypt", null, (byte) 0), new C04P("type", "get", null, (byte) 0), new C04P("to", C04260Jm.A00)}, new C02590Ca("digest", null, null, null)));
        Log.i("xmpp/writer/write/get-pre-key-digest");
    }

    public void A04() {
        final C40581sV c40581sV = this.A00.A00;
        int i = c40581sV.A00 + 1;
        c40581sV.A00 = i;
        String hexString = Integer.toHexString(i);
        c40581sV.A0c.put(hexString, new C0SF() { // from class: X.2SN
            @Override // X.C0SF
            public void A00(int i2) {
                C000200d.A0p("connection/send-tos-get-state error:", i2);
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                long j;
                C02590Ca A0D = c02590Ca.A0D("accept2");
                if (A0D != null) {
                    j = A0D.A07("accept", 0L) * 1000;
                } else {
                    j = 0;
                }
                C03070Ea c03070Ea = C40581sV.this.A0X;
                synchronized (c03070Ea) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("tosupdate/onTosStateFromServer timeAccepted:");
                    sb.append(j);
                    Log.i(sb.toString());
                    C000500h c000500h = c03070Ea.A02;
                    long A09 = c000500h.A09();
                    if (A09 > 0 && j == 0) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("tosupdate/onTosStateFromServer/resend accept tos clientTimeAccepted=");
                        sb2.append(A09);
                        Log.i(sb2.toString());
                        c000500h.A0D().remove("tos_v2_accepted_ack").apply();
                        c03070Ea.A03();
                    } else {
                        c000500h.A00.edit().putLong("tos_v2_accepted_time", j).putBoolean("tos_v2_accepted_ack", true).apply();
                    }
                }
            }
        });
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("to", C04260Jm.A00), new C04P("type", "get", null, (byte) 0), new C04P("id", hexString, null, (byte) 0), new C04P("xmlns", "urn:xmpp:whatsapp:account", null, (byte) 0)}, new C02590Ca("accept2", null, null, null)));
        Log.i("xmpp/writer/write/get-tos-state");
    }

    public void A05() {
        C40581sV c40581sV = this.A00.A00;
        if (c40581sV != null) {
            c40581sV.A0R.A06(new C02590Ca("presence", new C04P[]{new C04P("type", "unavailable", null, (byte) 0)}, null, null));
            Log.i("xmpp/writer/write/inactive");
            return;
        }
        throw null;
    }

    public void A06() {
        C2SA c2sa = this.A00;
        C40581sV c40581sV = c2sa.A00;
        if (c40581sV != null) {
            C02590Ca c02590Ca = new C02590Ca("presence", new C04P[]{new C04P("type", "unavailable", null, (byte) 0)}, null, null);
            C466127n c466127n = c40581sV.A0R;
            c466127n.A06(c02590Ca);
            c466127n.A05();
            c2sa.A01 = true;
            Log.i("xmpp/writer/write/logout");
            return;
        }
        throw null;
    }

    public void A07() {
        C40581sV c40581sV = this.A00.A00;
        if (c40581sV != null) {
            c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("type", "result", null, (byte) 0), new C04P("to", C04260Jm.A00)}, null, null));
            Log.i("xmpp/writer/write/pong");
            return;
        }
        throw null;
    }

    public void A08() {
        if (this.A00.A00 != null) {
            Log.i("xmpp/writer/write/reset-smb-tos");
            return;
        }
        throw null;
    }

    public void A09() {
        if (this.A00.A00 != null) {
            Log.i("xmpp/writer/write/accept-smb-tos");
            return;
        }
        throw null;
    }

    public void A0A() {
        final C40581sV c40581sV = this.A00.A00;
        int i = c40581sV.A00 + 1;
        c40581sV.A00 = i;
        String hexString = Integer.toHexString(i);
        c40581sV.A0c.put(hexString, new C0SF() { // from class: X.2SO
            @Override // X.C0SF
            public void A00(int i2) {
                C000200d.A0p("connection/send-tos-accepted error:", i2);
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                C03070Ea c03070Ea = C40581sV.this.A0X;
                synchronized (c03070Ea) {
                    Log.i("tosupdate/onTosAckFromServer");
                    C000500h c000500h = c03070Ea.A02;
                    long A09 = c000500h.A09();
                    if (A09 == 0) {
                        A09 = c03070Ea.A01.A05();
                    }
                    c000500h.A00.edit().putLong("tos_v2_accepted_time", A09).putBoolean("tos_v2_accepted_ack", true).apply();
                }
            }
        });
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("to", C04260Jm.A00), new C04P("type", "set", null, (byte) 0), new C04P("id", hexString, null, (byte) 0), new C04P("xmlns", "urn:xmpp:whatsapp:account", null, (byte) 0)}, new C02590Ca("accept2", c40581sV.A0Y.A07(C01C.A0I) ? new C04P[]{new C04P("version", "eu", null, (byte) 0)} : null, null, null)));
        Log.i("xmpp/writer/write/accept-tos");
    }

    public void A0B() {
        final C40581sV c40581sV = this.A00.A00;
        int i = c40581sV.A00 + 1;
        c40581sV.A00 = i;
        String hexString = Integer.toHexString(i);
        c40581sV.A0c.put(hexString, new C0SF() { // from class: X.2SP
            @Override // X.C0SF
            public void A00(int i2) {
                C000200d.A0p("connection/send-tos-page-2 error:", i2);
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                C03070Ea c03070Ea = C40581sV.this.A0X;
                synchronized (c03070Ea) {
                    Log.i("tosupdate/onTosPage2Ack");
                    c03070Ea.A02.A0D().putBoolean("tos_v2_page_2_ack", true).apply();
                }
            }
        });
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("to", C04260Jm.A00), new C04P("type", "set", null, (byte) 0), new C04P("id", hexString, null, (byte) 0), new C04P("xmlns", "urn:xmpp:whatsapp:account", null, (byte) 0)}, new C02590Ca("tos2", new C04P[]{new C04P("page", "2", null, (byte) 0)}, null, null)));
        Log.i("xmpp/writer/write/tos-page-2");
    }

    public void A0C() {
        C40581sV c40581sV = this.A00.A00;
        int i = c40581sV.A00 + 1;
        c40581sV.A00 = i;
        String hexString = Integer.toHexString(i);
        c40581sV.A0c.put(hexString, new C0SF() { // from class: X.2SQ
            @Override // X.C0SF
            public void A00(int i2) {
                C000200d.A0p("connection/send-tos-reset-ack error:", i2);
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                Log.i("connection/send-tos-reset-ack");
            }
        });
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("to", C04260Jm.A00), new C04P("type", "set", null, (byte) 0), new C04P("id", hexString, null, (byte) 0), new C04P("xmlns", "urn:xmpp:whatsapp:account", null, (byte) 0)}, new C02590Ca("tos2", (C04P[]) null, new C02590Ca("reset", null, null, null))));
        Log.i("xmpp/writer/write/tos-reset-ack");
    }

    public void A0D() {
        this.A00.A00.A00++;
        throw null;
    }

    public void A0E() {
        if (this.A00.A00 != null) {
            throw null;
        }
        throw null;
    }

    public void A0F() {
        this.A00.A00.A00++;
        throw null;
    }

    public void A0G() {
        if (this.A00.A00 != null) {
            Log.i("xmpp/writer/write/smb-tos-server-prop-ack");
            return;
        }
        throw null;
    }

    public void A0H(final int i) {
        final C40581sV c40581sV = this.A00.A00;
        int i2 = c40581sV.A00 + 1;
        c40581sV.A00 = i2;
        String hexString = Integer.toHexString(i2);
        c40581sV.A0c.put(hexString, new C0SF() { // from class: X.2SR
            @Override // X.C0SF
            public void A00(int i3) {
                C000200d.A0p("connection/send-tos-stage error:", i3);
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                C03070Ea c03070Ea = C40581sV.this.A0X;
                int i3 = i;
                synchronized (c03070Ea) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("tosupdate/onTosStageAck stage:");
                    sb.append(i3);
                    Log.i(sb.toString());
                    SharedPreferences.Editor A0D = c03070Ea.A02.A0D();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("tos_v2_stage_start_ack");
                    sb2.append(i3);
                    A0D.putBoolean(sb2.toString(), true).apply();
                }
            }
        });
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("to", C04260Jm.A00), new C04P("type", "set", null, (byte) 0), new C04P("id", hexString, null, (byte) 0), new C04P("xmlns", "urn:xmpp:whatsapp:account", null, (byte) 0)}, new C02590Ca("tos2", new C04P[]{new C04P("stage", Integer.toString(i), null, (byte) 0)}, null, null)));
        StringBuilder sb = new StringBuilder("xmpp/writer/write/tos-stage ");
        sb.append(i);
        Log.i(sb.toString());
    }

    public void A0I(int i, C02590Ca c02590Ca) {
        this.A00.A00.A0R.A06(c02590Ca);
        StringBuilder sb = new StringBuilder("xmpp/writer/write/type=");
        sb.append(i);
        Log.i(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0J(final int r13, final java.lang.String r14, java.lang.String r15) {
        /*
            r12 = this;
            X.2SA r0 = r12.A00
            X.1sV r6 = r0.A00
            r8 = 0
            if (r6 == 0) goto L92
            java.lang.String r4 = "challenge"
            r7 = 2
            r5 = 0
            r9 = 1
            if (r13 == 0) goto L8e
            if (r13 == r9) goto L8b
            if (r13 != r7) goto L7d
            X.04P r11 = new X.04P
            r11.<init>(r4, r15, r8, r5)
        L17:
            int r0 = r6.A00
            int r0 = r0 + r9
            r6.A00 = r0
            java.lang.String r2 = java.lang.Integer.toHexString(r0)
            java.util.Map r1 = r6.A0c
            X.2SS r0 = new X.2SS
            r0.<init>()
            r1.put(r2, r0)
            r10 = 3
            r0 = 3
            if (r11 != 0) goto L2f
            r0 = 1
        L2f:
            X.04P[] r3 = new X.C04P[r0]
            java.lang.String r1 = "reason"
            X.04P r0 = new X.04P
            r0.<init>(r1, r4, r8, r5)
            r3[r5] = r0
            if (r11 == 0) goto L49
            java.lang.String r4 = "version"
            java.lang.String r1 = "0.17.11"
            X.04P r0 = new X.04P
            r0.<init>(r4, r1, r8, r5)
            r3[r9] = r0
            r3[r7] = r11
        L49:
            java.lang.String r0 = "deny"
            X.0Ca r4 = new X.0Ca
            r4.<init>(r0, r3, r14)
            X.04P[] r3 = new X.C04P[r10]
            java.lang.String r10 = "type"
            java.lang.String r1 = "set"
            X.04P r0 = new X.04P
            r0.<init>(r10, r1, r8, r5)
            r3[r5] = r0
            java.lang.String r1 = "id"
            X.04P r0 = new X.04P
            r0.<init>(r1, r2, r8, r5)
            r3[r9] = r0
            java.lang.String r2 = "xmlns"
            java.lang.String r1 = "w:web"
            X.04P r0 = new X.04P
            r0.<init>(r2, r1, r8, r5)
            r3[r7] = r0
            java.lang.String r0 = "iq"
            X.0Ca r1 = new X.0Ca
            r1.<init>(r0, r3, r4)
            X.27n r0 = r6.A0R
            r0.A06(r1)
        L7d:
            java.lang.String r2 = "xmpp/writer/write/web-deny-reason; ref="
            java.lang.String r1 = "; challenge="
            java.lang.String r0 = "; reason="
            java.lang.StringBuilder r0 = X.C000200d.A0X(r2, r14, r1, r15, r0)
            X.C000200d.A1F(r0, r13)
            return
        L8b:
            java.lang.String r4 = "fail"
            goto L90
        L8e:
            java.lang.String r4 = "conflict"
        L90:
            r11 = r8
            goto L17
        L92:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07420Yd.A0J(int, java.lang.String, java.lang.String):void");
    }

    public void A0K(int i, boolean z, int i2) {
        C40581sV c40581sV = this.A00.A00;
        int i3 = c40581sV.A00 + 1;
        c40581sV.A00 = i3;
        String hexString = Integer.toHexString(i3);
        C04P[] c04pArr = null;
        if (i != -1) {
            c04pArr = new C04P[3];
            c04pArr[0] = new C04P("id", i);
            c04pArr[1] = new C04P("blocking", z ? "true" : "false", null, (byte) 0);
            c04pArr[2] = new C04P("version", i2);
        }
        c40581sV.A0T(hexString, "0", new C02590Ca("action", new C04P[]{new C04P("type", "set", null, (byte) 0)}, new C02590Ca("notice", c04pArr, null, null)));
        Log.i("xmpp/writer/write/send-web-user-notice-update");
    }

    public void A0L(long j, C010805j c010805j) {
        C40581sV c40581sV = this.A00.A00;
        if (c40581sV != null) {
            c40581sV.A0R.A06(new C02590Ca("ib", (C04P[]) null, new C02590Ca("location", j != 0 ? new C04P[]{new C04P("elapsed", Long.toString(j), null, (byte) 0)} : C40581sV.A0f, C40581sV.A01(c010805j, 0, null, null))));
            Log.i("xmpp/writer/write/send-location");
            return;
        }
        throw null;
    }

    public void A0M(final C0TC c0tc) {
        String hexString;
        if (!((AbstractC05910Qs) c0tc).A01) {
            List list = c0tc.A07;
            final C40581sV c40581sV = this.A00.A00;
            final C011005l c011005l = ((C0TD) c0tc).A01;
            C04500Kk c04500Kk = c0tc.A04;
            if (c04500Kk != null) {
                hexString = c04500Kk.A01;
            } else {
                int i = c40581sV.A00 + 1;
                c40581sV.A00 = i;
                hexString = Integer.toHexString(i);
            }
            c40581sV.A0c.put(hexString, new C0SF() { // from class: X.2ST
                @Override // X.C0SF
                public void A00(int i2) {
                    C0I3 c0i3 = c0tc;
                    if (c0i3 != null) {
                        c0i3.ARv(i2);
                    }
                }

                @Override // X.C0SF
                public void A03(C02590Ca c02590Ca) {
                    C2KE c2ke = new C2KE(c011005l);
                    C40581sV c40581sV2 = C40581sV.this;
                    AbstractC000600i abstractC000600i = c40581sV2.A04;
                    Jid A08 = c02590Ca.A08(C011005l.class, "from", abstractC000600i);
                    if (A08 == null) {
                        C0I3 c0i3 = c0tc;
                        if (c0i3 != null) {
                            c0i3.ARv(800);
                            return;
                        }
                        return;
                    }
                    C43981yK.A09(abstractC000600i, c02590Ca, c2ke, "add");
                    if (c40581sV2.A0B != null) {
                        StringBuilder sb = new StringBuilder("groupmgr/onAddGroupParticipants/");
                        sb.append(A08);
                        sb.append("/");
                        sb.append(Arrays.deepToString(c2ke.A03.keySet().toArray()));
                        sb.append("/");
                        Map map = c2ke.A01;
                        sb.append(Arrays.deepToString(map.keySet().toArray()));
                        Log.i(sb.toString());
                        if (map.size() > 0) {
                            C0ES.A02(3001, map);
                        }
                        Runnable runnable = c0tc;
                        if (runnable != null) {
                            runnable.run();
                        }
                        C0TA c0ta = c0tc;
                        if (c0ta != null) {
                            c0ta.ARx(c2ke);
                            return;
                        }
                        return;
                    }
                    throw null;
                }
            });
            c40581sV.A0I(c011005l, list, hexString, "add", c04500Kk);
            StringBuilder A0P = C000200d.A0P("xmpp/writer/write/add-participants; groupId=");
            A0P.append(((C0TD) c0tc).A01);
            A0P.append("; participants=");
            A0P.append(list);
            Log.i(A0P.toString());
            return;
        }
        StringBuilder A0P2 = C000200d.A0P("xmpp/writer/write/add-participants/timeout; groupId=");
        A0P2.append(((C0TD) c0tc).A01);
        A0P2.append("; participants=");
        A0P2.append(c0tc.A07);
        Log.e(A0P2.toString());
    }

    public void A0N(final C0TD c0td) {
        String hexString;
        if (!((AbstractC05910Qs) c0td).A01) {
            List list = c0td.A07;
            final C40581sV c40581sV = this.A00.A00;
            C011005l c011005l = c0td.A01;
            C04500Kk c04500Kk = c0td.A04;
            if (c04500Kk != null) {
                hexString = c04500Kk.A01;
            } else {
                int i = c40581sV.A00 + 1;
                c40581sV.A00 = i;
                hexString = Integer.toHexString(i);
            }
            c40581sV.A0c.put(hexString, new C0SF() { // from class: X.2SU
                @Override // X.C0SF
                public void A00(int i2) {
                    C0I3 c0i3 = c0td;
                    if (c0i3 != null) {
                        c0i3.ARv(i2);
                    }
                }

                @Override // X.C0SF
                public void A03(C02590Ca c02590Ca) {
                    C40581sV c40581sV2 = C40581sV.this;
                    AbstractC000600i abstractC000600i = c40581sV2.A04;
                    Jid A08 = c02590Ca.A08(C011005l.class, "from", abstractC000600i);
                    if (A08 == null) {
                        C0I3 c0i3 = c0td;
                        if (c0i3 != null) {
                            c0i3.ARv(800);
                            return;
                        }
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    C43981yK.A0A(abstractC000600i, c02590Ca, hashMap, hashMap2, "promote");
                    if (c40581sV2.A0B != null) {
                        StringBuilder sb = new StringBuilder("groupmgr/onPromoteGroupParticipants/");
                        sb.append(A08);
                        sb.append("/");
                        sb.append(Arrays.deepToString(hashMap.keySet().toArray()));
                        sb.append("/");
                        sb.append(Arrays.deepToString(hashMap2.keySet().toArray()));
                        Log.i(sb.toString());
                        if (hashMap2.size() > 0) {
                            C0ES.A02(3003, hashMap2);
                        }
                        Runnable runnable = c0td;
                        if (runnable != null) {
                            runnable.run();
                            return;
                        }
                        return;
                    }
                    throw null;
                }
            });
            c40581sV.A0I(c011005l, list, hexString, "promote", c04500Kk);
            StringBuilder A0P = C000200d.A0P("xmpp/writer/write/add-admins; groupId=");
            A0P.append(c0td.A01);
            A0P.append("; participants=");
            A0P.append(list);
            Log.i(A0P.toString());
            return;
        }
        StringBuilder A0P2 = C000200d.A0P("xmpp/writer/write/add-admins/timeout; groupId=");
        A0P2.append(c0td.A01);
        A0P2.append("; participants=");
        A0P2.append(c0td.A07);
        Log.e(A0P2.toString());
    }

    public void A0O(final C0TD c0td) {
        if (!((AbstractC05910Qs) c0td).A01) {
            final C40581sV c40581sV = this.A00.A00;
            C011005l c011005l = c0td.A01;
            int i = c40581sV.A00 + 1;
            c40581sV.A00 = i;
            String hexString = Integer.toHexString(i);
            c40581sV.A0c.put(hexString, new C0SF() { // from class: X.2SV
                @Override // X.C0SF
                public void A00(int i2) {
                    C0I3 c0i3 = c0td;
                    if (c0i3 != null) {
                        c0i3.ARv(i2);
                    }
                }

                @Override // X.C0SF
                public void A03(C02590Ca c02590Ca) {
                    int i2;
                    if (c02590Ca.A0D("delete") != null) {
                        ArrayList arrayList = new ArrayList();
                        HashMap hashMap = new HashMap();
                        if (C40581sV.this != null) {
                            C02590Ca A0D = c02590Ca.A0D("delete");
                            if (A0D != null) {
                                ArrayList arrayList2 = new ArrayList();
                                C43981yK.A0E(A0D, arrayList2, "group", "id");
                                ArrayList arrayList3 = new ArrayList();
                                C43981yK.A0E(A0D, arrayList3, "group", "error");
                                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                                    Object obj = arrayList2.get(i3);
                                    String str = (String) arrayList3.get(i3);
                                    if (str != null) {
                                        try {
                                            i2 = Integer.valueOf(str);
                                        } catch (Exception unused) {
                                            i2 = 499;
                                        }
                                        hashMap.put(obj, i2);
                                    } else {
                                        arrayList.add(obj);
                                    }
                                }
                            } else {
                                throw null;
                            }
                        } else {
                            throw null;
                        }
                    }
                    Runnable runnable = c0td;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            });
            c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("id", hexString, null, (byte) 0), new C04P("xmlns", "w:g2", null, (byte) 0), new C04P("type", "set", null, (byte) 0), new C04P("to", C0N9.A00)}, new C02590Ca("delete", null, new C02590Ca[]{new C02590Ca("group", new C04P[]{new C04P("id", c011005l)}, null, null)}, null)));
            StringBuilder sb = new StringBuilder("xmpp/writer/write/end-group; groupId=");
            sb.append(c0td.A01);
            Log.i(sb.toString());
            return;
        }
        StringBuilder A0P = C000200d.A0P("xmpp/writer/write/end-group/timeout; groupId=");
        A0P.append(c0td.A01);
        Log.e(A0P.toString());
    }

    public void A0P(final C0TD c0td) {
        String hexString;
        if (!((AbstractC05910Qs) c0td).A01) {
            final C40581sV c40581sV = this.A00.A00;
            C011005l c011005l = c0td.A01;
            C04500Kk c04500Kk = c0td.A04;
            final boolean z = c0td.A08;
            if (c04500Kk != null) {
                hexString = c04500Kk.A01;
            } else {
                int i = c40581sV.A00 + 1;
                c40581sV.A00 = i;
                hexString = Integer.toHexString(i);
            }
            c40581sV.A0c.put(hexString, new C0SF() { // from class: X.2SW
                @Override // X.C0SF
                public void A00(int i2) {
                    C0I3 c0i3 = c0td;
                    if (c0i3 != null) {
                        c0i3.ARv(i2);
                    }
                }

                @Override // X.C0SF
                public void A03(C02590Ca c02590Ca) {
                    C02590Ca A0D = c02590Ca.A0D("leave");
                    if (A0D != null) {
                        ArrayList arrayList = new ArrayList();
                        C40581sV c40581sV2 = C40581sV.this;
                        C43981yK.A0B(c40581sV2.A04, C011005l.class, A0D, arrayList, "group", "id");
                        if (arrayList.size() > 0) {
                            c40581sV2.A0B.A0M(arrayList, z);
                        }
                    }
                    Runnable runnable = c0td;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            });
            C02590Ca c02590Ca = new C02590Ca("leave", null, new C02590Ca[]{new C02590Ca("group", new C04P[]{new C04P("id", c011005l)}, null, null)}, null);
            C04P[] c04pArr = new C04P[c04500Kk == null ? 4 : 5];
            c04pArr[0] = new C04P("id", hexString, null, (byte) 0);
            c04pArr[1] = new C04P("xmlns", "w:g2", null, (byte) 0);
            c04pArr[2] = new C04P("type", "set", null, (byte) 0);
            c04pArr[3] = new C04P("to", C0N9.A00);
            if (c04500Kk != null) {
                c04pArr[4] = new C04P("web", c04500Kk.A00, null, (byte) 0);
            }
            c40581sV.A0R.A06(new C02590Ca("iq", c04pArr, c02590Ca));
            StringBuilder sb = new StringBuilder("xmpp/writer/write/leave-group; groupId=");
            sb.append(c0td.A01);
            Log.i(sb.toString());
            return;
        }
        StringBuilder A0P = C000200d.A0P("xmpp/writer/write/leave-group/timeout; groupId=");
        A0P.append(c0td.A01);
        Log.e(A0P.toString());
    }

    public void A0Q(final C0TD c0td) {
        String hexString;
        if (!((AbstractC05910Qs) c0td).A01) {
            List list = c0td.A07;
            final C40581sV c40581sV = this.A00.A00;
            C011005l c011005l = c0td.A01;
            if (list != null) {
                C04500Kk c04500Kk = c0td.A04;
                if (c04500Kk != null) {
                    hexString = c04500Kk.A01;
                } else {
                    int i = c40581sV.A00 + 1;
                    c40581sV.A00 = i;
                    hexString = Integer.toHexString(i);
                }
                c40581sV.A0c.put(hexString, new C0SF() { // from class: X.2SX
                    @Override // X.C0SF
                    public void A00(int i2) {
                        C0I3 c0i3 = c0td;
                        if (c0i3 != null) {
                            c0i3.ARv(i2);
                        }
                    }

                    @Override // X.C0SF
                    public void A03(C02590Ca c02590Ca) {
                        C40581sV c40581sV2 = C40581sV.this;
                        AbstractC000600i abstractC000600i = c40581sV2.A04;
                        Jid A08 = c02590Ca.A08(C011005l.class, "from", abstractC000600i);
                        if (A08 == null) {
                            C0I3 c0i3 = c0td;
                            if (c0i3 != null) {
                                c0i3.ARv(800);
                                return;
                            }
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        C43981yK.A0A(abstractC000600i, c02590Ca, hashMap, hashMap2, "demote");
                        if (c40581sV2.A0B != null) {
                            StringBuilder sb = new StringBuilder("groupmgr/onDemoteGroupParticipants/");
                            sb.append(A08);
                            sb.append("/");
                            sb.append(Arrays.deepToString(hashMap.keySet().toArray()));
                            sb.append("/");
                            sb.append(Arrays.deepToString(hashMap2.keySet().toArray()));
                            Log.i(sb.toString());
                            if (hashMap2.size() > 0) {
                                C0ES.A02(3004, hashMap2);
                            }
                            Runnable runnable = c0td;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                        throw null;
                    }
                });
                c40581sV.A0I(c011005l, list, hexString, "demote", c04500Kk);
                StringBuilder A0P = C000200d.A0P("xmpp/writer/write/remove-admins; groupId=");
                A0P.append(c0td.A01);
                A0P.append("; participants=");
                A0P.append(list);
                Log.i(A0P.toString());
                return;
            }
            throw null;
        }
        StringBuilder A0P2 = C000200d.A0P("xmpp/writer/write/remove-admins/timeout; groupId=");
        A0P2.append(c0td.A01);
        A0P2.append("; participants=");
        A0P2.append(c0td.A07);
        Log.e(A0P2.toString());
    }

    public void A0R(final C0TD c0td) {
        String hexString;
        if (!((AbstractC05910Qs) c0td).A01) {
            List list = c0td.A07;
            final C40581sV c40581sV = this.A00.A00;
            C011005l c011005l = c0td.A01;
            C04500Kk c04500Kk = c0td.A04;
            if (c04500Kk != null) {
                hexString = c04500Kk.A01;
            } else {
                int i = c40581sV.A00 + 1;
                c40581sV.A00 = i;
                hexString = Integer.toHexString(i);
            }
            c40581sV.A0c.put(hexString, new C0SF() { // from class: X.2SY
                @Override // X.C0SF
                public void A00(int i2) {
                    C0I3 c0i3 = c0td;
                    if (c0i3 != null) {
                        c0i3.ARv(i2);
                    }
                }

                @Override // X.C0SF
                public void A03(C02590Ca c02590Ca) {
                    C40581sV c40581sV2 = C40581sV.this;
                    AbstractC000600i abstractC000600i = c40581sV2.A04;
                    Jid A08 = c02590Ca.A08(C011005l.class, "from", abstractC000600i);
                    if (A08 == null) {
                        C0I3 c0i3 = c0td;
                        if (c0i3 != null) {
                            c0i3.ARv(800);
                            return;
                        }
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    C43981yK.A0A(abstractC000600i, c02590Ca, hashMap, hashMap2, "remove");
                    if (c40581sV2.A0B != null) {
                        StringBuilder sb = new StringBuilder("groupmgr/onRemoveGroupParticipants/");
                        sb.append(A08);
                        sb.append("/");
                        sb.append(Arrays.deepToString(hashMap.keySet().toArray()));
                        sb.append("/");
                        sb.append(Arrays.deepToString(hashMap2.keySet().toArray()));
                        Log.i(sb.toString());
                        if (hashMap2.size() > 0) {
                            C0ES.A02(3002, hashMap2);
                        }
                        Runnable runnable = c0td;
                        if (runnable != null) {
                            runnable.run();
                            return;
                        }
                        return;
                    }
                    throw null;
                }
            });
            c40581sV.A0I(c011005l, list, hexString, "remove", c04500Kk);
            StringBuilder A0P = C000200d.A0P("xmpp/writer/write/remove-participants; groupId=");
            A0P.append(c0td.A01);
            A0P.append("; participants=");
            A0P.append(list);
            Log.i(A0P.toString());
            return;
        }
        StringBuilder A0P2 = C000200d.A0P("xmpp/writer/write/remove-participants/timeout; groupId=");
        A0P2.append(c0td.A01);
        A0P2.append("; participants=");
        A0P2.append(c0td.A07);
        Log.e(A0P2.toString());
    }

    public void A0S(final C0TD c0td) {
        String hexString;
        String str = c0td.A06;
        C40581sV c40581sV = this.A00.A00;
        C011005l c011005l = c0td.A01;
        C04500Kk c04500Kk = c0td.A04;
        if (c04500Kk != null) {
            hexString = c04500Kk.A01;
        } else {
            int i = c40581sV.A00 + 1;
            c40581sV.A00 = i;
            hexString = Integer.toHexString(i);
        }
        c40581sV.A0c.put(hexString, new C0SF() { // from class: X.2SZ
            @Override // X.C0SF
            public void A00(int i2) {
                C0I3 c0i3 = c0td;
                if (c0i3 != null) {
                    c0i3.ARv(i2);
                }
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                Runnable runnable = c0td;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        C02590Ca c02590Ca = new C02590Ca("subject", (C04P[]) null, str);
        C04P[] c04pArr = new C04P[c04500Kk == null ? 4 : 5];
        c04pArr[0] = new C04P("id", hexString, null, (byte) 0);
        c04pArr[1] = new C04P("xmlns", "w:g2", null, (byte) 0);
        c04pArr[2] = new C04P("type", "set", null, (byte) 0);
        c04pArr[3] = new C04P("to", c011005l);
        if (c04500Kk != null) {
            c04pArr[4] = new C04P("web", c04500Kk.A00, null, (byte) 0);
        }
        c40581sV.A0R.A06(new C02590Ca("iq", c04pArr, c02590Ca));
        StringBuilder sb = new StringBuilder("xmpp/writer/set-subject; groupId=");
        sb.append(c0td.A01);
        sb.append("; subject=");
        C000200d.A1N(sb, str);
    }

    public void A0T(AbstractC005302j abstractC005302j) {
        C40581sV c40581sV = this.A00.A00;
        if (c40581sV != null) {
            c40581sV.A0R.A06(new C02590Ca("chatstate", new C04P[]{new C04P("to", abstractC005302j)}, new C02590Ca("paused", null, null, null)));
            StringBuilder sb = new StringBuilder("xmpp/writer/write/paused; toJid=");
            sb.append(abstractC005302j);
            Log.i(sb.toString());
            return;
        }
        throw null;
    }

    public void A0U(AbstractC005302j abstractC005302j) {
        C40581sV c40581sV = this.A00.A00;
        if (c40581sV != null) {
            c40581sV.A0R.A06(new C02590Ca("presence", new C04P[]{new C04P("type", "subscribe", null, (byte) 0), new C04P("to", abstractC005302j)}, null, null));
            StringBuilder sb = new StringBuilder("xmpp/writer/write/subscription-request; jid=");
            sb.append(abstractC005302j);
            Log.i(sb.toString());
            return;
        }
        throw null;
    }

    public void A0V(AbstractC005302j abstractC005302j, int i) {
        C40581sV c40581sV = this.A00.A00;
        String str = i == 1 ? "audio" : null;
        if (c40581sV != null) {
            C02590Ca c02590Ca = new C02590Ca("composing", str == null ? null : new C04P[]{new C04P("media", str, null, (byte) 0)}, null, null);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C04P("to", abstractC005302j));
            c40581sV.A0R.A06(new C02590Ca("chatstate", (C04P[]) arrayList.toArray(C40581sV.A0f), c02590Ca));
            StringBuilder sb = new StringBuilder("xmpp/writer/write/composing; toJid=");
            sb.append(abstractC005302j);
            sb.append("; media=");
            sb.append(i);
            Log.i(sb.toString());
            return;
        }
        throw null;
    }

    public void A0W(AbstractC005302j abstractC005302j, UserJid userJid) {
        C40581sV c40581sV = this.A00.A00;
        int i = c40581sV.A00 + 1;
        c40581sV.A00 = i;
        String hexString = Integer.toHexString(i);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new C04P("type", "update", null, (byte) 0));
        arrayList.add(new C04P("jid", abstractC005302j));
        if (userJid != null && !abstractC005302j.equals(userJid)) {
            C000200d.A0y("author", userJid, arrayList);
        }
        c40581sV.A0T(hexString, "w", new C02590Ca("action", (C04P[]) null, new C02590Ca("location", (C04P[]) arrayList.toArray(C40581sV.A0f), null, null)));
        Log.i("xmpp/writer/write/send-web-live-location-stop-sharing");
    }

    public void A0X(AbstractC005302j abstractC005302j, String str, AbstractC005302j abstractC005302j2) {
        this.A00.A00.A0G(abstractC005302j, str, abstractC005302j2, null, null, "hsm-envelope-mismatch");
        C000200d.A14("xmpp/writer/write/message-received-permanent-failure; message.key.id=", str);
    }

    public void A0Y(AbstractC005302j abstractC005302j, String str, AbstractC005302j abstractC005302j2, Integer num, String str2) {
        this.A00.A00.A0G(abstractC005302j, str, abstractC005302j2, num, str2, "structure-unavailable");
        C000200d.A14("xmpp/writer/write/message-received-structure-unavailable; message.key.id=", str);
    }

    public void A0Z(DeviceJid deviceJid) {
        C40581sV c40581sV = this.A00.A00;
        if (c40581sV != null) {
            c40581sV.A0R.A06(new C02590Ca("presence", new C04P[]{new C04P("type", "probe", null, (byte) 0), new C04P("to", deviceJid)}, null, null));
            return;
        }
        throw null;
    }

    public void A0a(Jid jid, Jid jid2, Jid jid3, String str, long j, Jid jid4, String str2, String str3) {
        C02590Ca c02590Ca;
        if (jid != null && jid2 != null && !TextUtils.isEmpty(str) && jid4 != null && str2 != null && str3 != null) {
            C40581sV c40581sV = this.A00.A00;
            C04P[] c04pArr = null;
            if (c40581sV != null) {
                int i = c40581sV.A00 + 1;
                c40581sV.A00 = i;
                C04P[] c04pArr2 = {new C04P("to", C04260Jm.A00), new C04P("xmlns", "spam", null, (byte) 0), new C04P("type", "set", null, (byte) 0), new C04P("id", Integer.toHexString(i), null, (byte) 0)};
                if (str != null) {
                    C04P[] c04pArr3 = {new C04P("from", jid), new C04P("to", jid2), new C04P("id", str, null, (byte) 0)};
                    C04P[] c04pArr4 = new C04P[2 + (jid3 != null ? 2 : 0) + 1 + 1];
                    c04pArr4[0] = new C04P("duration", Long.toString(j), null, (byte) 0);
                    c04pArr4[1] = new C04P("terminator", jid4);
                    c04pArr4[2] = new C04P("reason", str2, null, (byte) 0);
                    c04pArr4[3] = new C04P("mediatype", str3, null, (byte) 0);
                    if (jid3 != null) {
                        c04pArr4[4] = new C04P("creator", jid3);
                        c04pArr4[5] = new C04P("adder", jid);
                    }
                    c04pArr = null;
                    c02590Ca = new C02590Ca("call", c04pArr3, new C02590Ca("call_info", c04pArr4, null, null));
                } else {
                    c02590Ca = null;
                }
                c40581sV.A0R.A06(new C02590Ca("iq", c04pArr2, new C02590Ca("spam_list", c04pArr, c02590Ca)));
                return;
            }
            throw null;
        }
    }

    public void A0b(Jid jid, String str, boolean z, long j) {
        HashMap hashMap = new HashMap();
        C04420Kc c04420Kc = new C04420Kc(jid, "notification", str, "contacts", null, null, null, null, j, hashMap.isEmpty() ? null : new ArrayList(hashMap.values()));
        C40581sV c40581sV = this.A00.A00;
        if (c40581sV == null) {
            throw null;
        }
        c40581sV.A0O(c04420Kc, new C02590Ca("sync", new C04P[]{new C04P("contacts", z ? "in" : "out", null, (byte) 0)}, null, null));
        StringBuilder sb = new StringBuilder("xmpp/writer/write/contact-ack; toJid=");
        sb.append(jid);
        sb.append("; msgId=");
        sb.append(str);
        sb.append("; isValid=");
        sb.append(z);
        Log.i(sb.toString());
    }

    public void A0c(Jid jid, byte[] bArr, long j) {
        C40581sV c40581sV = this.A00.A00;
        int i = c40581sV.A00 + 1;
        c40581sV.A00 = i;
        c40581sV.A0T(Integer.toHexString(i), "w", new C02590Ca("action", (C04P[]) null, new C02590Ca("location", new C04P[]{new C04P("type", "update", null, (byte) 0), new C04P("jid", jid), new C04P("elapsed", String.valueOf(j), null, (byte) 0)}, null, bArr)));
        Log.i("xmpp/writer/write/send-web-live-location-update");
    }

    public void A0d(C011005l c011005l) {
        final C40581sV c40581sV = this.A00.A00;
        int i = c40581sV.A00 + 1;
        c40581sV.A00 = i;
        String hexString = Integer.toHexString(i);
        c40581sV.A0c.put(hexString, new C0SF() { // from class: X.2Sc
            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                C02590Ca A0B = c02590Ca.A0B();
                C40581sV c40581sV2 = C40581sV.this;
                AbstractC000600i abstractC000600i = c40581sV2.A04;
                C011005l c011005l2 = (C011005l) c02590Ca.A08(C011005l.class, "from", abstractC000600i);
                if (c011005l2 != null) {
                    C0ES c0es = c40581sV2.A0B;
                    C04410Kb A0I = C40731sm.A0I(abstractC000600i, A0B, A0B.A0D("description"));
                    C05W c05w = c0es.A08;
                    C06C A08 = c05w.A08(c011005l2);
                    if (A08 != null) {
                        String str = A08.A0B.A02;
                        String str2 = A0I.A02;
                        if (!TextUtils.equals(str, str2)) {
                            Log.i("groupmgr/onGroupDescription/changed");
                            C06C A0A = c05w.A0A(c011005l2);
                            if (str2 != null) {
                                A0A.A0B = A0I;
                            }
                            c05w.A05.A0N(A0A);
                            c05w.A03.A00(A0A);
                            C0ES.A02(3006, c0es.A0g.A06(null, c011005l2, A0I));
                            return;
                        }
                        return;
                    }
                    Log.w("groupmgr/onGroupDescription/new group");
                }
            }
        });
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("id", hexString, null, (byte) 0), new C04P("xmlns", "w:g2", null, (byte) 0), new C04P("type", "get", null, (byte) 0), new C04P("to", c011005l)}, new C02590Ca("query", new C04P[]{new C04P("request", "description", null, (byte) 0)}, null, null)));
        StringBuilder sb = new StringBuilder("xmpp/writer/write/get-group-description; groupId=");
        sb.append(c011005l);
        Log.i(sb.toString());
    }

    public void A0e(C011005l c011005l, int i, C0TD c0td) {
        if (i > 0) {
            this.A00.A00.A0H(c011005l, "ephemeral", new C04P[]{new C04P("expiration", i)}, c0td, c0td, c0td.A04);
        } else {
            this.A00.A00.A0H(c011005l, "not_ephemeral", null, c0td, c0td, c0td.A04);
        }
        C000200d.A0q("xmpp/writer/set-ephemeral-setting; ephemeralDuration=", i);
    }

    public void A0f(C011005l c011005l, final String str) {
        final C40581sV c40581sV = this.A00.A00;
        int i = c40581sV.A00 + 1;
        c40581sV.A00 = i;
        String hexString = Integer.toHexString(i);
        c40581sV.A0c.put(hexString, new C0SF() { // from class: X.2Sd
            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                String str2;
                String str3;
                String str4;
                C02590Ca A0B = c02590Ca.A0B();
                C40581sV c40581sV2 = C40581sV.this;
                AbstractC000600i abstractC000600i = c40581sV2.A04;
                Jid A08 = c02590Ca.A08(Jid.class, "from", abstractC000600i);
                if (A08 != null) {
                    UserJid userJid = (UserJid) A0B.A08(UserJid.class, "creator", abstractC000600i);
                    C04P A0A = A0B.A0A("creation");
                    if (A0A != null) {
                        str2 = A0A.A03;
                    } else {
                        str2 = null;
                    }
                    long A03 = AnonymousClass024.A03(str2, 0L) * 1000;
                    C04P A0A2 = A0B.A0A("subject");
                    if (A0A2 != null) {
                        str3 = A0A2.A03;
                    } else {
                        str3 = null;
                    }
                    C04P A0A3 = A0B.A0A("s_t");
                    if (A0A3 != null) {
                        str4 = A0A3.A03;
                    } else {
                        str4 = null;
                    }
                    long A032 = 1000 * AnonymousClass024.A03(str4, 0L);
                    C04P A0A4 = A0B.A0A("type");
                    String str5 = A0A4 != null ? A0A4.A03 : null;
                    long A07 = A0B.A07("p_v_id", 0L);
                    long A072 = A0B.A07("a_v_id", 0L);
                    boolean z = A0B.A0D("locked") != null;
                    boolean z2 = A0B.A0D("announcement") != null;
                    boolean z3 = A0B.A0D("no_frequently_forwarded") != null;
                    boolean z4 = A0B.A0D("support") != null;
                    HashMap hashMap = new HashMap();
                    C40731sm.A0b(abstractC000600i, A0B, hashMap);
                    int A00 = C40731sm.A00(A0B);
                    C0ES c0es = c40581sV2.A0B;
                    C011005l A033 = C011005l.A03(A08);
                    C04410Kb A0I = C40731sm.A0I(abstractC000600i, A0B, A0B.A0D("description"));
                    String str6 = str;
                    c0es.A0H(A033, userJid, A03, str3, A032, str5, A07, A072, hashMap, A0I, z4, z, z2, z3, A00);
                    c0es.A0h.A00.A01(A033);
                    if (c0es.A0b.A04() && "phash".equals(str6)) {
                        c0es.A0B.A02((UserJid[]) hashMap.keySet().toArray(new UserJid[0]), 1);
                        return;
                    }
                    return;
                }
                throw null;
            }
        });
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("id", hexString, null, (byte) 0), new C04P("xmlns", "w:g2", null, (byte) 0), new C04P("type", "get", null, (byte) 0), new C04P("to", c011005l)}, new C02590Ca("query", str == null ? null : new C04P[]{new C04P("request", str, null, (byte) 0)}, null, null)));
        StringBuilder sb = new StringBuilder("xmpp/writer/write/get-group-info; groupId=");
        sb.append(c011005l);
        sb.append("; context=");
        sb.append(str);
        Log.i(sb.toString());
    }

    public void A0g(C011005l c011005l, boolean z, C0TD c0td) {
        this.A00.A00.A0H(c011005l, z ? "announcement" : "not_announcement", null, c0td, c0td, c0td.A04);
        C000200d.A1C("xmpp/writer/set-announcements-only; announcementsEnabled=", z);
    }

    public void A0h(C011005l c011005l, boolean z, C0TD c0td) {
        this.A00.A00.A0H(c011005l, z ? "no_frequently_forwarded" : "frequently_forwarded_ok", null, c0td, c0td, c0td.A04);
        C000200d.A1C("xmpp/writer/set-no-frequently-forwarded; noFrequentlyForwarded=", z);
    }

    public void A0i(C011005l c011005l, boolean z, C0TD c0td) {
        this.A00.A00.A0H(c011005l, z ? "locked" : "unlocked", null, c0td, c0td, c0td.A04);
        C000200d.A1C("xmpp/writer/set-restrict-mode; restrictModeEnabled=", z);
    }

    public void A0j(UserJid userJid) {
        C40581sV c40581sV = this.A00.A00;
        int i = c40581sV.A00 + 1;
        c40581sV.A00 = i;
        c40581sV.A0R.A06(new C02590Ca("notification", new C04P[]{new C04P("id", Integer.toHexString(i), null, (byte) 0), new C04P("to", userJid), new C04P("type", "location", null, (byte) 0)}, new C02590Ca("encrypt", (C04P[]) null, new C02590Ca("deny", null, null, null))));
        Log.i("xmpp/writer/write/send-location-key-deny-notification");
    }

    public void A0k(UserJid userJid, AbstractC005302j abstractC005302j, String str, byte[] bArr, int i) {
        C40581sV c40581sV = this.A00.A00;
        int i2 = c40581sV.A00 + 1;
        c40581sV.A00 = i2;
        c40581sV.A0R.A06(new C02590Ca("notification", new C04P[]{new C04P("id", Integer.toHexString(i2), null, (byte) 0), new C04P("to", userJid), new C04P("type", "location", null, (byte) 0)}, new C02590Ca("location", C003101m.A0U(abstractC005302j) ? new C04P[]{new C04P("final", str, null, (byte) 0), new C04P("context", abstractC005302j)} : new C04P[]{new C04P("final", str, null, (byte) 0)}, new C02590Ca[]{new C02590Ca("request", new C04P[]{new C04P("retry", String.valueOf(i), null, (byte) 0)}, null, null), new C02590Ca("registration", null, null, bArr)}, null)));
        Log.i("xmpp/writer/write/send-final-live-location-retry-notification");
    }

    public void A0l(UserJid userJid, byte[] bArr, int i) {
        C40581sV c40581sV = this.A00.A00;
        int i2 = c40581sV.A00 + 1;
        c40581sV.A00 = i2;
        c40581sV.A0R.A06(new C02590Ca("notification", new C04P[]{new C04P("id", Integer.toHexString(i2), null, (byte) 0), new C04P("to", userJid), new C04P("type", "location", null, (byte) 0)}, new C02590Ca("encrypt", null, new C02590Ca[]{new C02590Ca("request", new C04P[]{new C04P("retry", String.valueOf(i), null, (byte) 0)}, null, null), new C02590Ca("registration", null, null, bArr)}, null)));
        Log.i("xmpp/writer/write/send-location-key-retry-notification");
    }

    public void A0m(final C0SE c0se) {
        AbstractC005302j abstractC005302j = c0se.A00;
        boolean z = c0se.A01;
        final C40581sV c40581sV = this.A00.A00;
        int i = c40581sV.A00 + 1;
        c40581sV.A00 = i;
        String hexString = Integer.toHexString(i);
        c40581sV.A0c.put(hexString, new C0SF() { // from class: X.2Se
            @Override // X.C0SF
            public void A00(int i2) {
                c0se.A00(i2);
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                int i2;
                String str;
                int i3 = 0;
                C02590Ca A0C = c02590Ca.A0C(0);
                if (A0C != null) {
                    C04P A0A = A0C.A0A("duration");
                    if (A0A != null && (str = A0A.A03) != null) {
                        i2 = Integer.parseInt(str);
                    } else {
                        i2 = 0;
                    }
                    C02590Ca A0C2 = A0C.A0C(0);
                    if (A0C2 != null) {
                        List<C02590Ca> A0H = A0C2.A0H("participant");
                        ArrayList arrayList = new ArrayList(A0H.size());
                        for (C02590Ca c02590Ca2 : A0H) {
                            arrayList.add(c02590Ca2.A08(UserJid.class, "jid", C40581sV.this.A04));
                        }
                        C40581sV c40581sV2 = C40581sV.this;
                        C41461tx c41461tx = c40581sV2.A0D;
                        C0SE c0se2 = c0se;
                        AbstractC005302j abstractC005302j2 = c0se2.A00;
                        if (c41461tx != null) {
                            StringBuilder A0T = C000200d.A0T("LocationSharingManager/onReceiveServerSharingList; jid=", abstractC005302j2, "; participants.size=");
                            A0T.append(arrayList.size());
                            Log.i(A0T.toString());
                            HashSet hashSet = new HashSet();
                            synchronized (c41461tx.A0S) {
                                Map A0C3 = c41461tx.A0C();
                                Map map = (Map) A0C3.get(abstractC005302j2);
                                if (map != null) {
                                    hashSet.addAll(map.keySet());
                                    hashSet.removeAll(arrayList);
                                    HashSet hashSet2 = new HashSet();
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        UserJid userJid = (UserJid) it.next();
                                        c41461tx.A0W((C21O) map.remove(userJid));
                                        hashSet2.add(userJid);
                                    }
                                    c41461tx.A0O.A08(false, abstractC005302j2, hashSet2);
                                    if (map.isEmpty()) {
                                        A0C3.remove(abstractC005302j2);
                                    }
                                    if (!hashSet.isEmpty()) {
                                        c41461tx.A0d(A0C3);
                                    }
                                }
                            }
                            Iterator it2 = hashSet.iterator();
                            while (it2.hasNext()) {
                                UserJid userJid2 = (UserJid) it2.next();
                                for (InterfaceC453921s interfaceC453921s : c41461tx.A0Y) {
                                    interfaceC453921s.ANg(abstractC005302j2, userJid2);
                                }
                            }
                            if (!hashSet.isEmpty()) {
                                c41461tx.A0N();
                            }
                            c0se2.A01(i2 * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
                            for (C02590Ca c02590Ca3 : A0H) {
                                UserJid userJid3 = (UserJid) c02590Ca3.A08(UserJid.class, "jid", c40581sV2.A04);
                                C02590Ca A0C4 = c02590Ca3.A0C(0);
                                if (A0C4 != null) {
                                    c40581sV2.A0J(userJid3, A0C4);
                                }
                            }
                        } else {
                            throw null;
                        }
                    }
                    i3 = i2;
                }
                c0se.A02(i3 * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
            }
        });
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("id", hexString, null, (byte) 0), new C04P("xmlns", "location", null, (byte) 0), new C04P("type", "get", null, (byte) 0), new C04P("to", abstractC005302j)}, new C02590Ca("subscribe", z ? new C04P[]{new C04P("participants", "true", null, (byte) 0)} : null, null, null)));
        StringBuilder sb = new StringBuilder("xmpp/writer/write/subscribe-locations; groupId=");
        sb.append(abstractC005302j);
        sb.append("; needParticipants=");
        C000200d.A1V(sb, z);
    }

    public void A0n(final C0Z5 c0z5) {
        String hexString;
        AbstractC005302j abstractC005302j = c0z5.A00;
        C40581sV c40581sV = this.A00.A00;
        C04500Kk c04500Kk = c0z5.A01;
        if (c04500Kk != null) {
            hexString = c04500Kk.A01;
        } else {
            int i = c40581sV.A00 + 1;
            c40581sV.A00 = i;
            hexString = Integer.toHexString(i);
        }
        c40581sV.A0c.put(hexString, new C0SF() { // from class: X.2Sf
            @Override // X.C0SF
            public void A00(int i2) {
                C0I3 c0i3 = c0z5;
                if (c0i3 != null) {
                    c0i3.ARv(i2);
                }
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                Runnable runnable = c0z5;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        C02590Ca c02590Ca = new C02590Ca("unsubscribe", null, null, null);
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(new C04P("id", hexString, null, (byte) 0));
        arrayList.add(new C04P("xmlns", "location", null, (byte) 0));
        arrayList.add(new C04P("type", "get", null, (byte) 0));
        arrayList.add(new C04P("to", abstractC005302j));
        if (c04500Kk != null) {
            arrayList.add(new C04P("web", c04500Kk.A00, null, (byte) 0));
        }
        c40581sV.A0R.A06(new C02590Ca("iq", (C04P[]) arrayList.toArray(C40581sV.A0f), c02590Ca));
        StringBuilder sb = new StringBuilder("xmpp/writer/write/unsubscribe-locations; groupId=");
        sb.append(abstractC005302j);
        Log.i(sb.toString());
    }

    public void A0o(final RunnableC05900Qr runnableC05900Qr) {
        C02590Ca c02590Ca;
        if (!((AbstractC05910Qs) runnableC05900Qr).A01) {
            C40581sV c40581sV = this.A00.A00;
            C0I1 c0i1 = runnableC05900Qr.A01;
            int i = c40581sV.A00 + 1;
            c40581sV.A00 = i;
            String hexString = Integer.toHexString(i);
            c40581sV.A0c.put(hexString, new C0SF() { // from class: X.2Sg
                @Override // X.C0SF
                public void A00(int i2) {
                    C0I3 c0i3 = runnableC05900Qr;
                    if (c0i3 != null) {
                        c0i3.ARv(i2);
                    }
                }

                @Override // X.C0SF
                public void A03(C02590Ca c02590Ca2) {
                    Runnable runnable = runnableC05900Qr;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            });
            if (c0i1 != null) {
                c02590Ca = new C02590Ca("list", new C04P[]{new C04P("id", c0i1)}, null, null);
            } else {
                c02590Ca = null;
            }
            c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("id", hexString, null, (byte) 0), new C04P("xmlns", "w:b", null, (byte) 0), new C04P("type", "set", null, (byte) 0), new C04P("to", C04260Jm.A00)}, new C02590Ca("delete", (C04P[]) null, c02590Ca)));
            StringBuilder sb = new StringBuilder("xmpp/writer/write/delete-broadcast-list; listId=");
            sb.append(runnableC05900Qr.A01);
            Log.i(sb.toString());
            return;
        }
        StringBuilder A0P = C000200d.A0P("xmpp/writer/write/delete-broadcast-list/timeout; listId=");
        A0P.append(runnableC05900Qr.A01);
        Log.e(A0P.toString());
    }

    public void A0p(C0ZK c0zk) {
        C02590Ca[] c02590CaArr;
        Jid jid;
        byte b;
        C02590Ca c02590Ca;
        final String str = c0zk.A01;
        final String str2 = c0zk.A00;
        final C40581sV c40581sV = this.A00.A00;
        List list = c0zk.A02;
        int i = c40581sV.A00 + 1;
        c40581sV.A00 = i;
        String hexString = Integer.toHexString(i);
        c40581sV.A0c.put(hexString, new C0SF() { // from class: X.2Sh
            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca2) {
                if (C40581sV.this.A0G != null) {
                    Log.i("xmpp/reader/read/client_config_set");
                    return;
                }
                throw null;
            }
        });
        char c = 0;
        int i2 = 2;
        if (list == null || list.size() == 0) {
            c02590CaArr = null;
        } else {
            c02590CaArr = new C02590Ca[list.size()];
            int i3 = 0;
            while (i3 < list.size()) {
                C03470Fv c03470Fv = (C03470Fv) list.get(i3);
                C04P[] c04pArr = new C04P[i2];
                c04pArr[c] = new C04P("jid", c03470Fv.A01);
                Long l = c03470Fv.A00;
                if (l == null) {
                    long longValue = c03470Fv.A02.longValue();
                    l = Long.valueOf(longValue != -1 ? TimeUnit.MILLISECONDS.toSeconds(longValue) : -1L);
                    c03470Fv.A00 = l;
                }
                c04pArr[1] = new C04P("mute", l.longValue());
                c02590CaArr[i3] = new C02590Ca("item", c04pArr, null, null);
                i3++;
                c = 0;
                i2 = 2;
            }
        }
        if (c02590CaArr != null) {
            C04P[] c04pArr2 = new C04P[i2];
            jid = null;
            b = 0;
            c04pArr2[0] = new C04P("id", str, null, (byte) 0);
            c04pArr2[1] = new C04P("platform", str2, null, (byte) 0);
            c02590Ca = new C02590Ca("config", c04pArr2, c02590CaArr, null);
        } else {
            jid = null;
            b = 0;
            C04P[] c04pArr3 = new C04P[i2];
            c04pArr3[0] = new C04P("id", str, null, (byte) 0);
            c04pArr3[1] = new C04P("platform", str2, null, (byte) 0);
            c02590Ca = new C02590Ca("config", c04pArr3, null, null);
        }
        C04P[] c04pArr4 = new C04P[4];
        c04pArr4[b] = new C04P("id", hexString, jid, b);
        c04pArr4[1] = new C04P("xmlns", "urn:xmpp:whatsapp:push", jid, b);
        c04pArr4[2] = new C04P("type", "set", jid, b);
        c04pArr4[3] = new C04P("to", C04260Jm.A00);
        c40581sV.A0R.A06(new C02590Ca("iq", c04pArr4, c02590Ca));
        StringBuilder sb = new StringBuilder("xmpp/writer/write/client-config; pushId=");
        sb.append(str);
        sb.append("; platform=");
        C000200d.A1N(sb, str2);
    }

    public void A0q(C0Z1 c0z1) {
        AnonymousClass094 anonymousClass094 = c0z1.A04;
        C40581sV c40581sV = this.A00.A00;
        AbstractC005302j abstractC005302j = c0z1.A02;
        c40581sV.A0K(anonymousClass094, c0z1.A05, abstractC005302j, c0z1.A03, null, c0z1.A01, c0z1.A00);
        StringBuilder A0P = C000200d.A0P("xmpp/writer/write/messages-read; message.key=");
        A0P.append(anonymousClass094);
        A0P.append(" participant=");
        A0P.append(abstractC005302j);
        A0P.append(" extraIds=");
        C000200d.A1N(A0P, Arrays.deepToString(c0z1.A01));
    }

    public void A0r(C0Mz c0Mz) {
        C02590Ca c02590Ca;
        String str = c0Mz.A00;
        final C40581sV c40581sV = this.A00.A00;
        List list = c0Mz.A01;
        int i = 1;
        int i2 = c40581sV.A00 + 1;
        c40581sV.A00 = i2;
        String hexString = Integer.toHexString(i2);
        c40581sV.A0c.put(hexString, new C0SF() { // from class: X.2Si
            @Override // X.C0SF
            public void A00(int i3) {
                C000200d.A0r("change number failed; code=", i3);
                C467628d c467628d = C40581sV.this.A0G;
                if (c467628d != null) {
                    C000200d.A0q("xmpp/reader/on-change-number-error = ", i3);
                    ((HandlerC467828f) c467628d.A00).A00(Message.obtain(null, 0, 201, i3));
                    return;
                }
                throw null;
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca2) {
                Log.i("change number succeeded");
                C02590Ca.A01(c02590Ca2.A0C(0), "modify");
                C467628d c467628d = C40581sV.this.A0G;
                if (c467628d != null) {
                    Log.i("xmpp/reader/on-change-number-success");
                    ((HandlerC467828f) c467628d.A00).A00(Message.obtain(null, 0, 200, 0));
                    return;
                }
                throw null;
            }
        });
        C02590Ca c02590Ca2 = new C02590Ca("username", (C04P[]) null, str);
        if (list != null && list.size() > 0) {
            C02590Ca[] c02590CaArr = new C02590Ca[list.size()];
            int i3 = 0;
            while (i3 < list.size()) {
                C04P[] c04pArr = new C04P[i];
                c04pArr[0] = new C04P("jid", (Jid) list.get(i3));
                c02590CaArr[i3] = new C02590Ca("user", c04pArr, null, null);
                i3++;
                i = 1;
            }
            c02590Ca = new C02590Ca("modify", null, new C02590Ca[]{c02590Ca2, new C02590Ca("notify", null, c02590CaArr, null)}, null);
        } else {
            c02590Ca = new C02590Ca("modify", (C04P[]) null, c02590Ca2);
        }
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("id", hexString, null, (byte) 0), new C04P("xmlns", "urn:xmpp:whatsapp:account", null, (byte) 0), new C04P("type", "get", null, (byte) 0), new C04P("to", C04260Jm.A00)}, c02590Ca));
        C000200d.A1N(new StringBuilder("xmpp/writer/write/change-number; oldChatUserId="), str);
    }

    public void A0s(C0ZG c0zg) {
        String str = c0zg.A00;
        String str2 = c0zg.A01;
        final C40581sV c40581sV = this.A00.A00;
        int i = c40581sV.A00 + 1;
        c40581sV.A00 = i;
        String hexString = Integer.toHexString(i);
        c40581sV.A0c.put(hexString, new C0SF() { // from class: X.2Sj
            @Override // X.C0SF
            public void A00(int i2) {
                C467628d c467628d = C40581sV.this.A0G;
                if (c467628d != null) {
                    C000200d.A0q("xmpp/reader/on-number-normalization-error = ", i2);
                    ((HandlerC467828f) c467628d.A00).A00(Message.obtain(null, 0, 199, i2));
                    return;
                }
                throw null;
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                String str3;
                C02590Ca A0C = c02590Ca.A0C(0);
                C02590Ca.A01(A0C, "normalize");
                C04P A0A = A0C.A0A("result");
                if (A0A != null) {
                    str3 = A0A.A03;
                } else {
                    str3 = null;
                }
                C467628d c467628d = C40581sV.this.A0G;
                if (c467628d != null) {
                    C000200d.A14("xmpp/reader/on-number-normalized = ", str3);
                    ((HandlerC467828f) c467628d.A00).A00(Message.obtain(null, 0, 198, 0, str3));
                    return;
                }
                throw null;
            }
        });
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("to", C04260Jm.A00), new C04P("xmlns", "urn:xmpp:whatsapp:account", null, (byte) 0), new C04P("type", "get", null, (byte) 0), new C04P("id", hexString, null, (byte) 0)}, new C02590Ca("normalize", null, new C02590Ca[]{new C02590Ca("cc", (C04P[]) null, str), new C02590Ca("in", (C04P[]) null, str2)}, null)));
        StringBuilder sb = new StringBuilder("xmpp/writer/write/get-normalized-jid; countryCode=");
        sb.append(c0zg.A00);
        sb.append("; phoneNumber=");
        C000200d.A1N(sb, c0zg.A01);
    }

    public void A0t(C07570Yt c07570Yt) {
        HashMap hashMap = new HashMap();
        String str = c07570Yt.A04;
        long j = c07570Yt.A00;
        Jid jid = c07570Yt.A02;
        Jid jid2 = c07570Yt.A01;
        String str2 = c07570Yt.A05;
        String str3 = c07570Yt.A03;
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("error", new C04P("error", str3, null, (byte) 0));
        }
        this.A00.A00.A0N(new C04420Kc(jid, "message", str, str2, null, jid2, null, null, j, hashMap.isEmpty() ? null : new ArrayList(hashMap.values())));
        Log.i("xmpp/writer/write/send-message-ack");
    }

    public void A0u(C07570Yt c07570Yt) {
        HashMap hashMap = new HashMap();
        Jid jid = c07570Yt.A02;
        Jid jid2 = c07570Yt.A01;
        C04420Kc c04420Kc = new C04420Kc(jid, "notification", c07570Yt.A04, c07570Yt.A05, null, jid2, null, null, c07570Yt.A00, hashMap.isEmpty() ? null : new ArrayList(hashMap.values()));
        this.A00.A00.A0N(c04420Kc);
        StringBuilder sb = new StringBuilder("xmpp/writer/write/notification-received; stanzaKey=");
        sb.append(c04420Kc);
        Log.i(sb.toString());
    }

    public void A0v(C010905k c010905k) {
        final C40581sV c40581sV = this.A00.A00;
        final byte[] bArr = c010905k.A01;
        final byte[] bArr2 = c010905k.A02;
        final Runnable runnable = c010905k.A00;
        int i = c40581sV.A00 + 1;
        c40581sV.A00 = i;
        String hexString = Integer.toHexString(i);
        c40581sV.A0c.put(hexString, new C0SF() { // from class: X.2Sk
            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                String str;
                C02590Ca A0C = c02590Ca.A0C(0);
                if (A0C != null) {
                    C02590Ca.A01(A0C, "crypto");
                    C04P A0A = A0C.A0A("version");
                    if (A0A != null) {
                        str = A0A.A03;
                    } else {
                        str = null;
                    }
                    byte[] bArr3 = A0C.A0E("code").A01;
                    byte[] bArr4 = A0C.A0E("password").A01;
                    C467628d c467628d = C40581sV.this.A0G;
                    byte[] bArr5 = bArr;
                    byte[] bArr6 = bArr2;
                    Runnable runnable2 = runnable;
                    if (c467628d != null) {
                        Log.i("xmpp/reader/read/create-cipher-key");
                        ((HandlerC467828f) c467628d.A00).A00(Message.obtain(null, 0, 66, 0, new C2EI(str, bArr3, bArr4, bArr5, bArr6, runnable2)));
                        return;
                    }
                    throw null;
                }
                throw null;
            }
        });
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("to", C04260Jm.A00), new C04P("xmlns", "urn:xmpp:whatsapp:account", null, (byte) 0), new C04P("type", "get", null, (byte) 0), new C04P("id", hexString, null, (byte) 0)}, new C02590Ca("crypto", new C04P[]{new C04P("action", "create", null, (byte) 0)}, new C02590Ca[]{new C02590Ca("google", null, null, bArr)}, null)));
        Log.i("xmpp/writer/write/create-cipher-key");
    }

    public void A0w(C07520Yn c07520Yn) {
        String str;
        C40581sV c40581sV = this.A00.A00;
        String str2 = c07520Yn.A02;
        final Runnable runnable = c07520Yn.A01;
        final C0I3 c0i3 = c07520Yn.A00;
        if (str2 == null) {
            int i = c40581sV.A00 + 1;
            c40581sV.A00 = i;
            str = Integer.toHexString(i);
        } else {
            str = str2;
        }
        c40581sV.A0c.put(str2, new C0SF() { // from class: X.2Sl
            @Override // X.C0SF
            public void A00(int i2) {
                c0i3.ARv(i2);
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                runnable.run();
            }
        });
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("to", C04260Jm.A00), new C04P("xmlns", "urn:xmpp:whatsapp:account", null, (byte) 0), new C04P("type", "get", null, (byte) 0), new C04P("id", str, null, (byte) 0)}, new C02590Ca("gdpr", new C04P[]{new C04P("action", "delete", null, (byte) 0)}, null, null)));
        Log.i("xmpp/writer/write/delete-gdpr-report");
    }

    public void A0x(C0S3 c0s3) {
        C40581sV c40581sV = this.A00.A00;
        String str = c0s3.A01;
        byte[] bArr = c0s3.A02;
        final Runnable runnable = c0s3.A00;
        if (c40581sV != null) {
            String l = Long.toString(System.currentTimeMillis() / 1000);
            c40581sV.A0c.put(str, new C0SF() { // from class: X.2Sm
                @Override // X.C0SF
                public void A00(int i) {
                }

                @Override // X.C0SF
                public void A03(C02590Ca c02590Ca) {
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }

                @Override // X.C0SF
                public void A04(Exception exc) {
                }
            });
            c40581sV.A0R.A07(new C02590Ca("iq", new C04P[]{new C04P("id", str, null, (byte) 0), new C04P("xmlns", "w:stats", null, (byte) 0), new C04P("type", "set", null, (byte) 0), new C04P("to", C04260Jm.A00)}, new C02590Ca("add", new C04P[]{new C04P("t", l, null, (byte) 0)}, null, bArr)), 3);
            StringBuilder sb = new StringBuilder("xmpp/writer/write/field-stats; sendFieldStats=");
            sb.append(c0s3);
            Log.i(sb.toString());
            return;
        }
        throw null;
    }

    public void A0y(C0QZ c0qz) {
        final C40581sV c40581sV = this.A00.A00;
        final String str = c0qz.A01;
        final byte[] bArr = c0qz.A03;
        final byte[] bArr2 = c0qz.A02;
        final Runnable runnable = c0qz.A00;
        int i = c40581sV.A00 + 1;
        c40581sV.A00 = i;
        String hexString = Integer.toHexString(i);
        c40581sV.A0c.put(hexString, new C0SF() { // from class: X.2Sn
            @Override // X.C0SF
            public void A00(int i2) {
                C467628d c467628d = C40581sV.this.A0G;
                String str2 = str;
                byte[] bArr3 = bArr;
                byte[] bArr4 = bArr2;
                Runnable runnable2 = runnable;
                Log.i("xmpp/reader/read/get-cipher-key");
                ((HandlerC467828f) c467628d.A00).A00(Message.obtain(null, 0, 67, 0, new C2EH(i2, null, str2, bArr3, bArr4, runnable2)));
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                C02590Ca A0C = c02590Ca.A0C(0);
                if (A0C != null) {
                    C02590Ca.A01(A0C, "crypto");
                    byte[] bArr3 = A0C.A0E("password").A01;
                    C467628d c467628d = C40581sV.this.A0G;
                    String str2 = str;
                    byte[] bArr4 = bArr;
                    byte[] bArr5 = bArr2;
                    Runnable runnable2 = runnable;
                    Log.i("xmpp/reader/read/get-cipher-key");
                    ((HandlerC467828f) c467628d.A00).A00(Message.obtain(null, 0, 67, 0, new C2EH(0, bArr3, str2, bArr4, bArr5, runnable2)));
                    return;
                }
                throw null;
            }
        });
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("to", C04260Jm.A00), new C04P("xmlns", "urn:xmpp:whatsapp:account", null, (byte) 0), new C04P("type", "get", null, (byte) 0), new C04P("id", hexString, null, (byte) 0)}, new C02590Ca("crypto", new C04P[]{new C04P("action", "get", null, (byte) 0), new C04P("version", str, null, (byte) 0)}, new C02590Ca[]{new C02590Ca("google", null, null, bArr2), new C02590Ca("code", null, null, bArr)}, null)));
        Log.i("xmpp/writer/write/get-cipher-key");
    }

    public void A0z(C07530Yo c07530Yo) {
        String str;
        final C40581sV c40581sV = this.A00.A00;
        String str2 = c07530Yo.A01;
        final InterfaceC07680Zg interfaceC07680Zg = c07530Yo.A00;
        if (str2 == null) {
            int i = c40581sV.A00 + 1;
            c40581sV.A00 = i;
            str = Integer.toHexString(i);
        } else {
            str = str2;
        }
        c40581sV.A0c.put(str2, new C0SF() { // from class: X.2So
            @Override // X.C0SF
            public void A00(int i2) {
                C80063mf c80063mf = (C80063mf) interfaceC07680Zg;
                if (i2 == 404) {
                    ReportActivity reportActivity = c80063mf.A00;
                    if (reportActivity.A0O.A02() == 1) {
                        reportActivity.A0O.A05();
                        return;
                    }
                    return;
                }
                C000200d.A0p("send-get-gdpr-report/failed/error ", i2);
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                C02590Ca A0D = c02590Ca.A0D("gdpr");
                if (A0D != null) {
                    C02590Ca A0D2 = A0D.A0D("document");
                    if (A0D2 != null) {
                        InterfaceC07680Zg interfaceC07680Zg2 = interfaceC07680Zg;
                        long A07 = A0D2.A07("creation", 0L) * 1000;
                        byte[] bArr = A0D2.A01;
                        long A072 = A0D2.A07("expiration", (C40581sV.this.A07.A05() + 2592000000L) / 1000) * 1000;
                        ReportActivity reportActivity = ((C80063mf) interfaceC07680Zg2).A00;
                        if (reportActivity.A0O.A02() < 3) {
                            reportActivity.A0O.A08(A07, bArr, A072);
                            return;
                        }
                        return;
                    }
                    ((C80063mf) interfaceC07680Zg).A00.A0O.A07(A0D.A07("timestamp", 0L) * 1000);
                    return;
                }
                C000200d.A0p("send-get-gdpr-report/failed/error ", 0);
            }
        });
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("to", C04260Jm.A00), new C04P("xmlns", "urn:xmpp:whatsapp:account", null, (byte) 0), new C04P("type", "get", null, (byte) 0), new C04P("id", str, null, (byte) 0)}, new C02590Ca("gdpr", new C04P[]{new C04P("action", "status", null, (byte) 0)}, null, null)));
        Log.i("xmpp/writer/write/get-gdpr-report");
    }

    public void A10(C07600Yy c07600Yy) {
        String str = c07600Yy.A01;
        final C40581sV c40581sV = this.A00.A00;
        String str2 = c07600Yy.A02;
        final InterfaceC07690Zh interfaceC07690Zh = c07600Yy.A00;
        c40581sV.A0c.put(str2, new C0SF() { // from class: X.2Sp
            @Override // X.C0SF
            public void A00(int i) {
                interfaceC07690Zh.AJp(i);
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                String str3;
                String str4;
                String str5;
                String str6;
                String str7;
                String str8;
                C02590Ca A0B = c02590Ca.A0B();
                C40581sV c40581sV2 = C40581sV.this;
                AbstractC000600i abstractC000600i = c40581sV2.A04;
                UserJid userJid = (UserJid) A0B.A08(UserJid.class, "creator", abstractC000600i);
                C04P A0A = A0B.A0A("creation");
                if (A0A != null) {
                    str3 = A0A.A03;
                } else {
                    str3 = null;
                }
                long A03 = AnonymousClass024.A03(str3, 0L) * 1000;
                C04P A0A2 = A0B.A0A("subject");
                if (A0A2 != null) {
                    str4 = A0A2.A03;
                } else {
                    str4 = null;
                }
                C04P A0A3 = A0B.A0A("s_t");
                if (A0A3 != null) {
                    str5 = A0A3.A03;
                } else {
                    str5 = null;
                }
                long A032 = AnonymousClass024.A03(str5, 0L) * 1000;
                C04P A0A4 = A0B.A0A("id");
                if (A0A4 != null && (str6 = A0A4.A03) != null) {
                    try {
                        C011005l A05 = C003101m.A05(str6);
                        C04P A0A5 = A0B.A0A("type");
                        if (A0A5 != null) {
                            str7 = A0A5.A03;
                        } else {
                            str7 = null;
                        }
                        HashMap hashMap = new HashMap();
                        C40731sm.A0b(abstractC000600i, A0B, hashMap);
                        C04P A0A6 = A0B.A0A("size");
                        if (A0A6 != null) {
                            str8 = A0A6.A03;
                        } else {
                            str8 = null;
                        }
                        interfaceC07690Zh.AKt(A05, userJid, A03, str4, A032, str7, hashMap, AnonymousClass024.A01(str8, hashMap.size()), C40731sm.A0I(abstractC000600i, A0B, A0B.A0D("description")));
                        return;
                    } catch (C011305p e) {
                        interfaceC07690Zh.AJp(800);
                        if (c40581sV2 != null) {
                            Log.e("Connection/handleInvalidJidReceived", e);
                            abstractC000600i.A09("Connection/handleInvalidJidReceived", "invalid-jid-received", true);
                            return;
                        }
                        throw null;
                    }
                }
                interfaceC07690Zh.AJp(500);
            }
        });
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("id", str2, null, (byte) 0), new C04P("xmlns", "w:g2", null, (byte) 0), new C04P("type", "get", null, (byte) 0), new C04P("to", C0N9.A00)}, new C02590Ca("invite", new C04P[]{new C04P("code", str, null, (byte) 0)}, null, null)));
        C000200d.A1N(new StringBuilder("xmpp/writer/write/get-group-info-by-code-iq; code="), c07600Yy.A01);
    }

    public void A11(C07490Yk c07490Yk) {
        final C40581sV c40581sV = this.A00.A00;
        String str = c07490Yk.A02;
        C07700Zi c07700Zi = c07490Yk.A01;
        final InterfaceC07690Zh interfaceC07690Zh = c07490Yk.A00;
        c40581sV.A0c.put(str, new C0SF() { // from class: X.2Sq
            @Override // X.C0SF
            public void A00(int i) {
                interfaceC07690Zh.AJp(i);
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                String str7;
                C02590Ca A0B = c02590Ca.A0B();
                C40581sV c40581sV2 = C40581sV.this;
                AbstractC000600i abstractC000600i = c40581sV2.A04;
                UserJid userJid = (UserJid) A0B.A08(UserJid.class, "creator", abstractC000600i);
                C04P A0A = A0B.A0A("creation");
                if (A0A != null) {
                    str2 = A0A.A03;
                } else {
                    str2 = null;
                }
                long A03 = AnonymousClass024.A03(str2, 0L) * 1000;
                C04P A0A2 = A0B.A0A("subject");
                if (A0A2 != null) {
                    str3 = A0A2.A03;
                } else {
                    str3 = null;
                }
                C04P A0A3 = A0B.A0A("s_t");
                if (A0A3 != null) {
                    str4 = A0A3.A03;
                } else {
                    str4 = null;
                }
                long A032 = AnonymousClass024.A03(str4, 0L) * 1000;
                try {
                    C04P A0A4 = A0B.A0A("id");
                    if (A0A4 != null && (str5 = A0A4.A03) != null) {
                        C011005l A05 = C003101m.A05(str5);
                        C04P A0A5 = A0B.A0A("type");
                        if (A0A5 != null) {
                            str6 = A0A5.A03;
                        } else {
                            str6 = null;
                        }
                        HashMap hashMap = new HashMap();
                        C40731sm.A0b(abstractC000600i, A0B, hashMap);
                        C04P A0A6 = A0B.A0A("size");
                        if (A0A6 != null) {
                            str7 = A0A6.A03;
                        } else {
                            str7 = null;
                        }
                        interfaceC07690Zh.AKt(A05, userJid, A03, str3, A032, str6, hashMap, AnonymousClass024.A01(str7, hashMap.size()), C40731sm.A0I(abstractC000600i, A0B, A0B.A0D("description")));
                        return;
                    }
                    throw null;
                } catch (C011305p e) {
                    interfaceC07690Zh.AJp(800);
                    if (c40581sV2 != null) {
                        Log.e("Connection/handleInvalidJidReceived", e);
                        abstractC000600i.A09("Connection/handleInvalidJidReceived", "invalid-jid-received", true);
                        return;
                    }
                    throw null;
                }
            }
        });
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("id", str, null, (byte) 0), new C04P("xmlns", "w:g2", null, (byte) 0), new C04P("type", "get", null, (byte) 0), new C04P("to", c07700Zi.A01)}, new C02590Ca("query", (C04P[]) null, new C02590Ca("add_request", new C04P[]{new C04P("code", c07700Zi.A03, null, (byte) 0), new C04P("expiration", Long.toString(c07700Zi.A00), null, (byte) 0), new C04P("admin", c07700Zi.A02)}, null, null))));
        Log.i("xmpp/writer/write/get-group-info-by-add-request-code-iq; code=");
    }

    public void A12(C0Yw c0Yw) {
        String str = c0Yw.A02;
        C40581sV c40581sV = this.A00.A00;
        String str2 = c0Yw.A03;
        final C011005l c011005l = c0Yw.A00;
        final InterfaceC06360St interfaceC06360St = c0Yw.A01;
        if (c40581sV != null) {
            c40581sV.A0c.put(str2, new C0SF() { // from class: X.2Sr
                @Override // X.C0SF
                public void A00(int i) {
                    InterfaceC06360St.this.AJp(i);
                }

                @Override // X.C0SF
                public void A03(C02590Ca c02590Ca) {
                    String str3;
                    String str4;
                    C02590Ca A0E = c02590Ca.A0E("picture");
                    C04P A0A = A0E.A0A("id");
                    if (A0A != null) {
                        str3 = A0A.A03;
                    } else {
                        str3 = null;
                    }
                    C04P A0A2 = A0E.A0A("type");
                    if (A0A2 != null) {
                        str4 = A0A2.A03;
                    } else {
                        str4 = null;
                    }
                    C04P A0A3 = A0E.A0A("url");
                    InterfaceC06360St.this.AKu(c011005l, str3, str4, A0A3 != null ? A0A3.A03 : null, A0E.A01);
                }
            });
            c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("id", str2, null, (byte) 0), new C04P("xmlns", "w:profile:picture", null, (byte) 0), new C04P("to", C0N9.A00), new C04P("type", "get", null, (byte) 0)}, new C02590Ca("picture", new C04P[]{new C04P("invite", str, null, (byte) 0)}, null, null)));
            C000200d.A1N(new StringBuilder("xmpp/writer/write/get-group-photo-by-code-iq; code="), c0Yw.A02);
            return;
        }
        throw null;
    }

    public void A13(C07460Yh c07460Yh) {
        C40581sV c40581sV = this.A00.A00;
        String str = c07460Yh.A02;
        final C07700Zi c07700Zi = c07460Yh.A01;
        final InterfaceC06360St interfaceC06360St = c07460Yh.A00;
        c40581sV.A0c.put(str, new C0SF() { // from class: X.2Ss
            @Override // X.C0SF
            public void A00(int i) {
                InterfaceC06360St.this.AJp(i);
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                String str2;
                String str3;
                C02590Ca A0E = c02590Ca.A0E("picture");
                C04P A0A = A0E.A0A("id");
                if (A0A != null) {
                    str2 = A0A.A03;
                } else {
                    str2 = null;
                }
                C04P A0A2 = A0E.A0A("type");
                if (A0A2 != null) {
                    str3 = A0A2.A03;
                } else {
                    str3 = null;
                }
                C04P A0A3 = A0E.A0A("url");
                InterfaceC06360St.this.AKu(c07700Zi.A01, str2, str3, A0A3 != null ? A0A3.A03 : null, A0E.A01);
            }
        });
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("id", str, null, (byte) 0), new C04P("xmlns", "w:profile:picture", null, (byte) 0), new C04P("to", c07700Zi.A01), new C04P("type", "get", null, (byte) 0)}, new C02590Ca("picture", (C04P[]) null, new C02590Ca("add_request", new C04P[]{new C04P("code", c07700Zi.A03, null, (byte) 0), new C04P("expiration", Long.toString(c07700Zi.A00), null, (byte) 0), new C04P("admin", c07700Zi.A02)}, null, null))));
    }

    public void A14(C0Yv c0Yv) {
        final C40581sV c40581sV = this.A00.A00;
        String str = c0Yv.A01;
        final C0Zp c0Zp = c0Yv.A00;
        if (str == null) {
            int i = c40581sV.A00 + 1;
            c40581sV.A00 = i;
            str = Integer.toHexString(i);
        }
        c40581sV.A0c.put(str, new C0SF() { // from class: X.2Sw
            @Override // X.C0SF
            public void A00(int i2) {
                C3DY c3dy = (C3DY) c0Zp;
                if (c3dy != null) {
                    if (i2 != 404) {
                        StringBuilder A0P = C000200d.A0P("error in response while running get status privacy job");
                        A0P.append(c3dy.A00.A07());
                        A0P.append("; code=");
                        A0P.append(i2);
                        Log.e(A0P.toString());
                    } else {
                        StringBuilder A0P2 = C000200d.A0P("get status privacy job response is 'no settings found on server'");
                        A0P2.append(c3dy.A00.A07());
                        Log.i(A0P2.toString());
                    }
                    c3dy.A01.set(i2);
                    return;
                }
                throw null;
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                String str2;
                String str3;
                ArrayList arrayList = null;
                ArrayList arrayList2 = null;
                loop0: while (true) {
                    int i2 = 0;
                    for (C02590Ca c02590Ca2 : c02590Ca.A0E("privacy").A0H("list")) {
                        List<C02590Ca> A0H = c02590Ca2.A0H("user");
                        ArrayList arrayList3 = new ArrayList(A0H.size());
                        for (C02590Ca c02590Ca3 : A0H) {
                            arrayList3.add(c02590Ca3.A08(UserJid.class, "jid", C40581sV.this.A04));
                        }
                        C04P A0A = c02590Ca2.A0A("type");
                        if (A0A == null || (str2 = A0A.A03) == null) {
                            break loop0;
                        }
                        C04P A0A2 = c02590Ca2.A0A("default");
                        if (A0A2 != null) {
                            str3 = A0A2.A03;
                        } else {
                            str3 = null;
                        }
                        boolean equals = "true".equals(str3);
                        int hashCode = str2.hashCode();
                        if (hashCode != -1653850041) {
                            if (hashCode == -567451565) {
                                if (str2.equals("contacts") && equals) {
                                    break;
                                }
                            } else if (hashCode == 1333012765 && str2.equals("blacklist")) {
                                if (equals) {
                                    i2 = 2;
                                }
                                arrayList2 = arrayList3;
                            }
                        } else if (str2.equals("whitelist")) {
                            if (equals) {
                                i2 = 1;
                            }
                            arrayList = arrayList3;
                        }
                    }
                    C3DY c3dy = (C3DY) c0Zp;
                    if (c3dy != null) {
                        StringBuilder A0Q = C000200d.A0Q("get status privacy job response statusDistributionMode=", i2, "; whiteList=");
                        A0Q.append(arrayList == null ? "null" : TextUtils.join(",", arrayList));
                        A0Q.append("; blackList=");
                        C000200d.A1N(A0Q, arrayList2 != null ? TextUtils.join(",", arrayList2) : "null");
                        GetStatusPrivacyJob getStatusPrivacyJob = c3dy.A00;
                        if (getStatusPrivacyJob.A00.A0H()) {
                            return;
                        }
                        Log.i("save status privacy");
                        C0EB c0eb = getStatusPrivacyJob.A00;
                        c0eb.A03.A04("status_distribution", i2);
                        C05C c05c = c0eb.A03;
                        c05c.A06("status_black_list", arrayList2 == null ? "" : TextUtils.join(",", C003101m.A0d(arrayList2)));
                        c05c.A06("status_white_list", arrayList != null ? TextUtils.join(",", C003101m.A0d(arrayList)) : "");
                        return;
                    }
                    throw null;
                }
                throw new C0L4("status list type is null");
            }
        });
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("id", str, null, (byte) 0), new C04P("xmlns", "status", null, (byte) 0), new C04P("type", "get", null, (byte) 0), new C04P("to", C04260Jm.A00)}, new C02590Ca("privacy", null, null, null)));
        Log.i("xmpp/writer/write/send-get-status-privacy");
    }

    public void A15(C07590Yx c07590Yx) {
        String str = c07590Yx.A02;
        final C40581sV c40581sV = this.A00.A00;
        String str2 = c07590Yx.A03;
        final C0T9 c0t9 = c07590Yx.A00;
        final C0I3 c0i3 = c07590Yx.A01;
        c40581sV.A0c.put(str2, new C0SF() { // from class: X.2Sx
            @Override // X.C0SF
            public void A00(int i) {
                c0i3.ARv(i);
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                C02590Ca A0B = c02590Ca.A0B();
                C02590Ca.A01(A0B, "group");
                c0t9.ARw(A0B.A08(C011005l.class, "jid", C40581sV.this.A04));
            }
        });
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("id", str2, null, (byte) 0), new C04P("xmlns", "w:g2", null, (byte) 0), new C04P("type", "set", null, (byte) 0), new C04P("to", C0N9.A00)}, new C02590Ca("invite", new C04P[]{new C04P("code", str, null, (byte) 0)}, null, null)));
        C000200d.A1N(new StringBuilder("xmpp/writer/write/join-group-iq; code="), c07590Yx.A02);
    }

    public void A16(C07480Yj c07480Yj) {
        C40581sV c40581sV = this.A00.A00;
        String str = c07480Yj.A04;
        C07700Zi c07700Zi = c07480Yj.A03;
        final C0T9 c0t9 = c07480Yj.A00;
        final C0I3 c0i3 = c07480Yj.A01;
        C04500Kk c04500Kk = c07480Yj.A02;
        if (c40581sV != null) {
            final C011005l c011005l = c07700Zi.A01;
            c40581sV.A0c.put(str, new C0SF() { // from class: X.2Sy
                @Override // X.C0SF
                public void A00(int i) {
                    C0I3 c0i32 = c0i3;
                    if (c0i32 != null) {
                        c0i32.ARv(i);
                    }
                }

                @Override // X.C0SF
                public void A03(C02590Ca c02590Ca) {
                    C0T9 c0t92 = C0T9.this;
                    if (c0t92 != null) {
                        c0t92.ARw(c011005l);
                    }
                }
            });
            C02590Ca c02590Ca = new C02590Ca("accept", new C04P[]{new C04P("code", c07700Zi.A03, null, (byte) 0), new C04P("expiration", Long.toString(c07700Zi.A00), null, (byte) 0), new C04P("admin", c07700Zi.A02)}, null, null);
            C04P[] c04pArr = new C04P[c04500Kk == null ? 4 : 5];
            c04pArr[0] = new C04P("id", str, null, (byte) 0);
            c04pArr[1] = new C04P("xmlns", "w:g2", null, (byte) 0);
            c04pArr[2] = new C04P("type", "set", null, (byte) 0);
            c04pArr[3] = new C04P("to", c011005l);
            if (c04500Kk != null) {
                c04pArr[4] = new C04P("web", c04500Kk.A00, null, (byte) 0);
            }
            c40581sV.A0R.A06(new C02590Ca("iq", c04pArr, c02590Ca));
            return;
        }
        throw null;
    }

    public void A17(C07580Yu c07580Yu) {
        C40581sV c40581sV = this.A00.A00;
        String str = c07580Yu.A01;
        Map map = c07580Yu.A02;
        int i = c07580Yu.A00;
        if (c40581sV != null) {
            int i2 = 1;
            C04P[] c04pArr = {new C04P("id", str, null, (byte) 0), new C04P("to", C0Zq.A00), new C04P("type", "location", null, (byte) 0)};
            C02590Ca[] c02590CaArr = new C02590Ca[map.size()];
            int i3 = 0;
            for (Map.Entry entry : map.entrySet()) {
                C04P[] c04pArr2 = new C04P[i2];
                c04pArr2[0] = new C04P("jid", (Jid) entry.getKey());
                c02590CaArr[i3] = new C02590Ca("to", c04pArr2, C40581sV.A01((C010805j) entry.getValue(), i, null, null));
                i2 = 1;
                i3++;
            }
            c40581sV.A0R.A06(new C02590Ca("notification", c04pArr, new C02590Ca("participants", null, c02590CaArr, null)));
            Log.i("xmpp/writer/write/send-location-key-distribution-notification");
            return;
        }
        throw null;
    }

    public void A18(C07540Yq c07540Yq) {
        final C40581sV c40581sV = this.A00.A00;
        String str = c07540Yq.A02;
        C011005l c011005l = c07540Yq.A00;
        List list = c07540Yq.A04;
        List list2 = c07540Yq.A03;
        final C0TB c0tb = c07540Yq.A01;
        if (str == null) {
            int i = c40581sV.A00 + 1;
            c40581sV.A00 = i;
            str = Integer.toHexString(i);
        }
        c40581sV.A0c.put(str, new C0SF() { // from class: X.2Sz
            @Override // X.C0SF
            public void A00(int i2) {
                if (i2 == 401) {
                    C0ES.A02(2019, null);
                } else if (i2 == 403) {
                    C0ES.A02(2020, null);
                } else if (i2 != 404) {
                    C0ES.A02(2018, null);
                } else {
                    C0ES.A02(2021, null);
                }
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                C43981yK.A0A(C40581sV.this.A04, c02590Ca, hashMap, hashMap2, "admin");
                C2KB c2kb = (C2KB) c0tb;
                if (c2kb != null) {
                    StringBuilder A0P = C000200d.A0P("modify-admins/");
                    C2KC c2kc = c2kb.A00;
                    A0P.append(c2kc.A04);
                    A0P.append("/");
                    A0P.append(Arrays.deepToString(hashMap.keySet().toArray()));
                    A0P.append("/");
                    A0P.append(Arrays.deepToString(hashMap2.keySet().toArray()));
                    Log.i(A0P.toString());
                    if (hashMap2.isEmpty()) {
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    Activity activity = (Activity) c2kc.A06.get();
                    if (activity == null || activity.isFinishing()) {
                        return;
                    }
                    for (Map.Entry entry : hashMap2.entrySet()) {
                        UserJid userJid = (UserJid) entry.getKey();
                        StringBuilder A0U = C000200d.A0U("modify-admins/error/", userJid, "/");
                        A0U.append(entry.getValue());
                        Log.e(A0U.toString());
                        int intValue = ((Number) entry.getValue()).intValue();
                        C06C A0A = c2kc.A01.A0A(userJid);
                        boolean contains = c2kc.A08.contains(userJid);
                        if (intValue != 404) {
                            if (intValue == 406) {
                                sb.append(activity.getString(R.string.error_removing_admin_406, c2kc.A02.A08(A0A, false)));
                                sb.append("\n");
                            } else if (intValue == 419) {
                                sb.append(activity.getString(R.string.failed_announcement_group_add_admin, c2kc.A02.A08(A0A, false)));
                                sb.append("\n");
                            } else if (contains) {
                                sb.append(activity.getString(R.string.error_adding_participant, c2kc.A02.A08(A0A, false)));
                                sb.append("\n");
                            } else {
                                sb.append(activity.getString(R.string.error_removing_participant, c2kc.A02.A08(A0A, false)));
                                sb.append("\n");
                            }
                        } else if (contains) {
                            sb.append(activity.getString(R.string.error_adding_participant, c2kc.A02.A08(A0A, false)));
                            sb.append("\n");
                        } else {
                            sb.append(activity.getString(R.string.error_removing_participant, c2kc.A02.A08(A0A, false)));
                            sb.append("\n");
                        }
                    }
                    c2kc.A00.A02.post(new RunnableEBaseShape2S0200000_I0_2(c2kb, sb, 26));
                    return;
                }
                throw null;
            }
        });
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            arrayList.add(C40581sV.A03("promote", list));
        }
        if (!list2.isEmpty()) {
            arrayList.add(C40581sV.A03("demote", list2));
        }
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("id", str, null, (byte) 0), new C04P("xmlns", "w:g2", null, (byte) 0), new C04P("type", "set", null, (byte) 0), new C04P("to", c011005l)}, new C02590Ca("admin", null, (C02590Ca[]) arrayList.toArray(new C02590Ca[0]), null)));
        Log.i("xmpp/writer/modify-admins");
    }

    public void A19(C0Yp c0Yp) {
        String str;
        C40581sV c40581sV = this.A00.A00;
        String str2 = c0Yp.A01;
        final InterfaceC07740Zr interfaceC07740Zr = c0Yp.A00;
        if (str2 == null) {
            int i = c40581sV.A00 + 1;
            c40581sV.A00 = i;
            str = Integer.toHexString(i);
        } else {
            str = str2;
        }
        c40581sV.A0c.put(str2, new C0SF() { // from class: X.2T0
            @Override // X.C0SF
            public void A00(int i2) {
                C80053me c80053me = (C80053me) InterfaceC07740Zr.this;
                if (c80053me != null) {
                    C000200d.A0p("send-request-gdpr-report/failed/error ", i2);
                    ReportActivity reportActivity = c80053me.A00;
                    C018508q c018508q = ((ActivityC02290Ap) reportActivity).A0A;
                    c018508q.A02.post(new RunnableEBaseShape5S0100000_I0_5(reportActivity, 44));
                    return;
                }
                throw null;
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                C02590Ca A0D = c02590Ca.A0D("gdpr");
                ((C80053me) InterfaceC07740Zr.this).A00.A0O.A07(A0D != null ? A0D.A07("timestamp", 0L) * 1000 : 0L);
            }
        });
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("to", C04260Jm.A00), new C04P("xmlns", "urn:xmpp:whatsapp:account", null, (byte) 0), new C04P("type", "get", null, (byte) 0), new C04P("id", str, null, (byte) 0)}, new C02590Ca("gdpr", new C04P[]{new C04P("action", "request", null, (byte) 0)}, null, null)));
        Log.i("xmpp/writer/write/request-gdpr-report");
    }

    public void A1A(C0ZI c0zi) {
        String str = c0zi.A0A;
        Jid jid = c0zi.A04;
        int i = c0zi.A01;
        C2SA c2sa = this.A00;
        C40581sV c40581sV = c2sa.A00;
        Jid jid2 = c0zi.A05;
        UserJid userJid = c0zi.A06;
        long j = c0zi.A03;
        byte[] bArr = c0zi.A0C;
        byte[] bArr2 = c0zi.A0B;
        byte b = c0zi.A00;
        C05020My c05020My = c0zi.A08;
        C05020My c05020My2 = c0zi.A07;
        long j2 = c0zi.A02;
        String str2 = c0zi.A09;
        Jid jid3 = jid;
        if (C40581sV.A08(jid2)) {
            jid3 = jid2;
            jid2 = jid;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C04P("v", "1", null, (byte) 0));
        String valueOf = String.valueOf(i);
        arrayList.add(new C04P("count", valueOf, null, (byte) 0));
        arrayList.add(new C04P("id", str, null, (byte) 0));
        arrayList.add(new C04P("t", String.valueOf(j / 1000), null, (byte) 0));
        C04P[] A0B = C40581sV.A0B(str, "retry", jid3, jid2, userJid, str2);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C02590Ca("retry", (C04P[]) arrayList.toArray(C40581sV.A0f), null, null));
        C000200d.A1D("registration", bArr, arrayList2);
        if (bArr2 != null && c05020My != null && c05020My2 != null) {
            arrayList2.add(new C02590Ca("keys", null, new C02590Ca[]{new C02590Ca("identity", null, null, bArr2), new C02590Ca("type", null, null, new byte[]{b}), new C02590Ca("key", null, new C02590Ca[]{new C02590Ca("id", null, null, c05020My2.A01), new C02590Ca("value", null, null, c05020My2.A00)}, null), new C02590Ca("skey", null, new C02590Ca[]{new C02590Ca("id", null, null, c05020My.A01), new C02590Ca("value", null, null, c05020My.A00), new C02590Ca("signature", null, null, c05020My.A02)}, null)}, null));
        }
        c40581sV.A0F(j2, new C02590Ca("receipt", A0B, (C02590Ca[]) arrayList2.toArray(new C02590Ca[0]), null));
        StringBuilder sb = new StringBuilder("xmpp/writer/write/message-retry; message.key=");
        sb.append(str);
        sb.append("; jid=");
        sb.append(jid);
        sb.append("; retryCount=");
        C000200d.A1F(sb, i);
        if (i > 4) {
            c2sa.A02.A09("retry-count-too-high", valueOf, false);
        }
    }

    public void A1B(C07470Yi c07470Yi) {
        C02590Ca[] c02590CaArr;
        final C40581sV c40581sV = this.A00.A00;
        String str = c07470Yi.A03;
        final C011005l c011005l = c07470Yi.A00;
        List list = c07470Yi.A04;
        final InterfaceC05940Qx interfaceC05940Qx = c07470Yi.A02;
        C04500Kk c04500Kk = c07470Yi.A01;
        c40581sV.A0c.put(str, new C0SF() { // from class: X.2T1
            @Override // X.C0SF
            public void A00(int i) {
                InterfaceC05940Qx interfaceC05940Qx2 = interfaceC05940Qx;
                if (interfaceC05940Qx2 != null) {
                    ((C3DR) interfaceC05940Qx2).A00.A00 = i;
                }
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                HashSet hashSet = new HashSet();
                HashMap hashMap = new HashMap();
                Iterator it = c02590Ca.A0E("revoke").A0H("participant").iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C02590Ca c02590Ca2 = (C02590Ca) it.next();
                    Jid A08 = c02590Ca2.A08(UserJid.class, "jid", C40581sV.this.A04);
                    C04P A0A = c02590Ca2.A0A("error");
                    String str2 = A0A != null ? A0A.A03 : null;
                    if (A08 != null) {
                        if (str2 != null) {
                            try {
                                hashMap.put(A08, Integer.valueOf(Integer.parseInt(str2)));
                            } catch (Exception unused) {
                            }
                        } else {
                            hashSet.add(A08);
                        }
                    }
                }
                C07D c07d = new C07D(hashSet, null);
                C07E c07e = new C07E(hashMap, null);
                C0ES c0es = C40581sV.this.A0B;
                c0es.A0i.AS1(new RunnableEBaseShape0S0400000_I0(c0es, c011005l, c07d, c07e, 5));
                InterfaceC05940Qx interfaceC05940Qx2 = interfaceC05940Qx;
                if (interfaceC05940Qx2 != null) {
                    C3DS c3ds = ((C3DR) interfaceC05940Qx2).A00;
                    c3ds.A02 = c07d;
                    c3ds.A01 = c07e;
                }
            }
        });
        int i = 1;
        if (list.size() > 0) {
            int size = list.size();
            c02590CaArr = new C02590Ca[size];
            int i2 = 0;
            while (i2 < size) {
                C04P[] c04pArr = new C04P[i];
                c04pArr[0] = new C04P("jid", (Jid) list.get(i2));
                c02590CaArr[i2] = new C02590Ca("participant", c04pArr, null, null);
                i2++;
                i = 1;
            }
        } else {
            c02590CaArr = null;
        }
        C02590Ca c02590Ca = new C02590Ca("revoke", null, c02590CaArr, null);
        C04P[] c04pArr2 = new C04P[c04500Kk == null ? 4 : 5];
        c04pArr2[0] = new C04P("id", str, null, (byte) 0);
        c04pArr2[1] = new C04P("xmlns", "w:g2", null, (byte) 0);
        c04pArr2[2] = new C04P("type", "set", null, (byte) 0);
        c04pArr2[3] = new C04P("to", c011005l);
        if (c04500Kk != null) {
            c04pArr2[4] = new C04P("web", c04500Kk.A00, null, (byte) 0);
        }
        c40581sV.A0R.A06(new C02590Ca("iq", c04pArr2, c02590Ca));
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018a  */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63, types: [byte[], X.0Ca[]] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [byte[], X.0Ca[]] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [byte[], X.0Ca[]] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1C(X.C05890Qq r31) {
        /*
            Method dump skipped, instructions count: 960
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07420Yd.A1C(X.0Qq):void");
    }

    public void A1D(C0Z6 c0z6) {
        C02590Ca c02590Ca;
        String str = c0z6.A02;
        AbstractC005302j abstractC005302j = c0z6.A01;
        AbstractC005302j abstractC005302j2 = c0z6.A00;
        C40581sV c40581sV = this.A00.A00;
        byte[] bArr = c0z6.A03;
        byte[] bArr2 = c0z6.A04;
        C04P[] A09 = C40581sV.A09(abstractC005302j, abstractC005302j2, str, "server-error");
        if (bArr != null && bArr2 != null) {
            c02590Ca = new C02590Ca("receipt", A09, new C02590Ca[]{new C02590Ca("encrypt", null, new C02590Ca[]{new C02590Ca("enc_p", null, null, bArr), new C02590Ca("enc_iv", null, null, bArr2)}, null)}, null);
        } else {
            c02590Ca = new C02590Ca("receipt", A09, null, null);
        }
        c40581sV.A0R.A06(c02590Ca);
        StringBuilder sb = new StringBuilder("xmpp/writer/write/message-media-error; id=");
        sb.append(str);
        sb.append(" to=");
        sb.append(abstractC005302j);
        sb.append(" participant=");
        sb.append(abstractC005302j2);
        Log.i(sb.toString());
    }

    public void A1E(C0ZF c0zf) {
        C02590Ca[] c02590CaArr;
        StringBuilder A0P = C000200d.A0P("id=");
        String[] strArr = c0zf.A03;
        A0P.append(strArr[0]);
        A0P.append(" count=");
        int length = strArr.length;
        A0P.append(length);
        A0P.append(" to=");
        AbstractC005302j abstractC005302j = c0zf.A01;
        A0P.append(abstractC005302j);
        A0P.append(" participant=");
        AbstractC005302j abstractC005302j2 = c0zf.A00;
        A0P.append(abstractC005302j2);
        String obj = A0P.toString();
        C40581sV c40581sV = this.A00.A00;
        String str = c0zf.A02;
        C000700j.A0B(strArr);
        if (c40581sV != null) {
            C04P[] A09 = C40581sV.A09(abstractC005302j, abstractC005302j2, strArr[0], str);
            if (length > 1) {
                c02590CaArr = C40581sV.A0C((String[]) Arrays.copyOfRange(strArr, 1, length));
            } else {
                c02590CaArr = null;
            }
            c40581sV.A0R.A06(new C02590Ca("receipt", A09, c02590CaArr, null));
            StringBuilder sb = new StringBuilder("xmpp/writer/write/message-played; ");
            sb.append(obj);
            Log.i(sb.toString());
            return;
        }
        throw null;
    }

    public void A1F(C0ZH c0zh) {
        String hexString;
        C40581sV c40581sV = this.A00.A00;
        final String str = c0zh.A04;
        final InterfaceC07770Zu interfaceC07770Zu = c0zh.A02;
        final C0I3 c0i3 = c0zh.A01;
        final C0I4 c0i4 = c0zh.A00;
        C04500Kk c04500Kk = c0zh.A03;
        if (c04500Kk != null) {
            hexString = c04500Kk.A01;
        } else {
            int i = c40581sV.A00 + 1;
            c40581sV.A00 = i;
            hexString = Integer.toHexString(i);
        }
        c40581sV.A0c.put(hexString, new C0SF() { // from class: X.2T4
            @Override // X.C0SF
            public void A00(int i2) {
                C0I3 c0i32 = c0i3;
                if (c0i32 != null) {
                    c0i32.ARv(i2);
                }
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                InterfaceC07770Zu interfaceC07770Zu2 = InterfaceC07770Zu.this;
                if (interfaceC07770Zu2 != null) {
                    interfaceC07770Zu2.AS2(str);
                }
            }

            @Override // X.C0SF
            public void A04(Exception exc) {
                C0I4 c0i42 = c0i4;
                if (c0i42 != null) {
                    c0i42.ARz(exc);
                }
            }
        });
        C02590Ca c02590Ca = new C02590Ca("status", (C04P[]) null, str);
        C04P[] c04pArr = new C04P[c04500Kk == null ? 4 : 5];
        c04pArr[0] = new C04P("id", hexString, null, (byte) 0);
        c04pArr[1] = new C04P("xmlns", "status", null, (byte) 0);
        c04pArr[2] = new C04P("type", "set", null, (byte) 0);
        c04pArr[3] = new C04P("to", C04260Jm.A00);
        if (c04500Kk != null) {
            c04pArr[4] = new C04P("web", c04500Kk.A00, null, (byte) 0);
        }
        c40581sV.A0R.A06(new C02590Ca("iq", c04pArr, c02590Ca));
        Log.i("xmpp/writer/write/status-update");
    }

    public void A1G(C04990Mu c04990Mu) {
        VoipStanzaChildNode voipStanzaChildNode = c04990Mu.A01;
        String str = voipStanzaChildNode.tag;
        String str2 = c04990Mu.A02;
        C40581sV c40581sV = this.A00.A00;
        if (c40581sV != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C04P("to", c04990Mu.A00));
            String str3 = c04990Mu.A03;
            arrayList.add(new C04P("id", str3, null, (byte) 0));
            if (c04990Mu.A04) {
                C000200d.A1A("web", "relay", arrayList);
            }
            c40581sV.A0R.A06(new C02590Ca("call", (C04P[]) arrayList.toArray(C40581sV.A0f), voipStanzaChildNode.toProtocolTreeNode()));
            StringBuilder sb = new StringBuilder("xmpp/writer/write/call-stanza-");
            sb.append(str);
            sb.append("; id=");
            sb.append(str3);
            sb.append("; callId=");
            sb.append(str2);
            Log.i(sb.toString());
            return;
        }
        throw null;
    }

    public void A1H(C04990Mu c04990Mu) {
        VoipStanzaChildNode voipStanzaChildNode = c04990Mu.A01;
        String str = voipStanzaChildNode.tag;
        String str2 = c04990Mu.A02;
        C40581sV c40581sV = this.A00.A00;
        if (c40581sV != null) {
            String str3 = c04990Mu.A03;
            c40581sV.A0V(str3, "0", c40581sV.A0S.A0B(new C02590Ca("action", (C04P[]) null, new C02590Ca("call", new C04P[]{new C04P("id", str3, null, (byte) 0), new C04P("from", c04990Mu.A00)}, voipStanzaChildNode.toProtocolTreeNode()))));
            StringBuilder sb = new StringBuilder("xmpp/writer/write/send-web-stanza-");
            sb.append(str);
            sb.append("; callId=");
            sb.append(str2);
            Log.i(sb.toString());
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x03cb, code lost:
        if (r51.equals("contact") == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03d7, code lost:
        if (r51.equals("contact_array") == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x03e3, code lost:
        if (r51.equals("document") == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03ef, code lost:
        if (r51.equals("catalog") == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x03fb, code lost:
        if (r51.equals("video") == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0407, code lost:
        if (r51.equals("order") == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0413, code lost:
        if (r51.equals("image") == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x041f, code lost:
        if (r51.equals("audio") == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x042c, code lost:
        if (r51.equals("gif") == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0438, code lost:
        if (r51.equals("product") == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0444, code lost:
        if (r51.equals("livelocation") == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0450, code lost:
        if (r51.equals("invite") == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x045c, code lost:
        if (r51.equals("sticker") == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0466, code lost:
        if (r51.equals("location") != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0468, code lost:
        r1 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x04b0, code lost:
        if (r56 != null) goto L200;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0232  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1I(X.AnonymousClass094 r43, com.whatsapp.jid.Jid r44, long r45, int r47, com.whatsapp.jid.DeviceJid r48, com.whatsapp.jid.UserJid r49, java.lang.String r50, java.lang.String r51, X.EnumC03920Hs r52, X.C010805j r53, java.util.Map r54, java.util.Map r55, java.util.List r56, int r57, int r58, java.lang.Integer r59, X.AnonymousClass093 r60, java.util.Map r61, java.lang.Integer r62, java.lang.String r63, java.lang.String r64, boolean r65) {
        /*
            Method dump skipped, instructions count: 1446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07420Yd.A1I(X.094, com.whatsapp.jid.Jid, long, int, com.whatsapp.jid.DeviceJid, com.whatsapp.jid.UserJid, java.lang.String, java.lang.String, X.0Hs, X.05j, java.util.Map, java.util.Map, java.util.List, int, int, java.lang.Integer, X.093, java.util.Map, java.lang.Integer, java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1J(X.AnonymousClass092 r13) {
        /*
            r12 = this;
            X.094 r4 = r13.A0n
            X.2SA r0 = r12.A00
            X.1sV r3 = r0.A00
            r8 = 0
            if (r3 == 0) goto L57
            boolean r0 = r4.A02
            if (r0 == 0) goto L55
            X.0EE r0 = r3.A0F
            boolean r0 = r0.A04()
            if (r0 == 0) goto L42
            java.lang.String r5 = "sender"
        L17:
            X.02j r6 = r13.A0A()
            com.whatsapp.jid.DeviceJid r7 = r13.A0v
            boolean r0 = r13.A0w
            if (r0 == 0) goto L2b
            X.02j r1 = r4.A00
            boolean r0 = r1 instanceof X.AbstractC011205o
            if (r0 != 0) goto L2b
            com.whatsapp.jid.UserJid r8 = com.whatsapp.jid.UserJid.of(r1)
        L2b:
            r9 = 0
            long r10 = r13.A0s
            r3.A0K(r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r0 = "xmpp/writer/write/message-received; message.key="
            java.lang.StringBuilder r0 = X.C000200d.A0P(r0)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i(r0)
            return
        L42:
            java.lang.String r0 = "Connection/sendMessageReceived sending receipt for message from self when M-D is disabled. ID="
            java.lang.StringBuilder r1 = X.C000200d.A0P(r0)
            java.lang.String r0 = r4.A01
            X.C000200d.A1M(r1, r0)
            X.00i r2 = r3.A04
            r1 = 0
            java.lang.String r0 = "sending_receipt_for_self_message"
            r2.A09(r0, r8, r1)
        L55:
            r5 = r8
            goto L17
        L57:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07420Yd.A1J(X.092):void");
    }

    public void A1K(AnonymousClass092 anonymousClass092) {
        C40581sV c40581sV = this.A00.A00;
        int i = c40581sV.A00 + 1;
        c40581sV.A00 = i;
        c40581sV.A0T(Integer.toHexString(i), "0", new C02590Ca("action", new C04P[]{new C04P("add", "update", null, (byte) 0)}, c40581sV.A0O.A02(anonymousClass092)));
        Log.i("xmpp/writer/write/send-web-payment-transaction-status-update");
    }

    public void A1L(C02590Ca c02590Ca) {
        this.A00.A00.A0R.A07(c02590Ca, 3);
        StringBuilder sb = new StringBuilder("xmpp/writer/write/type=");
        sb.append(102);
        Log.i(sb.toString());
    }

    public void A1M(C04420Kc c04420Kc) {
        if ("receipt".equals(c04420Kc.A05)) {
            String str = c04420Kc.A08;
            if ("read".equals(str) || "read-self".equals(str)) {
                A1O(c04420Kc, !this.A00.A05.A02(C003101m.A04(c04420Kc.A01)));
                return;
            }
        }
        A1N(c04420Kc);
    }

    public void A1N(C04420Kc c04420Kc) {
        this.A00.A00.A0N(c04420Kc);
        StringBuilder sb = new StringBuilder("xmpp/writer/write/send-stanza-received; stanzaKey=");
        sb.append(c04420Kc);
        Log.i(sb.toString());
    }

    public void A1O(C04420Kc c04420Kc, boolean z) {
        C40581sV c40581sV = this.A00.A00;
        if (c40581sV != null) {
            c40581sV.A0O(c04420Kc, z ? new C02590Ca("features", new C04P[]{new C04P("readreceipts", "disable", null, (byte) 0)}, null, null) : null);
            StringBuilder sb = new StringBuilder("xmpp/writer/write/read-receipt-received; stanzaKey=");
            sb.append(c04420Kc);
            sb.append("; disable=");
            sb.append(z);
            Log.i(sb.toString());
            return;
        }
        throw null;
    }

    public void A1P(C0NW c0nw, int i, String str) {
        C04P[] c04pArr;
        C02590Ca c02590Ca;
        C02590Ca[] c02590CaArr;
        C04P[] c04pArr2;
        C02590Ca c02590Ca2;
        C02590Ca[] c02590CaArr2;
        C04P[] c04pArr3;
        C02590Ca c02590Ca3;
        C04P[] c04pArr4;
        C02590Ca c02590Ca4;
        C02590Ca[] c02590CaArr3;
        C02590Ca[] c02590CaArr4;
        C40581sV c40581sV = this.A00.A00;
        if (c40581sV != null) {
            if (c0nw == null) {
                c02590Ca = new C02590Ca("error", new C04P[]{new C04P("code", Integer.toString(i), null, (byte) 0)}, str);
            } else {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new C04P("actual_count", c0nw.A00));
                for (C2T5 c2t5 : c0nw.A01) {
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new C04P("name", c2t5.A01, null, (byte) 0));
                    arrayList4.add(new C04P("hash", c2t5.A02, null, (byte) 0));
                    arrayList4.add(new C04P("category", c2t5.A00));
                    if (!arrayList4.isEmpty()) {
                        c04pArr2 = (C04P[]) arrayList4.toArray(new C04P[0]);
                    } else {
                        c04pArr2 = null;
                    }
                    if (!arrayList3.isEmpty() && (c02590CaArr2 = (C02590Ca[]) arrayList3.toArray(new C02590Ca[0])) != null) {
                        c02590Ca2 = new C02590Ca("item", c04pArr2, c02590CaArr2, null);
                    } else {
                        c02590Ca2 = new C02590Ca("item", c04pArr2, null, null);
                    }
                    arrayList.add(c02590Ca2);
                }
                if (!arrayList2.isEmpty()) {
                    c04pArr = (C04P[]) arrayList2.toArray(new C04P[0]);
                } else {
                    c04pArr = null;
                }
                if (!arrayList.isEmpty() && (c02590CaArr = (C02590Ca[]) arrayList.toArray(new C02590Ca[0])) != null) {
                    c02590Ca = new C02590Ca("apps", c04pArr, c02590CaArr, null);
                } else {
                    c02590Ca = new C02590Ca("apps", c04pArr, null, null);
                }
            }
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            arrayList5.add(c02590Ca);
            if (!arrayList6.isEmpty()) {
                c04pArr3 = (C04P[]) arrayList6.toArray(new C04P[0]);
            } else {
                c04pArr3 = null;
            }
            if (!arrayList5.isEmpty() && (c02590CaArr4 = (C02590Ca[]) arrayList5.toArray(new C02590Ca[0])) != null) {
                c02590Ca3 = new C02590Ca("verify_apps", c04pArr3, c02590CaArr4, null);
            } else {
                c02590Ca3 = new C02590Ca("verify_apps", c04pArr3, null, null);
            }
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            arrayList7.add(c02590Ca3);
            if (!arrayList8.isEmpty()) {
                c04pArr4 = (C04P[]) arrayList8.toArray(new C04P[0]);
            } else {
                c04pArr4 = null;
            }
            if (!arrayList7.isEmpty() && (c02590CaArr3 = (C02590Ca[]) arrayList7.toArray(new C02590Ca[0])) != null) {
                c02590Ca4 = new C02590Ca("ib", c04pArr4, c02590CaArr3, null);
            } else {
                c02590Ca4 = new C02590Ca("ib", c04pArr4, null, null);
            }
            c40581sV.A0R.A06(c02590Ca4);
            Log.i("xmpp/writer/write/send-safety-net-verify-apps-result");
            return;
        }
        throw null;
    }

    public void A1Q(C03990Hz c03990Hz) {
        C40581sV c40581sV = this.A00.A00;
        Integer valueOf = Integer.valueOf(c03990Hz.A00);
        Boolean valueOf2 = Boolean.valueOf(c03990Hz.A01);
        Boolean valueOf3 = Boolean.valueOf(c03990Hz.A02);
        if (c40581sV != null) {
            if (valueOf != null || valueOf2 != null || valueOf3 != null) {
                int i = c40581sV.A00 + 1;
                c40581sV.A00 = i;
                String hexString = Integer.toHexString(i);
                ArrayList arrayList = new ArrayList();
                if (valueOf != null) {
                    arrayList.add(new C04P("value", valueOf.toString(), null, (byte) 0));
                }
                if (valueOf2 != null) {
                    arrayList.add(new C04P("live", valueOf2.toString(), null, (byte) 0));
                }
                if (valueOf3 != null) {
                    arrayList.add(new C04P("powersave", valueOf3.toString(), null, (byte) 0));
                }
                c40581sV.A0T(hexString, "c", new C02590Ca("action", (C04P[]) null, new C02590Ca("battery", (C04P[]) arrayList.toArray(C40581sV.A0f), null, null)));
            }
            Log.i("xmpp/writer/write/web-battery-update");
            return;
        }
        throw null;
    }

    public void A1R(final Runnable runnable) {
        final C40581sV c40581sV = this.A00.A00;
        int i = c40581sV.A00 + 1;
        c40581sV.A00 = i;
        String hexString = Integer.toHexString(i);
        c40581sV.A0c.put(hexString, new C0SF() { // from class: X.2T6
            @Override // X.C0SF
            public void A02(C02590Ca c02590Ca) {
                C467628d c467628d = C40581sV.this.A0G;
                C000200d.A0u("xmpp/reader/read/ping_response; timestamp=", 0L);
                Message obtainMessage = ((Handler) c467628d.A00).obtainMessage(3);
                obtainMessage.getData().putLong("timestamp", 0L);
                obtainMessage.sendToTarget();
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                String str;
                C04P A0A = c02590Ca.A0A("t");
                if (A0A != null) {
                    str = A0A.A03;
                } else {
                    str = null;
                }
                long A03 = AnonymousClass024.A03(str, 0L);
                C467628d c467628d = C40581sV.this.A0G;
                C000200d.A0u("xmpp/reader/read/ping_response; timestamp=", A03);
                Message obtainMessage = ((Handler) c467628d.A00).obtainMessage(3);
                obtainMessage.getData().putLong("timestamp", A03);
                obtainMessage.sendToTarget();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("id", hexString, null, (byte) 0), new C04P("xmlns", "w:p", null, (byte) 0), new C04P("type", "get", null, (byte) 0), new C04P("to", C04260Jm.A00)}, new C02590Ca("ping", null, null, null)));
        Log.i("xmpp/writer/write/client-ping");
    }

    public void A1S(String str) {
        final C40581sV c40581sV = this.A00.A00;
        c40581sV.A0c.put(str, new C0SF() { // from class: X.2T7
            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                C02590Ca A0D = c02590Ca.A0D("2fa");
                if (A0D != null) {
                    C467628d c467628d = C40581sV.this.A0G;
                    boolean z = A0D.A0D("code") != null;
                    boolean z2 = A0D.A0D("email") != null;
                    if (c467628d != null) {
                        StringBuilder sb = new StringBuilder("xmpp/reader/on-get-two-factor-auth-response code=");
                        sb.append(z);
                        sb.append(" email");
                        sb.append(z2);
                        Log.i(sb.toString());
                        InterfaceC467728e interfaceC467728e = c467628d.A00;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("code", z);
                        bundle.putBoolean("email", z2);
                        ((HandlerC467828f) interfaceC467728e).A00(Message.obtain(null, 0, 106, 0, bundle));
                        return;
                    }
                    throw null;
                }
                throw null;
            }
        });
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("to", C04260Jm.A00), new C04P("id", str, null, (byte) 0), new C04P("xmlns", "urn:xmpp:whatsapp:account", null, (byte) 0), new C04P("type", "get", null, (byte) 0)}, new C02590Ca("2fa", null, null, null)));
    }

    public void A1T(String str, int i) {
        C40581sV c40581sV = this.A00.A00;
        if (c40581sV != null) {
            c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("id", str, null, (byte) 0), new C04P("xmlns", "w:web", null, (byte) 0), new C04P("type", "set", null, (byte) 0)}, new C02590Ca("error", new C04P[]{new C04P("code", Integer.toString(i), null, (byte) 0)}, null, null)));
            StringBuilder sb = new StringBuilder("xmpp/writer/write/web-code; id=");
            sb.append(str);
            sb.append("; code=");
            sb.append(i);
            Log.i(sb.toString());
            return;
        }
        throw null;
    }

    public void A1U(String str, int i, String str2) {
        C02590Ca c02590Ca;
        C40581sV c40581sV = this.A00.A00;
        if (c40581sV != null) {
            if (str == null) {
                c02590Ca = new C02590Ca("error", new C04P[]{new C04P("code", Integer.toString(i), null, (byte) 0)}, str2);
            } else {
                c02590Ca = new C02590Ca("jws", (C04P[]) null, str);
            }
            c40581sV.A0R.A06(new C02590Ca("ib", (C04P[]) null, new C02590Ca("attestation", (C04P[]) null, c02590Ca)));
            Log.i("xmpp/writer/write/send-attestation-result");
            return;
        }
        throw null;
    }

    public void A1V(String str, int i, List list, C0SF c0sf) {
        C02590Ca[] c02590CaArr;
        String str2;
        C40581sV c40581sV = this.A00.A00;
        if (str == null) {
            int i2 = c40581sV.A00 + 1;
            c40581sV.A00 = i2;
            str = Integer.toHexString(i2);
        }
        c40581sV.A0c.put(str, c0sf);
        if (list == null || list.size() <= 0) {
            c02590CaArr = null;
        } else {
            c02590CaArr = new C02590Ca[list.size()];
            for (int i3 = 0; i3 < list.size(); i3++) {
                c02590CaArr[i3] = new C02590Ca("user", new C04P[]{new C04P("jid", (Jid) list.get(i3))}, null, null);
            }
        }
        C04P[] c04pArr = new C04P[1];
        if (i == 0) {
            str2 = "contacts";
        } else {
            str2 = i == 1 ? "whitelist" : "blacklist";
        }
        c04pArr[0] = new C04P("type", str2, null, (byte) 0);
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("id", str, null, (byte) 0), new C04P("xmlns", "status", null, (byte) 0), new C04P("type", "set", null, (byte) 0), new C04P("to", C04260Jm.A00)}, new C02590Ca("privacy", (C04P[]) null, new C02590Ca("list", c04pArr, c02590CaArr, null))));
        Log.i("xmpp/writer/write/send-set-status-privacy");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1W(java.lang.String r14, int r15, java.util.List r16, final X.C0I2 r17) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07420Yd.A1W(java.lang.String, int, java.util.List, X.0I2):void");
    }

    public void A1X(String str, AbstractC005302j abstractC005302j, long j) {
        String str2;
        C40581sV c40581sV = this.A00.A00;
        if (str == null) {
            int i = c40581sV.A00 + 1;
            c40581sV.A00 = i;
            str2 = Integer.toHexString(i);
        } else {
            str2 = str;
        }
        c40581sV.A0R.A06(new C02590Ca("notification", new C04P[]{new C04P("id", str2, null, (byte) 0), new C04P("type", "location", null, (byte) 0), new C04P("to", abstractC005302j)}, new C02590Ca("disable", new C04P[]{new C04P("id", Long.toString(j), null, (byte) 0)}, null, null)));
        StringBuilder sb = new StringBuilder("xmpp/writer/write/disable-location-sharing; id=");
        sb.append(str);
        sb.append("; jid=");
        sb.append(abstractC005302j);
        sb.append("; sequenceNumber=");
        sb.append(j);
        Log.i(sb.toString());
    }

    public void A1Y(String str, AbstractC005302j abstractC005302j, AbstractC005302j abstractC005302j2, String str2, C010805j c010805j, int i) {
        C40581sV c40581sV = this.A00.A00;
        if (c40581sV != null) {
            c40581sV.A0R.A06(new C02590Ca("notification", new C04P[]{new C04P("id", str, null, (byte) 0), new C04P("to", abstractC005302j), new C04P("type", "location", null, (byte) 0)}, new C02590Ca("location", abstractC005302j2 == null ? new C04P[]{new C04P("final", str2, null, (byte) 0)} : new C04P[]{new C04P("final", str2, null, (byte) 0), new C04P("context", abstractC005302j2)}, C40581sV.A01(c010805j, i, null, null))));
            Log.i("xmpp/writer/write/send-final-live-location-notification");
            return;
        }
        throw null;
    }

    public void A1Z(String str, AbstractC005302j abstractC005302j, C0I2 c0i2, List list, List list2, C03950Hv c03950Hv) {
        C40581sV c40581sV = this.A00.A00;
        if (abstractC005302j != null) {
            boolean z = c03950Hv.A01 == 7;
            c40581sV.A0S(z ? "star" : "unstar", str, abstractC005302j, Integer.valueOf(c03950Hv.A00), list, list2, c0i2, c0i2);
            Log.i("xmpp/writer/write/web-star-messages");
            return;
        }
        throw null;
    }

    public void A1a(String str, AbstractC005302j abstractC005302j, List list, C03950Hv c03950Hv, C0I2 c0i2) {
        C40581sV c40581sV = this.A00.A00;
        if (abstractC005302j != null) {
            c40581sV.A0S("clear", str, abstractC005302j, Integer.valueOf(c03950Hv.A00), list, null, c0i2, c0i2);
            Log.i("xmpp/writer/write/web-delete-messages");
            return;
        }
        throw null;
    }

    public void A1b(String str, final AbstractC005302j abstractC005302j, boolean z, final C0I2 c0i2) {
        final C40581sV c40581sV = this.A00.A00;
        if (str == null) {
            int i = c40581sV.A00 + 1;
            c40581sV.A00 = i;
            str = Integer.toHexString(i);
        }
        c40581sV.A0c.put(str, new C0SF() { // from class: X.2T9
            @Override // X.C0SF
            public void A00(int i2) {
                C0I3 c0i3 = c0i2;
                if (c0i3 != null) {
                    c0i3.ARv(i2);
                }
                C467628d c467628d = C40581sV.this.A0G;
                AbstractC005302j abstractC005302j2 = abstractC005302j;
                if (c467628d == null) {
                    throw null;
                }
                StringBuilder sb = new StringBuilder("xmpp/reader/read/on-qr-convo-seen-error ");
                sb.append(i2);
                sb.append(" ");
                sb.append(abstractC005302j2);
                Log.e(sb.toString());
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
            }

            @Override // X.C0SF
            public void A04(Exception exc) {
                C0I4 c0i4 = c0i2;
                if (c0i4 != null) {
                    c0i4.ARz(exc);
                }
            }
        });
        C04P[] c04pArr = new C04P[z ? 1 : 2];
        c04pArr[0] = new C04P("jid", abstractC005302j);
        if (!z) {
            c04pArr[1] = new C04P("type", "false", null, (byte) 0);
        }
        c40581sV.A0T(str, "d", new C02590Ca("action", (C04P[]) null, new C02590Ca("read", c04pArr, null, null)));
        StringBuilder sb = new StringBuilder("xmpp/writer/write/web-conversation-seen; jid=");
        sb.append(abstractC005302j);
        Log.i(sb.toString());
    }

    public void A1c(String str, DeviceJid deviceJid, DeviceJid deviceJid2, String str2, long j) {
        this.A00.A00.A0Q(str, deviceJid, deviceJid2, str2, "accept", j);
        C000200d.A14("xmpp/writer/write/call-accept-receipt; callId=", str2);
    }

    public void A1d(String str, DeviceJid deviceJid, DeviceJid deviceJid2, String str2, long j) {
        this.A00.A00.A0Q(str, deviceJid, deviceJid2, str2, "offer", j);
        C000200d.A14("xmpp/writer/write/call-offer-receipt; callId=", str2);
    }

    public void A1e(String str, DeviceJid deviceJid, DeviceJid deviceJid2, String str2, long j) {
        this.A00.A00.A0Q(str, deviceJid, deviceJid2, str2, "reject", j);
        C000200d.A14("xmpp/writer/write/call-reject-receipt; callId=", str2);
    }

    public void A1f(String str, DeviceJid deviceJid, DeviceJid deviceJid2, String str2, String str3, byte[] bArr, byte b, long j) {
        C40581sV c40581sV = this.A00.A00;
        if (c40581sV != null) {
            C02590Ca[] c02590CaArr = new C02590Ca[bArr == null ? 1 : 2];
            c02590CaArr[0] = new C02590Ca("enc_rekey", new C04P[]{new C04P("call-id", str2, null, (byte) 0), new C04P("call-creator", deviceJid2), new C04P("count", String.valueOf((int) b), null, (byte) 0)}, null, null);
            if (bArr != null) {
                c02590CaArr[1] = new C02590Ca("registration", null, null, bArr);
            }
            C04P[] c04pArr = new C04P[str3 == null ? 2 : 3];
            c04pArr[0] = new C04P("to", deviceJid);
            c04pArr[1] = new C04P("id", str, null, (byte) 0);
            if (str3 != null) {
                c04pArr[2] = new C04P("type", str3, null, (byte) 0);
            }
            c40581sV.A0F(j, new C02590Ca("receipt", c04pArr, c02590CaArr, null));
            C000200d.A1N(new StringBuilder("xmpp/writer/write/call-rekey; callId="), str2);
            return;
        }
        throw null;
    }

    public void A1g(String str, Jid jid, int i) {
        C40581sV c40581sV = this.A00.A00;
        C02590Ca c02590Ca = null;
        if (c40581sV != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C04P("to", jid));
            C000200d.A1A("id", str, arrayList);
            if (i == 0) {
                C000200d.A1A("type", "result", arrayList);
            } else {
                arrayList.add(new C04P("type", "error", null, (byte) 0));
                c02590Ca = new C02590Ca("error", new C04P[]{new C04P("code", Integer.toString(i), null, (byte) 0)}, null, null);
            }
            c40581sV.A0R.A06(new C02590Ca("iq", (C04P[]) arrayList.toArray(C40581sV.A0f), c02590Ca));
            StringBuilder sb = new StringBuilder("xmpp/writer/write/onSendLocationReportingAck id=");
            sb.append(str);
            Log.i(sb.toString());
            return;
        }
        throw null;
    }

    public void A1h(String str, Jid jid, long j, boolean z, int i) {
        C40581sV c40581sV = this.A00.A00;
        Boolean valueOf = Boolean.valueOf(z);
        int i2 = c40581sV.A00 + 1;
        c40581sV.A00 = i2;
        String hexString = Integer.toHexString(i2);
        C0KA A09 = C452821e.A09();
        C452521b A092 = C452421a.A09();
        A092.A06(jid.getRawString());
        A092.A07(valueOf.booleanValue());
        A092.A02();
        C452421a.A0A((C452421a) A092.A00, str);
        A09.A02();
        C452821e.A0A((C452821e) A09.A00, A092);
        A09.A04(j);
        C0RV A00 = C20t.A00(i);
        A09.A02();
        C452821e.A0C((C452821e) A09.A00, A00);
        c40581sV.A0T(hexString, "s", new C02590Ca("action", new C04P[]{new C04P("add", "relay", null, (byte) 0)}, new C02590Ca("message", null, null, A09.A01().A0B())));
        Log.i("xmpp/writer/write/web-missed-call-notif");
    }

    public void A1i(String str, Jid jid, AbstractC005302j abstractC005302j, boolean z, UserJid userJid, byte[] bArr, byte[] bArr2, int i) {
        C40581sV c40581sV = this.A00.A00;
        if (c40581sV != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C04P("id", str, null, (byte) 0));
            arrayList.add(new C04P("to", jid));
            C000200d.A1A("type", "mediaretry", arrayList);
            if (userJid != null) {
                C000200d.A0y("participant", userJid, arrayList);
            }
            ArrayList arrayList2 = new ArrayList(2);
            if (bArr != null && bArr2 != null) {
                arrayList2.add(new C02590Ca("encrypt", null, new C02590Ca[]{new C02590Ca("enc_p", null, null, bArr), new C02590Ca("enc_iv", null, null, bArr2)}, null));
            } else if (i != 1) {
                arrayList2.add(new C02590Ca("error", new C04P[]{new C04P("code", i)}, null, null));
            }
            if (abstractC005302j != null) {
                ArrayList arrayList3 = new ArrayList(3);
                arrayList3.add(new C04P("jid", abstractC005302j));
                arrayList3.add(new C04P("from_me", String.valueOf(z), null, (byte) 0));
                if (userJid != null) {
                    C000200d.A0y("participant", userJid, arrayList3);
                }
                arrayList2.add(new C02590Ca("rmr", (C04P[]) arrayList3.toArray(C40581sV.A0f), null, null));
            }
            c40581sV.A0R.A06(new C02590Ca("notification", (C04P[]) arrayList.toArray(C40581sV.A0f), (C02590Ca[]) arrayList2.toArray(new C02590Ca[0]), null));
            StringBuilder sb = new StringBuilder("xmpp/writer/write/media-retry-notification; id=");
            sb.append(str);
            sb.append("; jid=");
            sb.append(jid);
            sb.append("; remoteJid=");
            sb.append(abstractC005302j);
            sb.append("; fromMe=");
            sb.append(z);
            sb.append("; participant=");
            sb.append(userJid);
            sb.append("; errorCode=");
            C000200d.A1F(sb, i);
            return;
        }
        throw null;
    }

    public void A1j(String str, Jid jid, List list, final C0I2 c0i2) {
        C40581sV c40581sV = this.A00.A00;
        if (str == null) {
            int i = c40581sV.A00 + 1;
            c40581sV.A00 = i;
            str = Integer.toHexString(i);
        }
        c40581sV.A0c.put(str, new C0SF() { // from class: X.2TA
            @Override // X.C0SF
            public void A00(int i2) {
                C0I3 c0i3 = C0I3.this;
                if (c0i3 != null) {
                    c0i3.ARv(i2);
                }
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
            }

            @Override // X.C0SF
            public void A04(Exception exc) {
                C0I4 c0i4 = c0i2;
                if (c0i4 != null) {
                    c0i4.ARz(exc);
                }
            }
        });
        C26W c26w = c40581sV.A0H;
        C466127n c466127n = c40581sV.A0S;
        if (c26w != null) {
            C02590Ca[] c02590CaArr = new C02590Ca[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                c02590CaArr[i2] = new C02590Ca("recipient", new C04P[]{new C04P("jid", (Jid) list.get(i2))}, null, null);
            }
            c40581sV.A0V(str, "e", c466127n.A0B(new C02590Ca("action", (C04P[]) null, new C02590Ca("broadcast", new C04P[]{new C04P("jid", jid), new C04P("type", "modify", null, (byte) 0)}, c02590CaArr, null))));
            StringBuilder sb = new StringBuilder("xmpp/writer/write/web-broadcast-list-recipients; jid=");
            sb.append(jid);
            Log.i(sb.toString());
            return;
        }
        throw null;
    }

    public void A1k(String str, C011005l c011005l, String str2, String str3, String str4, final InterfaceC07560Ys interfaceC07560Ys, C04500Kk c04500Kk) {
        C02590Ca c02590Ca;
        if (!interfaceC07560Ys.AFq()) {
            C40581sV c40581sV = this.A00.A00;
            if (str == null) {
                int i = c40581sV.A00 + 1;
                c40581sV.A00 = i;
                str = Integer.toHexString(i);
            }
            c40581sV.A0c.put(str, new C0SF() { // from class: X.2TB
                @Override // X.C0SF
                public void A00(int i2) {
                    InterfaceC07560Ys.this.AJp(i2);
                }

                @Override // X.C0SF
                public void A03(C02590Ca c02590Ca2) {
                    InterfaceC07560Ys.this.APE();
                }
            });
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str2)) {
                C000200d.A1A("prev", str2, arrayList);
            }
            if (!TextUtils.isEmpty(str3)) {
                C000200d.A1A("id", str3, arrayList);
            }
            if (!TextUtils.isEmpty(str4)) {
                c02590Ca = new C02590Ca("body", (C04P[]) null, str4);
            } else {
                C000200d.A1A("delete", "true", arrayList);
                c02590Ca = null;
            }
            C02590Ca c02590Ca2 = new C02590Ca("description", (C04P[]) arrayList.toArray(C40581sV.A0f), c02590Ca);
            C04P[] c04pArr = new C04P[c04500Kk == null ? 4 : 5];
            c04pArr[0] = new C04P("id", str, null, (byte) 0);
            c04pArr[1] = new C04P("xmlns", "w:g2", null, (byte) 0);
            c04pArr[2] = new C04P("type", "set", null, (byte) 0);
            c04pArr[3] = new C04P("to", c011005l);
            if (c04500Kk != null) {
                c04pArr[4] = new C04P("web", c04500Kk.A00, null, (byte) 0);
            }
            c40581sV.A0R.A06(new C02590Ca("iq", c04pArr, c02590Ca2));
            Log.i("xmpp/writer/set-description");
            return;
        }
        StringBuilder sb = new StringBuilder("xmpp/writer/write/set-description/timeout; groupId=");
        sb.append(c011005l);
        Log.e(sb.toString());
    }

    public void A1l(String str, final UserJid userJid) {
        final C40581sV c40581sV = this.A00.A00;
        if (str == null) {
            int i = c40581sV.A00 + 1;
            c40581sV.A00 = i;
            str = Integer.toHexString(i);
        }
        c40581sV.A0c.put(str, new C0SF() { // from class: X.2TC
            @Override // X.C0SF
            public void A00(int i2) {
                C467628d c467628d = C40581sV.this.A0G;
                UserJid userJid2 = userJid;
                if (c467628d != null) {
                    StringBuilder sb = new StringBuilder("xmpp/reader/on-get-biz-vname-cert-error jid=");
                    sb.append(userJid2);
                    sb.append(" code=");
                    sb.append(i2);
                    Log.i(sb.toString());
                    InterfaceC467728e interfaceC467728e = c467628d.A00;
                    Message obtain = Message.obtain(null, 0, 110, 0);
                    Bundle data = obtain.getData();
                    data.putParcelable("jid", userJid2);
                    data.putInt("errorCode", i2);
                    ((HandlerC467828f) interfaceC467728e).A00(obtain);
                    return;
                }
                throw null;
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                Object obj;
                UserJid userJid2;
                C02590Ca A0D = c02590Ca.A0D("verified_name");
                if (A0D != null) {
                    C40581sV c40581sV2 = C40581sV.this;
                    UserJid userJid3 = (UserJid) A0D.A08(UserJid.class, "jid", c40581sV2.A04);
                    if (userJid3 == null && (userJid2 = userJid) != null) {
                        userJid3 = userJid2;
                    }
                    C04P A0A = A0D.A0A("v");
                    if (A0A != null) {
                        str2 = A0A.A03;
                    } else {
                        str2 = null;
                    }
                    C04P A0A2 = A0D.A0A("verified_level");
                    if (A0A2 != null) {
                        str3 = A0A2.A03;
                    } else {
                        str3 = null;
                    }
                    long A07 = A0D.A07("serial", 0L);
                    C04P A0A3 = A0D.A0A("host_storage");
                    if (A0A3 != null) {
                        str4 = A0A3.A03;
                    } else {
                        str4 = null;
                    }
                    C04P A0A4 = A0D.A0A("actual_actors");
                    if (A0A4 != null) {
                        str5 = A0A4.A03;
                    } else {
                        str5 = null;
                    }
                    C04P A0A5 = A0D.A0A("privacy_mode_ts");
                    if (A0A5 != null) {
                        str6 = A0A5.A03;
                    } else {
                        str6 = null;
                    }
                    C05200Ns c05200Ns = new C05200Ns(str4, str5, str6);
                    if ("1".equals(str2) && str3 != null) {
                        byte[] bArr = A0D.A01;
                        int A00 = C003101m.A00(str3);
                        C467628d c467628d = c40581sV2.A0G;
                        if (c467628d != null) {
                            StringBuilder A0U = C000200d.A0U("xmpp/reader/on-get-biz-vname-cert jid=", userJid3, " certBlob=[");
                            if (bArr != null) {
                                obj = Integer.valueOf(bArr.length);
                            } else {
                                obj = "null";
                            }
                            A0U.append(obj);
                            A0U.append("] vlevel=");
                            A0U.append(A00);
                            A0U.append(". privactMode=");
                            A0U.append(c05200Ns);
                            Log.i(A0U.toString());
                            InterfaceC467728e interfaceC467728e = c467628d.A00;
                            Message obtain = Message.obtain(null, 0, 109, 0);
                            Bundle data = obtain.getData();
                            data.putParcelable("jid", userJid3);
                            data.putByteArray("certBlob", bArr);
                            data.putLong("serial", A07);
                            data.putInt("vlevel", A00);
                            data.putInt("host_storage", c05200Ns.hostStorage);
                            data.putInt("actual_actors", c05200Ns.actualActors);
                            data.putLong("privacy_mode_ts", c05200Ns.privacyModeTs);
                            ((HandlerC467828f) interfaceC467728e).A00(obtain);
                            return;
                        }
                        throw null;
                    }
                    StringBuilder sb = new StringBuilder("unknown vname cert payload version or vlevel: v=");
                    sb.append(str2);
                    sb.append(" vlevel=");
                    sb.append(str3);
                    Log.w(sb.toString());
                    return;
                }
                throw null;
            }
        });
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("id", str, null, (byte) 0), new C04P("xmlns", "w:biz", null, (byte) 0), new C04P("type", "get", null, (byte) 0)}, new C02590Ca("verified_name", new C04P[]{new C04P("jid", userJid)}, null, null)));
        Log.i("xmpp/writer/write/get-biz-vname-cert");
    }

    public void A1m(String str, UserJid userJid, int i, boolean z) {
        String str2;
        C40581sV c40581sV = this.A00.A00;
        C466127n c466127n = c40581sV.A0R;
        if (c40581sV.A0M != null) {
            C04P[] c04pArr = {new C04P("to", userJid), new C04P("type", "pay", null, (byte) 0), new C04P("id", str, null, (byte) 0)};
            C02590Ca[] c02590CaArr = new C02590Ca[1];
            C04P[] c04pArr2 = new C04P[3];
            c04pArr2[0] = new C04P("type", "account-set-up", null, (byte) 0);
            if (i == 1) {
                str2 = "FBPAY";
            } else if (i == 2) {
                str2 = "NOVI";
            } else if (i != 3) {
                throw null;
            } else {
                str2 = "UPI";
            }
            c04pArr2[1] = new C04P("service", str2, null, (byte) 0);
            c04pArr2[2] = new C04P("invite-used", z ? 1 : 0);
            c02590CaArr[0] = new C02590Ca("invite", c04pArr2, null, null);
            c466127n.A06(new C02590Ca("notification", c04pArr, c02590CaArr, null));
            return;
        }
        throw null;
    }

    public void A1n(String str, UserJid userJid, UserJid userJid2, UserJid userJid3) {
        C40581sV c40581sV = this.A00.A00;
        if (c40581sV != null) {
            C03950Hv c03950Hv = new C03950Hv(userJid, 13);
            c03950Hv.A07 = userJid2;
            c03950Hv.A08 = userJid3;
            c40581sV.A0V(str, "a", c40581sV.A0S.A0B(new C02590Ca("action", (C04P[]) null, C40581sV.A02(c03950Hv))));
            return;
        }
        throw null;
    }

    public void A1o(String str, UserJid userJid, String str2, AnonymousClass094 anonymousClass094, C0I2 c0i2) {
        this.A00.A00.A0R(str, anonymousClass094, userJid, str2, c0i2, c0i2);
        Log.i("xmpp/writer/write/send-web-status-message-seen");
    }

    public void A1p(String str, UserJid userJid, String str2, AnonymousClass094 anonymousClass094, String str3, C0I2 c0i2) {
        if (userJid == null || userJid.getType() != 11) {
            this.A00.A00.A0R(str, anonymousClass094, userJid, str2, c0i2, c0i2);
        }
        C40581sV c40581sV = this.A00.A00;
        String str4 = anonymousClass094.A01;
        boolean z = anonymousClass094.A02;
        AbstractC005302j abstractC005302j = anonymousClass094.A00;
        if (abstractC005302j != null) {
            c40581sV.A0U(str4, str3, z, abstractC005302j, userJid);
            Log.i("xmpp/writer/write/send-web-status-revoked");
            return;
        }
        throw null;
    }

    public void A1q(String str, UserJid userJid, String str2, byte[] bArr) {
        C40581sV c40581sV = this.A00.A00;
        if (userJid == null) {
            throw null;
        }
        if (c40581sV != null) {
            c40581sV.A0V(str, "0", c40581sV.A0S.A0B(new C02590Ca("action", (C04P[]) null, new C02590Ca("call", new C04P[]{new C04P("id", str, null, (byte) 0), new C04P("from", userJid)}, new C02590Ca("offer", new C04P[]{new C04P("call-id", str2, null, (byte) 0)}, C40581sV.A04(bArr))))));
            Log.i("xmpp/writer/write/send-web-offer-key");
            return;
        }
        throw null;
    }

    public void A1r(String str, UserJid userJid, String str2, byte[] bArr, final C0I2 c0i2) {
        C40581sV c40581sV = this.A00.A00;
        c40581sV.A0c.put(str, new C0SF() { // from class: X.2TD
            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
            }

            @Override // X.C0SF
            public void A00(int i) {
                C0I3 c0i3 = C0I3.this;
                if (c0i3 != null) {
                    c0i3.ARv(i);
                }
            }
        });
        c40581sV.A0V(str, "r", c40581sV.A0S.A0B(new C02590Ca("action", (C04P[]) null, new C02590Ca("identity", new C04P[]{new C04P("jid", userJid)}, new C02590Ca[]{new C02590Ca("raw", null, null, bArr), new C02590Ca("text", (C04P[]) null, str2)}, null))));
        StringBuilder sb = new StringBuilder("xmpp/writer/write/web-identity-changed/");
        sb.append(userJid);
        Log.i(sb.toString());
    }

    public void A1s(String str, UserJid userJid, boolean z) {
        C40581sV c40581sV = this.A00.A00;
        C463026g c463026g = c40581sV.A0M;
        C466127n c466127n = c40581sV.A0R;
        if (c463026g != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C04P("id", str, null, (byte) 0));
            arrayList.add(new C04P("to", userJid));
            arrayList.add(new C04P("type", z ? "upi-intent-to-send" : "upi-user-set-up", null, (byte) 0));
            c466127n.A06(new C02590Ca("notification", (C04P[]) arrayList.toArray(new C04P[0]), null, null));
            return;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1t(java.lang.String r9, X.AnonymousClass094 r10, int r11, final X.C0I2 r12) {
        /*
            r8 = this;
            X.2SA r0 = r8.A00
            X.1sV r4 = r0.A00
            r3 = 1
            if (r9 != 0) goto L10
            int r0 = r4.A00
            int r0 = r0 + r3
            r4.A00 = r0
            java.lang.String r9 = java.lang.Integer.toHexString(r0)
        L10:
            java.util.Map r1 = r4.A0c
            r5 = 0
            X.2TE r0 = new X.2TE
            r0.<init>()
            r1.put(r9, r0)
            if (r11 == 0) goto L7a
            r0 = 13
            if (r11 == r0) goto L77
            r0 = 7
            if (r11 == r0) goto L7a
            r0 = 8
            if (r11 == r0) goto L74
            java.lang.String r2 = "message"
        L2a:
            r0 = 4
            X.04P[] r6 = new X.C04P[r0]
            r7 = 0
            java.lang.String r1 = "type"
            X.04P r0 = new X.04P
            r0.<init>(r1, r2, r5, r7)
            r6[r7] = r0
            java.lang.String r2 = r10.A01
            java.lang.String r1 = "index"
            X.04P r0 = new X.04P
            r0.<init>(r1, r2, r5, r7)
            r6[r3] = r0
            r3 = 2
            boolean r0 = r10.A02
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "owner"
            X.04P r0 = new X.04P
            r0.<init>(r1, r2, r5, r7)
            r6[r3] = r0
            r3 = 3
            X.02j r2 = r10.A00
            if (r2 == 0) goto L7d
            java.lang.String r1 = "jid"
            X.04P r0 = new X.04P
            r0.<init>(r1, r2)
            r6[r3] = r0
            java.lang.String r0 = "received"
            X.0Ca r2 = new X.0Ca
            r2.<init>(r0, r6, r5, r5)
            java.lang.String r0 = "action"
            X.0Ca r1 = new X.0Ca
            r1.<init>(r0, r5, r2)
            java.lang.String r0 = "9"
            r4.A0T(r9, r0, r1)
            return
        L74:
            java.lang.String r2 = "played"
            goto L2a
        L77:
            java.lang.String r2 = "read"
            goto L2a
        L7a:
            java.lang.String r2 = "error"
            goto L2a
        L7d:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07420Yd.A1t(java.lang.String, X.094, int, X.0I2):void");
    }

    public void A1u(String str, C05020My c05020My, C0SF c0sf) {
        C40581sV c40581sV = this.A00.A00;
        c40581sV.A0c.put(str, c0sf);
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("xmlns", "encrypt", null, (byte) 0), new C04P("type", "set", null, (byte) 0), new C04P("to", C04260Jm.A00), new C04P("id", str, null, (byte) 0)}, new C02590Ca("rotate", (C04P[]) null, new C02590Ca("skey", null, new C02590Ca[]{new C02590Ca("id", null, null, c05020My.A01), new C02590Ca("value", null, null, c05020My.A00), new C02590Ca("signature", null, null, c05020My.A02)}, null))));
        Log.i("xmpp/writer/write/rotate-pre-key");
    }

    public void A1v(String str, C04500Kk c04500Kk) {
        C40581sV c40581sV = this.A00.A00;
        if (c40581sV != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C04P("type", "available", null, (byte) 0));
            C000200d.A1A("name", str, arrayList);
            if (c04500Kk != null) {
                arrayList.add(new C04P("id", c04500Kk.A01, null, (byte) 0));
                arrayList.add(new C04P("web", c04500Kk.A00, null, (byte) 0));
            }
            c40581sV.A0R.A06(new C02590Ca("presence", (C04P[]) arrayList.toArray(C40581sV.A0f), null, null));
            StringBuilder sb = new StringBuilder("xmpp/writer/write/push-name; pushName=");
            sb.append(str);
            Log.i(sb.toString());
            return;
        }
        throw null;
    }

    public void A1w(String str, C04980Ms c04980Ms) {
        C40581sV c40581sV = this.A00.A00;
        int i = c40581sV.A00 + 1;
        c40581sV.A00 = i;
        String hexString = Integer.toHexString(i);
        AbstractCollection abstractCollection = (AbstractCollection) c04980Ms.A02(false);
        abstractCollection.add(new C04P("type", "add", null, (byte) 0));
        c40581sV.A0T(hexString, "0", new C02590Ca("action", new C04P[]{new C04P("checksum", str, null, (byte) 0)}, new C02590Ca("starred_stickers", (C04P[]) abstractCollection.toArray(new C04P[abstractCollection.size()]), null, null)));
        Log.i("xmpp/writer/write/send-web-starred-stickers-add");
    }

    public void A1x(String str, Long l) {
        C40581sV c40581sV = this.A00.A00;
        if (str != null) {
            int i = c40581sV.A00 + 1;
            c40581sV.A00 = i;
            String hexString = Integer.toHexString(i);
            c40581sV.A0c.put(hexString, new C0SF() { // from class: X.2TF
                @Override // X.C0SF
                public void A03(C02590Ca c02590Ca) {
                }
            });
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            C000200d.A1A("type", str, arrayList2);
            if (l != null) {
                arrayList2.add(new C04P("timestamp", l.longValue()));
            }
            arrayList.add(new C02590Ca("clean", (C04P[]) arrayList2.toArray(C40581sV.A0f), null, null));
            c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("id", hexString, null, (byte) 0), new C04P("xmlns", "urn:xmpp:whatsapp:dirty", null, (byte) 0), new C04P("type", "set", null, (byte) 0), new C04P("to", C04260Jm.A00)}, (C02590Ca[]) arrayList.toArray(new C02590Ca[0]), null));
            StringBuilder sb = new StringBuilder("xmpp/writer/write/clear-dirty; category=");
            sb.append(str);
            sb.append("; timestamp=");
            sb.append(l);
            Log.i(sb.toString());
            return;
        }
        throw null;
    }

    public void A1y(final String str, final String str2) {
        final C40581sV c40581sV = this.A00.A00;
        int i = c40581sV.A00 + 1;
        c40581sV.A00 = i;
        String hexString = Integer.toHexString(i);
        c40581sV.A0c.put(hexString, new C0SF() { // from class: X.2TG
            @Override // X.C0SF
            public void A01(int i2, String str3) {
                C40581sV.this.A0G.A0C(str, str2, i2, str3);
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                C467628d c467628d = C40581sV.this.A0G;
                String str3 = str;
                String str4 = str2;
                if (c467628d != null) {
                    Log.i("xmpp/reader/on-set-two-factor-auth-confirmation");
                    InterfaceC467728e interfaceC467728e = c467628d.A00;
                    Bundle bundle = new Bundle();
                    bundle.putString("code", str3);
                    bundle.putString("email", str4);
                    ((HandlerC467828f) interfaceC467728e).A00(Message.obtain(null, 0, 102, 0, bundle));
                    return;
                }
                throw null;
            }

            @Override // X.C0SF
            public void A04(Exception exc) {
                C40581sV.this.A0G.A0C(str, str2, -1, exc.getMessage());
            }
        });
        ArrayList arrayList = new ArrayList(2);
        if (str != null) {
            C000200d.A1B("code", str, arrayList);
        }
        if (str2 != null) {
            C000200d.A1B("email", str2, arrayList);
        }
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("to", C04260Jm.A00), new C04P("id", hexString, null, (byte) 0), new C04P("xmlns", "urn:xmpp:whatsapp:account", null, (byte) 0), new C04P("type", "set", null, (byte) 0)}, new C02590Ca("2fa", null, (C02590Ca[]) arrayList.toArray(new C02590Ca[0]), null)));
    }

    public void A1z(String str, String str2) {
        C40581sV c40581sV = this.A00.A00;
        int i = c40581sV.A00 + 1;
        c40581sV.A00 = i;
        c40581sV.A0T(Integer.toHexString(i), "0", new C02590Ca("action", new C04P[]{new C04P("checksum", str, null, (byte) 0)}, new C02590Ca("recent_stickers", new C04P[]{new C04P("type", "delete", null, (byte) 0), new C04P("filehash", str2, null, (byte) 0)}, null, null)));
        Log.i("xmpp/writer/write/send-web-recent-stickers-delete");
    }

    public void A20(String str, String str2) {
        C40581sV c40581sV = this.A00.A00;
        int i = c40581sV.A00 + 1;
        c40581sV.A00 = i;
        c40581sV.A0T(Integer.toHexString(i), "0", new C02590Ca("action", new C04P[]{new C04P("checksum", str, null, (byte) 0)}, new C02590Ca("starred_stickers", new C04P[]{new C04P("type", "delete", null, (byte) 0), new C04P("filehash", str2, null, (byte) 0)}, null, null)));
        Log.i("xmpp/writer/write/send-web-starred-stickers-delete");
    }

    public void A21(String str, String str2, String str3) {
        C40581sV c40581sV = this.A00.A00;
        int i = c40581sV.A00 + 1;
        c40581sV.A00 = i;
        String hexString = Integer.toHexString(i);
        ArrayList arrayList = new ArrayList(2);
        C000200d.A1A("type", str2, arrayList);
        if (!TextUtils.isEmpty(str3)) {
            C000200d.A1A("id", str3, arrayList);
        }
        c40581sV.A0T(hexString, "0", new C02590Ca("action", new C04P[]{new C04P("checksum", str, null, (byte) 0)}, new C02590Ca("sticker_pack", (C04P[]) arrayList.toArray(C40581sV.A0f), null, null)));
        Log.i("xmpp/writer/write/send-web-sticker-packs-update");
    }

    public void A22(String str, String str2, String str3, int i) {
        C02590Ca[] c02590CaArr;
        C02590Ca c02590Ca;
        final C40581sV c40581sV = this.A00.A00;
        int i2 = c40581sV.A00 + 1;
        c40581sV.A00 = i2;
        String hexString = Integer.toHexString(i2);
        c40581sV.A0c.put(hexString, new C0SF() { // from class: X.2TH
            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca2) {
                C02590Ca.A01(c02590Ca2.A0C(0), "remove");
                C467628d c467628d = C40581sV.this.A0G;
                if (c467628d != null) {
                    Log.i("xmpp/reader/read/removeaccount");
                    ((HandlerC467828f) c467628d.A00).A00(Message.obtain(null, 0, 12, 0));
                    return;
                }
                throw null;
            }
        });
        if (str3 != null) {
            if (str == null) {
                str = "";
            }
            String str4 = str2 != null ? str2 : "";
            if (i >= 0) {
                c02590Ca = new C02590Ca("body", new C04P[]{new C04P("lg", str, null, (byte) 0), new C04P("lc", str4, null, (byte) 0), new C04P("reason", Integer.toString(i), null, (byte) 0)}, str3);
            } else {
                c02590Ca = new C02590Ca("body", new C04P[]{new C04P("lg", str, null, (byte) 0), new C04P("lc", str4, null, (byte) 0)}, str3);
            }
            c02590CaArr = new C02590Ca[]{c02590Ca};
        } else {
            c02590CaArr = null;
        }
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("to", C04260Jm.A00), new C04P("xmlns", "urn:xmpp:whatsapp:account", null, (byte) 0), new C04P("type", "get", null, (byte) 0), new C04P("id", hexString, null, (byte) 0)}, new C02590Ca("remove", null, c02590CaArr, null)));
        Log.i("xmpp/writer/write/remove-account");
    }

    public void A23(final String str, String str2, final String str3, final String str4, int i, final String str5, int i2, byte[] bArr, boolean z, boolean z2, String str6, String str7, String str8, boolean z3) {
        final C40581sV c40581sV = this.A00.A00;
        int i3 = c40581sV.A00 + 1;
        c40581sV.A00 = i3;
        String hexString = Integer.toHexString(i3);
        c40581sV.A0c.put(hexString, new C0SF() { // from class: X.2TI
            @Override // X.C0SF
            public void A00(int i4) {
                C40581sV.this.A0G.A0A(str5, i4);
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                String str9;
                String str10;
                boolean z4;
                String str11;
                C02590Ca A0D = c02590Ca.A0D("sync");
                if (A0D != null) {
                    C02590Ca A0D2 = A0D.A0D("platform");
                    if (A0D2 != null) {
                        C04P A0A = A0D2.A0A("os");
                        if (A0A != null) {
                            str9 = A0A.A03;
                        } else {
                            str9 = null;
                        }
                        C04P A0A2 = A0D2.A0A("browser");
                        if (A0A2 != null) {
                            str10 = A0A2.A03;
                        } else {
                            str10 = null;
                        }
                        C04P A0A3 = A0D2.A0A("type");
                        if (A0A3 != null) {
                            str11 = A0A3.A03;
                        } else {
                            str11 = null;
                        }
                        AnonymousClass024.A01(str11, 0);
                    } else {
                        str9 = null;
                        str10 = null;
                    }
                    z4 = A0D.A0D("timeout") != null;
                    A0D.A0D("fservice");
                } else {
                    str9 = null;
                    str10 = null;
                    z4 = false;
                }
                C467628d c467628d = C40581sV.this.A0G;
                String str12 = str5;
                String str13 = str;
                String str14 = str3;
                String str15 = str4;
                if (c467628d != null) {
                    StringBuilder sb = new StringBuilder("xmpp/reader/read/on-qr-sync-success ");
                    sb.append(str12);
                    sb.append(' ');
                    sb.append(str14);
                    Log.i(sb.toString());
                    ((HandlerC467828f) c467628d.A00).A00(Message.obtain(null, 0, 28, 0, new C2UI(str12, str13, str14, str15, str9, str10, z4)));
                    return;
                }
                throw null;
            }
        });
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C04P("version", "0.17.11", null, (byte) 0));
        C000200d.A1A("url", "true", arrayList);
        if (i == 1) {
            C000200d.A1A("web", "response", arrayList);
        } else if (i == 2) {
            C000200d.A1A("web", "resume", arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        C04P[] c04pArr = C40581sV.A0f;
        arrayList2.add(new C02590Ca("sync", (C04P[]) arrayList.toArray(c04pArr), str5));
        C04P[] c04pArr2 = new C04P[3];
        c04pArr2[0] = new C04P("value", Integer.toString(i2), null, (byte) 0);
        c04pArr2[1] = new C04P("live", z ? "true" : "false", null, (byte) 0);
        c04pArr2[2] = new C04P("powersave", z2 ? "true" : "false", null, (byte) 0);
        arrayList2.add(new C02590Ca("battery", c04pArr2, null, null));
        arrayList2.add(new C02590Ca("code", (C04P[]) null, str4));
        ArrayList arrayList3 = new ArrayList();
        if (str6 != null) {
            C000200d.A1A("lc", str6, arrayList3);
        }
        if (str7 != null) {
            C000200d.A1A("lg", str7, arrayList3);
        }
        C000200d.A1A("locales", str8, arrayList3);
        if (z3) {
            C000200d.A1A("t", "24", arrayList3);
        }
        arrayList2.add(new C02590Ca("config", (C04P[]) arrayList3.toArray(c04pArr), null, null));
        if (str2 != null) {
            C000200d.A1B("password", str2, arrayList2);
        }
        if (bArr != null) {
            C000200d.A1D("features", bArr, arrayList2);
        }
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("type", "set", null, (byte) 0), new C04P("xmlns", "w:web", null, (byte) 0), new C04P("id", hexString, null, (byte) 0)}, (C02590Ca[]) arrayList2.toArray(new C02590Ca[0]), null));
        StringBuilder sb = new StringBuilder("xmpp/writer/write/web-sync; ref=");
        sb.append(str5);
        sb.append("; browserId=");
        C000200d.A1U(sb, str3, "; loginToken=", str4, "; loginType=");
        C000200d.A1H(sb, i, "; batteryLevel=", i2, "; plugged=");
        sb.append(z);
        sb.append("; locale=");
        sb.append(str6);
        sb.append("; language=");
        C000200d.A1U(sb, str7, "; locales=\"", str8, "\"; is24h=");
        sb.append(z3);
        sb.append("; biz=");
        sb.append(false);
        Log.i(sb.toString());
    }

    public void A24(String str, String str2, boolean z) {
        C40581sV c40581sV = this.A00.A00;
        c40581sV.A0c.put(str, new C0SF() { // from class: X.2TJ
            @Override // X.C0SF
            public void A00(int i) {
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
            }
        });
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("type", "set", null, (byte) 0), new C04P("xmlns", "w:web", null, (byte) 0), new C04P("id", str, null, (byte) 0)}, new C02590Ca(z ? "sync" : "deny", new C04P[]{new C04P("web", "query", null, (byte) 0)}, str2)));
        StringBuilder sb = new StringBuilder("xmpp/writer/write/web-pong; id=");
        sb.append(str);
        sb.append("; ref=");
        sb.append(str2);
        sb.append("; active=");
        sb.append(z);
        Log.i(sb.toString());
    }

    public void A25(String str, String str2, boolean z, AbstractC005302j abstractC005302j, AbstractC005302j abstractC005302j2) {
        this.A00.A00.A0U(str, str2, z, abstractC005302j, abstractC005302j2);
        Log.i("xmpp/writer/write/send-web-revoke-message-notif");
    }

    public void A26(String str, List list) {
        C40581sV c40581sV = this.A00.A00;
        if (c40581sV != null) {
            if (str == null) {
                int i = c40581sV.A00 + 1;
                c40581sV.A00 = i;
                str = Integer.toHexString(i);
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C20v c20v = (C20v) it.next();
                String str2 = c20v.A0G;
                C04P[] c04pArr = new C04P[1];
                AbstractC005302j abstractC005302j = c20v.A0A;
                if (abstractC005302j != null) {
                    c04pArr[0] = new C04P("jid", abstractC005302j);
                    arrayList.add(new C02590Ca(str2, c04pArr, null, null));
                } else {
                    throw null;
                }
            }
            c40581sV.A0T(str, "t", new C02590Ca("action", (C04P[]) null, new C02590Ca("contacts", new C04P[]{new C04P("type", "frequent", null, (byte) 0)}, (C02590Ca[]) arrayList.toArray(new C02590Ca[0]), null)));
            Log.i("xmpp/writer/write/send-web-frequent-contacts");
            return;
        }
        throw null;
    }

    public void A27(String str, List list, int i, Map map, final C0I2 c0i2, Map map2) {
        String str2;
        String obj;
        String str3;
        C40581sV c40581sV = this.A00.A00;
        if (c40581sV != null) {
            if (i == 7 || i == 8) {
                StringBuilder A0P = C000200d.A0P("preempt-");
                if (str == null) {
                    int i2 = c40581sV.A00 + 1;
                    c40581sV.A00 = i2;
                    str2 = Integer.toHexString(i2);
                } else {
                    str2 = str;
                }
                A0P.append(str2);
                obj = A0P.toString();
            } else {
                obj = str;
            }
            c40581sV.A0c.put(obj, new C0SF() { // from class: X.2TK
                @Override // X.C0SF
                public void A00(int i3) {
                    C0I3 c0i3 = C0I3.this;
                    if (c0i3 != null) {
                        c0i3.ARv(i3);
                    }
                }

                @Override // X.C0SF
                public void A03(C02590Ca c02590Ca) {
                }

                @Override // X.C0SF
                public void A04(Exception exc) {
                    C0I4 c0i4 = c0i2;
                    if (c0i4 != null) {
                        c0i4.ARz(exc);
                    }
                }
            });
            switch (i) {
                case 0:
                case 7:
                case 9:
                    str3 = "4";
                    break;
                case 1:
                case 3:
                case 18:
                case 25:
                case 26:
                default:
                    str3 = "0";
                    break;
                case 2:
                case 8:
                case 10:
                    str3 = "5";
                    break;
                case 4:
                case 23:
                    str3 = "3";
                    break;
                case 5:
                    str3 = "1";
                    break;
                case 6:
                    str3 = "2";
                    break;
                case GoogleMigrateImporterActivity.A0E /* 11 */:
                    str3 = "6";
                    break;
                case 12:
                    str3 = "i";
                    break;
                case 13:
                    str3 = "h";
                    break;
                case 14:
                case 15:
                    str3 = "j";
                    break;
                case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                    str3 = "k";
                    break;
                case 17:
                    str3 = "l";
                    break;
                case 19:
                case 24:
                    str3 = "n";
                    break;
                case C0M6.A01 /* 20 */:
                    str3 = "o";
                    break;
                case 21:
                    str3 = "p";
                    break;
                case 22:
                    str3 = "q";
                    break;
                case 27:
                case 28:
                    str3 = "u";
                    break;
            }
            c40581sV.A0V(obj, str3, c40581sV.A0H.A04(c40581sV.A0S, i, list, map, map2));
            C000200d.A1R(new StringBuilder("xmpp/writer/write/web-response; id="), str, "; webQueryType=", i);
            return;
        }
        throw null;
    }

    public void A28(String str, List list, final C0I2 c0i2) {
        C40581sV c40581sV = this.A00.A00;
        if (c40581sV != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C02590Ca A02 = C40581sV.A02((C03950Hv) it.next());
                if (A02 != null) {
                    arrayList.add(A02);
                }
            }
            if (!arrayList.isEmpty()) {
                C02590Ca[] c02590CaArr = (C02590Ca[]) arrayList.toArray(new C02590Ca[0]);
                if (str == null) {
                    int i = c40581sV.A00 + 1;
                    c40581sV.A00 = i;
                    str = Integer.toHexString(i);
                }
                c40581sV.A0c.put(str, new C0SF() { // from class: X.2TL
                    @Override // X.C0SF
                    public void A00(int i2) {
                        C0I3 c0i3 = C0I3.this;
                        if (c0i3 != null) {
                            c0i3.ARv(i2);
                        }
                    }

                    @Override // X.C0SF
                    public void A03(C02590Ca c02590Ca) {
                    }

                    @Override // X.C0SF
                    public void A04(Exception exc) {
                        C0I4 c0i4 = c0i2;
                        if (c0i4 != null) {
                            c0i4.ARz(exc);
                        }
                    }
                });
                c40581sV.A0T(str, "a", new C02590Ca("action", null, c02590CaArr, null));
            }
            Log.i("xmpp/writer/write/web-conversation-update");
            return;
        }
        throw null;
    }

    public void A29(String str, List list, String str2, final C0I2 c0i2) {
        C40581sV c40581sV = this.A00.A00;
        if (str == null) {
            int i = c40581sV.A00 + 1;
            c40581sV.A00 = i;
            str = Integer.toHexString(i);
        }
        c40581sV.A0c.put(str, new C0SF() { // from class: X.2TM
            @Override // X.C0SF
            public void A00(int i2) {
                C0I3 c0i3 = C0I3.this;
                if (c0i3 != null) {
                    c0i3.ARv(i2);
                }
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
            }

            @Override // X.C0SF
            public void A04(Exception exc) {
                C0I4 c0i4 = c0i2;
                if (c0i4 != null) {
                    c0i4.ARz(exc);
                }
            }
        });
        ArrayList arrayList = new ArrayList(list.size());
        C26W.A03(list, arrayList);
        if (!arrayList.isEmpty()) {
            c40581sV.A0T(str, "b", new C02590Ca("action", str2 == null ? null : new C04P[]{new C04P("checksum", str2, null, (byte) 0)}, (C02590Ca[]) arrayList.toArray(new C02590Ca[0]), null));
        }
        Log.i("xmpp/writer/write/web-contact-updates");
    }

    public void A2A(String str, final boolean z) {
        final C40581sV c40581sV = this.A00.A00;
        if (str == null) {
            int i = c40581sV.A00 + 1;
            c40581sV.A00 = i;
            str = Integer.toHexString(i);
        }
        c40581sV.A0c.put(str, new C0SF() { // from class: X.2TN
            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                C467628d c467628d = C40581sV.this.A0G;
                boolean z2 = z;
                if (c467628d != null) {
                    C000200d.A1C("xmpp/reader/read/connectionactive/set ", z2);
                    ((HandlerC467828f) c467628d.A00).A00(Message.obtain(null, 0, 87, 0, Boolean.valueOf(z2)));
                    return;
                }
                throw null;
            }
        });
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("id", str, null, (byte) 0), new C04P("xmlns", "passive", null, (byte) 0), new C04P("type", "set", null, (byte) 0), new C04P("to", C04260Jm.A00)}, new C02590Ca(z ? "active" : "passive", null, null, null)));
        StringBuilder sb = new StringBuilder("xmpp/writer/write/set-connection-active; active=");
        sb.append(z);
        Log.i(sb.toString());
    }

    public void A2B(String str, byte[] bArr) {
        final C40581sV c40581sV = this.A00.A00;
        if (c40581sV != null) {
            if (bArr.length != 0) {
                if (str == null) {
                    int i = c40581sV.A00 + 1;
                    c40581sV.A00 = i;
                    str = Integer.toHexString(i);
                }
                c40581sV.A0c.put(str, new C0SF() { // from class: X.2TO
                    @Override // X.C0SF
                    public void A02(C02590Ca c02590Ca) {
                        String str2;
                        String str3;
                        C02590Ca A0D = c02590Ca.A0D("error");
                        if (A0D != null) {
                            C04P A0A = A0D.A0A("code");
                            if (A0A != null) {
                                str2 = A0A.A03;
                            } else {
                                str2 = null;
                            }
                            C02590Ca A0D2 = A0D.A0D("violation");
                            if (A0D2 != null) {
                                C04P A0A2 = A0D2.A0A("reason");
                                if (A0A2 != null) {
                                    str3 = A0A2.A03;
                                }
                                str3 = null;
                            } else {
                                C04P A0A3 = A0D.A0A("text");
                                if (A0A3 != null) {
                                    str3 = A0A3.A03;
                                }
                                str3 = null;
                            }
                            C467628d c467628d = C40581sV.this.A0G;
                            int intValue = Integer.valueOf(str2).intValue();
                            if (c467628d != null) {
                                StringBuilder sb = new StringBuilder("xmpp/reader/on-set-biz-vname-cert-error code: ");
                                sb.append(intValue);
                                sb.append(", reason: ");
                                sb.append(str3);
                                Log.w(sb.toString());
                                InterfaceC467728e interfaceC467728e = c467628d.A00;
                                Message obtain = Message.obtain(null, 0, 112, 0);
                                Bundle data = obtain.getData();
                                data.putInt("errorCode", intValue);
                                data.putString("errorReason", str3);
                                ((HandlerC467828f) interfaceC467728e).A00(obtain);
                                return;
                            }
                            throw null;
                        }
                    }

                    @Override // X.C0SF
                    public void A03(C02590Ca c02590Ca) {
                        String str2;
                        C02590Ca A0D = c02590Ca.A0D("verified_name");
                        if (A0D != null) {
                            C04P A0A = A0D.A0A("id");
                            if (A0A != null) {
                                str2 = A0A.A03;
                            } else {
                                str2 = null;
                            }
                            C467628d c467628d = C40581sV.this.A0G;
                            if (c467628d != null) {
                                Log.i("xmpp/reader/on-set-biz-vname-cert-success");
                                ((HandlerC467828f) c467628d.A00).A00(Message.obtain(null, 0, 111, 0, str2));
                                return;
                            }
                            throw null;
                        }
                        throw null;
                    }
                });
                c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("id", str, null, (byte) 0), new C04P("xmlns", "w:biz", null, (byte) 0), new C04P("type", "set", null, (byte) 0), new C04P("to", C04260Jm.A00)}, new C02590Ca("verified_name", new C04P[]{new C04P("v", "2", null, (byte) 0)}, null, bArr)));
                Log.i("xmpp/writer/write/set-biz-vname-cert");
                return;
            }
            throw new IllegalArgumentException("signedCertificate cannot be null or empty");
        }
        throw null;
    }

    public void A2C(String str, byte[] bArr) {
        C40581sV c40581sV = this.A00.A00;
        int i = c40581sV.A00 + 1;
        c40581sV.A00 = i;
        String hexString = Integer.toHexString(i);
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("type", "set", null, (byte) 0), new C04P("id", hexString, null, (byte) 0), new C04P("xmlns", "w:web", null, (byte) 0)}, new C02590Ca("notify", null, new C02590Ca[]{new C02590Ca("name", null, null, str.getBytes()), new C02590Ca("enc", null, null, bArr)}, null)));
        Log.i("xmpp/writer/write/send-set-notify");
    }

    public void A2D(String str, final DeviceJid[] deviceJidArr, DeviceJid[] deviceJidArr2) {
        Arrays.toString(deviceJidArr);
        final C40581sV c40581sV = this.A00.A00;
        c40581sV.A0c.put(str, new C0SF() { // from class: X.2TP
            @Override // X.C0SF
            public void A00(int i) {
                C40581sV.this.A0G.A0D(deviceJidArr, i);
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                byte b;
                C05020My c05020My;
                byte[] bArr;
                C02590Ca A0E = c02590Ca.A0E("list");
                DeviceJid[] deviceJidArr3 = deviceJidArr;
                int length = deviceJidArr3.length;
                HashSet hashSet = new HashSet(length);
                HashMap hashMap = new HashMap(length);
                C02590Ca[] c02590CaArr = A0E.A03;
                if (c02590CaArr != null) {
                    C40581sV c40581sV2 = C40581sV.this;
                    if (c40581sV2 != null) {
                        Arrays.sort(c02590CaArr, new C3TE(c40581sV2));
                        for (C02590Ca c02590Ca2 : c02590CaArr) {
                            Jid A09 = c02590Ca2.A09(DeviceJid.class, "jid", c40581sV2.A04);
                            C02590Ca A0D = c02590Ca2.A0D("error");
                            if (A0D != null) {
                                int A04 = A0D.A04("code");
                                hashSet.add(A09);
                                hashMap.put(A09, Integer.valueOf(A04));
                            } else {
                                C02590Ca A0E2 = c02590Ca2.A0E("identity");
                                C02590Ca A0D2 = c02590Ca2.A0D("device-identity");
                                C02590Ca A0E3 = c02590Ca2.A0E("registration");
                                C02590Ca A0D3 = c02590Ca2.A0D("type");
                                if (A0D3 == null) {
                                    b = 5;
                                } else {
                                    byte[] bArr2 = A0D3.A01;
                                    if (bArr2 != null && bArr2.length == 1) {
                                        b = bArr2[0];
                                    } else {
                                        throw new C0L4("type node should contain exactly 1 byte");
                                    }
                                }
                                C02590Ca A0D4 = c02590Ca2.A0D("key");
                                if (A0D4 != null) {
                                    c05020My = new C05020My(A0D4.A0E("id").A01, A0D4.A0E("value").A01, null);
                                } else {
                                    c05020My = null;
                                }
                                C02590Ca A0E4 = c02590Ca2.A0E("skey");
                                C02590Ca A0E5 = A0E4.A0E("id");
                                C02590Ca A0E6 = A0E4.A0E("value");
                                C02590Ca A0E7 = A0E4.A0E("signature");
                                C467628d c467628d = c40581sV2.A0G;
                                byte[] bArr3 = A0E2.A01;
                                byte[] bArr4 = A0E3.A01;
                                if (A0D2 != null) {
                                    bArr = A0D2.A01;
                                } else {
                                    bArr = null;
                                }
                                C05020My c05020My2 = new C05020My(A0E5.A01, A0E6.A01, A0E7.A01);
                                if (c467628d != null) {
                                    Log.i("xmpp/reader/on-get-pre-key-success");
                                    InterfaceC467728e interfaceC467728e = c467628d.A00;
                                    Bundle bundle = new Bundle();
                                    bundle.putParcelable("jid", A09);
                                    bundle.putByteArray("identity", bArr3);
                                    bundle.putByteArray("registration", bArr4);
                                    bundle.putByteArray("deviceIdentity", bArr);
                                    bundle.putByte("type", b);
                                    bundle.putParcelable("preKey", new C0Z2(c05020My));
                                    bundle.putParcelable("signedPreKey", new C0Z2(c05020My2));
                                    ((HandlerC467828f) interfaceC467728e).A00(Message.obtain(null, 0, 74, 0, bundle));
                                    hashSet.add(A09);
                                } else {
                                    throw null;
                                }
                            }
                        }
                    } else {
                        throw null;
                    }
                }
                SparseArray sparseArray = new SparseArray();
                for (DeviceJid deviceJid : deviceJidArr3) {
                    if (!hashSet.contains(deviceJid)) {
                        C467628d c467628d2 = C40581sV.this.A0G;
                        if (c467628d2 != null) {
                            Log.i("xmpp/reader/on-get-pre-key-none");
                            InterfaceC467728e interfaceC467728e2 = c467628d2.A00;
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("jid", deviceJid);
                            ((HandlerC467828f) interfaceC467728e2).A00(Message.obtain(null, 0, 75, 0, bundle2));
                        } else {
                            throw null;
                        }
                    }
                    if (hashMap.containsKey(deviceJid)) {
                        int intValue = ((Number) hashMap.get(deviceJid)).intValue();
                        List list = (List) sparseArray.get(intValue);
                        if (list != null) {
                            list.add(deviceJid);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(deviceJid);
                            sparseArray.put(intValue, arrayList);
                        }
                    }
                }
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    C40581sV.this.A0G.A0D((DeviceJid[]) ((List) sparseArray.valueAt(i)).toArray(new DeviceJid[0]), sparseArray.keyAt(i));
                }
            }
        });
        ArrayList arrayList = new ArrayList(deviceJidArr.length);
        HashSet hashSet = new HashSet(Arrays.asList(deviceJidArr2));
        for (DeviceJid deviceJid : deviceJidArr) {
            if (hashSet.contains(deviceJid)) {
                arrayList.add(new C02590Ca("user", new C04P[]{new C04P("jid", deviceJid), new C04P("reason", "identity", null, (byte) 0)}, null, null));
            } else {
                arrayList.add(new C02590Ca("user", new C04P[]{new C04P("jid", deviceJid)}, null, null));
            }
        }
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("id", str, null, (byte) 0), new C04P("xmlns", "encrypt", null, (byte) 0), new C04P("type", "get", null, (byte) 0), new C04P("to", C04260Jm.A00)}, new C02590Ca("key", null, (C02590Ca[]) arrayList.toArray(new C02590Ca[0]), null)));
        StringBuilder sb = new StringBuilder("xmpp/writer/write/get-pre-key-batch; id=");
        sb.append(str);
        sb.append("; jids=");
        C000200d.A1N(sb, Arrays.toString(deviceJidArr));
    }

    public void A2E(String str, final Locale[] localeArr, final String[] strArr, final String str2, String str3) {
        int length;
        final C40581sV c40581sV = this.A00.A00;
        if (c40581sV == null) {
            throw null;
        }
        if (localeArr != null && (length = localeArr.length) != 0) {
            if (strArr != null && length != strArr.length) {
                throw new IllegalArgumentException("locales[] and haveHashes[] must be the same length");
            }
            if (!TextUtils.isEmpty(str2)) {
                if (str == null) {
                    int i = c40581sV.A00 + 1;
                    c40581sV.A00 = i;
                    str = Integer.toHexString(i);
                }
                c40581sV.A0c.put(str, new C0SF() { // from class: X.2TQ
                    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Locale[], java.io.Serializable] */
                    @Override // X.C0SF
                    public void A00(int i2) {
                        C467628d c467628d = C40581sV.this.A0G;
                        ?? r6 = localeArr;
                        String[] strArr2 = strArr;
                        String str4 = str2;
                        if (c467628d != null) {
                            C000200d.A0q("xmpp/reader/on-get-biz-language-pack-error code=", i2);
                            InterfaceC467728e interfaceC467728e = c467628d.A00;
                            Message obtain = Message.obtain(null, 0, C0M6.A03, 0);
                            Bundle data = obtain.getData();
                            data.putSerializable("requestLocales", r6);
                            if (strArr2 != null) {
                                data.putStringArray("haveHashes", strArr2);
                            } else {
                                data.remove("haveHashes");
                            }
                            data.putString("ns", str4);
                            data.putInt("errorCode", i2);
                            ((HandlerC467828f) interfaceC467728e).A00(obtain);
                            return;
                        }
                        throw null;
                    }

                    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.Locale[], java.io.Serializable] */
                    @Override // X.C0SF
                    public void A03(C02590Ca c02590Ca) {
                        String str4;
                        String str5;
                        C02590Ca A0D = c02590Ca.A0D("languagepack");
                        if (A0D != null) {
                            C04P A0A = A0D.A0A("lg");
                            if (A0A != null) {
                                str4 = A0A.A03;
                            } else {
                                str4 = "";
                            }
                            C04P A0A2 = A0D.A0A("lc");
                            String str6 = A0A2 != null ? A0A2.A03 : "";
                            C04P A0A3 = A0D.A0A("hash");
                            if (A0A3 != null) {
                                str5 = A0A3.A03;
                            } else {
                                str5 = null;
                            }
                            String str7 = str2;
                            C04P A0A4 = A0D.A0A("ns");
                            if (A0A4 != null) {
                                str7 = A0A4.A03;
                            }
                            byte[] bArr = A0D.A01;
                            C467628d c467628d = C40581sV.this.A0G;
                            ?? r10 = localeArr;
                            Locale locale = new Locale(str4, str6);
                            if (c467628d != null) {
                                StringBuilder A0P = C000200d.A0P("xmpp/reader/on-get-biz-language-pack requested=");
                                A0P.append(AbstractC003201n.A08(r10));
                                A0P.append(" locale=");
                                A0P.append(AbstractC003201n.A05(locale));
                                A0P.append(" hash=");
                                A0P.append(str5);
                                C000200d.A1Q(A0P, " ns=", str7);
                                InterfaceC467728e interfaceC467728e = c467628d.A00;
                                Message obtain = Message.obtain(null, 0, 107, 0);
                                Bundle data = obtain.getData();
                                data.putSerializable("requestLocales", r10);
                                data.putSerializable("locale", locale);
                                data.putString("hash", str5);
                                data.putString("ns", str7);
                                data.putByteArray("blob", bArr);
                                ((HandlerC467828f) interfaceC467728e).A00(obtain);
                                return;
                            }
                            throw null;
                        }
                        throw null;
                    }
                });
                C02590Ca[] c02590CaArr = new C02590Ca[length];
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < length; i2++) {
                    arrayList.clear();
                    String language = localeArr[i2].getLanguage();
                    String country = localeArr[i2].getCountry();
                    if (!TextUtils.isEmpty(language)) {
                        C000200d.A1A("lg", language, arrayList);
                    }
                    if (!TextUtils.isEmpty(country)) {
                        C000200d.A1A("lc", country, arrayList);
                    }
                    if (strArr != null && strArr[i2] != null) {
                        arrayList.add(new C04P("havehash", strArr[i2], null, (byte) 0));
                    }
                    c02590CaArr[i2] = new C02590Ca("item", (C04P[]) arrayList.toArray(C40581sV.A0f), null, null);
                }
                c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("id", str, null, (byte) 0), new C04P("xmlns", "w:biz", null, (byte) 0), new C04P("type", "get", null, (byte) 0)}, new C02590Ca("languagepack", TextUtils.isEmpty(str3) ? new C04P[]{new C04P("ns", str2, null, (byte) 0)} : new C04P[]{new C04P("ns", str2, null, (byte) 0), new C04P("reason", str3, null, (byte) 0)}, c02590CaArr, null)));
                Log.i("xmpp/writer/write/get-biz-language-pack");
                return;
            }
            throw new IllegalArgumentException("namespace cannot be null or empty");
        }
        throw new IllegalArgumentException("locales[] cannot be null or empty");
    }

    public void A2F(boolean z) {
        this.A00.A00.A0W(z);
        Log.i("xmpp/writer/after/write/get-ab-props");
    }

    public void A2G(boolean z) {
        this.A00.A00.A0X(z);
        Log.i("xmpp/writer/write/get-server-props");
    }

    public void A2H(boolean z) {
        final C40581sV c40581sV = this.A00.A00;
        int i = c40581sV.A00 + 1;
        c40581sV.A00 = i;
        String hexString = Integer.toHexString(i);
        c40581sV.A0c.put(hexString, new C0SF() { // from class: X.2TR
            @Override // X.C0SF
            public void A00(int i2) {
                if (C40581sV.this.A0G == null) {
                    throw null;
                }
                C000200d.A0p("xmpp/reader/read/on-qr-disconnect-error ", i2);
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
            }
        });
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("id", hexString, null, (byte) 0), new C04P("xmlns", "w:web", null, (byte) 0), new C04P("type", "set", null, (byte) 0)}, new C02590Ca("delete", z ? null : new C04P[]{new C04P("type", "Replaced by new connection", null, (byte) 0)}, null, null)));
        StringBuilder sb = new StringBuilder("xmpp/writer/write/web-disconnet; isLogout=");
        sb.append(z);
        Log.i(sb.toString());
    }

    public void A2I(boolean z) {
        C40581sV c40581sV = this.A00.A00;
        if (c40581sV.A06.A0E(C01C.A0j)) {
            int i = c40581sV.A00 + 1;
            c40581sV.A00 = i;
            String hexString = Integer.toHexString(i);
            C04P[] c04pArr = new C04P[1];
            c04pArr[0] = new C04P("classic", z ? "true" : "false", null, (byte) 0);
            c40581sV.A0T(hexString, "0", new C02590Ca("action", new C04P[]{new C04P("type", "set", null, (byte) 0)}, new C02590Ca("archive_v2", c04pArr, null, null)));
        }
    }

    public void A2J(final byte[] bArr, final String str) {
        final C40581sV c40581sV = this.A00.A00;
        int i = c40581sV.A00 + 1;
        c40581sV.A00 = i;
        String hexString = Integer.toHexString(i);
        c40581sV.A0c.put(hexString, new C0SF() { // from class: X.2TS
            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                if (C02A.A09(C40581sV.this.A08.A00, bArr, str)) {
                    return;
                }
                Log.e("app/set-recovery-token/fail");
            }
        });
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("id", hexString, null, (byte) 0), new C04P("xmlns", "w:auth:token", null, (byte) 0), new C04P("type", "set", null, (byte) 0), new C04P("to", C04260Jm.A00)}, new C02590Ca("token", null, null, bArr)));
        Log.i("xmpp/writer/write/set-recovery-token");
    }

    public void A2K(byte[] bArr, final byte[] bArr2, byte b, C05020My[] c05020MyArr, C05020My c05020My, byte[] bArr3) {
        final C40581sV c40581sV = this.A00.A00;
        int i = c40581sV.A00 + 1;
        c40581sV.A00 = i;
        String hexString = Integer.toHexString(i);
        c40581sV.A0c.put(hexString, new C0SF() { // from class: X.2TT
            @Override // X.C0SF
            public void A02(C02590Ca c02590Ca) {
                String str;
                String str2;
                int A01 = C40731sm.A01(c02590Ca);
                if (A01 == 207) {
                    for (C02590Ca c02590Ca2 : c02590Ca.A0H("error")) {
                        for (C02590Ca c02590Ca3 : c02590Ca2.A0H("error")) {
                            C04P A0A = c02590Ca3.A0A("code");
                            if (A0A != null) {
                                str = A0A.A03;
                            } else {
                                str = null;
                            }
                            C04P A0A2 = c02590Ca3.A0A("text");
                            if (A0A2 != null) {
                                str2 = A0A2.A03;
                            } else {
                                str2 = null;
                            }
                            if (str != null) {
                                int A012 = AnonymousClass024.A01(str, 0);
                                C467628d c467628d = C40581sV.this.A0G;
                                if (c467628d != null) {
                                    Log.i("xmpp/reader/on-set-pre-key-error");
                                    InterfaceC467728e interfaceC467728e = c467628d.A00;
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("errorCode", A012);
                                    bundle.putString("errorText", str2);
                                    ((HandlerC467828f) interfaceC467728e).A00(Message.obtain(null, 0, 196, 0, bundle));
                                } else {
                                    throw null;
                                }
                            }
                        }
                    }
                    return;
                }
                C467628d c467628d2 = C40581sV.this.A0G;
                if (c467628d2 != null) {
                    Log.i("xmpp/reader/on-set-pre-key-error");
                    ((HandlerC467828f) c467628d2.A00).A00(Message.obtain(null, 0, 78, 0, C000200d.A01("errorCode", A01)));
                    return;
                }
                throw null;
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                C467628d c467628d = C40581sV.this.A0G;
                if (c467628d != null) {
                    Log.i("xmpp/reader/on-set-pre-key-success");
                    ((HandlerC467828f) c467628d.A00).A00(Message.obtain(null, 0, 77, 0));
                    return;
                }
                throw null;
            }
        });
        int length = c05020MyArr.length;
        C02590Ca[] c02590CaArr = new C02590Ca[length];
        for (int i2 = 0; i2 < length; i2++) {
            c02590CaArr[i2] = new C02590Ca("key", null, new C02590Ca[]{new C02590Ca("id", null, null, c05020MyArr[i2].A01), new C02590Ca("value", null, null, c05020MyArr[i2].A00)}, null);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C02590Ca("identity", null, null, bArr));
        arrayList.add(new C02590Ca("registration", null, null, bArr2));
        arrayList.add(new C02590Ca("type", null, null, new byte[]{b}));
        arrayList.add(new C02590Ca("list", null, c02590CaArr, null));
        arrayList.add(new C02590Ca("skey", null, new C02590Ca[]{new C02590Ca("id", null, null, c05020My.A01), new C02590Ca("value", null, null, c05020My.A00), new C02590Ca("signature", null, null, c05020My.A02)}, null));
        if (bArr3 != null) {
            arrayList.add(new C02590Ca("verified_name", null, null, bArr3));
        }
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("id", hexString, null, (byte) 0), new C04P("xmlns", "encrypt", null, (byte) 0), new C04P("type", "set", null, (byte) 0), new C04P("to", C04260Jm.A00)}, (C02590Ca[]) arrayList.toArray(new C02590Ca[0]), null));
        Log.i("xmpp/writer/write/set-pre-key");
    }

    public void A2L(final DeviceJid[] deviceJidArr) {
        final C40581sV c40581sV = this.A00.A00;
        int i = c40581sV.A00 + 1;
        c40581sV.A00 = i;
        String hexString = Integer.toHexString(i);
        c40581sV.A0c.put(hexString, new C0SF() { // from class: X.2TU
            @Override // X.C0SF
            public void A00(int i2) {
                for (DeviceJid deviceJid : deviceJidArr) {
                    C40581sV.this.A0G.A01(deviceJid, i2);
                }
            }

            @Override // X.C0SF
            public void A03(C02590Ca c02590Ca) {
                byte[] bArr;
                List<C02590Ca> A0H = c02590Ca.A0E("list").A0H("user");
                C40581sV c40581sV2 = C40581sV.this;
                if (c40581sV2 != null) {
                    Collections.sort(A0H, new C3TE(c40581sV2));
                    for (C02590Ca c02590Ca2 : A0H) {
                        DeviceJid deviceJid = (DeviceJid) c02590Ca2.A09(DeviceJid.class, "jid", c40581sV2.A04);
                        C02590Ca A0D = c02590Ca2.A0D("error");
                        if (A0D != null) {
                            c40581sV2.A0G.A01(deviceJid, A0D.A04("code"));
                        } else {
                            C02590Ca A0E = c02590Ca2.A0E("identity");
                            C02590Ca A0E2 = c02590Ca2.A0E("type");
                            C02590Ca A0D2 = c02590Ca2.A0D("device-identity");
                            byte[] bArr2 = A0E2.A01;
                            if (bArr2 != null && bArr2.length == 1) {
                                C467628d c467628d = c40581sV2.A0G;
                                byte[] bArr3 = A0E.A01;
                                byte b = bArr2[0];
                                if (A0D2 != null) {
                                    bArr = A0D2.A01;
                                } else {
                                    bArr = null;
                                }
                                if (c467628d != null) {
                                    Log.i("xmpp/reader/on-get-identity-success");
                                    InterfaceC467728e interfaceC467728e = c467628d.A00;
                                    Bundle bundle = new Bundle();
                                    bundle.putParcelable("jid", deviceJid);
                                    bundle.putByteArray("data", bArr3);
                                    bundle.putByte("type", b);
                                    bundle.putByteArray("deviceIdentity", bArr);
                                    ((HandlerC467828f) interfaceC467728e).A00(Message.obtain(null, 0, 143, 0, bundle));
                                } else {
                                    throw null;
                                }
                            } else {
                                throw new C0L4("type node should contain exactly 1 byte");
                            }
                        }
                    }
                    return;
                }
                throw null;
            }
        });
        int length = deviceJidArr.length;
        C02590Ca[] c02590CaArr = new C02590Ca[length];
        for (int i2 = 0; i2 < length; i2++) {
            c02590CaArr[i2] = new C02590Ca("user", new C04P[]{new C04P("jid", deviceJidArr[i2])}, null, null);
        }
        c40581sV.A0R.A06(new C02590Ca("iq", new C04P[]{new C04P("id", hexString, null, (byte) 0), new C04P("xmlns", "encrypt", null, (byte) 0), new C04P("type", "get", null, (byte) 0), new C04P("to", C04260Jm.A00)}, new C02590Ca("identity", null, c02590CaArr, null)));
    }
}
