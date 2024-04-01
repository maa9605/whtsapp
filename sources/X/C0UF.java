package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

/* renamed from: X.0UF  reason: invalid class name */
/* loaded from: classes.dex */
public class C0UF extends C0UG implements InterfaceC02380Ay, C0B0 {
    public final /* synthetic */ ActivityC02330At A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UF(ActivityC02330At activityC02330At) {
        super(activityC02330At);
        this.A00 = activityC02330At;
    }

    @Override // X.C0UH
    public View A00(int i) {
        return this.A00.findViewById(i);
    }

    @Override // X.C0UH
    public boolean A01() {
        Window window = this.A00.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // X.C0UG
    public void A02(C0BA c0ba, Intent intent, int i, Bundle bundle) {
        this.A00.A0Y(c0ba, intent, i, bundle);
    }

    @Override // X.InterfaceC02360Aw
    public AbstractC02530Bu AAs() {
        return this.A00.A09;
    }

    @Override // X.C0B0
    public C0U8 ABe() {
        return this.A00.ABe();
    }

    @Override // X.InterfaceC02380Ay
    public C0VW ADv() {
        return this.A00.ADv();
    }
}
