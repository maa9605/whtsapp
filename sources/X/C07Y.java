package X;

import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.Locale;

/* renamed from: X.07Y */
/* loaded from: classes.dex */
public final class C07Y {
    public static final C07X A00;
    public static final C07X A01;
    public static final C07X A02;
    public static final C07X A03;
    public static final C07X A04 = new AbstractC014907a(null, false) { // from class: X.0Wo
        public final boolean A00;

        {
            this.A00 = r2;
        }

        @Override // X.AbstractC014907a
        public boolean A00() {
            return this.A00;
        }
    };
    public static final C07X A05 = new AbstractC014907a(null, true) { // from class: X.0Wo
        public final boolean A00;

        {
            this.A00 = r2;
        }

        @Override // X.AbstractC014907a
        public boolean A00() {
            return this.A00;
        }
    };

    static {
        C07070Wp c07070Wp = new C0Wq() { // from class: X.0Wp
            @Override // X.C0Wq
            public int A65(CharSequence charSequence, int i, int i2) {
                int i3 = i2 + i;
                int i4 = 2;
                while (i < i3 && i4 == 2) {
                    byte directionality = Character.getDirectionality(charSequence.charAt(i));
                    i4 = 1;
                    if (directionality != 0) {
                        if (directionality != 1 && directionality != 2) {
                            switch (directionality) {
                                case 14:
                                case 15:
                                    break;
                                case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                                case 17:
                                    break;
                                default:
                                    i4 = 2;
                                    break;
                            }
                        }
                        i4 = 0;
                    }
                    i++;
                }
                return i4;
            }
        };
        A01 = new AbstractC014907a(c07070Wp, false) { // from class: X.0Wo
            public final boolean A00;

            {
                this.A00 = r2;
            }

            @Override // X.AbstractC014907a
            public boolean A00() {
                return this.A00;
            }
        };
        A02 = new AbstractC014907a(c07070Wp, true) { // from class: X.0Wo
            public final boolean A00;

            {
                this.A00 = r2;
            }

            @Override // X.AbstractC014907a
            public boolean A00() {
                return this.A00;
            }
        };
        A00 = new AbstractC014907a(new C0Wq() { // from class: X.0Wr
            public final boolean A00 = true;

            @Override // X.C0Wq
            public int A65(CharSequence charSequence, int i, int i2) {
                int i3 = i2 + i;
                boolean z = false;
                while (i < i3) {
                    byte directionality = Character.getDirectionality(charSequence.charAt(i));
                    if (directionality != 0) {
                        if (directionality != 1 && directionality != 2) {
                            i++;
                        } else if (this.A00) {
                            return 0;
                        }
                    } else if (!this.A00) {
                        return 1;
                    }
                    z = true;
                    i++;
                }
                if (z) {
                    return this.A00 ? 1 : 0;
                }
                return 2;
            }
        }, false) { // from class: X.0Wo
            public final boolean A00;

            {
                this.A00 = r2;
            }

            @Override // X.AbstractC014907a
            public boolean A00() {
                return this.A00;
            }
        };
        A03 = new AbstractC014907a() { // from class: X.0Ws
            @Override // X.AbstractC014907a
            public boolean A00() {
                return C07050Wl.A00(Locale.getDefault()) == 1;
            }
        };
    }
}
