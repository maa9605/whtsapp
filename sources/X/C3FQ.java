package X;

import android.content.Context;

/* renamed from: X.3FQ  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3FQ implements InterfaceRunnableC62892yj {
    public final Context A00;
    public final C012005w A01;
    public final C40081rY A02;
    public final C22e A03;
    public final String A04;

    public C3FQ(C012005w c012005w, C40081rY c40081rY, C22e c22e, String str, Context context) {
        this.A01 = c012005w;
        this.A02 = c40081rY;
        this.A03 = c22e;
        this.A04 = str;
        this.A00 = context;
    }

    @Override // X.InterfaceRunnableC62892yj
    public C22e ABB() {
        return this.A03;
    }
}
