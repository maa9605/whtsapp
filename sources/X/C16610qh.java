package X;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.List;

/* renamed from: X.0qh  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C16610qh {
    public Context A00;
    public C01e A01;
    public C16510qW A02 = new C16510qW();
    public WorkDatabase A03;
    public InterfaceC16840r7 A04;
    public InterfaceC17300rs A05;
    public String A06;
    public List A07;

    public C16610qh(Context context, C01e configuration, InterfaceC17300rs workTaskExecutor, InterfaceC16840r7 foregroundProcessor, WorkDatabase database, String workSpecId) {
        this.A00 = context.getApplicationContext();
        this.A05 = workTaskExecutor;
        this.A04 = foregroundProcessor;
        this.A01 = configuration;
        this.A03 = database;
        this.A06 = workSpecId;
    }
}
