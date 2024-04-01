package X;

import java.lang.ref.ReferenceQueue;

/* renamed from: X.0Sn  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C06310Sn {
    public static final Thread A02;
    public static final C06320So A01 = new C06320So();
    public static final ReferenceQueue A03 = new ReferenceQueue();
    public static final C06330Sp A00 = new C06330Sp();

    static {
        Thread thread = new Thread() { // from class: X.0Sr
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                while (true) {
                    try {
                        AnonymousClass042 anonymousClass042 = (AnonymousClass042) C06310Sn.A03.remove();
                        anonymousClass042.destruct();
                        if (anonymousClass042.previous == null) {
                            AnonymousClass042 anonymousClass0422 = (AnonymousClass042) C06310Sn.A01.A00.getAndSet(null);
                            while (anonymousClass0422 != null) {
                                AnonymousClass042 anonymousClass0423 = anonymousClass0422.next;
                                AnonymousClass042 anonymousClass0424 = C06310Sn.A00.A00;
                                anonymousClass0422.next = anonymousClass0424.next;
                                anonymousClass0424.next = anonymousClass0422;
                                if (anonymousClass0422.next != null) {
                                    anonymousClass0422.next.previous = anonymousClass0422;
                                }
                                anonymousClass0422.previous = anonymousClass0424;
                                anonymousClass0422 = anonymousClass0423;
                            }
                        }
                        AnonymousClass042 anonymousClass0425 = anonymousClass042.next;
                        if (anonymousClass0425 != null) {
                            anonymousClass0425.previous = anonymousClass042.previous;
                        }
                        AnonymousClass042 anonymousClass0426 = anonymousClass042.previous;
                        if (anonymousClass0426 != null) {
                            anonymousClass0426.next = anonymousClass0425;
                        }
                    } catch (InterruptedException unused) {
                    }
                }
            }
        };
        A02 = thread;
        thread.start();
    }
}
