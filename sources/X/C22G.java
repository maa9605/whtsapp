package X;

import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.Conversation;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendWebForwardJob;
import com.whatsapp.util.Log;
import java.util.Arrays;

/* renamed from: X.22G */
/* loaded from: classes2.dex */
public class C22G implements C0EK {
    public static volatile C22G A0O;
    public final C04920Mm A00;
    public final AbstractC000600i A01;
    public final C04480Ki A02;
    public final C018508q A03;
    public final C03320Ff A04;
    public final C41541u6 A05;
    public final C05W A06;
    public final AnonymousClass008 A07;
    public final C41691uM A08;
    public final C011505r A09;
    public final C04470Kh A0A;
    public final C41321tj A0B;
    public final C0KQ A0C;
    public final C001200o A0D;
    public final C06T A0E;
    public final C22X A0F;
    public final C05Y A0G;
    public final C0EG A0H;
    public final C0EJ A0I;
    public final C26Y A0J;
    public final C22I A0K;
    public final C04400Ka A0L;
    public final C03510Fz A0M;
    public final InterfaceC002901k A0N;

    @Override // X.C0EK
    public int[] AAP() {
        return new int[]{25};
    }

    public C22G(C001200o c001200o, C018508q c018508q, AbstractC000600i abstractC000600i, InterfaceC002901k interfaceC002901k, C0EG c0eg, C41541u6 c41541u6, C05Y c05y, C05W c05w, C04480Ki c04480Ki, C26Y c26y, C22I c22i, AnonymousClass008 anonymousClass008, C03510Fz c03510Fz, C06T c06t, C03320Ff c03320Ff, C011505r c011505r, C41321tj c41321tj, C22X c22x, C04920Mm c04920Mm, C04470Kh c04470Kh, C0EJ c0ej, C04400Ka c04400Ka, C41691uM c41691uM, C0KQ c0kq) {
        this.A0D = c001200o;
        this.A03 = c018508q;
        this.A01 = abstractC000600i;
        this.A0N = interfaceC002901k;
        this.A0H = c0eg;
        this.A05 = c41541u6;
        this.A0G = c05y;
        this.A06 = c05w;
        this.A02 = c04480Ki;
        this.A0J = c26y;
        this.A0K = c22i;
        this.A07 = anonymousClass008;
        this.A0M = c03510Fz;
        this.A0E = c06t;
        this.A04 = c03320Ff;
        this.A09 = c011505r;
        this.A0B = c41321tj;
        this.A0F = c22x;
        this.A00 = c04920Mm;
        this.A0A = c04470Kh;
        this.A0I = c0ej;
        this.A0L = c04400Ka;
        this.A08 = c41691uM;
        this.A0C = c0kq;
    }

    @Override // X.C0EK
    public boolean AEN(int i, Message message) {
        String str;
        String str2;
        String str3;
        String str4;
        if (i != 25) {
            return false;
        }
        Parcelable parcelable = message.getData().getParcelable("stanzaKey");
        C000700j.A04(parcelable, "stanzaKey is null");
        C04420Kc c04420Kc = (C04420Kc) parcelable;
        C02590Ca c02590Ca = (C02590Ca) message.obj;
        C02590Ca A0C = c02590Ca.A0C(0);
        C05140Nm A04 = this.A0I.A04(c04420Kc.A00);
        if (A04 != null) {
            if (A0C != null) {
                str4 = A0C.A00;
            } else {
                str4 = null;
            }
            A04.A00 = str4;
            A04.A00(3);
        }
        if (A0C != null) {
            if (C02590Ca.A02(A0C, "add")) {
                byte[] bArr = A0C.A01;
                C468428m c468428m = new C468428m(C22H.A0C);
                c468428m.A04 = true;
                c468428m.A02();
                c468428m.A03(bArr);
                this.A0B.A02(c468428m.A01(), true);
                this.A0H.A0L(c04420Kc);
                return true;
            } else if (C02590Ca.A02(A0C, "remove")) {
                Jid A08 = A0C.A08(UserJid.class, "jid", this.A01);
                this.A0E.A01(new RunnableEBaseShape3S0200000_I0_3(this, A08, 38), 45);
                this.A0N.AS1(new RunnableEBaseShape0S0300000_I0_0(this, A08, c04420Kc, 37));
                return true;
            } else {
                long j = 0;
                if (C02590Ca.A02(A0C, "update")) {
                    C04P A0A = A0C.A0A("hash");
                    if (A0A == null || (str3 = A0A.A03) == null) {
                        AbstractC000600i abstractC000600i = this.A01;
                        UserJid userJid = (UserJid) A0C.A08(UserJid.class, "jid", abstractC000600i);
                        C05W c05w = this.A06;
                        C06C A09 = c05w.A09(userJid);
                        if (A09 != null) {
                            this.A02.A00.post(new RunnableEBaseShape0S0300000_I0_0(this, A09, userJid, 39));
                            C22I c22i = this.A0K;
                            if (!c22i.A0A(userJid)) {
                                c22i.A04(userJid, 0L);
                                this.A03.A0G(new RunnableEBaseShape3S0200000_I0_3(this, userJid, 37));
                            }
                            if (((C0OU) Conversation.A58.get()).A01(userJid) && !this.A0J.A01()) {
                                c22i.A07(userJid);
                            }
                            new C0OV(this.A0D, abstractC000600i, this.A0G, new C2AJ(this.A0N, this.A05, c05w, this.A08)).A00(userJid, A09.A07);
                        }
                    } else if (!TextUtils.isEmpty(str3)) {
                        byte[] decode = Base64.decode(str3.getBytes(), 0);
                        Arrays.toString(decode);
                        C468428m c468428m2 = new C468428m(C22H.A0E);
                        c468428m2.A04 = true;
                        c468428m2.A00 = new C468328l(false, false, true, false, false, false);
                        c468428m2.A03(decode);
                        this.A0B.A02(c468428m2.A01(), true);
                    }
                    this.A0H.A0L(c04420Kc);
                    return true;
                } else if (C02590Ca.A02(A0C, "sync")) {
                    C04P A0A2 = A0C.A0A("after");
                    if (A0A2 != null) {
                        str2 = A0A2.A03;
                    } else {
                        str2 = null;
                    }
                    long A03 = AnonymousClass024.A03(str2, 0L) * 1000;
                    C04P A0A3 = c02590Ca.A0A("t");
                    long A032 = AnonymousClass024.A03(A0A3 != null ? A0A3.A03 : null, 0L) * 1000;
                    C018508q c018508q = this.A03;
                    RunnableEBaseShape5S0100000_I0_5 runnableEBaseShape5S0100000_I0_5 = new RunnableEBaseShape5S0100000_I0_5(this, 5);
                    if (A03 > A032 && A032 > 0) {
                        j = A03 - A032;
                    }
                    c018508q.A02.postDelayed(runnableEBaseShape5S0100000_I0_5, j);
                    this.A0H.A0L(c04420Kc);
                    return true;
                } else if (!C02590Ca.A02(A0C, "modify")) {
                    return true;
                } else {
                    C04P A0A4 = c02590Ca.A0A("t");
                    if (A0A4 != null) {
                        str = A0A4.A03;
                    } else {
                        str = null;
                    }
                    long A033 = 1000 * AnonymousClass024.A03(str, 0L);
                    AbstractC000600i abstractC000600i2 = this.A01;
                    UserJid userJid2 = (UserJid) A0C.A08(UserJid.class, "old", abstractC000600i2);
                    UserJid userJid3 = (UserJid) A0C.A08(UserJid.class, "new", abstractC000600i2);
                    StringBuilder sb = new StringBuilder("contactupdatenotificationhandler/handleContactModify oldUserJid=");
                    sb.append(userJid2);
                    sb.append(" newUserJid=");
                    sb.append(userJid3);
                    Log.i(sb.toString());
                    C04920Mm c04920Mm = this.A00;
                    if (c04920Mm != null) {
                        StringBuilder sb2 = new StringBuilder("ChangeNumberManager/onContactNumberChanged/oldJid=");
                        sb2.append(userJid2);
                        sb2.append("; newJid=");
                        sb2.append(userJid3);
                        Log.i(sb2.toString());
                        C07A c07a = c04920Mm.A07;
                        C04370Jx A0B = c07a.A0B(userJid2, A033, userJid2, userJid3);
                        C04370Jx A0B2 = c07a.A0B(userJid3, A033, userJid2, userJid3);
                        C0C9 c0c9 = c04920Mm.A04;
                        c0c9.A0Q(A0B);
                        c0c9.A0Q(A0B2);
                        C451820s c451820s = c04920Mm.A03;
                        C05M c05m = c451820s.A03;
                        C0IT A07 = c05m.A07(userJid2);
                        if (A07 != null) {
                            c451820s.A00.A01(new RunnableEBaseShape0S0300000_I0_0(c451820s, A07, A0B, 12), 18);
                        }
                        C0IT A072 = c05m.A07(userJid3);
                        if (A072 != null) {
                            c451820s.A00.A01(new RunnableEBaseShape0S0300000_I0_0(c451820s, A072, A0B2, 12), 18);
                        }
                        C41521u3 c41521u3 = c04920Mm.A06;
                        C41981up c41981up = c41521u3.A0F;
                        if (c41981up.A04() && userJid3 != null) {
                            String A034 = c41521u3.A0G.A03();
                            c41521u3.A04.A00.A01(new SendWebForwardJob(A034, c41981up.A01().A03, Message.obtain(null, 0, 174, 0, new C0OW(A034, userJid3, null, userJid2))));
                        }
                        if (c41981up.A04() && userJid2 != null) {
                            String A035 = c41521u3.A0G.A03();
                            c41521u3.A04.A00.A01(new SendWebForwardJob(A035, c41981up.A01().A03, Message.obtain(null, 0, 174, 0, new C0OW(A035, userJid2, userJid3, null))));
                        }
                        this.A0H.A0L(c04420Kc);
                        return true;
                    }
                    throw null;
                }
            }
        }
        return true;
    }
}
