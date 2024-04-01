package X;

import java.util.List;

/* renamed from: X.0t3 */
/* loaded from: classes.dex */
public class C18020t3 implements Cloneable {
    public long A00 = 0;
    public C17870so A01;
    public C1WX A02;
    public C17900sr A03;
    public C17900sr A04;
    public C17900sr A05;
    public EnumC17930su A06;
    public EnumC17930su A07;
    public EnumC17940sv A08;
    public EnumC17950sw A09;
    public EnumC17960sx A0A;
    public EnumC17970sy A0B;
    public EnumC17980sz A0C;
    public EnumC17990t0 A0D;
    public EnumC18000t1 A0E;
    public EnumC18010t2 A0F;
    public AbstractC18060t7 A0G;
    public AbstractC18060t7 A0H;
    public AbstractC18060t7 A0I;
    public AbstractC18060t7 A0J;
    public AbstractC18060t7 A0K;
    public Boolean A0L;
    public Boolean A0M;
    public Boolean A0N;
    public Float A0O;
    public Float A0P;
    public Float A0Q;
    public Float A0R;
    public Float A0S;
    public Float A0T;
    public Float A0U;
    public Integer A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public List A0b;
    public C17900sr[] A0c;

    public static C18020t3 A00() {
        EnumC17930su enumC17930su = EnumC17930su.NonZero;
        C18020t3 c18020t3 = new C18020t3();
        c18020t3.A00 = -1L;
        C1WX c1wx = C1WX.A01;
        c18020t3.A0G = c1wx;
        c18020t3.A07 = enumC17930su;
        Float valueOf = Float.valueOf(1.0f);
        c18020t3.A0O = valueOf;
        c18020t3.A0J = null;
        c18020t3.A0T = valueOf;
        c18020t3.A05 = new C17900sr(1.0f);
        c18020t3.A09 = EnumC17950sw.Butt;
        c18020t3.A0A = EnumC17960sx.Miter;
        c18020t3.A0S = Float.valueOf(4.0f);
        c18020t3.A0c = null;
        c18020t3.A04 = new C17900sr(0.0f);
        c18020t3.A0P = valueOf;
        c18020t3.A02 = c1wx;
        c18020t3.A0b = null;
        c18020t3.A03 = new C17900sr(12.0f, EnumC18080t9.pt);
        c18020t3.A0V = 400;
        c18020t3.A08 = EnumC17940sv.Normal;
        c18020t3.A0D = EnumC17990t0.None;
        c18020t3.A0E = EnumC18000t1.LTR;
        c18020t3.A0C = EnumC17980sz.Start;
        Boolean bool = Boolean.TRUE;
        c18020t3.A0M = bool;
        c18020t3.A01 = null;
        c18020t3.A0Z = null;
        c18020t3.A0Y = null;
        c18020t3.A0X = null;
        c18020t3.A0L = bool;
        c18020t3.A0N = bool;
        c18020t3.A0I = c1wx;
        c18020t3.A0R = valueOf;
        c18020t3.A0W = null;
        c18020t3.A06 = enumC17930su;
        c18020t3.A0a = null;
        c18020t3.A0H = null;
        c18020t3.A0Q = valueOf;
        c18020t3.A0K = null;
        c18020t3.A0U = valueOf;
        c18020t3.A0F = EnumC18010t2.None;
        c18020t3.A0B = EnumC17970sy.auto;
        return c18020t3;
    }

    public Object clone() {
        C18020t3 c18020t3 = (C18020t3) super.clone();
        C17900sr[] c17900srArr = this.A0c;
        if (c17900srArr != null) {
            c18020t3.A0c = (C17900sr[]) c17900srArr.clone();
        }
        return c18020t3;
    }
}
