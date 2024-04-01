package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.2Cf  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C47692Cf {
    public static List A02 = Arrays.asList(new C2CI(new int[]{128514}), new C2CI(new int[]{128525}), new C2CI(new int[]{128536}), new C2CI(new int[]{129315}), new C2CI(new int[]{128512}), new C2CI(new int[]{10084}), new C2CI(new int[]{128521}), new C2CI(new int[]{128522}), new C2CI(new int[]{129300}), new C2CI(new int[]{128557}), new C2CI(new int[]{128513}), new C2CI(new int[]{128540}), new C2CI(new int[]{128079}), new C2CI(new int[]{128526}), new C2CI(new int[]{128077}), new C2CI(new int[]{128556}), new C2CI(new int[]{128518}), new C2CI(new int[]{128578}), new C2CI(new int[]{128519}), new C2CI(new int[]{128544}), new C2CI(new int[]{128517}), new C2CI(new int[]{9786}), new C2CI(new int[]{129303}), new C2CI(new int[]{128516}), new C2CI(new int[]{128530}), new C2CI(new int[]{128515}), new C2CI(new int[]{128527}), new C2CI(new int[]{128524}), new C2CI(new int[]{128076}), new C2CI(new int[]{128541}), new C2CI(new int[]{128579}), new C2CI(new int[]{128523}), new C2CI(new int[]{127874}), new C2CI(new int[]{128545}), new C2CI(new int[]{128561}), new C2CI(new int[]{128591}), new C2CI(new int[]{128532}), new C2CI(new int[]{128546}), new C2CI(new int[]{128563}), new C2CI(new int[]{128542}), new C2CI(new int[]{129316}), new C2CI(new int[]{128074}), new C2CI(new int[]{128539}), new C2CI(new int[]{128538}), new C2CI(new int[]{128580}), new C2CI(new int[]{128149}), new C2CI(new int[]{9996}), new C2CI(new int[]{128170}), new C2CI(new int[]{128158}), new C2CI(new int[]{127801}));
    public static volatile C47692Cf A03;
    public List A00;
    public final C000500h A01;

    public C47692Cf(C000500h c000500h) {
        this.A01 = c000500h;
    }

    public static C47692Cf A00() {
        if (A03 == null) {
            synchronized (C47692Cf.class) {
                if (A03 == null) {
                    A03 = new C47692Cf(C000500h.A00());
                }
            }
        }
        return A03;
    }
}
