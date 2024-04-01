package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;

/* renamed from: X.0Wg */
/* loaded from: classes.dex */
public class C0Wg extends ViewGroup.MarginLayoutParams {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public int A0S;
    public int A0T;
    public int A0U;
    public int A0V;
    public int A0W;
    public int A0X;
    public int A0Y;
    public int A0Z;
    public int A0a;
    public int A0b;
    public int A0c;
    public int A0d;
    public int A0e;
    public int A0f;
    public int A0g;
    public int A0h;
    public int A0i;
    public int A0j;
    public int A0k;
    public int A0l;
    public int A0m;
    public int A0n;
    public int A0o;
    public int A0p;
    public int A0q;
    public C0YF A0r;
    public String A0s;
    public String A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;

    public C0Wg() {
        super(-2, -2);
        this.A0Q = -1;
        this.A0R = -1;
        this.A01 = -1.0f;
        this.A0T = -1;
        this.A0U = -1;
        this.A0k = -1;
        this.A0l = -1;
        this.A0p = -1;
        this.A0o = -1;
        this.A0C = -1;
        this.A0B = -1;
        this.A0A = -1;
        this.A0D = -1;
        this.A0E = 0;
        this.A00 = 0.0f;
        this.A0m = -1;
        this.A0n = -1;
        this.A0J = -1;
        this.A0I = -1;
        this.A0M = -1;
        this.A0P = -1;
        this.A0N = -1;
        this.A0K = -1;
        this.A0O = -1;
        this.A0L = -1;
        this.A02 = 0.5f;
        this.A08 = 0.5f;
        this.A0t = null;
        this.A0F = 1;
        this.A03 = -1.0f;
        this.A09 = -1.0f;
        this.A0S = 0;
        this.A0q = 0;
        this.A0W = 0;
        this.A0V = 0;
        this.A0a = 0;
        this.A0Z = 0;
        this.A0Y = 0;
        this.A0X = 0;
        this.A05 = 1.0f;
        this.A04 = 1.0f;
        this.A0G = -1;
        this.A0H = -1;
        this.A0b = -1;
        this.A0v = false;
        this.A0u = false;
        this.A0s = null;
        this.A0w = true;
        this.A10 = true;
        this.A0z = false;
        this.A0x = false;
        this.A0y = false;
        this.A0g = -1;
        this.A0h = -1;
        this.A0i = -1;
        this.A0j = -1;
        this.A0c = -1;
        this.A0d = -1;
        this.A07 = 0.5f;
        this.A0r = new C0YF();
    }

    public C0Wg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.A0Q = -1;
        this.A0R = -1;
        this.A01 = -1.0f;
        this.A0T = -1;
        this.A0U = -1;
        this.A0k = -1;
        this.A0l = -1;
        this.A0p = -1;
        this.A0o = -1;
        this.A0C = -1;
        this.A0B = -1;
        this.A0A = -1;
        this.A0D = -1;
        this.A0E = 0;
        this.A00 = 0.0f;
        this.A0m = -1;
        this.A0n = -1;
        this.A0J = -1;
        this.A0I = -1;
        this.A0M = -1;
        this.A0P = -1;
        this.A0N = -1;
        this.A0K = -1;
        this.A0O = -1;
        this.A0L = -1;
        this.A02 = 0.5f;
        this.A08 = 0.5f;
        this.A0t = null;
        this.A0F = 1;
        this.A03 = -1.0f;
        this.A09 = -1.0f;
        this.A0S = 0;
        this.A0q = 0;
        this.A0W = 0;
        this.A0V = 0;
        this.A0a = 0;
        this.A0Z = 0;
        this.A0Y = 0;
        this.A0X = 0;
        this.A05 = 1.0f;
        this.A04 = 1.0f;
        this.A0G = -1;
        this.A0H = -1;
        this.A0b = -1;
        this.A0v = false;
        this.A0u = false;
        this.A0s = null;
        this.A0w = true;
        this.A10 = true;
        this.A0z = false;
        this.A0x = false;
        this.A0y = false;
        this.A0g = -1;
        this.A0h = -1;
        this.A0i = -1;
        this.A0j = -1;
        this.A0c = -1;
        this.A0d = -1;
        this.A07 = 0.5f;
        this.A0r = new C0YF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12420jO.A0I);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            int i3 = C12300jB.A00.get(index);
            switch (i3) {
                case 1:
                    this.A0b = obtainStyledAttributes.getInt(index, this.A0b);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.A0D);
                    this.A0D = resourceId;
                    if (resourceId == -1) {
                        this.A0D = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    this.A0E = obtainStyledAttributes.getDimensionPixelSize(index, this.A0E);
                    break;
                case 4:
                    float f = obtainStyledAttributes.getFloat(index, this.A00) % 360.0f;
                    this.A00 = f;
                    if (f < 0.0f) {
                        this.A00 = (360.0f - f) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    this.A0Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.A0Q);
                    break;
                case 6:
                    this.A0R = obtainStyledAttributes.getDimensionPixelOffset(index, this.A0R);
                    break;
                case 7:
                    this.A01 = obtainStyledAttributes.getFloat(index, this.A01);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, this.A0T);
                    this.A0T = resourceId2;
                    if (resourceId2 == -1) {
                        this.A0T = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, this.A0U);
                    this.A0U = resourceId3;
                    if (resourceId3 == -1) {
                        this.A0U = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, this.A0k);
                    this.A0k = resourceId4;
                    if (resourceId4 == -1) {
                        this.A0k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case GoogleMigrateImporterActivity.A0E /* 11 */:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, this.A0l);
                    this.A0l = resourceId5;
                    if (resourceId5 == -1) {
                        this.A0l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, this.A0p);
                    this.A0p = resourceId6;
                    if (resourceId6 == -1) {
                        this.A0p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, this.A0o);
                    this.A0o = resourceId7;
                    if (resourceId7 == -1) {
                        this.A0o = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, this.A0C);
                    this.A0C = resourceId8;
                    if (resourceId8 == -1) {
                        this.A0C = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, this.A0B);
                    this.A0B = resourceId9;
                    if (resourceId9 == -1) {
                        this.A0B = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, this.A0A);
                    this.A0A = resourceId10;
                    if (resourceId10 == -1) {
                        this.A0A = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, this.A0m);
                    this.A0m = resourceId11;
                    if (resourceId11 == -1) {
                        this.A0m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, this.A0n);
                    this.A0n = resourceId12;
                    if (resourceId12 == -1) {
                        this.A0n = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, this.A0J);
                    this.A0J = resourceId13;
                    if (resourceId13 == -1) {
                        this.A0J = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case C0M6.A01 /* 20 */:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, this.A0I);
                    this.A0I = resourceId14;
                    if (resourceId14 == -1) {
                        this.A0I = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    this.A0M = obtainStyledAttributes.getDimensionPixelSize(index, this.A0M);
                    break;
                case 22:
                    this.A0P = obtainStyledAttributes.getDimensionPixelSize(index, this.A0P);
                    break;
                case 23:
                    this.A0N = obtainStyledAttributes.getDimensionPixelSize(index, this.A0N);
                    break;
                case 24:
                    this.A0K = obtainStyledAttributes.getDimensionPixelSize(index, this.A0K);
                    break;
                case 25:
                    this.A0O = obtainStyledAttributes.getDimensionPixelSize(index, this.A0O);
                    break;
                case 26:
                    this.A0L = obtainStyledAttributes.getDimensionPixelSize(index, this.A0L);
                    break;
                case 27:
                    this.A0v = obtainStyledAttributes.getBoolean(index, this.A0v);
                    break;
                case 28:
                    this.A0u = obtainStyledAttributes.getBoolean(index, this.A0u);
                    break;
                case 29:
                    this.A02 = obtainStyledAttributes.getFloat(index, this.A02);
                    break;
                case 30:
                    this.A08 = obtainStyledAttributes.getFloat(index, this.A08);
                    break;
                case 31:
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    this.A0W = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                    int i5 = obtainStyledAttributes.getInt(index, 0);
                    this.A0V = i5;
                    if (i5 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        this.A0a = obtainStyledAttributes.getDimensionPixelSize(index, this.A0a);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, this.A0a) == -2) {
                            this.A0a = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        this.A0Y = obtainStyledAttributes.getDimensionPixelSize(index, this.A0Y);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, this.A0Y) == -2) {
                            this.A0Y = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    this.A05 = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.A05));
                    this.A0W = 2;
                    break;
                case 36:
                    try {
                        this.A0Z = obtainStyledAttributes.getDimensionPixelSize(index, this.A0Z);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, this.A0Z) == -2) {
                            this.A0Z = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        this.A0X = obtainStyledAttributes.getDimensionPixelSize(index, this.A0X);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, this.A0X) == -2) {
                            this.A0X = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    this.A04 = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.A04));
                    this.A0V = 2;
                    break;
                default:
                    switch (i3) {
                        case 44:
                            String string = obtainStyledAttributes.getString(index);
                            this.A0t = string;
                            this.A0F = -1;
                            if (string != null) {
                                int length = string.length();
                                int indexOf = string.indexOf(44);
                                if (indexOf <= 0 || indexOf >= length - 1) {
                                    i = 0;
                                } else {
                                    String substring = string.substring(0, indexOf);
                                    if (substring.equalsIgnoreCase("W")) {
                                        this.A0F = 0;
                                    } else if (substring.equalsIgnoreCase("H")) {
                                        this.A0F = 1;
                                    }
                                    i = indexOf + 1;
                                }
                                String str = this.A0t;
                                int indexOf2 = str.indexOf(58);
                                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                    String substring2 = str.substring(i, indexOf2);
                                    String substring3 = this.A0t.substring(indexOf2 + 1);
                                    if (substring2.length() > 0 && substring3.length() > 0) {
                                        try {
                                            Float.parseFloat(substring2);
                                            Float.parseFloat(substring3);
                                            break;
                                        } catch (NumberFormatException unused5) {
                                            break;
                                        }
                                    }
                                } else {
                                    String substring4 = str.substring(i);
                                    if (substring4.length() > 0) {
                                        Float.parseFloat(substring4);
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                            } else {
                                continue;
                            }
                            break;
                        case 45:
                            this.A03 = obtainStyledAttributes.getFloat(index, this.A03);
                            continue;
                        case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /* 46 */:
                            this.A09 = obtainStyledAttributes.getFloat(index, this.A09);
                            continue;
                        case 47:
                            this.A0S = obtainStyledAttributes.getInt(index, 0);
                            continue;
                        case 48:
                            this.A0q = obtainStyledAttributes.getInt(index, 0);
                            continue;
                        case 49:
                            this.A0G = obtainStyledAttributes.getDimensionPixelOffset(index, this.A0G);
                            continue;
                        case 50:
                            this.A0H = obtainStyledAttributes.getDimensionPixelOffset(index, this.A0H);
                            continue;
                        case 51:
                            this.A0s = obtainStyledAttributes.getString(index);
                            continue;
                    }
            }
        }
        obtainStyledAttributes.recycle();
        A00();
    }

    public C0Wg(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.A0Q = -1;
        this.A0R = -1;
        this.A01 = -1.0f;
        this.A0T = -1;
        this.A0U = -1;
        this.A0k = -1;
        this.A0l = -1;
        this.A0p = -1;
        this.A0o = -1;
        this.A0C = -1;
        this.A0B = -1;
        this.A0A = -1;
        this.A0D = -1;
        this.A0E = 0;
        this.A00 = 0.0f;
        this.A0m = -1;
        this.A0n = -1;
        this.A0J = -1;
        this.A0I = -1;
        this.A0M = -1;
        this.A0P = -1;
        this.A0N = -1;
        this.A0K = -1;
        this.A0O = -1;
        this.A0L = -1;
        this.A02 = 0.5f;
        this.A08 = 0.5f;
        this.A0t = null;
        this.A0F = 1;
        this.A03 = -1.0f;
        this.A09 = -1.0f;
        this.A0S = 0;
        this.A0q = 0;
        this.A0W = 0;
        this.A0V = 0;
        this.A0a = 0;
        this.A0Z = 0;
        this.A0Y = 0;
        this.A0X = 0;
        this.A05 = 1.0f;
        this.A04 = 1.0f;
        this.A0G = -1;
        this.A0H = -1;
        this.A0b = -1;
        this.A0v = false;
        this.A0u = false;
        this.A0s = null;
        this.A0w = true;
        this.A10 = true;
        this.A0z = false;
        this.A0x = false;
        this.A0y = false;
        this.A0g = -1;
        this.A0h = -1;
        this.A0i = -1;
        this.A0j = -1;
        this.A0c = -1;
        this.A0d = -1;
        this.A07 = 0.5f;
        this.A0r = new C0YF();
    }

    public void A00() {
        this.A0x = false;
        this.A0w = true;
        this.A10 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.A0v) {
            this.A0w = false;
            if (this.A0W == 0) {
                this.A0W = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.A0u) {
            this.A10 = false;
            if (this.A0V == 0) {
                this.A0V = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.A0w = false;
            if (i == 0 && this.A0W == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.A0v = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.A10 = false;
            if (i2 == 0 && this.A0V == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.A0u = true;
            }
        }
        if (this.A01 == -1.0f && this.A0Q == -1 && this.A0R == -1) {
            return;
        }
        this.A0x = true;
        this.A0w = true;
        this.A10 = true;
        C0YF c0yf = this.A0r;
        if (!(c0yf instanceof C28581Sq)) {
            c0yf = new C28581Sq();
            this.A0r = c0yf;
        }
        ((C28581Sq) c0yf).A0J(this.A0b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0014, code lost:
        if (1 != getLayoutDirection()) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00c1  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void resolveLayoutDirection(int r15) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Wg.resolveLayoutDirection(int):void");
    }
}
