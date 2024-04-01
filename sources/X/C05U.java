package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.List;

/* renamed from: X.05U */
/* loaded from: classes.dex */
public class C05U {
    public static volatile C05U A08;
    public final AbstractC000600i A00;
    public final C06K A01;
    public final C05W A02;
    public final C001200o A03;
    public final C002301c A04;
    public final C06I A05;
    public final C003701t A06;
    public final C05V A07;

    public C05U(C001200o c001200o, C003701t c003701t, AbstractC000600i abstractC000600i, C05W c05w, C002301c c002301c, C05V c05v, C06I c06i, C06K c06k) {
        this.A06 = c003701t;
        this.A00 = abstractC000600i;
        this.A03 = c001200o;
        this.A02 = c05w;
        this.A04 = c002301c;
        this.A07 = c05v;
        this.A05 = c06i;
        this.A01 = c06k;
    }

    public static C0CV A00(GroupJid groupJid, long j) {
        C0CV c0cv = new C0CV(new AnonymousClass094(groupJid, false, ""), j);
        c0cv.A0G = groupJid;
        c0cv.A0d = null;
        c0cv.A0Z(2);
        return c0cv;
    }

    public static C05U A01() {
        if (A08 == null) {
            synchronized (C05V.class) {
                if (A08 == null) {
                    A08 = new C05U(C001200o.A01, C003701t.A00(), AbstractC000600i.A00(), C05W.A00(), C002301c.A00(), C05V.A01(), C06I.A00(), C06K.A00());
                }
            }
        }
        return A08;
    }

    public AnonymousClass092 A02(AnonymousClass094 anonymousClass094, long j, byte b) {
        C0JU A0b = C002701i.A0b(anonymousClass094, j, b);
        if (A0b != null) {
            return A0b;
        }
        switch (b) {
            case 0:
                return new C0JJ(anonymousClass094, j);
            case 1:
                return new AnonymousClass095(anonymousClass094, j);
            case 2:
                return new C09G(anonymousClass094, j);
            case 3:
                return new C0JP(anonymousClass094, j);
            case 4:
                return new C0D8(anonymousClass094, j);
            case 5:
                return new C0LP(anonymousClass094, j);
            case 6:
            case 7:
            case 17:
            case 18:
            case 34:
            case 35:
            case 38:
            case 39:
            case 40:
            case 41:
            case 47:
            case 50:
            default:
                C000700j.A08(false, C000200d.A0D("FMessageFactory/newFMessage/message type not handled; type=", b));
                return new AnonymousClass092(anonymousClass094, j, b) { // from class: X.1nA
                    @Override // X.AnonymousClass092
                    public String A16() {
                        return null;
                    }

                    @Override // X.AnonymousClass092
                    public void A17(String str) {
                    }
                };
            case 8:
                return new C10050fD(anonymousClass094, j);
            case 9:
                return new C09E(anonymousClass094, j);
            case 10:
                return new C04280Jo(anonymousClass094, j);
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                return new C0CW(anonymousClass094, j) { // from class: X.1MK
                };
            case 12:
                return new C0KT(anonymousClass094, j);
            case 13:
                return new C0LO(anonymousClass094, j);
            case 14:
                return new C0DA(this.A03, this.A02, this.A04, this.A01, anonymousClass094, j);
            case 15:
                return new C03890Hn(anonymousClass094, j);
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                return new C0KC(anonymousClass094, j);
            case 19:
                return new C0CW(anonymousClass094, j) { // from class: X.0fA
                };
            case C0M6.A01 /* 20 */:
                return new C04040Ie(anonymousClass094, j);
            case 21:
                return new C0LQ(anonymousClass094, j);
            case 22:
                return new C0LS(anonymousClass094, j);
            case 23:
                return new C04160Iu(anonymousClass094, j);
            case 24:
                return new C04570Ky(anonymousClass094, j);
            case 25:
                return new C14390ms(anonymousClass094, j);
            case 26:
                return new C21700zl(anonymousClass094, j);
            case 27:
                return new C1MI(anonymousClass094, j);
            case 28:
                return new C10470g6(anonymousClass094, j);
            case 29:
                return new C10480g7(anonymousClass094, j);
            case 30:
                return new C21170yu(anonymousClass094, j);
            case 31:
                return new C0CW(anonymousClass094, j) { // from class: X.1MJ
                };
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                return new C0PX(anonymousClass094, j);
            case 33:
                return new C0CV(anonymousClass094, j);
            case 36:
                return new C0KU(anonymousClass094, j);
            case 37:
                return new C10040fC(anonymousClass094, j);
            case 42:
                return new C09D(anonymousClass094, j);
            case 43:
                return new C09A(anonymousClass094, j);
            case 44:
                return new C0LN(this.A00, anonymousClass094, j);
            case 45:
                return new C0LU(anonymousClass094, j, (byte) 45);
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /* 46 */:
                return new C0LV(anonymousClass094, j);
            case 48:
                return new C10220fU(anonymousClass094, j);
            case 49:
                return new C05510Pa(anonymousClass094, j);
            case 51:
                return new C0LT(anonymousClass094, j);
            case 52:
                return new C0LU(anonymousClass094, j, (byte) 52);
        }
    }

    public final AnonymousClass097 A03(AbstractC005302j abstractC005302j, C09H c09h, long j, int i, byte b, int i2, String str, long j2, int i3, AnonymousClass092 anonymousClass092) {
        C05V c05v = this.A07;
        AnonymousClass092 A02 = A02(C05V.A00(c05v.A01, c05v.A00, abstractC005302j, true), j, b);
        if (A02 instanceof AnonymousClass097) {
            AnonymousClass097 anonymousClass097 = (AnonymousClass097) A02;
            anonymousClass097.A02 = c09h;
            ((AnonymousClass092) anonymousClass097).A01 = i;
            anonymousClass097.A0Y(i2);
            anonymousClass097.A08 = str;
            anonymousClass097.A01 = j2;
            ((AnonymousClass092) anonymousClass097).A04 = i3;
            A05(anonymousClass097, anonymousClass092);
            return anonymousClass097;
        }
        throw new IllegalArgumentException(C000200d.A0D("FMessageFactory/newFMessageMedia/wrong message type; mediaWaType=", b));
    }

    public C0JJ A04(AbstractC005302j abstractC005302j, String str, long j, C05920Qu c05920Qu, List list, AnonymousClass092 anonymousClass092) {
        C05V c05v = this.A07;
        C0JJ c0jj = new C0JJ(C05V.A00(c05v.A01, c05v.A00, abstractC005302j, true), j, str, c05920Qu, list);
        A05(c0jj, anonymousClass092);
        return c0jj;
    }

    public void A05(AnonymousClass092 anonymousClass092, AnonymousClass092 anonymousClass0922) {
        byte[] bArr;
        AnonymousClass092 anonymousClass0923;
        AnonymousClass092 A0C;
        if (anonymousClass0922 != null) {
            C03900Hp A0E = anonymousClass0922.A0E();
            if (A0E != null && A0E.A05()) {
                if (!A0E.A06()) {
                    byte[] A07 = A0E.A07();
                    if (A07 == null) {
                        A07 = this.A05.A0D(anonymousClass0922);
                    }
                    A0E.A02(A07);
                }
                bArr = A0E.A08();
            } else {
                bArr = null;
            }
            if (anonymousClass0922 instanceof AnonymousClass098) {
                anonymousClass0923 = ((AnonymousClass098) anonymousClass0922).A6G(anonymousClass0922.A0n);
                anonymousClass0923.A0b = anonymousClass0922.A0b;
                anonymousClass0923.A0F = anonymousClass0922.A0F;
            } else {
                anonymousClass0923 = null;
                if (anonymousClass0922 instanceof C0CV) {
                    anonymousClass0923 = anonymousClass0922;
                }
                anonymousClass092.A0g(anonymousClass0923);
                A0C = anonymousClass092.A0C();
                if (A0C != null || A0C.A0E() == null) {
                }
                anonymousClass092.A0C().A0E().A04(bArr, true);
                return;
            }
            anonymousClass0923.A05 = (1024 ^ (-1)) & anonymousClass0923.A05;
            anonymousClass0923.A0Z(2);
            if (anonymousClass0922.A11()) {
                anonymousClass0923.A0h(anonymousClass0922.A0D().A00);
            }
            anonymousClass092.A0g(anonymousClass0923);
            A0C = anonymousClass092.A0C();
            if (A0C != null) {
            }
        }
    }
}
