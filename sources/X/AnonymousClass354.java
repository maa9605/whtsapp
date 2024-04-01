package X;

import android.view.View;

/* renamed from: X.354  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass354 extends C0TS implements View.OnClickListener, View.OnLongClickListener {
    public final C51702Xm A00;
    public final /* synthetic */ C52112a5 A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass354(C52112a5 c52112a5, C51702Xm c51702Xm) {
        super(c51702Xm);
        this.A01 = c52112a5;
        this.A00 = c51702Xm;
        c51702Xm.setOnClickListener(this);
        this.A00.setOnLongClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C52112a5 c52112a5 = this.A01;
        if (c52112a5.A00 != null) {
            C29X c29x = c52112a5.A03;
            if (!c29x.A0N.AFg() && !c29x.A0o.hasMessages(0)) {
                if (c29x.A1P.isEmpty()) {
                    C51702Xm c51702Xm = this.A00;
                    c29x.A0I(c51702Xm.A04, c51702Xm, false);
                    return;
                }
                C29X.A00(c29x, this.A00.A04);
            }
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        C52112a5 c52112a5 = this.A01;
        if (c52112a5.A00 != null) {
            C29X c29x = c52112a5.A03;
            if (c29x.A0N.AFg() || c29x.A0o.hasMessages(0)) {
                return true;
            }
            C29X.A00(c29x, this.A00.A04);
            return true;
        }
        return true;
    }
}
