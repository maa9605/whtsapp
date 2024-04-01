package X;

import android.graphics.Rect;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.List;

/* renamed from: X.43v */
/* loaded from: classes3.dex */
public abstract class AbstractC886243v {
    public static final C886143u A0K = new C886143u(0);
    public static final C886143u A0L = new C886143u(1);
    public static final C886143u A0P = new C886143u(2);
    public static final C886143u A0R = new C886143u(3);
    public static final C886143u A0Q = new C886143u(4);
    public static final C886143u A0O = new C886143u(5);
    public static final C886143u A0I = new C886143u(6);
    public static final C886143u A0N = new C886143u(7);
    public static final C886143u A0f = new C886143u(8);
    public static final C886143u A0B = new C886143u(9);
    public static final C886143u A09 = new C886143u(10);
    public static final C886143u A00 = new C886143u(11);
    public static final C886143u A05 = new C886143u(12);
    public static final C886143u A07 = new C886143u(13);
    public static final C886143u A0S = new C886143u(14);
    public static final C886143u A0T = new C886143u(15);
    public static final C886143u A0X = new C886143u(16);
    public static final C886143u A0Y = new C886143u(17);
    public static final C886143u A0a = new C886143u(18);
    public static final C886143u A0c = new C886143u(19);
    public static final C886143u A0h = new C886143u(20);
    public static final C886143u A0W = new C886143u(21);
    public static final C886143u A0H = new C886143u(22);
    public static final C886143u A0g = new C886143u(23);
    public static final C886143u A0j = new C886143u(24);
    public static final C886143u A0k = new C886143u(25);
    public static final C886143u A0G = new C886143u(26);
    public static final C886143u A0C = new C886143u(29);
    public static final C886143u A0E = new C886143u(30);
    public static final C886143u A0D = new C886143u(31);
    public static final C886143u A0e = new C886143u(32);
    public static final C886143u A0Z = new C886143u(33);
    public static final C886143u A0i = new C886143u(34);
    public static final C886143u A0U = new C886143u(35);
    public static final C886143u A0A = new C886143u(36);
    public static final C886143u A0V = new C886143u(37);
    public static final C886143u A0b = new C886143u(38);
    public static final C886143u A0d = new C886143u(39);
    public static final C886143u A0F = new C886143u(41);
    public static final C886143u A0M = new C886143u(43);
    public static final C886143u A0J = new C886143u(44);
    public static final C886143u A08 = new C886143u(45);
    public static final C886143u A06 = new C886143u(46);
    public static final C886143u A01 = new C886143u(47);
    public static final C886143u A02 = new C886143u(48);
    public static final C886143u A03 = new C886143u(49);
    public static final C886143u A04 = new C886143u(50);

    public Object A00(C886143u c886143u) {
        if (!(this instanceof AnonymousClass459)) {
            AnonymousClass456 anonymousClass456 = (AnonymousClass456) this;
            int i = c886143u.A00;
            Float valueOf = Float.valueOf(0.0f);
            switch (i) {
                case 0:
                    return anonymousClass456.A08;
                case 1:
                    return anonymousClass456.A0E;
                case 2:
                    return Boolean.valueOf(((Number) anonymousClass456.A00(A0g)).intValue() == 17);
                case 3:
                    return anonymousClass456.A0D;
                case 4:
                    return anonymousClass456.A0B;
                case 5:
                    return anonymousClass456.A0A;
                case 6:
                    return anonymousClass456.A06;
                case 7:
                    return Boolean.valueOf(anonymousClass456.A0O.intValue() == 0);
                case 8:
                    return anonymousClass456.A0C;
                case 9:
                    return anonymousClass456.A0P;
                case 10:
                    return anonymousClass456.A0O;
                case GoogleMigrateImporterActivity.A0E /* 11 */:
                    return anonymousClass456.A0J;
                case 12:
                    return anonymousClass456.A0L;
                case 13:
                    return anonymousClass456.A0N;
                case 14:
                    return anonymousClass456.A0R;
                case 15:
                    return anonymousClass456.A0S;
                case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                    C42C c42c = anonymousClass456.A03;
                    if (c42c == null) {
                        return 0;
                    }
                    return Integer.valueOf(c42c.A01 * c42c.A00);
                case 17:
                    return anonymousClass456.A0U;
                case 18:
                    return 35;
                case 19:
                    return anonymousClass456.A0V;
                case C0M6.A01 /* 20 */:
                    return 0;
                case 21:
                    return anonymousClass456.A0T;
                case 22:
                    return anonymousClass456.A0Q;
                case 23:
                    return anonymousClass456.A0W;
                case 24:
                    return anonymousClass456.A0X;
                case 25:
                    return anonymousClass456.A0Y;
                case 26:
                    return anonymousClass456.A0a;
                case 27:
                case 28:
                    return valueOf;
                case 29:
                    return anonymousClass456.A0F;
                case 30:
                    return anonymousClass456.A0H;
                case 31:
                    return anonymousClass456.A0G;
                case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                    return anonymousClass456.A04;
                case 33:
                    return anonymousClass456.A03;
                case 34:
                    return anonymousClass456.A05;
                case 35:
                    return anonymousClass456.A02;
                case 36:
                    return anonymousClass456.A0c;
                case 37:
                    return anonymousClass456.A0d;
                case 38:
                    int[] iArr = anonymousClass456.A0h;
                    return new int[]{iArr[0], iArr[1]};
                case 39:
                    return new Rect(anonymousClass456.A01);
                case 40:
                    return new Rect(anonymousClass456.A00);
                case 41:
                    return anonymousClass456.A0b;
                case 42:
                    return "";
                case 43:
                    return anonymousClass456.A09;
                case 44:
                    return anonymousClass456.A07;
                case 45:
                    return anonymousClass456.A0Z;
                case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /* 46 */:
                    return anonymousClass456.A0M;
                case 47:
                    return anonymousClass456.A0I;
                case 48:
                    return anonymousClass456.A0e;
                case 49:
                    return anonymousClass456.A0K;
                case 50:
                    return anonymousClass456.A0f;
                default:
                    StringBuilder A0P2 = C000200d.A0P("Invalid Settings key: ");
                    A0P2.append(i);
                    throw new RuntimeException(A0P2.toString());
            }
        }
        AnonymousClass459 anonymousClass459 = (AnonymousClass459) this;
        int i2 = c886143u.A00;
        boolean z = false;
        switch (i2) {
            case 0:
                return anonymousClass459.A06;
            case 1:
                return anonymousClass459.A07;
            case 2:
                if (C885943s.A01 && ((Number) anonymousClass459.A00(A0g)).intValue() == 17) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                return anonymousClass459.A08;
            case 4:
                return Boolean.FALSE;
            case 5:
                return Boolean.FALSE;
            case 6:
                return Boolean.FALSE;
            case 7:
                int intValue = anonymousClass459.A0I.intValue();
                return Boolean.valueOf((intValue == -1 || intValue == 0) ? true : true);
            case 8:
                return anonymousClass459.A09;
            case 9:
                return anonymousClass459.A0J;
            case 10:
                return anonymousClass459.A0I;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                return anonymousClass459.A0F;
            case 12:
                return anonymousClass459.A0G;
            case 13:
                return anonymousClass459.A0H;
            case 14:
                return anonymousClass459.A0L;
            case 15:
                return anonymousClass459.A0M;
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                C42C c42c2 = anonymousClass459.A03;
                if (c42c2 == null) {
                    return 0;
                }
                return Integer.valueOf(c42c2.A01 * c42c2.A00);
            case 17:
                return anonymousClass459.A0O;
            case 18:
                return anonymousClass459.A0P;
            case 19:
                return anonymousClass459.A0Q;
            case C0M6.A01 /* 20 */:
                int intValue2 = anonymousClass459.A0Q.intValue();
                int[] iArr2 = anonymousClass459.A0a;
                int i3 = 0;
                int i4 = iArr2[0];
                int i5 = iArr2[1];
                for (Number number : (List) anonymousClass459.A0Z.A00(AbstractC885543o.A0c)) {
                    int intValue3 = number.intValue();
                    int i6 = intValue3 * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
                    if (i6 >= i4 && i6 <= i5 && i6 > i3) {
                        i3 = intValue3;
                    }
                }
                if (i3 != 0) {
                    intValue2 = i3;
                }
                return Integer.valueOf(intValue2);
            case 21:
                return anonymousClass459.A0N;
            case 22:
                return anonymousClass459.A0K;
            case 23:
                return anonymousClass459.A0R;
            case 24:
                return anonymousClass459.A0S;
            case 25:
                return anonymousClass459.A0T;
            case 26:
                return anonymousClass459.A0U;
            case 27:
                return anonymousClass459.A0E;
            case 28:
                return anonymousClass459.A0D;
            case 29:
                return anonymousClass459.A0A;
            case 30:
                return anonymousClass459.A0C;
            case 31:
                return anonymousClass459.A0B;
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                return anonymousClass459.A04;
            case 33:
                return anonymousClass459.A03;
            case 34:
                return anonymousClass459.A05;
            case 35:
                return anonymousClass459.A02;
            case 36:
                return anonymousClass459.A0X;
            case 37:
                return anonymousClass459.A0Y;
            case 38:
                int[] iArr3 = anonymousClass459.A0a;
                return new int[]{iArr3[0], iArr3[1]};
            case 39:
                return new Rect(anonymousClass459.A01);
            case 40:
                return new Rect(anonymousClass459.A00);
            case 41:
                return anonymousClass459.A0V;
            case 42:
                return anonymousClass459.A0W;
            default:
                StringBuilder A0P3 = C000200d.A0P("Invalid Settings key: ");
                A0P3.append(i2);
                throw new RuntimeException(A0P3.toString());
        }
    }
}
