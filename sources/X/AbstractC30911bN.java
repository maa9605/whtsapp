package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.1bN  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC30911bN extends AbstractC016307p {
    public C016807u A00;
    public final long A01;

    @Override // X.AbstractC016307p
    /* renamed from: A08 */
    public abstract View A07(Context context);

    public void A09(View view, AnonymousClass087 anonymousClass087, C016807u c016807u, Object obj) {
    }

    public abstract void A0A(View view, AnonymousClass087 anonymousClass087, C016807u c016807u, Object obj);

    public abstract void A0B(View view, AnonymousClass087 anonymousClass087, C016807u c016807u, Object obj);

    public AbstractC30911bN(C016807u c016807u, final AnonymousClass087 anonymousClass087) {
        super(EnumC20560xj.VIEW);
        this.A01 = ((AbstractC016907v) c016807u).A00;
        this.A00 = c016807u;
        C08D[] c08dArr = {new C08D(this, new C08C(this, anonymousClass087) { // from class: X.1g6
            public final AnonymousClass087 A00;
            public final AbstractC30911bN A01;

            {
                this.A01 = this;
                this.A00 = anonymousClass087;
            }

            @Override // X.C08C
            public void A5g(Context context, Object obj, Object obj2, Object obj3) {
                this.A01.A0A((View) obj, this.A00, ((AbstractC30911bN) obj2).A00, obj3);
            }

            @Override // X.C08C
            public boolean AUY(Object obj, Object obj2, Object obj3, Object obj4) {
                if (this.A01 != null) {
                    return true;
                }
                throw null;
            }

            @Override // X.C08C
            public void AVh(Context context, Object obj, Object obj2, Object obj3) {
                this.A01.A0B((View) obj, this.A00, ((AbstractC30911bN) obj2).A00, obj3);
            }
        }), new C08D(this, new C08C(this, anonymousClass087) { // from class: X.1g5
            public final AnonymousClass087 A00;
            public final AbstractC30911bN A01;

            {
                this.A01 = this;
                this.A00 = anonymousClass087;
            }

            @Override // X.C08C
            public void A5g(Context context, Object obj, Object obj2, Object obj3) {
            }

            @Override // X.C08C
            public boolean AUY(Object obj, Object obj2, Object obj3, Object obj4) {
                return false;
            }

            @Override // X.C08C
            public void AVh(Context context, Object obj, Object obj2, Object obj3) {
                this.A01.A09((View) obj, this.A00, ((AbstractC30911bN) obj2).A00, obj3);
            }
        })};
        for (int i = 0; i < 2; i++) {
            A06(c08dArr[i]);
        }
    }

    @Override // X.AbstractC016307p
    public long A04() {
        return this.A01;
    }

    @Override // X.AbstractC016307p, X.C07T
    public /* bridge */ /* synthetic */ C07T AGA() {
        return super.AGA();
    }
}
