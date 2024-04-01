package X;

/* renamed from: X.1Xm  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C29591Xm implements InterfaceC18820uO {
    public final int A00;
    public final InterfaceC18820uO A01;

    public C29591Xm(InterfaceC18820uO interfaceC18820uO, int i) {
        this.A01 = interfaceC18820uO;
        this.A00 = i;
    }

    @Override // X.InterfaceC18820uO
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C29591Xm) {
            C29591Xm c29591Xm = (C29591Xm) obj;
            return this.A00 == c29591Xm.A00 && this.A01.equals(c29591Xm.A01);
        }
        return false;
    }

    @Override // X.InterfaceC18820uO
    public int hashCode() {
        return (this.A01.hashCode() * 1013) + this.A00;
    }

    public String toString() {
        C18940ua c18940ua = new C18940ua("AnimatedFrameCache$FrameKey");
        c18940ua.A00("imageCacheKey", this.A01);
        c18940ua.A00("frameIndex", String.valueOf(this.A00));
        return c18940ua.toString();
    }
}
