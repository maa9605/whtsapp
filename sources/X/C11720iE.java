package X;

import android.security.identity.IdentityCredential;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: X.0iE  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C11720iE {
    public final IdentityCredential A00;
    public final Signature A01;
    public final Cipher A02;
    public final Mac A03;

    public C11720iE(IdentityCredential identityCredential) {
        this.A01 = null;
        this.A02 = null;
        this.A03 = null;
        this.A00 = identityCredential;
    }

    public C11720iE(Signature signature) {
        this.A01 = signature;
        this.A02 = null;
        this.A03 = null;
        this.A00 = null;
    }

    public C11720iE(Cipher cipher) {
        this.A01 = null;
        this.A02 = cipher;
        this.A03 = null;
        this.A00 = null;
    }

    public C11720iE(Mac mac) {
        this.A01 = null;
        this.A02 = null;
        this.A03 = mac;
        this.A00 = null;
    }
}
