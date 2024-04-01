package com.whatsapp;

import X.C002701i;
import X.C018808t;
import X.C0W7;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class SystemStatusActivity extends C0W7 {
    public int A00;
    public C018808t A01;
    public String A02;
    public String A03;
    public ArrayList A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final List A08 = Arrays.asList("broadcast", "registration", "sync", "status");

    public /* synthetic */ void lambda$onCreate$2875$SystemStatusActivity(View view) {
        startActivity(C002701i.A09(this, this.A01, this.A02, this.A03, Integer.valueOf(this.A00), null, null, getIntent().getBundleExtra("com.whatsapp.SystemStatusActivity.describeProblemBundle")));
        finish();
    }

    public /* synthetic */ void lambda$onCreate$2876$SystemStatusActivity(View view) {
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:265:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x020d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x01a8 A[SYNTHETIC] */
    @Override // X.C0W7, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 1044
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SystemStatusActivity.onCreate(android.os.Bundle):void");
    }
}
