package X;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendPeerMessageJob;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* renamed from: X.1uP */
/* loaded from: classes2.dex */
public class C41721uP {
    public static volatile C41721uP A0I;
    public final C02L A00;
    public final C01B A01;
    public final C0E6 A02;
    public final C44331yt A03;
    public final C05W A04;
    public final C000400f A05;
    public final AnonymousClass012 A06;
    public final C0C9 A07;
    public final C0C8 A08;
    public final C05O A09;
    public final C22X A0A;
    public final C0EB A0B;
    public final C44431z4 A0C;
    public final C41421tt A0D;
    public final AnonymousClass011 A0E;
    public final C44551zG A0F;
    public final C42321vY A0G;
    public final C05U A0H;

    public C41721uP(AnonymousClass012 anonymousClass012, C02L c02l, C05O c05o, AnonymousClass011 anonymousClass011, C01B c01b, C0EB c0eb, C0E6 c0e6, C05W c05w, C05U c05u, C44551zG c44551zG, C0C9 c0c9, C42321vY c42321vY, C44331yt c44331yt, C000400f c000400f, C41421tt c41421tt, C22X c22x, C0C8 c0c8, C44431z4 c44431z4) {
        this.A06 = anonymousClass012;
        this.A00 = c02l;
        this.A09 = c05o;
        this.A0E = anonymousClass011;
        this.A01 = c01b;
        this.A0B = c0eb;
        this.A02 = c0e6;
        this.A04 = c05w;
        this.A0H = c05u;
        this.A0F = c44551zG;
        this.A07 = c0c9;
        this.A0G = c42321vY;
        this.A03 = c44331yt;
        this.A05 = c000400f;
        this.A0D = c41421tt;
        this.A0A = c22x;
        this.A08 = c0c8;
        this.A0C = c44431z4;
    }

    public static C41721uP A00() {
        if (A0I == null) {
            synchronized (C41721uP.class) {
                if (A0I == null) {
                    AnonymousClass012 A00 = AnonymousClass012.A00();
                    C02L A002 = C02L.A00();
                    C05O A003 = C05O.A00();
                    AnonymousClass011 A004 = AnonymousClass011.A00();
                    C01B A005 = C01B.A00();
                    C0EB A006 = C0EB.A00();
                    C0E6 A007 = C0E6.A00();
                    C05W A008 = C05W.A00();
                    C05U A01 = C05U.A01();
                    C44551zG A009 = C44551zG.A00();
                    C0C9 A0010 = C0C9.A00();
                    C42321vY A0011 = C42321vY.A00();
                    C44331yt A0012 = C44331yt.A00();
                    C000400f A0013 = C000400f.A00();
                    C41421tt A0014 = C41421tt.A00();
                    C22X A0015 = C22X.A00();
                    C41711uO.A00();
                    A0I = new C41721uP(A00, A002, A003, A004, A005, A006, A007, A008, A01, A009, A0010, A0011, A0012, A0013, A0014, A0015, C0C8.A00(), C44431z4.A00());
                }
            }
        }
        return A0I;
    }

    public static final C22Y A01(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return C22Y.PUSH_NAME;
                        }
                        throw new IllegalArgumentException(C000200d.A0E("Unexpected type (", i, ")"));
                    }
                    return C22Y.FULL;
                }
                return C22Y.RECENT;
            }
            return C22Y.INITIAL_STATUS_V3;
        }
        return C22Y.INITIAL_BOOTSTRAP;
    }

    public final long A02(final String str, final DeviceJid deviceJid, C22Z c22z, final int i, final int i2, final int i3, final int i4, final long j, final long j2, final long j3, final String str2) {
        C04180Ja c04180Ja;
        try {
            final File A06 = this.A05.A06();
            A06.getAbsolutePath();
            byte[] A0B = c22z.A01().A0B();
            Deflater deflater = new Deflater(1, false);
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(new FileOutputStream(A06), deflater);
            deflaterOutputStream.write(A0B);
            deflaterOutputStream.close();
            deflater.end();
            C454422b A01 = C454422b.A01(new C22a(false, false), 0, C0DC.A0F, Uri.fromFile(A06), null, false, false, null, false);
            final long length = A06.length();
            C44331yt c44331yt = this.A03;
            c44331yt.A04(str, true);
            if (str != null && (c04180Ja = (C04180Ja) c44331yt.A06.get(str)) != null) {
                c04180Ja.A04 = Long.valueOf(length);
            }
            C44551zG c44551zG = this.A0F;
            final C454622d A05 = c44551zG.A05(A01, false);
            A05.A0S = "mms";
            c44551zG.A0D(A05, null);
            A05.A09.A03(new C0CG() { // from class: X.3g7
                {
                    C41721uP.this = this;
                }

                @Override // X.C0CG
                public final void A54(Object obj) {
                    Object remove;
                    C41721uP c41721uP = C41721uP.this;
                    File file = A06;
                    C454622d c454622d = A05;
                    int i5 = i2;
                    String str3 = str;
                    long j4 = length;
                    DeviceJid deviceJid2 = deviceJid;
                    int i6 = i;
                    int i7 = i3;
                    int i8 = i4;
                    long j5 = j;
                    long j6 = j2;
                    long j7 = j3;
                    String str4 = str2;
                    Number number = (Number) obj;
                    if (!file.delete()) {
                        StringBuilder sb = new StringBuilder("history-sync-send-methods/failed to delete temp file: ");
                        sb.append(file);
                        Log.w(sb.toString());
                    }
                    AnonymousClass011 anonymousClass011 = c41721uP.A0E;
                    C44551zG c44551zG2 = c41721uP.A0F;
                    int intValue = number.intValue();
                    anonymousClass011.A0B(c44551zG2.A04(c454622d, intValue, 8), null, false);
                    c454622d.A04();
                    if (intValue != 0) {
                        c41721uP.A03(i5, str3);
                        return;
                    }
                    C456322w c456322w = (C456322w) c454622d.A0G.A00();
                    if (c456322w == null) {
                        c41721uP.A03(i5, str3);
                        return;
                    }
                    if (i5 == 0) {
                        c41721uP.A0C.A02(true);
                    }
                    C23G c23g = c456322w.A02;
                    String A03 = c23g.A03();
                    String A052 = c23g.A05();
                    String A04 = c23g.A04();
                    C43621xh A00 = c23g.A00();
                    if (A00 != null && !TextUtils.isEmpty(A03) && !TextUtils.isEmpty(A052) && !TextUtils.isEmpty(A04)) {
                        C02L c02l = c41721uP.A00;
                        c02l.A05();
                        UserJid userJid = c02l.A03;
                        if (userJid == null) {
                            Log.e("history-sync-send-methods/no my user id (unregistered?).");
                            c41721uP.A03(i5, str3);
                            return;
                        }
                        C05U c05u = c41721uP.A0H;
                        long A053 = c41721uP.A06.A05();
                        byte[] bArr = A00.A01;
                        C05V c05v = c05u.A07;
                        C04200Je c04200Je = new C04200Je(C05V.A00(c05v.A01, c05v.A00, userJid, true), A053);
                        ((C0JU) c04200Je).A00 = deviceJid2;
                        c04200Je.A08 = A03;
                        c04200Je.A0A = A052;
                        c04200Je.A09 = A04;
                        c04200Je.A0C = bArr;
                        c04200Je.A04 = j4;
                        c04200Je.A00 = i6;
                        c04200Je.A01 = i7;
                        c04200Je.A03 = i5;
                        c04200Je.A02 = i8;
                        c04200Je.A06 = j5;
                        c04200Je.A07 = j7;
                        c04200Je.A05 = j6;
                        c04200Je.A0B = str4;
                        long A02 = c41721uP.A0D.A02(c04200Je);
                        if (A02 < 0) {
                            Log.e("history-sync-send-methods/failed to add peer message");
                            c41721uP.A03(i5, str3);
                            return;
                        }
                        C44331yt c44331yt2 = c41721uP.A03;
                        if (c44331yt2 != null) {
                            if (str3 != null && A02 >= 0 && (remove = c44331yt2.A06.remove(str3)) != null) {
                                c44331yt2.A05.put(Long.valueOf(A02), remove);
                            }
                            c41721uP.A02.A00.A01(new SendPeerMessageJob(c04200Je, deviceJid2, null, 0));
                            return;
                        }
                        throw null;
                    }
                    c41721uP.A03(i5, str3);
                }
            }, null);
            return length;
        } catch (IOException e) {
            Log.e("history-sync-send-methods/save-to-file: failed", e);
            C44331yt c44331yt2 = this.A03;
            c44331yt2.A04(str, false);
            c44331yt2.A03(str);
            return 0L;
        }
    }

    public final void A03(int i, String str) {
        if (i == 0) {
            this.A0C.A02(false);
            this.A03.A03(str);
        }
    }

    public void A04(DeviceJid deviceJid, int i, String str) {
        try {
            ArrayList A0E = this.A04.A0E();
            C22Z c22z = (C22Z) C454722f.A08.AVX();
            C22Y c22y = C22Y.PUSH_NAME;
            c22z.A02();
            C454722f.A0A((C454722f) c22z.A00, c22y);
            Iterator it = A0E.iterator();
            while (it.hasNext()) {
                C06C c06c = (C06C) it.next();
                UserJid userJid = (UserJid) c06c.A03(UserJid.class);
                if (userJid != null && !TextUtils.isEmpty(c06c.A0O)) {
                    C454922h c454922h = (C454922h) C454822g.A03.AVX();
                    String rawString = userJid.getRawString();
                    c454922h.A02();
                    C454822g c454822g = (C454822g) c454922h.A00;
                    if (rawString != null) {
                        c454822g.A00 |= 1;
                        c454822g.A01 = rawString;
                        String str2 = c06c.A0O;
                        c454922h.A02();
                        C454822g c454822g2 = (C454822g) c454922h.A00;
                        if (str2 != null) {
                            c454822g2.A00 |= 2;
                            c454822g2.A02 = str2;
                            C454822g c454822g3 = (C454822g) c454922h.A01();
                            c22z.A02();
                            C454722f c454722f = (C454722f) c22z.A00;
                            if (c454822g3 != null) {
                                C0CX c0cx = c454722f.A06;
                                if (!((C0CY) c0cx).A00) {
                                    c0cx = C0AZ.A05(c0cx);
                                    c454722f.A06 = c0cx;
                                }
                                c0cx.add(c454822g3);
                            } else {
                                throw null;
                            }
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                }
            }
            A02(null, deviceJid, c22z, 1, 4, 100, i, -1L, -1L, -1L, str);
        } catch (Exception e) {
            Log.e("history-sync-send-methods/send-push-names: error", e);
        }
    }

    public final void A05(C455022i c455022i, AbstractC005302j abstractC005302j, long j, long j2, long j3) {
        EnumC455122j enumC455122j = EnumC455122j.COMPLETE_BUT_MORE_MESSAGES_REMAIN_ON_PRIMARY;
        C05O c05o = this.A09;
        long A06 = c05o.A06(abstractC005302j);
        if (A06 == 1) {
            return;
        }
        if (A06 >= j) {
            EnumC455122j enumC455122j2 = EnumC455122j.COMPLETE_AND_NO_MORE_MESSAGE_REMAIN_ON_PRIMARY;
            c455022i.A02();
            C455222k.A09((C455222k) c455022i.A00, enumC455122j2);
        } else if (A06 < j3) {
            if (j2 != 1) {
                if (j2 >= j3) {
                    return;
                }
                c455022i.A02();
                C455222k.A09((C455222k) c455022i.A00, enumC455122j);
            } else if (c05o.A03(abstractC005302j, j3, j) != 0) {
            } else {
                c455022i.A02();
                C455222k.A09((C455222k) c455022i.A00, enumC455122j);
            }
        }
    }
}
