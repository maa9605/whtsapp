package X;

/* renamed from: X.0Sp  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C06330Sp {
    public final AnonymousClass042 A00;

    public C06330Sp() {
        AnonymousClass042 anonymousClass042 = new AnonymousClass042() { // from class: X.0Sq
            @Override // X.AnonymousClass042
            public void destruct() {
                throw new IllegalStateException("Cannot destroy Terminus Destructor.");
            }
        };
        this.A00 = anonymousClass042;
        anonymousClass042.next = new AnonymousClass042() { // from class: X.0Sq
            @Override // X.AnonymousClass042
            public void destruct() {
                throw new IllegalStateException("Cannot destroy Terminus Destructor.");
            }
        };
        AnonymousClass042 anonymousClass0422 = this.A00;
        anonymousClass0422.next.previous = anonymousClass0422;
    }
}
