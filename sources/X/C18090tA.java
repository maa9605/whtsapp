package X;

import android.graphics.Canvas;
import android.graphics.Picture;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.0tA */
/* loaded from: classes.dex */
public class C18090tA {
    public C10430g2 A02 = null;
    public float A00 = 96.0f;
    public C17750sc A01 = new C17750sc();
    public Map A03 = new HashMap();

    public Picture A00() {
        C17900sr c17900sr;
        C10430g2 c10430g2 = this.A02;
        C17860sn c17860sn = ((AbstractC11890iV) c10430g2).A00;
        C17900sr c17900sr2 = c10430g2.A01;
        if (c17900sr2 != null) {
            EnumC18080t9 enumC18080t9 = c17900sr2.A01;
            EnumC18080t9 enumC18080t92 = EnumC18080t9.percent;
            if (enumC18080t9 != enumC18080t92 && (c17900sr = c10430g2.A00) != null && c17900sr.A01 != enumC18080t92) {
                return A01((int) Math.ceil(c17900sr2.A00(96.0f)), (int) Math.ceil(c17900sr.A00(96.0f)));
            }
            if (c17860sn != null) {
                float A00 = c17900sr2.A00(96.0f);
                return A01((int) Math.ceil(A00), (int) Math.ceil((c17860sn.A00 * A00) / c17860sn.A03));
            }
        }
        C17900sr c17900sr3 = c10430g2.A00;
        if (c17900sr3 != null && c17860sn != null) {
            float A002 = c17900sr3.A00(96.0f);
            return A01((int) Math.ceil((c17860sn.A03 * A002) / c17860sn.A00), (int) Math.ceil(A002));
        }
        return A01(512, 512);
    }

    public Picture A01(int i, int i2) {
        C17860sn c17860sn;
        C17840sl c17840sl;
        List list;
        List list2;
        Picture picture = new Picture();
        Canvas beginRecording = picture.beginRecording(i, i2);
        C17850sm c17850sm = new C17850sm();
        c17850sm.A03 = new C17860sn(0.0f, 0.0f, i, i2);
        C18130tE c18130tE = new C18130tE(beginRecording);
        c18130tE.A02 = this;
        C10430g2 c10430g2 = this.A02;
        if (c10430g2 == null) {
            Log.w("SVGAndroidRenderer", String.format("Nothing to render. Document is empty.", new Object[0]));
        } else {
            String str = c17850sm.A04;
            if (str != null) {
                AbstractC29261Wb A03 = A03(str);
                if (A03 == null || !(A03 instanceof C10290fg)) {
                    Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" not found.", c17850sm.A04));
                } else {
                    AbstractC11890iV abstractC11890iV = (AbstractC11890iV) A03;
                    c17860sn = abstractC11890iV.A00;
                    if (c17860sn == null) {
                        Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" is missing a viewBox attribute.", c17850sm.A04));
                    } else {
                        c17840sl = ((AbstractC20440xX) abstractC11890iV).A00;
                    }
                }
            } else {
                c17860sn = c17850sm.A02;
                if (c17860sn == null) {
                    c17860sn = ((AbstractC11890iV) c10430g2).A00;
                }
                c17840sl = c17850sm.A01;
                if (c17840sl == null) {
                    c17840sl = ((AbstractC20440xX) c10430g2).A00;
                }
            }
            C17750sc c17750sc = c17850sm.A00;
            if (c17750sc != null && (list2 = c17750sc.A00) != null && list2.size() > 0) {
                this.A01.A01(c17850sm.A00);
            }
            c18130tE.A03 = new C18110tC();
            c18130tE.A06 = new Stack();
            c18130tE.A0f(c18130tE.A03, C18020t3.A00());
            C18110tC c18110tC = c18130tE.A03;
            c18110tC.A03 = null;
            c18110tC.A07 = false;
            c18130tE.A06.push(new C18110tC(c18110tC));
            c18130tE.A04 = new Stack();
            c18130tE.A05 = new Stack();
            Boolean bool = ((AbstractC29261Wb) c10430g2).A02;
            if (bool != null) {
                c18130tE.A03.A07 = bool.booleanValue();
            }
            c18130tE.A0K();
            C17860sn c17860sn2 = new C17860sn(c17850sm.A03);
            C17900sr c17900sr = c10430g2.A01;
            if (c17900sr != null) {
                c17860sn2.A03 = c17900sr.A04(c18130tE, c17860sn2.A03);
            }
            C17900sr c17900sr2 = c10430g2.A00;
            if (c17900sr2 != null) {
                c17860sn2.A00 = c17900sr2.A04(c18130tE, c17860sn2.A00);
            }
            c18130tE.A0T(c10430g2, c17860sn2, c17860sn, c17840sl);
            c18130tE.A0J();
            C17750sc c17750sc2 = c17850sm.A00;
            if (c17750sc2 != null && (list = c17750sc2.A00) != null && list.size() > 0) {
                C17750sc c17750sc3 = this.A01;
                EnumC17780sf enumC17780sf = EnumC17780sf.RenderOptions;
                List list3 = c17750sc3.A00;
                if (list3 != null) {
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        if (((C17730sa) it.next()).A01 == enumC17780sf) {
                            it.remove();
                        }
                    }
                }
            }
        }
        picture.endRecording();
        return picture;
    }

    public final AbstractC29261Wb A02(InterfaceC18040t5 interfaceC18040t5, String str) {
        AbstractC29261Wb A02;
        AbstractC29261Wb abstractC29261Wb = (AbstractC29261Wb) interfaceC18040t5;
        if (str.equals(abstractC29261Wb.A03)) {
            return abstractC29261Wb;
        }
        for (C18050t6 c18050t6 : interfaceC18040t5.A8t()) {
            if (c18050t6 instanceof AbstractC29261Wb) {
                AbstractC29261Wb abstractC29261Wb2 = (AbstractC29261Wb) c18050t6;
                if (str.equals(abstractC29261Wb2.A03)) {
                    return abstractC29261Wb2;
                }
                if ((c18050t6 instanceof InterfaceC18040t5) && (A02 = A02((InterfaceC18040t5) c18050t6, str)) != null) {
                    return A02;
                }
            }
        }
        return null;
    }

    public AbstractC29261Wb A03(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        C10430g2 c10430g2 = this.A02;
        if (str.equals(((AbstractC29261Wb) c10430g2).A03)) {
            return c10430g2;
        }
        if (this.A03.containsKey(str)) {
            return (AbstractC29261Wb) this.A03.get(str);
        }
        AbstractC29261Wb A02 = A02(this.A02, str);
        this.A03.put(str, A02);
        return A02;
    }

    public C18050t6 A04(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        String replace = str.replace("\\\n", "").replace("\\A", "\n");
        if (replace.length() <= 1 || !replace.startsWith("#")) {
            return null;
        }
        return A03(replace.substring(1));
    }
}
