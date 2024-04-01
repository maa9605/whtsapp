package X;

import android.app.Application;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.whatsapp.jid.Jid;
import com.whatsapp.location.LocationSharingService;
import com.whatsapp.protocol.VoipStanzaChildNode;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.io.File;
import java.security.SecureRandom;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2AK */
/* loaded from: classes2.dex */
public class C2AK implements C0EK {
    public static volatile C2AK A1Q;
    public final AbstractC000600i A00;
    public final C018508q A01;
    public final C03940Hu A02;
    public final C02L A03;
    public final C05X A04;
    public final C03010Du A05;
    public final C01B A06;
    public final C018608r A07;
    public final C0E6 A08;
    public final C40261rr A09;
    public final C011605s A0A;
    public final C05W A0B;
    public final AnonymousClass075 A0C;
    public final C011505r A0D;
    public final C41221tZ A0E;
    public final C0E7 A0F;
    public final AnonymousClass012 A0G;
    public final C001200o A0H;
    public final AnonymousClass072 A0I;
    public final C000500h A0J;
    public final C002301c A0K;
    public final C0HY A0L;
    public final C451820s A0M;
    public final C41181tV A0N;
    public final C05M A0O;
    public final C0DK A0P;
    public final C03340Fh A0Q;
    public final C0CA A0R;
    public final C0GK A0S;
    public final C0C9 A0T;
    public final C41561u9 A0U;
    public final C0D5 A0V;
    public final C456923c A0W;
    public final C0C8 A0X;
    public final C0GU A0Y;
    public final C03180Eq A0Z;
    public final C00A A0a;
    public final C42761wH A0b;
    public final C0EA A0c;
    public final C43081wp A0d;
    public final C22X A0e;
    public final C0EB A0f;
    public final C03880Hm A0g;
    public final C003701t A0h;
    public final C03300Fd A0i;
    public final C0ES A0j;
    public final C42821wN A0k;
    public final C41461tx A0l;
    public final C2AX A0m;
    public final C44551zG A0n;
    public final C41771uU A0o;
    public final C2AW A0p;
    public final C41601uD A0q;
    public final C05Y A0r;
    public final C0EN A0s;
    public final C41511u2 A0t;
    public final C0EG A0u;
    public final C41681uL A0v;
    public final C2AV A0w;
    public final C451520p A0x;
    public final C451720r A0y;
    public final C41521u3 A0z;
    public final C0EJ A10;
    public final C40301ry A11;
    public final C459724l A12;
    public final C2AQ A13;
    public final C22I A14;
    public final C2AU A15;
    public final C04400Ka A16;
    public final C456723a A17;
    public final C07A A18;
    public final C2AO A19;
    public final C0CB A1A;
    public final C2AR A1B;
    public final C2AT A1C;
    public final C2AL A1D;
    public final C2AM A1E;
    public final C2AS A1F;
    public final C2AP A1G;
    public final C41951um A1H;
    public final C2A6 A1I;
    public final InterfaceC002901k A1J;
    public final C41641uH A1K;
    public final C0L6 A1L;
    public final C41981up A1M;
    public final C41991uq A1N;
    public final SecureRandom A1O = new SecureRandom();
    public final Map A1P = new ConcurrentHashMap();

    public C2AK(C001200o c001200o, AnonymousClass012 anonymousClass012, C011605s c011605s, C003701t c003701t, C018508q c018508q, C05X c05x, AbstractC000600i abstractC000600i, C02L c02l, C03010Du c03010Du, InterfaceC002901k interfaceC002901k, C05M c05m, C41981up c41981up, C41991uq c41991uq, C41181tV c41181tV, C0EG c0eg, C01B c01b, C0EA c0ea, C0EB c0eb, C018608r c018608r, C0EN c0en, C0E6 c0e6, C0GU c0gu, C05Y c05y, C2AL c2al, C0L6 c0l6, C05W c05w, C0GK c0gk, C42761wH c42761wH, C41521u3 c41521u3, C002301c c002301c, C2AM c2am, C42821wN c42821wN, C0D5 c0d5, C44551zG c44551zG, C22I c22i, C2AO c2ao, C2AP c2ap, C03880Hm c03880Hm, C451520p c451520p, C40261rr c40261rr, C03300Fd c03300Fd, C0C9 c0c9, C41561u9 c41561u9, C0ES c0es, C03180Eq c03180Eq, C00A c00a, C2AQ c2aq, C2AR c2ar, C0HY c0hy, C0CB c0cb, C03940Hu c03940Hu, C41601uD c41601uD, C2AS c2as, C41951um c41951um, C451720r c451720r, C011505r c011505r, C41511u2 c41511u2, C2AT c2at, C22X c22x, C0EJ c0ej, C40301ry c40301ry, C0E7 c0e7, C2AU c2au, C04400Ka c04400Ka, C456723a c456723a, C43081wp c43081wp, AnonymousClass075 anonymousClass075, C41641uH c41641uH, C000500h c000500h, C0CA c0ca, C07A c07a, C03340Fh c03340Fh, C41681uL c41681uL, C2AV c2av, C41461tx c41461tx, C41221tZ c41221tZ, C41771uU c41771uU, C2AW c2aw, C451820s c451820s, C0C8 c0c8, C459724l c459724l, C456923c c456923c, C0DK c0dk, C2A6 c2a6, C2AX c2ax, AnonymousClass072 anonymousClass072) {
        this.A0H = c001200o;
        this.A0G = anonymousClass012;
        this.A0A = c011605s;
        this.A0h = c003701t;
        this.A01 = c018508q;
        this.A04 = c05x;
        this.A00 = abstractC000600i;
        this.A03 = c02l;
        this.A05 = c03010Du;
        this.A1J = interfaceC002901k;
        this.A0O = c05m;
        this.A1M = c41981up;
        this.A1N = c41991uq;
        this.A0N = c41181tV;
        this.A0u = c0eg;
        this.A06 = c01b;
        this.A0c = c0ea;
        this.A0f = c0eb;
        this.A07 = c018608r;
        this.A0s = c0en;
        this.A08 = c0e6;
        this.A0Y = c0gu;
        this.A0r = c05y;
        this.A1D = c2al;
        this.A1L = c0l6;
        this.A0B = c05w;
        this.A0S = c0gk;
        this.A0b = c42761wH;
        this.A0z = c41521u3;
        this.A0K = c002301c;
        this.A1E = c2am;
        this.A0k = c42821wN;
        this.A0V = c0d5;
        this.A0n = c44551zG;
        this.A14 = c22i;
        this.A19 = c2ao;
        this.A1G = c2ap;
        this.A0g = c03880Hm;
        this.A0x = c451520p;
        this.A09 = c40261rr;
        this.A0i = c03300Fd;
        this.A0T = c0c9;
        this.A0U = c41561u9;
        this.A0j = c0es;
        this.A0Z = c03180Eq;
        this.A0a = c00a;
        this.A13 = c2aq;
        this.A1B = c2ar;
        this.A0L = c0hy;
        this.A1A = c0cb;
        this.A02 = c03940Hu;
        this.A0q = c41601uD;
        this.A1F = c2as;
        this.A1H = c41951um;
        this.A0y = c451720r;
        this.A0D = c011505r;
        this.A0t = c41511u2;
        this.A1C = c2at;
        this.A0e = c22x;
        this.A10 = c0ej;
        this.A11 = c40301ry;
        this.A0F = c0e7;
        this.A15 = c2au;
        this.A16 = c04400Ka;
        this.A17 = c456723a;
        this.A0d = c43081wp;
        this.A0C = anonymousClass075;
        this.A1K = c41641uH;
        this.A0J = c000500h;
        this.A0R = c0ca;
        this.A18 = c07a;
        this.A0Q = c03340Fh;
        this.A0v = c41681uL;
        this.A0w = c2av;
        this.A0l = c41461tx;
        this.A0E = c41221tZ;
        this.A0o = c41771uU;
        this.A0p = c2aw;
        this.A0M = c451820s;
        this.A0X = c0c8;
        this.A12 = c459724l;
        this.A0W = c456923c;
        this.A0P = c0dk;
        this.A1I = c2a6;
        this.A0m = c2ax;
        this.A0I = anonymousClass072;
    }

    public static int A00(long j, boolean z) {
        return (z || System.currentTimeMillis() < j + 86400000) ? 20 : 1;
    }

    public static int A01(String str, Jid jid, int i, VoipStanzaChildNode voipStanzaChildNode) {
        int nativeHandleWebClientMessage = Voip.nativeHandleWebClientMessage(str, jid.getRawString(), i, voipStanzaChildNode);
        if (nativeHandleWebClientMessage == 0 || nativeHandleWebClientMessage == 70020) {
            return 200;
        }
        if (nativeHandleWebClientMessage == 670001) {
            return 423;
        }
        C000200d.A0q("app/xmpp/recv/native_handle_web_message failed with code:", nativeHandleWebClientMessage);
        return 409;
    }

    public final int A02(String str, Jid jid, int i) {
        C0Mt c0Mt;
        boolean z = true;
        if (i != 1 && i != 2 && i != 6 && i != 7) {
            z = false;
        }
        C000700j.A08(z, "invalid web client action in handleAcceptAndReject");
        C04V c04v = Voip.A01;
        Pair A00 = c04v.A00(str);
        if (A00 == null || (c0Mt = (C0Mt) A00.second) == null) {
            if (i != 6 && i != 7) {
                return A01(str, jid, i, null);
            }
            StringBuilder sb = new StringBuilder("app/xmpp/recv/call_web_query no cached offer in accept/reject pending, callId:");
            sb.append(str);
            sb.append(", type:");
            sb.append(i);
            Log.w(sb.toString());
            return 410;
        }
        int A01 = A01(str, c0Mt.A00(), i, ((C04990Mu) c0Mt.A01).A01);
        if (!TextUtils.equals(Voip.getCurrentCallId(), str) && (i == 2 || i == 7)) {
            C0HY c0hy = this.A0L;
            C0D3 A04 = c0hy.A04(new C07950aM(c0Mt.A00(), false, AnonymousClass029.A0t(str), c0Mt.A00));
            if (A04 != null) {
                A04.A06(2);
                c0hy.A08(A04);
            }
        }
        c04v.A01(str);
        return A01;
    }

    public final C20v A03(AbstractC005302j abstractC005302j, int i) {
        C451920u c451920u = new C451920u(this.A00, this.A06);
        c451920u.A00 = i;
        C05M c05m = this.A0O;
        c451920u.A08 = c05m.A05(abstractC005302j);
        c451920u.A03 = c05m.A02(abstractC005302j);
        c451920u.A0A = abstractC005302j;
        c451920u.A01 = c05m.A01(abstractC005302j);
        C06C A02 = this.A0P.A02(abstractC005302j);
        c451920u.A0G = TextUtils.isEmpty(A02.A0F) ? null : A02.A0F;
        c451920u.A07 = this.A1A.A02(abstractC005302j);
        return c451920u;
    }

    public final void A04(Jid jid, String str, int i, long j) {
        C41991uq c41991uq = this.A1N;
        c41991uq.A0E(str, i);
        this.A0z.A0F(str, i);
        this.A0s.A08(str, j, jid);
        c41991uq.A08();
        c41991uq.A09();
    }

    public final void A05(Jid jid, String str, long j) {
        C41991uq c41991uq = this.A1N;
        c41991uq.A0E(str, 200);
        this.A0z.A0F(str, 200);
        this.A0s.A08(str, j, jid);
        c41991uq.A08();
        c41991uq.A09();
    }

    public void A06(C2UG c2ug) {
        Message obtain = Message.obtain(null, 0, c2ug);
        C41641uH c41641uH = this.A1K;
        c41641uH.A00.obtainMessage(1, new C49032Ic("start_web_relay", null, obtain)).sendToTarget();
    }

    public final void A07(String str, AbstractC005302j abstractC005302j, int i) {
        long j = i;
        if (!this.A0x.A04(str, abstractC005302j, j, false)) {
            Application application = this.A0H.A00;
            C02160Ac.A06(application, new Intent(application, LocationSharingService.class).setAction("com.whatsapp.ShareLocationService.ACTION_SEND_LOCATION_WEB_RESPONSE").putExtra("id", str).putExtra("chatJid", abstractC005302j.getRawString()).putExtra("duration", j));
        }
    }

    public final void A08(final String str, final String str2, final String str3, final File file, C0DC c0dc, final boolean z) {
        final byte[] bArr = new byte[32];
        this.A1O.nextBytes(bArr);
        C454422b A01 = C454422b.A01(new C22a(true, false), 0, c0dc, Uri.fromFile(file), null, false, false, new C43621xh(bArr, this.A0G.A05()), true);
        C44551zG c44551zG = this.A0n;
        final C454622d A05 = c44551zG.A05(A01, false);
        A05.A0S = "mms";
        A05.A09.A03(new C0CG() { // from class: X.3fu
            {
                C2AK.this = this;
            }

            /* JADX WARN: Finally extract failed */
            @Override // X.C0CG
            public final void A54(Object obj) {
                boolean z2;
                C0CD A012;
                C2CI[] c2ciArr;
                C2AK c2ak = C2AK.this;
                C454622d c454622d = A05;
                String str4 = str2;
                byte[] bArr2 = bArr;
                String str5 = str3;
                String str6 = str;
                boolean z3 = z;
                File file2 = file;
                Number number = (Number) obj;
                C456322w c456322w = (C456322w) c454622d.A0G.A00();
                C0KW c0kw = (C0KW) c454622d.A07.A00();
                String str7 = null;
                if (c0kw != null && !c0kw.A02.get()) {
                    File file3 = c0kw.A01;
                    C04050If A00 = C04050If.A00(WebpUtils.fetchWebpMetadata(file3.getAbsolutePath()));
                    if (A00 != null && (c2ciArr = A00.A06) != null) {
                        str7 = C0JM.A00(c2ciArr);
                        z2 = A00.A05;
                    } else {
                        z2 = false;
                    }
                    AnonymousClass024.A0f(file3);
                } else {
                    z2 = false;
                }
                c454622d.A04();
                int intValue = number.intValue();
                if (intValue == 0 && c456322w != null) {
                    C2AW c2aw = c2ak.A0p;
                    C23G c23g = c456322w.A02;
                    String A052 = c23g.A05();
                    String A06 = c23g.A06();
                    String A03 = c23g.A03();
                    String A04 = c23g.A04();
                    long j = c456322w.A01.A02.A02;
                    int i = (int) j;
                    C2CG c2cg = new C2CG(str4, A052, bArr2, str5, A06, A03, A04, i, c23g.A02() == null ? 0 : c23g.A02().intValue(), c23g.A01() == null ? 0 : c23g.A01().intValue());
                    synchronized (c2aw) {
                        String str8 = c2cg.A07;
                        if (str8 != null) {
                            c2aw.A00.A08(str8, c2cg);
                            try {
                                A012 = c2aw.A01.A01();
                            } catch (SQLiteDatabaseCorruptException e) {
                                Log.e("WebUploadMediaKeyStore/insert", e);
                            }
                            try {
                                C0CE c0ce = A012.A02;
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("media_id", str8);
                                contentValues.put("file_hash", c2cg.A06);
                                contentValues.put("media_key", c2cg.A00);
                                contentValues.put("mime_type", c2cg.A08);
                                contentValues.put("upload_url", c2cg.A09);
                                contentValues.put("direct_path", c2cg.A04);
                                contentValues.put("enc_file_hash", c2cg.A05);
                                contentValues.put("file_size", Integer.valueOf(c2cg.A01));
                                contentValues.put("height", Integer.valueOf(c2cg.A02));
                                contentValues.put("width", Integer.valueOf(c2cg.A03));
                                c0ce.A06("web_upload_media_data_store", contentValues, 5);
                                A012.close();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    try {
                                        A012.close();
                                    } catch (Throwable unused) {
                                    }
                                    throw th2;
                                }
                            }
                        } else {
                            throw null;
                        }
                    }
                    if (c23g.A05() != null) {
                        C2AM c2am = c2ak.A1E;
                        if (c2am.A0B(c23g.A05()) != null) {
                            c2am.A0F(c23g.A05(), c23g.A06(), c23g.A04(), c23g.A03(), str5, Base64.encodeToString(bArr2, 0), i, c23g.A02() == null ? 0 : c23g.A02().intValue(), c23g.A01() == null ? 0 : c23g.A01().intValue(), str7, z2);
                        }
                    }
                    if (c23g.A05() != null) {
                        C2AP c2ap = c2ak.A1G;
                        if (c2ap.A02(c23g.A05())) {
                            String A053 = c23g.A05();
                            String A062 = c23g.A06();
                            String A042 = c23g.A04();
                            String A032 = c23g.A03();
                            String encodeToString = Base64.encodeToString(bArr2, 0);
                            int intValue2 = c23g.A02() == null ? 0 : c23g.A02().intValue();
                            int intValue3 = c23g.A01() == null ? 0 : c23g.A01().intValue();
                            C47602Bw c47602Bw = c2ap.A02;
                            if (c47602Bw != null) {
                                ContentValues contentValues2 = new ContentValues();
                                contentValues2.put("url", A062);
                                contentValues2.put("enc_hash", A042);
                                contentValues2.put("direct_path", A032);
                                contentValues2.put("mimetype", str5);
                                contentValues2.put("media_key", encodeToString);
                                contentValues2.put("file_size", Integer.valueOf(i));
                                contentValues2.put("width", Integer.valueOf(intValue2));
                                contentValues2.put("height", Integer.valueOf(intValue3));
                                contentValues2.put("emojis", str7);
                                contentValues2.put("is_first_party", Boolean.valueOf(z2));
                                C0CD A033 = c47602Bw.A00.A03();
                                try {
                                    A033.A02.A00("starred_stickers", contentValues2, "plaintext_hash = ?", new String[]{A053});
                                } catch (Throwable th3) {
                                    try {
                                        throw th3;
                                    } finally {
                                        try {
                                            A033.close();
                                        } catch (Throwable unused2) {
                                        }
                                    }
                                }
                            } else {
                                throw null;
                            }
                        }
                    }
                    if (c23g != null) {
                        if (c23g.A00() != null) {
                            c2ak.A0y.A01(str6, new C27N(c2ak.A00, c2ak.A06, 200, c23g.A06(), c23g.A00().A01, c23g.A05(), c23g.A03(), c23g.A04(), str5, c23g.A02() == null ? 0 : c23g.A02().intValue(), c23g.A01() == null ? 0 : c23g.A01().intValue(), j), 43);
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                } else {
                    StringBuilder A0P = C000200d.A0P("RecvWebMessageListener/uploadMedia/failed to upload, error:");
                    A0P.append(C40841sx.A0D(intValue));
                    Log.e(A0P.toString());
                    c2ak.A0y.A01(str6, C27N.A00(c2ak.A00, c2ak.A06, 502), 43);
                }
                if (z3) {
                    AnonymousClass024.A0f(file2);
                }
            }
        }, null);
        c44551zG.A0D(A05, null);
    }

    public final boolean A09(String str, Jid jid, C0HE c0he, long j) {
        if (c0he.A03()) {
            C000200d.A13("app/xmpp/recv/webquery/canceled: ", str);
            this.A0s.A08(str, j, jid);
            this.A1N.A0E(str, 499);
            this.A0z.A0F(str, 499);
            this.A1P.remove(str);
            return true;
        }
        return false;
    }

    @Override // X.C0EK
    public int[] AAP() {
        return new int[]{28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 89, 118, 119, 146, 147, 162, 171, 173, 207, 220};
    }

    /* JADX WARN: Code restructure failed: missing block: B:1604:0x0e37, code lost:
        if (r8 != 0) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1605:0x0e39, code lost:
        r30.A0E.A01(r9, false);
        A05(r7, r5, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1606:0x0e41, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1882:0x14c4, code lost:
        if (r15 == 0) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1946:0x15df, code lost:
        if (r30.A0d.A06(r5, false) != false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1949:0x15eb, code lost:
        if (r30.A0d.A05(r9) == false) goto L859;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2080:0x192d, code lost:
        if (r11.equals(r30.A1M.A01().A03) == false) goto L1044;
     */
    @Override // X.C0EK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean AEN(int r31, android.os.Message r32) {
        /*
            Method dump skipped, instructions count: 6652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2AK.AEN(int, android.os.Message):boolean");
    }
}
