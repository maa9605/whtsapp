package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1bM */
/* loaded from: classes.dex */
public class C30901bM extends AbstractC04890Mh {
    public int A00;
    public int A01;
    public RecyclerView A02;
    public C016807u A03;
    public List A04;
    public final Handler A05;
    public final AnonymousClass087 A06;
    public final C33601gA A07;

    public C30901bM(AnonymousClass087 anonymousClass087, C016807u c016807u, int i) {
        C33601gA c33601gA = new C33601gA(i);
        if (anonymousClass087.A02 != null) {
            this.A04 = new ArrayList();
            this.A07 = c33601gA;
            A0B(true);
            this.A06 = anonymousClass087;
            this.A03 = c016807u;
            this.A05 = new Handler(Looper.getMainLooper()) { // from class: X.1E6
                {
                    C30901bM.this = this;
                }

                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    C09P c09p = (C09P) message.obj;
                    C30901bM c30901bM = C30901bM.this;
                    C016807u c016807u2 = c30901bM.A03;
                    int i2 = ((AbstractC016907v) c016807u2).A00;
                    ArrayList arrayList = new ArrayList();
                    InterfaceC020509l A0f = AnonymousClass088.A0f(c016807u2);
                    if (arrayList.size() == 0) {
                        arrayList.add(A0f);
                        C25031Du.A00(i2, c09p, new C021109r(arrayList), c30901bM.A06);
                        return;
                    }
                    throw new IllegalArgumentException("arguments have to be continuous");
                }
            };
            return;
        }
        throw null;
    }

    @Override // X.AbstractC04890Mh
    public long A00(int i) {
        return ((C08Q) this.A04.get(i)).A02.A00;
    }

    @Override // X.AbstractC04890Mh
    public void A05(C0TS c0ts) {
        C09P AA3;
        AnonymousClass080 anonymousClass080 = ((C08Q) ((C1Yr) c0ts).A00).A02.A02;
        if (anonymousClass080 == null || !(anonymousClass080 instanceof AnonymousClass081)) {
            return;
        }
        AnonymousClass081 anonymousClass081 = (AnonymousClass081) anonymousClass080;
        if (anonymousClass081.ADL() != 13366 || (AA3 = anonymousClass081.AA3(C1ER.A01)) == null) {
            return;
        }
        C09M.A00();
        Handler handler = this.A05;
        handler.sendMessage(handler.obtainMessage(0, AA3));
    }

    @Override // X.AbstractC04890Mh
    public void A06(C0TS c0ts) {
        C09P AA3;
        AnonymousClass080 anonymousClass080 = ((C08Q) ((C1Yr) c0ts).A00).A02.A02;
        if (anonymousClass080 == null || !(anonymousClass080 instanceof AnonymousClass081)) {
            return;
        }
        AnonymousClass081 anonymousClass081 = (AnonymousClass081) anonymousClass080;
        if (anonymousClass081.ADL() != 13366 || (AA3 = anonymousClass081.AA3(C1ER.A02)) == null) {
            return;
        }
        C09M.A00();
        Handler handler = this.A05;
        handler.sendMessage(handler.obtainMessage(0, AA3));
    }

    @Override // X.AbstractC04890Mh
    public void A07(C0TS c0ts) {
        C1Yr c1Yr = (C1Yr) c0ts;
        ((InterfaceC20550xi) c1Yr.A0H).setRenderTree(null);
        c1Yr.A00 = null;
    }

    @Override // X.AbstractC04890Mh
    public void A09(RecyclerView recyclerView) {
        this.A02 = recyclerView;
    }

    @Override // X.AbstractC04890Mh
    public void A0A(RecyclerView recyclerView) {
        this.A02 = null;
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        return this.A04.size();
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        return new C1Yr(new C39121pc(viewGroup.getContext()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x00da, code lost:
        if (r4 != null) goto L45;
     */
    @Override // X.AbstractC04890Mh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0F(X.C0TS r12, int r13) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30901bM.A0F(X.0TS, int):void");
    }
}
