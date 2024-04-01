package X;

import android.text.Layout;

/* renamed from: X.11S  reason: invalid class name */
/* loaded from: classes.dex */
public final class C11S {
    public float A00;
    public int A01;
    public int A03;
    public Layout.Alignment A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public int A06 = -1;
    public int A07 = -1;
    public int A02 = -1;
    public int A05 = -1;
    public int A04 = -1;

    public void A00(C11S c11s) {
        if (c11s != null) {
            if (!this.A0C && c11s.A0C) {
                this.A03 = c11s.A03;
                this.A0C = true;
            }
            if (this.A02 == -1) {
                this.A02 = c11s.A02;
            }
            if (this.A05 == -1) {
                this.A05 = c11s.A05;
            }
            if (this.A09 == null) {
                this.A09 = c11s.A09;
            }
            if (this.A06 == -1) {
                this.A06 = c11s.A06;
            }
            if (this.A07 == -1) {
                this.A07 = c11s.A07;
            }
            if (this.A08 == null) {
                this.A08 = c11s.A08;
            }
            if (this.A04 == -1) {
                this.A04 = c11s.A04;
                this.A00 = c11s.A00;
            }
            if (this.A0B || !c11s.A0B) {
                return;
            }
            this.A01 = c11s.A01;
            this.A0B = true;
        }
    }
}
