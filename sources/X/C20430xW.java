package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0xW */
/* loaded from: classes.dex */
public class C20430xW {
    public final C05I A00;
    public final Map A02;
    public final Map A03 = new HashMap();
    public final C05I A01 = new C05I();

    public C20430xW(C20430xW c20430xW) {
        if (c20430xW == null) {
            this.A02 = new HashMap();
            this.A00 = new C05I();
            return;
        }
        this.A02 = c20430xW.A03;
        this.A00 = c20430xW.A01;
    }
}
