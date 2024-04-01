package X;

import com.whatsapp.data.ProfilePhotoChange;

/* renamed from: X.0Jz  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C04390Jz extends C04300Jq {
    public ProfilePhotoChange A00;
    public String A01;

    public C04390Jz(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, 6);
    }

    @Override // X.AnonymousClass092
    public Object A0F() {
        return this.A00;
    }

    @Override // X.AnonymousClass092
    public String A0G() {
        return A19();
    }

    @Override // X.AnonymousClass092
    public void A0k(Object obj) {
        if (obj instanceof ProfilePhotoChange) {
            this.A00 = (ProfilePhotoChange) obj;
        }
    }

    @Override // X.AnonymousClass092
    public void A0l(String str) {
        synchronized (this.A0o) {
            this.A01 = str;
        }
    }

    public String A19() {
        String str;
        synchronized (this.A0o) {
            str = this.A01;
        }
        return str;
    }
}
