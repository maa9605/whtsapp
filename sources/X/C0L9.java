package X;

/* renamed from: X.0L9  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0L9 {
    public static volatile C0L9 A01;
    public volatile boolean A00;

    public static C0L9 A00() {
        if (A01 == null) {
            synchronized (C0L9.class) {
                if (A01 == null) {
                    A01 = new C0L9();
                }
            }
        }
        return A01;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("VoiceNoteRecording{running=");
        A0P.append(this.A00);
        A0P.append('}');
        return A0P.toString();
    }
}
