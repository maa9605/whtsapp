package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/* renamed from: X.03f  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C007403f implements InterfaceC007503g {
    public static volatile C007403f A05;
    public final int A00;
    public final long A01;
    public final C007303e A02;
    public final Random A03 = new Random();
    public final Set A04;

    public C007403f(C03Z c03z, C007303e c007303e) {
        this.A02 = c007303e;
        this.A01 = c03z.A01();
        HashSet hashSet = new HashSet();
        for (int i : InterfaceC007503g.A00) {
            hashSet.add(Integer.valueOf(i));
        }
        this.A04 = Collections.unmodifiableSet(hashSet);
        this.A00 = this.A03.nextInt(901) + 100;
    }

    public static C007403f A00() {
        if (A05 == null) {
            synchronized (C007403f.class) {
                if (A05 == null) {
                    A05 = new C007403f(C03Z.A00(), C007303e.A00());
                }
            }
        }
        return A05;
    }
}
