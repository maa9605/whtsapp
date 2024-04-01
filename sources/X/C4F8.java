package X;

import android.util.Pair;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4F8  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4F8 extends C0MU implements C2OS {
    public InterfaceC02360Aw A00;
    public C0HK A01 = new C0HK(new ArrayList());
    public C461825l A02 = new C461825l();
    public final C018508q A03;
    public final C002301c A04;
    public final C013306k A05;
    public final InterfaceC002901k A06;

    public C4F8(InterfaceC02360Aw interfaceC02360Aw, C018508q c018508q, InterfaceC002901k interfaceC002901k, C002301c c002301c, C013306k c013306k) {
        this.A00 = interfaceC02360Aw;
        this.A03 = c018508q;
        this.A06 = interfaceC002901k;
        this.A04 = c002301c;
        this.A05 = c013306k;
    }

    public void A02() {
        C013306k c013306k = this.A05;
        List A0Y = c013306k.A0Y(3, new Integer[]{20, 401}, new Integer[]{40});
        List A0Y2 = c013306k.A0Y(3, new Integer[]{417, 418}, new Integer[]{40});
        this.A03.A02.post(new C3RU(this, A0Y, A0Y2));
    }

    public /* synthetic */ void A03() {
        C900949q c900949q = new C900949q();
        c900949q.A01 = true;
        Pair A06 = C013306k.A06(new int[]{20, 401}, new int[]{40});
        c900949q.A00 = new C28031Pt((String) A06.second, (String[]) A06.first);
        this.A02.A0B(c900949q);
    }

    public /* synthetic */ void A04() {
        C900949q c900949q = new C900949q();
        c900949q.A01 = true;
        Pair A06 = C013306k.A06(new int[]{417, 418}, new int[]{40});
        c900949q.A00 = new C28031Pt((String) A06.second, (String[]) A06.first);
        this.A02.A0B(c900949q);
    }

    public /* synthetic */ void A05(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        C002301c c002301c = this.A04;
        C92024Hf c92024Hf = new C92024Hf(c002301c.A06(R.string.upi_mandate_expandable_view_pending_title));
        c92024Hf.A00 = c002301c.A06(R.string.upi_mandate_history_pending_description);
        arrayList.add(c92024Hf);
        C92014He c92014He = new C92014He();
        c92014He.A01 = this;
        c92014He.A02 = c002301c.A06(R.string.upi_mandate_expandable_view_pending_empty_text);
        c92014He.A03 = c002301c.A06(R.string.upi_mandate_expandable_view_see_all);
        c92014He.A00 = new C3RV(this);
        c92014He.A05 = list;
        arrayList.add(c92014He);
        C91304Ek c91304Ek = new C91304Ek(102);
        C92014He c92014He2 = new C92014He();
        c92014He2.A01 = this;
        c92014He2.A04 = c002301c.A06(R.string.upi_mandate_expandable_view_scheduled_title);
        c92014He2.A02 = c002301c.A06(R.string.upi_mandate_expandable_view_scheduled_empty_text);
        c92014He2.A03 = c002301c.A06(R.string.upi_mandate_expandable_view_see_all);
        c92014He2.A05 = list2;
        c92014He2.A00 = new C3RX(this);
        arrayList.add(c91304Ek);
        arrayList.add(c92014He2);
        arrayList.add(c91304Ek);
        this.A01.A0B(arrayList);
    }

    @Override // X.C2OS
    public void AMs() {
        this.A06.AS1(new C3RW(this));
    }
}
