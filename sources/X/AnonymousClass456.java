package X;

import android.graphics.Rect;
import android.os.Build;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.Collections;
import java.util.List;

/* renamed from: X.456 */
/* loaded from: classes3.dex */
public final class AnonymousClass456 extends AbstractC886243v implements Cloneable {
    public Rect A00;
    public Rect A01;
    public C42C A02;
    public C42C A03;
    public C42C A04;
    public C42C A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;
    public Boolean A0E;
    public Double A0F;
    public Double A0G;
    public Double A0H;
    public Float A0I;
    public Integer A0J;
    public Integer A0K;
    public Integer A0L;
    public Integer A0M;
    public Integer A0P;
    public Integer A0Q;
    public Integer A0R;
    public Integer A0S;
    public Integer A0T;
    public Integer A0U;
    public Integer A0V;
    public Integer A0W;
    public Integer A0X;
    public Long A0Z;
    public Long A0a;
    public String A0b;
    public List A0c;
    public List A0d;
    public float[] A0e;
    public int[] A0f;
    public final AbstractC885543o A0g;
    public final int[] A0h;
    public Integer A0O = 0;
    public Integer A0Y = 0;
    public Integer A0N = 0;

    public AnonymousClass456(AbstractC885543o abstractC885543o) {
        Boolean bool = Boolean.FALSE;
        this.A0D = bool;
        this.A0B = bool;
        this.A0C = bool;
        this.A08 = bool;
        this.A0E = bool;
        this.A0A = bool;
        this.A06 = bool;
        this.A09 = bool;
        this.A07 = Boolean.TRUE;
        this.A0h = new int[2];
        this.A0P = 0;
        this.A0X = 0;
        this.A0J = 0;
        this.A0L = 0;
        this.A0R = 0;
        this.A0S = 0;
        this.A0U = 0;
        this.A0V = 0;
        this.A0T = 0;
        this.A0Q = 0;
        this.A0Z = 0L;
        this.A0I = Float.valueOf(0.0f);
        this.A0K = 1;
        this.A0W = 0;
        this.A0M = 1;
        this.A0a = 0L;
        Double valueOf = Double.valueOf(0.0d);
        this.A0F = valueOf;
        this.A0H = valueOf;
        this.A0G = valueOf;
        this.A0b = "";
        List list = Collections.EMPTY_LIST;
        this.A0c = list;
        this.A0d = list;
        this.A0g = abstractC885543o;
    }

    public void A01(C886143u c886143u, Object obj) {
        int i = c886143u.A00;
        switch (i) {
            case 0:
                this.A08 = (Boolean) obj;
                return;
            case 1:
                this.A0E = (Boolean) obj;
                return;
            case 2:
                if (((Boolean) this.A0g.A00(AbstractC885543o.A07)).booleanValue()) {
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    A01(AbstractC886243v.A0g, Integer.valueOf(booleanValue ? 17 : 0));
                    if (booleanValue) {
                        A01(AbstractC886243v.A0f, Boolean.FALSE);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                this.A0D = (Boolean) obj;
                return;
            case 4:
                this.A0B = (Boolean) obj;
                return;
            case 5:
                this.A0A = (Boolean) obj;
                return;
            case 6:
                this.A06 = (Boolean) obj;
                return;
            case 7:
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
            case C0M6.A01 /* 20 */:
            case 27:
            case 28:
            case 39:
            case 40:
            case 42:
            default:
                StringBuilder A0P = C000200d.A0P("Cannot directly set: ");
                A0P.append(i);
                throw new RuntimeException(A0P.toString());
            case 8:
                this.A0C = (Boolean) obj;
                return;
            case 9:
                this.A0P = (Integer) obj;
                return;
            case 10:
                int intValue = ((Number) obj).intValue();
                this.A0O = Integer.valueOf(intValue != -1 ? intValue : 0);
                return;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                this.A0J = (Integer) obj;
                return;
            case 12:
                this.A0L = (Integer) obj;
                return;
            case 13:
                this.A0N = (Integer) obj;
                return;
            case 14:
                this.A0R = (Integer) obj;
                return;
            case 15:
                this.A0S = (Integer) obj;
                return;
            case 17:
                this.A0U = (Integer) obj;
                return;
            case 18:
                return;
            case 19:
                this.A0V = (Integer) obj;
                return;
            case 21:
                this.A0T = (Integer) obj;
                return;
            case 22:
                this.A0Q = (Integer) obj;
                return;
            case 23:
                this.A0W = (Integer) obj;
                return;
            case 24:
                this.A0X = (Integer) obj;
                return;
            case 25:
                this.A0Y = (Integer) obj;
                return;
            case 26:
                this.A0a = (Long) obj;
                return;
            case 29:
                this.A0F = (Double) obj;
                return;
            case 30:
                this.A0H = (Double) obj;
                return;
            case 31:
                this.A0G = (Double) obj;
                return;
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                C42C c42c = (C42C) obj;
                this.A04 = c42c;
                this.A01 = c42c != null ? new Rect(0, 0, c42c.A01, c42c.A00) : null;
                return;
            case 33:
                C42C c42c2 = (C42C) obj;
                this.A03 = c42c2;
                this.A00 = c42c2 != null ? new Rect(0, 0, c42c2.A01, c42c2.A00) : null;
                return;
            case 34:
                this.A05 = (C42C) obj;
                return;
            case 35:
                this.A02 = (C42C) obj;
                return;
            case 36:
                this.A0c = C885843r.A00((List) obj);
                return;
            case 37:
                this.A0d = C885843r.A00((List) obj);
                return;
            case 38:
                int[] iArr = (int[]) obj;
                if (iArr != null && iArr.length == 2) {
                    int[] iArr2 = this.A0h;
                    iArr2[0] = iArr[0];
                    iArr2[1] = iArr[1];
                    return;
                }
                return;
            case 41:
                this.A0b = (String) obj;
                return;
            case 43:
                this.A09 = (Boolean) obj;
                return;
            case 44:
                this.A07 = (Boolean) obj;
                return;
            case 45:
                this.A0Z = (Long) obj;
                return;
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /* 46 */:
                this.A0M = (Integer) obj;
                return;
            case 47:
                this.A0I = (Float) obj;
                return;
            case 48:
                if (Build.VERSION.SDK_INT >= 21) {
                    this.A0e = (float[]) obj;
                    return;
                }
                return;
            case 49:
                this.A0K = (Integer) obj;
                return;
            case 50:
                if (Build.VERSION.SDK_INT >= 21) {
                    this.A0f = (int[]) obj;
                    return;
                }
                return;
        }
    }

    public boolean A02(C886443x c886443x) {
        boolean z;
        if (c886443x.A0n) {
            A01(AbstractC886243v.A09, Integer.valueOf(c886443x.A09));
            z = true;
        } else {
            z = false;
        }
        if (c886443x.A0j) {
            A01(AbstractC886243v.A07, Integer.valueOf(c886443x.A08));
            z = true;
        }
        if (c886443x.A0y) {
            A01(AbstractC886243v.A0P, Boolean.valueOf(c886443x.A0x));
            z = true;
        }
        if (c886443x.A1I) {
            A01(AbstractC886243v.A0R, Boolean.valueOf(c886443x.A1H));
            z = true;
        }
        if (c886443x.A15) {
            A01(AbstractC886243v.A0Q, Boolean.valueOf(c886443x.A14));
            z = true;
        }
        if (c886443x.A1E) {
            A01(AbstractC886243v.A0f, Boolean.valueOf(c886443x.A1D));
            z = true;
        }
        if (c886443x.A0b) {
            A01(AbstractC886243v.A0K, Boolean.valueOf(c886443x.A0a));
            z = true;
        }
        if (c886443x.A0d) {
            A01(AbstractC886243v.A0L, Boolean.valueOf(c886443x.A0c));
            z = true;
        }
        if (c886443x.A1B) {
            A01(AbstractC886243v.A0c, Integer.valueOf(c886443x.A0H));
            z = true;
        }
        if (c886443x.A1A) {
            A01(AbstractC886243v.A0b, c886443x.A1N);
            z = true;
        }
        if (c886443x.A0p) {
            A01(AbstractC886243v.A0B, Integer.valueOf(c886443x.A0A));
            z = true;
        }
        if (c886443x.A0r) {
            A01(AbstractC886243v.A0O, Boolean.valueOf(c886443x.A0q));
            z = true;
        }
        if (c886443x.A0X) {
            A01(AbstractC886243v.A0I, Boolean.valueOf(c886443x.A0W));
            z = true;
        }
        if (c886443x.A1J) {
            A01(AbstractC886243v.A0j, Integer.valueOf(c886443x.A0J));
            z = true;
        }
        if (c886443x.A0U) {
            A01(AbstractC886243v.A00, Integer.valueOf(c886443x.A04));
            z = true;
        }
        if (c886443x.A0h) {
            A01(AbstractC886243v.A05, Integer.valueOf(c886443x.A06));
            z = true;
        }
        if (c886443x.A10) {
            A01(AbstractC886243v.A0S, Integer.valueOf(c886443x.A0C));
            z = true;
        }
        if (c886443x.A11) {
            A01(AbstractC886243v.A0T, Integer.valueOf(c886443x.A0D));
            z = true;
        }
        if (c886443x.A12) {
            A01(AbstractC886243v.A0U, c886443x.A0N);
            z = true;
        }
        if (c886443x.A17) {
            A01(AbstractC886243v.A0Y, Integer.valueOf(c886443x.A0F));
            z = true;
        }
        if (c886443x.A16) {
            A01(AbstractC886243v.A0W, Integer.valueOf(c886443x.A0E));
            z = true;
        }
        if (c886443x.A0z) {
            A01(AbstractC886243v.A0H, Integer.valueOf(c886443x.A0B));
            z = true;
        }
        if (c886443x.A0m) {
            A01(AbstractC886243v.A08, Long.valueOf(c886443x.A0L));
            z = true;
        }
        if (c886443x.A0i) {
            A01(AbstractC886243v.A06, Integer.valueOf(c886443x.A07));
            z = true;
        }
        if (c886443x.A0V) {
            A01(AbstractC886243v.A01, Float.valueOf(c886443x.A03));
            z = true;
        }
        if (c886443x.A0e) {
            A01(AbstractC886243v.A02, c886443x.A1L);
            z = true;
        }
        if (c886443x.A0f) {
            A01(AbstractC886243v.A03, Integer.valueOf(c886443x.A05));
            z = true;
        }
        if (c886443x.A0g) {
            A01(AbstractC886243v.A04, c886443x.A1M);
            z = true;
        }
        if (c886443x.A1F) {
            A01(AbstractC886243v.A0g, Integer.valueOf(c886443x.A0I));
            z = true;
        }
        if (c886443x.A1K) {
            A01(AbstractC886243v.A0k, Integer.valueOf(c886443x.A0K));
            z = true;
        }
        if (c886443x.A0w) {
            A01(AbstractC886243v.A0G, Long.valueOf(c886443x.A0M));
            z = true;
        }
        if (c886443x.A0s) {
            A01(AbstractC886243v.A0C, Double.valueOf(c886443x.A00));
            z = true;
        }
        if (c886443x.A0u) {
            A01(AbstractC886243v.A0E, Double.valueOf(c886443x.A02));
            z = true;
        }
        if (c886443x.A0t) {
            A01(AbstractC886243v.A0D, Double.valueOf(c886443x.A01));
            z = true;
        }
        if (c886443x.A0v) {
            A01(AbstractC886243v.A0F, c886443x.A0R);
            z = true;
        }
        if (c886443x.A0o) {
            A01(AbstractC886243v.A0A, c886443x.A0S);
            z = true;
        }
        if (c886443x.A13) {
            A01(AbstractC886243v.A0V, c886443x.A0T);
            z = true;
        }
        if (c886443x.A1C) {
            A01(AbstractC886243v.A0e, c886443x.A0P);
            z = true;
        }
        if (c886443x.A18) {
            A01(AbstractC886243v.A0Z, c886443x.A0O);
            z = true;
        }
        if (c886443x.A1G) {
            A01(AbstractC886243v.A0i, c886443x.A0Q);
            z = true;
        }
        if (c886443x.A0l) {
            A01(AbstractC886243v.A0M, Boolean.valueOf(c886443x.A0k));
            z = true;
        }
        if (c886443x.A0Z) {
            A01(AbstractC886243v.A0J, Boolean.valueOf(c886443x.A0Y));
            return true;
        }
        return z;
    }

    public Object clone() {
        return super.clone();
    }
}
