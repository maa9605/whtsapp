package X;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.0YJ  reason: invalid class name */
/* loaded from: classes.dex */
public class C0YJ {
    public C0YK A02;
    public C0YJ A03;
    public final EnumC12170iy A05;
    public final C0YF A06;
    public HashSet A04 = null;
    public int A01 = 0;
    public int A00 = -1;

    public C0YJ(C0YF c0yf, EnumC12170iy enumC12170iy) {
        this.A06 = c0yf;
        this.A05 = enumC12170iy;
    }

    public int A00() {
        C0YJ c0yj;
        if (this.A06.A0N == 8) {
            return 0;
        }
        int i = this.A00;
        return (i <= -1 || (c0yj = this.A03) == null || c0yj.A06.A0N != 8) ? this.A01 : i;
    }

    public void A01() {
        HashSet hashSet;
        C0YJ c0yj = this.A03;
        if (c0yj != null && (hashSet = c0yj.A04) != null) {
            hashSet.remove(this);
        }
        this.A03 = null;
        this.A01 = 0;
        this.A00 = -1;
    }

    public void A02() {
        C0YK c0yk = this.A02;
        if (c0yk == null) {
            this.A02 = new C0YK(EnumC12160ix.UNRESTRICTED);
        } else {
            c0yk.A00();
        }
    }

    public void A03(C0YJ c0yj, int i, int i2) {
        if (c0yj == null) {
            A01();
            return;
        }
        this.A03 = c0yj;
        HashSet hashSet = c0yj.A04;
        if (hashSet == null) {
            hashSet = new HashSet();
            c0yj.A04 = hashSet;
        }
        hashSet.add(this);
        if (i > 0) {
            this.A01 = i;
        } else {
            this.A01 = 0;
        }
        this.A00 = i2;
    }

    public boolean A04() {
        C0YJ c0yj;
        HashSet hashSet = this.A04;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C0YJ c0yj2 = (C0YJ) it.next();
            EnumC12170iy enumC12170iy = c0yj2.A05;
            switch (enumC12170iy.ordinal()) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                    c0yj = null;
                    break;
                case 1:
                    c0yj = c0yj2.A06.A0X;
                    break;
                case 2:
                    c0yj = c0yj2.A06.A0S;
                    break;
                case 3:
                    c0yj = c0yj2.A06.A0W;
                    break;
                case 4:
                    c0yj = c0yj2.A06.A0Y;
                    break;
                default:
                    throw new AssertionError(enumC12170iy.name());
            }
            C0YJ c0yj3 = c0yj.A03;
            boolean z = false;
            if (c0yj3 != null) {
                z = true;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A06.A0f);
        sb.append(":");
        sb.append(this.A05.toString());
        return sb.toString();
    }
}
