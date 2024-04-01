package X;

import java.lang.ref.SoftReference;
import java.util.LinkedList;

/* renamed from: X.0vq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C19690vq {
    public final InterfaceC19050ul A00;
    public final C20040wg A01;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0wg] */
    public C19690vq(final InterfaceC18980ue interfaceC18980ue, final C19770vy c19770vy) {
        C07K.A1X(c19770vy.A00 > 0);
        final C1Y9 A00 = C1Y9.A00();
        this.A01 = new C24751Cs(interfaceC18980ue, c19770vy, A00) { // from class: X.0wg
            @Override // X.AbstractC39061pV
            public C19640vl A02(int i) {
                return new C19640vl(i, this.A05.A00) { // from class: X.1YA
                    public LinkedList A00 = new LinkedList();

                    @Override // X.C19640vl
                    public Object A00() {
                        C19040uk c19040uk = (C19040uk) this.A03.poll();
                        SoftReference softReference = c19040uk.A00;
                        Object obj = softReference == null ? null : softReference.get();
                        if (softReference != null) {
                            softReference.clear();
                            c19040uk.A00 = null;
                        }
                        SoftReference softReference2 = c19040uk.A01;
                        if (softReference2 != null) {
                            softReference2.clear();
                            c19040uk.A01 = null;
                        }
                        SoftReference softReference3 = c19040uk.A02;
                        if (softReference3 != null) {
                            softReference3.clear();
                            c19040uk.A02 = null;
                        }
                        this.A00.add(c19040uk);
                        return obj;
                    }

                    @Override // X.C19640vl
                    public void A01(Object obj) {
                        C19040uk c19040uk = (C19040uk) this.A00.poll();
                        if (c19040uk == null) {
                            c19040uk = new C19040uk();
                        }
                        c19040uk.A00 = new SoftReference(obj);
                        c19040uk.A01 = new SoftReference(obj);
                        c19040uk.A02 = new SoftReference(obj);
                        this.A03.add(c19040uk);
                    }
                };
            }
        };
        this.A00 = new InterfaceC19050ul() { // from class: X.1Y6
            @Override // X.InterfaceC19050ul
            public void ARD(Object obj) {
                ARD(obj);
            }
        };
    }
}
