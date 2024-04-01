package X;

import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.3fZ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C75803fZ {
    public final int A00;
    public final IvParameterSpec A01;
    public final SecretKeySpec A02;
    public final SecretKeySpec A03;

    public C75803fZ(SecretKeySpec secretKeySpec, SecretKeySpec secretKeySpec2, IvParameterSpec ivParameterSpec, int i) {
        this.A02 = secretKeySpec;
        this.A03 = secretKeySpec2;
        this.A01 = ivParameterSpec;
        this.A00 = i;
    }
}
